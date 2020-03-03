package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.util.Date;

/**
 * TB_ACQUISITION_EXTRACT_DIC
 * @author 
 */
public class TbAcquisitionExtractDic implements Serializable {
    /**
     * 数据表编码
     */
    private String TABLECODE;

    /**
     * 数据表名称
     */
    private String TABLENAME;

    /**
     * 抽取机构范围 （0.全部接入机构，1.指定机构）
     */
    private Short GETTYPE;

    /**
     * 指定机构群代码 当前数据源表为一个机构特有时，填写此机构群代码
     */
    private String ONLY_YLJGDM;

    /**
     * 更新时间
     */
    private Date UPDATETIME;

    private String YL1;

    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getTABLECODE() {
        return TABLECODE;
    }

    public void setTABLECODE(String TABLECODE) {
        this.TABLECODE = TABLECODE;
    }

    public String getTABLENAME() {
        return TABLENAME;
    }

    public void setTABLENAME(String TABLENAME) {
        this.TABLENAME = TABLENAME;
    }

    public Short getGETTYPE() {
        return GETTYPE;
    }

    public void setGETTYPE(Short GETTYPE) {
        this.GETTYPE = GETTYPE;
    }

    public String getONLY_YLJGDM() {
        return ONLY_YLJGDM;
    }

    public void setONLY_YLJGDM(String ONLY_YLJGDM) {
        this.ONLY_YLJGDM = ONLY_YLJGDM;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbAcquisitionExtractDic other = (TbAcquisitionExtractDic) that;
        return (this.getTABLECODE() == null ? other.getTABLECODE() == null : this.getTABLECODE().equals(other.getTABLECODE()))
            && (this.getTABLENAME() == null ? other.getTABLENAME() == null : this.getTABLENAME().equals(other.getTABLENAME()))
            && (this.getGETTYPE() == null ? other.getGETTYPE() == null : this.getGETTYPE().equals(other.getGETTYPE()))
            && (this.getONLY_YLJGDM() == null ? other.getONLY_YLJGDM() == null : this.getONLY_YLJGDM().equals(other.getONLY_YLJGDM()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTABLECODE() == null) ? 0 : getTABLECODE().hashCode());
        result = prime * result + ((getTABLENAME() == null) ? 0 : getTABLENAME().hashCode());
        result = prime * result + ((getGETTYPE() == null) ? 0 : getGETTYPE().hashCode());
        result = prime * result + ((getONLY_YLJGDM() == null) ? 0 : getONLY_YLJGDM().hashCode());
        result = prime * result + ((getUPDATETIME() == null) ? 0 : getUPDATETIME().hashCode());
        result = prime * result + ((getYL1() == null) ? 0 : getYL1().hashCode());
        result = prime * result + ((getYL2() == null) ? 0 : getYL2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", TABLECODE=").append(TABLECODE);
        sb.append(", TABLENAME=").append(TABLENAME);
        sb.append(", GETTYPE=").append(GETTYPE);
        sb.append(", ONLY_YLJGDM=").append(ONLY_YLJGDM);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}