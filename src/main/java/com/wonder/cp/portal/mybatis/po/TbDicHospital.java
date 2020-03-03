package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_DIC_HOSPITAL
 * @author 
 */
public class TbDicHospital implements Serializable {
    /**
     * 机构编码主键
     */
    private String YLJGBM;

    /**
     * 机构名称
     */
    private String JGMC;

    /**
     * 父机构代码
     */
    private String FJGDM;

    /**
     * 机构等级1：一级 2：二级 3.三级 9.未定级
     */
    private BigDecimal JGDJ;

    /**
     * 机构类型（1.综合性医院  2.专科医院 3.中医医院 4.专科疾病防治所（站、中心） 5.妇幼保健院（所，站）6.中西医结合医院 7.社区卫生服务中心 9.未分类（无））
     */
    private BigDecimal JGLX;

    /**
     * 地理区划北京市110000，昌平区110114
     */
    private String DLQH;

    /**
     * 是否获取号源0.未获取1.已获取
     */
    private String SFHQHY;

    /**
     * 是否获取诊疗数据0.未获取1.已获取
     */
    private String SFHQZLSJ;

    /**
     * 是否接入智能提醒0.未接入1.已接入
     */
    private String SFJRZNTX;

    /**
     * 所属医联体1.东部医联体2.南部医联体3.北部医联体4.中部医联体
     */
    private String SSYLT;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getYLJGBM() {
        return YLJGBM;
    }

    public void setYLJGBM(String YLJGBM) {
        this.YLJGBM = YLJGBM;
    }

    public String getJGMC() {
        return JGMC;
    }

    public void setJGMC(String JGMC) {
        this.JGMC = JGMC;
    }

    public String getFJGDM() {
        return FJGDM;
    }

    public void setFJGDM(String FJGDM) {
        this.FJGDM = FJGDM;
    }

    public BigDecimal getJGDJ() {
        return JGDJ;
    }

    public void setJGDJ(BigDecimal JGDJ) {
        this.JGDJ = JGDJ;
    }

    public BigDecimal getJGLX() {
        return JGLX;
    }

    public void setJGLX(BigDecimal JGLX) {
        this.JGLX = JGLX;
    }

    public String getDLQH() {
        return DLQH;
    }

    public void setDLQH(String DLQH) {
        this.DLQH = DLQH;
    }

    public String getSFHQHY() {
        return SFHQHY;
    }

    public void setSFHQHY(String SFHQHY) {
        this.SFHQHY = SFHQHY;
    }

    public String getSFHQZLSJ() {
        return SFHQZLSJ;
    }

    public void setSFHQZLSJ(String SFHQZLSJ) {
        this.SFHQZLSJ = SFHQZLSJ;
    }

    public String getSFJRZNTX() {
        return SFJRZNTX;
    }

    public void setSFJRZNTX(String SFJRZNTX) {
        this.SFJRZNTX = SFJRZNTX;
    }

    public String getSSYLT() {
        return SSYLT;
    }

    public void setSSYLT(String SSYLT) {
        this.SSYLT = SSYLT;
    }

    public String getYL1() {
        return YL1;
    }

    public void setYL1(String YL1) {
        this.YL1 = YL1;
    }

    public String getYL2() {
        return YL2;
    }

    public void setYL2(String YL2) {
        this.YL2 = YL2;
    }
}