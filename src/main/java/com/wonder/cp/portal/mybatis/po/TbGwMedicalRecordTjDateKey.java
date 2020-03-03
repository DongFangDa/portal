package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_GW_MEDICAL_RECORD_TJ_DATE
 * @author 
 */
public class TbGwMedicalRecordTjDateKey implements Serializable {
    /**
     * 社区编码
     */
    private String YLJGBM;

    /**
     * 日期
     */
    private BigDecimal TJ_DATE;

    private static final long serialVersionUID = 1L;

    public String getYLJGBM() {
        return YLJGBM;
    }

    public void setYLJGBM(String YLJGBM) {
        this.YLJGBM = YLJGBM;
    }

    public BigDecimal getTJ_DATE() {
        return TJ_DATE;
    }

    public void setTJ_DATE(BigDecimal TJ_DATE) {
        this.TJ_DATE = TJ_DATE;
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
        TbGwMedicalRecordTjDateKey other = (TbGwMedicalRecordTjDateKey) that;
        return (this.getYLJGBM() == null ? other.getYLJGBM() == null : this.getYLJGBM().equals(other.getYLJGBM()))
            && (this.getTJ_DATE() == null ? other.getTJ_DATE() == null : this.getTJ_DATE().equals(other.getTJ_DATE()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGBM() == null) ? 0 : getYLJGBM().hashCode());
        result = prime * result + ((getTJ_DATE() == null) ? 0 : getTJ_DATE().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", YLJGBM=").append(YLJGBM);
        sb.append(", TJ_DATE=").append(TJ_DATE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}