package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_HOSPITAL_RESOURCE_BED
 * @author 
 */
public class TbHospitalResourceBed extends TbHospitalResourceBedKey implements Serializable {
    /**
     * 床位总数目
     */
    private BigDecimal SSKS;

    /**
     * 已用床位
     */
    private BigDecimal CWSM;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSSKS() {
        return SSKS;
    }

    public void setSSKS(BigDecimal SSKS) {
        this.SSKS = SSKS;
    }

    public BigDecimal getCWSM() {
        return CWSM;
    }

    public void setCWSM(BigDecimal CWSM) {
        this.CWSM = CWSM;
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
        TbHospitalResourceBed other = (TbHospitalResourceBed) that;
        return (this.getYYBM() == null ? other.getYYBM() == null : this.getYYBM().equals(other.getYYBM()))
            && (this.getKSBM() == null ? other.getKSBM() == null : this.getKSBM().equals(other.getKSBM()))
            && (this.getKSMC() == null ? other.getKSMC() == null : this.getKSMC().equals(other.getKSMC()))
            && (this.getSSKS() == null ? other.getSSKS() == null : this.getSSKS().equals(other.getSSKS()))
            && (this.getCWSM() == null ? other.getCWSM() == null : this.getCWSM().equals(other.getCWSM()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYYBM() == null) ? 0 : getYYBM().hashCode());
        result = prime * result + ((getKSBM() == null) ? 0 : getKSBM().hashCode());
        result = prime * result + ((getKSMC() == null) ? 0 : getKSMC().hashCode());
        result = prime * result + ((getSSKS() == null) ? 0 : getSSKS().hashCode());
        result = prime * result + ((getCWSM() == null) ? 0 : getCWSM().hashCode());
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
        sb.append(", SSKS=").append(SSKS);
        sb.append(", CWSM=").append(CWSM);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}