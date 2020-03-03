package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_SERVICE_HOME_STATISTIC
 * @author 
 */
public class TbServiceHomeStatistic extends TbServiceHomeStatisticKey implements Serializable {
    /**
     * 公卫操作 （1：签约/2：建档）
     */
    private BigDecimal GWCZ;

    /**
     * 操作总次数
     */
    private BigDecimal CZRS;

    /**
     * 全区总人数
     */
    private BigDecimal QQZRS;

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

    public BigDecimal getGWCZ() {
        return GWCZ;
    }

    public void setGWCZ(BigDecimal GWCZ) {
        this.GWCZ = GWCZ;
    }

    public BigDecimal getCZRS() {
        return CZRS;
    }

    public void setCZRS(BigDecimal CZRS) {
        this.CZRS = CZRS;
    }

    public BigDecimal getQQZRS() {
        return QQZRS;
    }

    public void setQQZRS(BigDecimal QQZRS) {
        this.QQZRS = QQZRS;
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
        TbServiceHomeStatistic other = (TbServiceHomeStatistic) that;
        return (this.getYLJG() == null ? other.getYLJG() == null : this.getYLJG().equals(other.getYLJG()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getGWCZ() == null ? other.getGWCZ() == null : this.getGWCZ().equals(other.getGWCZ()))
            && (this.getCZRS() == null ? other.getCZRS() == null : this.getCZRS().equals(other.getCZRS()))
            && (this.getQQZRS() == null ? other.getQQZRS() == null : this.getQQZRS().equals(other.getQQZRS()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJG() == null) ? 0 : getYLJG().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getGWCZ() == null) ? 0 : getGWCZ().hashCode());
        result = prime * result + ((getCZRS() == null) ? 0 : getCZRS().hashCode());
        result = prime * result + ((getQQZRS() == null) ? 0 : getQQZRS().hashCode());
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
        sb.append(", GWCZ=").append(GWCZ);
        sb.append(", CZRS=").append(CZRS);
        sb.append(", QQZRS=").append(QQZRS);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}