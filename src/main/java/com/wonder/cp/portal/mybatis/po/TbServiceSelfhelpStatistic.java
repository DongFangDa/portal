package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_SERVICE_SELFHELP_STATISTIC
 * @author 
 */
public class TbServiceSelfhelpStatistic extends TbServiceSelfhelpStatisticKey implements Serializable {
    /**
     * 机构名称
     */
    private String JGMC;

    /**
     * 开放时间段
     */
    private String KFSJD;

    /**
     * 医疗取号次数
     */
    private BigDecimal YLQHCS;

    /**
     * 预防接种取号次数
     */
    private BigDecimal YFJZQHCS;

    /**
     * 叶酸领取取号次数
     */
    private BigDecimal YSLQQHCS;

    /**
     * 更新时间
     */
    private Date UPDATETIME;

    /**
     * yl1
     */
    private String YL1;

    /**
     * yl2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getJGMC() {
        return JGMC;
    }

    public void setJGMC(String JGMC) {
        this.JGMC = JGMC;
    }

    public String getKFSJD() {
        return KFSJD;
    }

    public void setKFSJD(String KFSJD) {
        this.KFSJD = KFSJD;
    }

    public BigDecimal getYLQHCS() {
        return YLQHCS;
    }

    public void setYLQHCS(BigDecimal YLQHCS) {
        this.YLQHCS = YLQHCS;
    }

    public BigDecimal getYFJZQHCS() {
        return YFJZQHCS;
    }

    public void setYFJZQHCS(BigDecimal YFJZQHCS) {
        this.YFJZQHCS = YFJZQHCS;
    }

    public BigDecimal getYSLQQHCS() {
        return YSLQQHCS;
    }

    public void setYSLQQHCS(BigDecimal YSLQQHCS) {
        this.YSLQQHCS = YSLQQHCS;
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
        TbServiceSelfhelpStatistic other = (TbServiceSelfhelpStatistic) that;
        return (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getJGDM() == null ? other.getJGDM() == null : this.getJGDM().equals(other.getJGDM()))
            && (this.getJGMC() == null ? other.getJGMC() == null : this.getJGMC().equals(other.getJGMC()))
            && (this.getKFSJD() == null ? other.getKFSJD() == null : this.getKFSJD().equals(other.getKFSJD()))
            && (this.getYLQHCS() == null ? other.getYLQHCS() == null : this.getYLQHCS().equals(other.getYLQHCS()))
            && (this.getYFJZQHCS() == null ? other.getYFJZQHCS() == null : this.getYFJZQHCS().equals(other.getYFJZQHCS()))
            && (this.getYSLQQHCS() == null ? other.getYSLQQHCS() == null : this.getYSLQQHCS().equals(other.getYSLQQHCS()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getJGDM() == null) ? 0 : getJGDM().hashCode());
        result = prime * result + ((getJGMC() == null) ? 0 : getJGMC().hashCode());
        result = prime * result + ((getKFSJD() == null) ? 0 : getKFSJD().hashCode());
        result = prime * result + ((getYLQHCS() == null) ? 0 : getYLQHCS().hashCode());
        result = prime * result + ((getYFJZQHCS() == null) ? 0 : getYFJZQHCS().hashCode());
        result = prime * result + ((getYSLQQHCS() == null) ? 0 : getYSLQQHCS().hashCode());
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
        sb.append(", JGMC=").append(JGMC);
        sb.append(", KFSJD=").append(KFSJD);
        sb.append(", YLQHCS=").append(YLQHCS);
        sb.append(", YFJZQHCS=").append(YFJZQHCS);
        sb.append(", YSLQQHCS=").append(YSLQQHCS);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}