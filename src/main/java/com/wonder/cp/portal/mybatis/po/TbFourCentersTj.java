package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_FOUR_CENTERS_TJ
 * @author 
 */
public class TbFourCentersTj extends TbFourCentersTjKey implements Serializable {
    /**
     * 心电诊断数量
     */
    private BigDecimal XDZDSL;

    /**
     * 影像诊断数量
     */
    private BigDecimal YXZDSL;

    /**
     * 临检数量
     */
    private BigDecimal LJSL;

    /**
     * 体检数量
     */
    private BigDecimal TJSL;

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

    public BigDecimal getXDZDSL() {
        return XDZDSL;
    }

    public void setXDZDSL(BigDecimal XDZDSL) {
        this.XDZDSL = XDZDSL;
    }

    public BigDecimal getYXZDSL() {
        return YXZDSL;
    }

    public void setYXZDSL(BigDecimal YXZDSL) {
        this.YXZDSL = YXZDSL;
    }

    public BigDecimal getLJSL() {
        return LJSL;
    }

    public void setLJSL(BigDecimal LJSL) {
        this.LJSL = LJSL;
    }

    public BigDecimal getTJSL() {
        return TJSL;
    }

    public void setTJSL(BigDecimal TJSL) {
        this.TJSL = TJSL;
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
        TbFourCentersTj other = (TbFourCentersTj) that;
        return (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getTJ_DATE() == null ? other.getTJ_DATE() == null : this.getTJ_DATE().equals(other.getTJ_DATE()))
            && (this.getXDZDSL() == null ? other.getXDZDSL() == null : this.getXDZDSL().equals(other.getXDZDSL()))
            && (this.getYXZDSL() == null ? other.getYXZDSL() == null : this.getYXZDSL().equals(other.getYXZDSL()))
            && (this.getLJSL() == null ? other.getLJSL() == null : this.getLJSL().equals(other.getLJSL()))
            && (this.getTJSL() == null ? other.getTJSL() == null : this.getTJSL().equals(other.getTJSL()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getTJ_DATE() == null) ? 0 : getTJ_DATE().hashCode());
        result = prime * result + ((getXDZDSL() == null) ? 0 : getXDZDSL().hashCode());
        result = prime * result + ((getYXZDSL() == null) ? 0 : getYXZDSL().hashCode());
        result = prime * result + ((getLJSL() == null) ? 0 : getLJSL().hashCode());
        result = prime * result + ((getTJSL() == null) ? 0 : getTJSL().hashCode());
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
        sb.append(", XDZDSL=").append(XDZDSL);
        sb.append(", YXZDSL=").append(YXZDSL);
        sb.append(", LJSL=").append(LJSL);
        sb.append(", TJSL=").append(TJSL);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}