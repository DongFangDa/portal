package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_HIS_MEDICAL_RECORD_TJ
 * @author 
 */
public class TbHisMedicalRecordTj implements Serializable {
    /**
     * 社区机构编码
     */
    private String YLJGBM;

    /**
     * 日期
     */
    private BigDecimal TJDATE;

    /**
     * 接诊数量
     */
    private BigDecimal JZSL;

    /**
     * 开处方数量
     */
    private BigDecimal CFSL;

    /**
     * 信息更新时间
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

    public String getYLJGBM() {
        return YLJGBM;
    }

    public void setYLJGBM(String YLJGBM) {
        this.YLJGBM = YLJGBM;
    }

    public BigDecimal getTJDATE() {
        return TJDATE;
    }

    public void setTJDATE(BigDecimal TJDATE) {
        this.TJDATE = TJDATE;
    }

    public BigDecimal getJZSL() {
        return JZSL;
    }

    public void setJZSL(BigDecimal JZSL) {
        this.JZSL = JZSL;
    }

    public BigDecimal getCFSL() {
        return CFSL;
    }

    public void setCFSL(BigDecimal CFSL) {
        this.CFSL = CFSL;
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
        TbHisMedicalRecordTj other = (TbHisMedicalRecordTj) that;
        return (this.getYLJGBM() == null ? other.getYLJGBM() == null : this.getYLJGBM().equals(other.getYLJGBM()))
            && (this.getTJDATE() == null ? other.getTJDATE() == null : this.getTJDATE().equals(other.getTJDATE()))
            && (this.getJZSL() == null ? other.getJZSL() == null : this.getJZSL().equals(other.getJZSL()))
            && (this.getCFSL() == null ? other.getCFSL() == null : this.getCFSL().equals(other.getCFSL()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGBM() == null) ? 0 : getYLJGBM().hashCode());
        result = prime * result + ((getTJDATE() == null) ? 0 : getTJDATE().hashCode());
        result = prime * result + ((getJZSL() == null) ? 0 : getJZSL().hashCode());
        result = prime * result + ((getCFSL() == null) ? 0 : getCFSL().hashCode());
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
        sb.append(", YLJGBM=").append(YLJGBM);
        sb.append(", TJDATE=").append(TJDATE);
        sb.append(", JZSL=").append(JZSL);
        sb.append(", CFSL=").append(CFSL);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}