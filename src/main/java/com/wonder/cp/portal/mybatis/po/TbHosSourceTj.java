package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_HOS_SOURCE_TJ
 * @author 
 */
public class TbHosSourceTj extends TbHosSourceTjKey implements Serializable {
    /**
     * 号源数量
     */
    private BigDecimal HYSL;

    /**
     * 已预约号源
     */
    private BigDecimal YYYHY;

    /**
     * 剩余号源
     */
    private BigDecimal SYHY;

    /**
     * 更新时间
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

    public BigDecimal getHYSL() {
        return HYSL;
    }

    public void setHYSL(BigDecimal HYSL) {
        this.HYSL = HYSL;
    }

    public BigDecimal getYYYHY() {
        return YYYHY;
    }

    public void setYYYHY(BigDecimal YYYHY) {
        this.YYYHY = YYYHY;
    }

    public BigDecimal getSYHY() {
        return SYHY;
    }

    public void setSYHY(BigDecimal SYHY) {
        this.SYHY = SYHY;
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
        TbHosSourceTj other = (TbHosSourceTj) that;
        return (this.getYLJGBM() == null ? other.getYLJGBM() == null : this.getYLJGBM().equals(other.getYLJGBM()))
            && (this.getTJ_TIME() == null ? other.getTJ_TIME() == null : this.getTJ_TIME().equals(other.getTJ_TIME()))
            && (this.getHYSL() == null ? other.getHYSL() == null : this.getHYSL().equals(other.getHYSL()))
            && (this.getYYYHY() == null ? other.getYYYHY() == null : this.getYYYHY().equals(other.getYYYHY()))
            && (this.getSYHY() == null ? other.getSYHY() == null : this.getSYHY().equals(other.getSYHY()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGBM() == null) ? 0 : getYLJGBM().hashCode());
        result = prime * result + ((getTJ_TIME() == null) ? 0 : getTJ_TIME().hashCode());
        result = prime * result + ((getHYSL() == null) ? 0 : getHYSL().hashCode());
        result = prime * result + ((getYYYHY() == null) ? 0 : getYYYHY().hashCode());
        result = prime * result + ((getSYHY() == null) ? 0 : getSYHY().hashCode());
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
        sb.append(", HYSL=").append(HYSL);
        sb.append(", YYYHY=").append(YYYHY);
        sb.append(", SYHY=").append(SYHY);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}