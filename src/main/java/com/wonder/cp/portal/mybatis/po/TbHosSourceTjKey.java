package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_HOS_SOURCE_TJ
 * @author 
 */
public class TbHosSourceTjKey implements Serializable {
    /**
     * 机构编码,复合主键
     */
    private String YLJGBM;

    /**
     * 数据对应时间,复合主键，yyyyMMdd
     */
    private String TJ_TIME;

    private static final long serialVersionUID = 1L;

    public String getYLJGBM() {
        return YLJGBM;
    }

    public void setYLJGBM(String YLJGBM) {
        this.YLJGBM = YLJGBM;
    }

    public String getTJ_TIME() {
        return TJ_TIME;
    }

    public void setTJ_TIME(String TJ_TIME) {
        this.TJ_TIME = TJ_TIME;
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
        TbHosSourceTjKey other = (TbHosSourceTjKey) that;
        return (this.getYLJGBM() == null ? other.getYLJGBM() == null : this.getYLJGBM().equals(other.getYLJGBM()))
            && (this.getTJ_TIME() == null ? other.getTJ_TIME() == null : this.getTJ_TIME().equals(other.getTJ_TIME()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGBM() == null) ? 0 : getYLJGBM().hashCode());
        result = prime * result + ((getTJ_TIME() == null) ? 0 : getTJ_TIME().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", YLJGBM=").append(YLJGBM);
        sb.append(", TJ_TIME=").append(TJ_TIME);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}