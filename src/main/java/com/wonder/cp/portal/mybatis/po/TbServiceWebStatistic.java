package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_SERVICE_WEB_STATISTIC
 * @author 
 */
public class TbServiceWebStatistic implements Serializable {
    /**
     * 当前统计日期主键
     */
    private Date TJ_TIME;

    /**
     * 注册总人数
     */
    private BigDecimal ZCZRS;

    /**
     * 实名认证总人数
     */
    private BigDecimal SMRZZRS;

    /**
     * 预约挂号次数
     */
    private BigDecimal YYGHCS;

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

    public Date getTJ_TIME() {
        return TJ_TIME;
    }

    public void setTJ_TIME(Date TJ_TIME) {
        this.TJ_TIME = TJ_TIME;
    }

    public BigDecimal getZCZRS() {
        return ZCZRS;
    }

    public void setZCZRS(BigDecimal ZCZRS) {
        this.ZCZRS = ZCZRS;
    }

    public BigDecimal getSMRZZRS() {
        return SMRZZRS;
    }

    public void setSMRZZRS(BigDecimal SMRZZRS) {
        this.SMRZZRS = SMRZZRS;
    }

    public BigDecimal getYYGHCS() {
        return YYGHCS;
    }

    public void setYYGHCS(BigDecimal YYGHCS) {
        this.YYGHCS = YYGHCS;
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
        TbServiceWebStatistic other = (TbServiceWebStatistic) that;
        return (this.getTJ_TIME() == null ? other.getTJ_TIME() == null : this.getTJ_TIME().equals(other.getTJ_TIME()))
            && (this.getZCZRS() == null ? other.getZCZRS() == null : this.getZCZRS().equals(other.getZCZRS()))
            && (this.getSMRZZRS() == null ? other.getSMRZZRS() == null : this.getSMRZZRS().equals(other.getSMRZZRS()))
            && (this.getYYGHCS() == null ? other.getYYGHCS() == null : this.getYYGHCS().equals(other.getYYGHCS()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTJ_TIME() == null) ? 0 : getTJ_TIME().hashCode());
        result = prime * result + ((getZCZRS() == null) ? 0 : getZCZRS().hashCode());
        result = prime * result + ((getSMRZZRS() == null) ? 0 : getSMRZZRS().hashCode());
        result = prime * result + ((getYYGHCS() == null) ? 0 : getYYGHCS().hashCode());
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
        sb.append(", TJ_TIME=").append(TJ_TIME);
        sb.append(", ZCZRS=").append(ZCZRS);
        sb.append(", SMRZZRS=").append(SMRZZRS);
        sb.append(", YYGHCS=").append(YYGHCS);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}