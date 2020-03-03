package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_GW_MEDICAL_RECORD_TJ_DATE
 * @author 
 */
public class TbGwMedicalRecordTjDate extends TbGwMedicalRecordTjDateKey implements Serializable {
    /**
     * 签约时间
     */
    private String QYSJ;

    /**
     * 建档数量
     */
    private BigDecimal JDSL;

    /**
     * 记录更新时间
     */
    private BigDecimal UPDATETIME;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getQYSJ() {
        return QYSJ;
    }

    public void setQYSJ(String QYSJ) {
        this.QYSJ = QYSJ;
    }

    public BigDecimal getJDSL() {
        return JDSL;
    }

    public void setJDSL(BigDecimal JDSL) {
        this.JDSL = JDSL;
    }

    public BigDecimal getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(BigDecimal UPDATETIME) {
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
        TbGwMedicalRecordTjDate other = (TbGwMedicalRecordTjDate) that;
        return (this.getYLJGBM() == null ? other.getYLJGBM() == null : this.getYLJGBM().equals(other.getYLJGBM()))
            && (this.getTJ_DATE() == null ? other.getTJ_DATE() == null : this.getTJ_DATE().equals(other.getTJ_DATE()))
            && (this.getQYSJ() == null ? other.getQYSJ() == null : this.getQYSJ().equals(other.getQYSJ()))
            && (this.getJDSL() == null ? other.getJDSL() == null : this.getJDSL().equals(other.getJDSL()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGBM() == null) ? 0 : getYLJGBM().hashCode());
        result = prime * result + ((getTJ_DATE() == null) ? 0 : getTJ_DATE().hashCode());
        result = prime * result + ((getQYSJ() == null) ? 0 : getQYSJ().hashCode());
        result = prime * result + ((getJDSL() == null) ? 0 : getJDSL().hashCode());
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
        sb.append(", QYSJ=").append(QYSJ);
        sb.append(", JDSL=").append(JDSL);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}