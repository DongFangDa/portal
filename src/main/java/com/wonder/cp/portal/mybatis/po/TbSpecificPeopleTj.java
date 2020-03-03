package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_SPECIFIC_PEOPLE_TJ
 * @author 
 */
public class TbSpecificPeopleTj implements Serializable {
    /**
     * 年份主键
     */
    private Date YEAR;

    /**
     * 0-6岁儿童数量
     */
    private int SL;

    /**
     * 孕产妇数量
     */
    private  int YCFSL;

    /**
     * 高血压病人数量
     */
    private  int GXYBRSL;

    /**
     * 糖尿病病人数量
     */
    private  int TNBBRSL;

    /**
     * 65岁以上老年人数量
     */
    private  int SYSLNRSL;

    /**
     * 慢病患者数量
     */
    private  int MBHZSL;

    /**
     * 数据更新时间
     */
    private Date UPDATETIME;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public Date getYEAR() {
        return YEAR;
    }

    public void setYEAR(Date YEAR) {
        this.YEAR = YEAR;
    }

    public  int getSL() {
        return SL;
    }

    public void setETSL( int ETSL) {
        this.SL = ETSL;
    }

    public  int getYCFSL() {
        return YCFSL;
    }

    public void setYCFSL( int YCFSL) {
        this.YCFSL = YCFSL;
    }

    public  int getGXYBRSL() {
        return GXYBRSL;
    }

    public void setGXYBRSL( int GXYBRSL) {
        this.GXYBRSL = GXYBRSL;
    }

    public  int getTNBBRSL() {
        return TNBBRSL;
    }

    public void setTNBBRSL( int TNBBRSL) {
        this.TNBBRSL = TNBBRSL;
    }

    public  int getSYSLNRSL() {
        return SYSLNRSL;
    }

    public void set65SYSLNRSL( int SYSLNRSL) {
        this.SYSLNRSL = SYSLNRSL;
    }

    public  int getMBHZSL() {
        return MBHZSL;
    }

    public void setMBHZSL( int MBHZSL) {
        this.MBHZSL = MBHZSL;
    }

    public Date getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(Date UPDATETIME) {
        this.UPDATETIME = UPDATETIME;
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