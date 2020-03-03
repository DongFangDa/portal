package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_SERVICE_HEALTHY_STATISTIC
 * @author 
 */
public class TbServiceHealthyStatistic implements Serializable {
    /**
     * 编码 主键
     */
    private String INDEXNO;

    /**
     * 开放数量
     */
    private BigDecimal KFSL;

    /**
     * 开放时间段
     */
    private String KFSJD;

    /**
     * 自助体验次数
     */
    private BigDecimal ZZTYCS;

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

    public String getINDEXNO() {
        return INDEXNO;
    }

    public void setINDEXNO(String INDEXNO) {
        this.INDEXNO = INDEXNO;
    }

    public BigDecimal getKFSL() {
        return KFSL;
    }

    public void setKFSL(BigDecimal KFSL) {
        this.KFSL = KFSL;
    }

    public String getKFSJD() {
        return KFSJD;
    }

    public void setKFSJD(String KFSJD) {
        this.KFSJD = KFSJD;
    }

    public BigDecimal getZZTYCS() {
        return ZZTYCS;
    }

    public void setZZTYCS(BigDecimal ZZTYCS) {
        this.ZZTYCS = ZZTYCS;
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
        TbServiceHealthyStatistic other = (TbServiceHealthyStatistic) that;
        return (this.getINDEXNO() == null ? other.getINDEXNO() == null : this.getINDEXNO().equals(other.getINDEXNO()))
            && (this.getKFSL() == null ? other.getKFSL() == null : this.getKFSL().equals(other.getKFSL()))
            && (this.getKFSJD() == null ? other.getKFSJD() == null : this.getKFSJD().equals(other.getKFSJD()))
            && (this.getZZTYCS() == null ? other.getZZTYCS() == null : this.getZZTYCS().equals(other.getZZTYCS()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getINDEXNO() == null) ? 0 : getINDEXNO().hashCode());
        result = prime * result + ((getKFSL() == null) ? 0 : getKFSL().hashCode());
        result = prime * result + ((getKFSJD() == null) ? 0 : getKFSJD().hashCode());
        result = prime * result + ((getZZTYCS() == null) ? 0 : getZZTYCS().hashCode());
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
        sb.append(", INDEXNO=").append(INDEXNO);
        sb.append(", KFSL=").append(KFSL);
        sb.append(", KFSJD=").append(KFSJD);
        sb.append(", ZZTYCS=").append(ZZTYCS);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}