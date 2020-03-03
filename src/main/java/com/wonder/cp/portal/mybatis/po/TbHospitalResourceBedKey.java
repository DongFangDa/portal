package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_HOSPITAL_RESOURCE_BED
 * @author 
 */
public class TbHospitalResourceBedKey implements Serializable {
    /**
     * 医院编码复合主键
     */
    private String YYBM;

    /**
     * 所属科室编码复合主键
     */
    private String KSBM;

    /**
     * 所属科室名称
     */
    private String KSMC;

    private static final long serialVersionUID = 1L;

    public String getYYBM() {
        return YYBM;
    }

    public void setYYBM(String YYBM) {
        this.YYBM = YYBM;
    }

    public String getKSBM() {
        return KSBM;
    }

    public void setKSBM(String KSBM) {
        this.KSBM = KSBM;
    }

    public String getKSMC() {
        return KSMC;
    }

    public void setKSMC(String KSMC) {
        this.KSMC = KSMC;
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
        TbHospitalResourceBedKey other = (TbHospitalResourceBedKey) that;
        return (this.getYYBM() == null ? other.getYYBM() == null : this.getYYBM().equals(other.getYYBM()))
            && (this.getKSBM() == null ? other.getKSBM() == null : this.getKSBM().equals(other.getKSBM()))
            && (this.getKSMC() == null ? other.getKSMC() == null : this.getKSMC().equals(other.getKSMC()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYYBM() == null) ? 0 : getYYBM().hashCode());
        result = prime * result + ((getKSBM() == null) ? 0 : getKSBM().hashCode());
        result = prime * result + ((getKSMC() == null) ? 0 : getKSMC().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", YYBM=").append(YYBM);
        sb.append(", KSBM=").append(KSBM);
        sb.append(", KSMC=").append(KSMC);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}