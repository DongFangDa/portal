package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_HIS_MEDICAL_RECORD_TJ_DATE
 * @author 
 */
public class TbHisMedicalRecordTjDateKey implements Serializable {
    /**
     * 社区机构编码
     */
    private String YLJGBM;

    /**
     * 日期
     */
    private String TJDATE;

    private static final long serialVersionUID = 1L;

    public String getYLJGBM() {
        return YLJGBM;
    }

    public void setYLJGBM(String YLJGBM) {
        this.YLJGBM = YLJGBM;
    }

    public String getTJDATE() {
        return TJDATE;
    }

    public void setTJDATE(String TJDATE) {
        this.TJDATE = TJDATE;
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
        TbHisMedicalRecordTjDateKey other = (TbHisMedicalRecordTjDateKey) that;
        return (this.getYLJGBM() == null ? other.getYLJGBM() == null : this.getYLJGBM().equals(other.getYLJGBM()))
            && (this.getTJDATE() == null ? other.getTJDATE() == null : this.getTJDATE().equals(other.getTJDATE()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGBM() == null) ? 0 : getYLJGBM().hashCode());
        result = prime * result + ((getTJDATE() == null) ? 0 : getTJDATE().hashCode());
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}