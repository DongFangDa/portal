package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_FOUR_CENTERS_TJ
 * @author 
 */
public class TbFourCentersTjKey implements Serializable {
    /**
     * 机构编码
     */
    private String YLJGDM;

    /**
     * 统计业务时间
     */
    private String TJ_DATE;

    private static final long serialVersionUID = 1L;

    public String getYLJGDM() {
        return YLJGDM;
    }

    public void setYLJGDM(String YLJGDM) {
        this.YLJGDM = YLJGDM;
    }

    public String getTJ_DATE() {
        return TJ_DATE;
    }

    public void setTJ_DATE(String TJ_DATE) {
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
        TbFourCentersTjKey other = (TbFourCentersTjKey) that;
        return (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getTJ_DATE() == null ? other.getTJ_DATE() == null : this.getTJ_DATE().equals(other.getTJ_DATE()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getTJ_DATE() == null) ? 0 : getTJ_DATE().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", YLJGDM=").append(YLJGDM);
        sb.append(", TJ_DATE=").append(TJ_DATE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}