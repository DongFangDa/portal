package com.wonder.cp.portal.config.web;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @authorDELL 主要用于webmvc配置的学习
 * 实现WebMVcConfigure 或者继承WebMvcConfigurationSupport
 * SpringBoot2.0后，有些东西改变了。
 * 在SpringBoot 1.X时代，整合fastjson是可以不排除JackSon消息转换器的。但在SpringBoot2.X时代，必须要排除JackSon消息转换器。
 * @date2019/12/158:30
 */

public class WebMvcConfig implements WebMvcConfigurer {










    /**
     * 使用fastjson代替jackson
     *
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        /**

         先把JackSon的消息转换器删除.

         备注: (1)源码分析可知，返回json的过程为:
                 Controller调用结束后返回一个数据对象，for循环遍历conventers，
                找到支持application/json的HttpMessageConverter，然后将返回的数据序列化成json。
                具体参考org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodProcessor的
              writeWithMessageConverters方法
               (2)由于是list结构，我们添加的fastjson在最后。因此必须要将jackson的转换器删除，不然会先匹配上jackson，导致没使用fastjson

        */
        for (int i = converters.size() - 1; i >= 0; i--) {
            if (converters.get(i) instanceof MappingJackson2CborHttpMessageConverter) {
                converters.remove(i);
            }
        }
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(
                 SerializerFeature.WriteMapNullValue,        // 是否输出值为null的字段,默认为false,我们将它打开
                SerializerFeature.WriteNullListAsEmpty,     // 将Collection类型字段的字段空值输出为[]
                SerializerFeature.WriteNullStringAsEmpty,   // 将字符串类型字段的空值输出为空字符串
                SerializerFeature.WriteNullNumberAsZero,    // 将数值类型字段的空值输出为0
                SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.DisableCircularReferenceDetect    // 禁用循环引用
        );

        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        fastJsonHttpMessageConverter.setFastJsonConfig(config);
        // 添加支持的MediaTypes;不添加时默认为*/*,也就是默认支持全部
        // 但是MappingJackson2HttpMessageConverter里面支持的MediaTypes为application/json
        // 参考它的做法, fastjson也只添加application/json的MediaType
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON);
        fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
        converters.add(fastJsonHttpMessageConverter);


    }

    /**
     *  跨域将请求分为简单请求和非简单请求
     *  跨域解决方式：
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 允许跨域的访问路径
        .allowedOrigins("*") // 允许跨域访问的路径
        .allowedMethods("POST","GET","PUT","OPTIONS","DELETE") // 允许请求的方法
        .maxAge(1680000) //预检间断时间
        .allowedHeaders()// 允许头部设置
        .allowCredentials(true);// 是否发送cookie
    }
}
