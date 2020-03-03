package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_SERVICE_TCM_STATISTIC
 * @author 
 */
public class TbServiceTcmStatistic extends TbServiceTcmStatisticKey implements Serializable {
    /**
     * 测试次数
     */
    private BigDecimal CSCS;

    /**
     * updateTime
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

    /**
     * 机构名称
     */
    private String JGMC;

    private static final long serialVersionUID = 1L;

    public BigDecimal getCSCS() {
        return CSCS;
    }

    public void setCSCS(BigDecimal CSCS) {
        this.CSCS = CSCS;
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

    public String getJGMC() {
        return JGMC;
    }

    public void setJGMC(String JGMC) {
        this.JGMC = JGMC;
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
        TbServiceTcmStatistic other = (TbServiceTcmStatistic) that;
        return (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getJGDM() == null ? other.getJGDM() == null : this.getJGDM().equals(other.getJGDM()))
            && (this.getCSCS() == null ? other.getCSCS() == null : this.getCSCS().equals(other.getCSCS()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()))
            && (this.getJGMC() == null ? other.getJGMC() == null : this.getJGMC().equals(other.getJGMC()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getJGDM() == null) ? 0 : getJGDM().hashCode());
        result = prime * result + ((getCSCS() == null) ? 0 : getCSCS().hashCode());
        result = prime * result + ((getUPDATETIME() == null) ? 0 : getUPDATETIME().hashCode());
        result = prime * result + ((getYL1() == null) ? 0 : getYL1().hashCode());
        result = prime * result + ((getYL2() == null) ? 0 : getYL2().hashCode());
        result = prime * result + ((getJGMC() == null) ? 0 : getJGMC().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", CSCS=").append(CSCS);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", JGMC=").append(JGMC);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}