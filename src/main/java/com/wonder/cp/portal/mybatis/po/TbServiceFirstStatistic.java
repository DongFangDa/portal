package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.util.Date;

/**
 * TB_SERVICE_FIRST_STATISTIC
 * @author 
 */
public class TbServiceFirstStatistic implements Serializable {
    /**
     * 统计对应日期
     */
    private Date TJ_TIME;

    /**
     * 转出医院代码
     */
    private String ZCYYDM;

    /**
     * 转出医院名称
     */
    private String ZCYYMC;

    /**
     * 转入医院代码
     */
    private String ZRYYDM;

    /**
     * 转入医院名称
     */
    private String ZRYYMC;

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

    public Date getTJ_TIME() {
        return TJ_TIME;
    }

    public void setTJ_TIME(Date TJ_TIME) {
        this.TJ_TIME = TJ_TIME;
    }

    public String getZCYYDM() {
        return ZCYYDM;
    }

    public void setZCYYDM(String ZCYYDM) {
        this.ZCYYDM = ZCYYDM;
    }

    public String getZCYYMC() {
        return ZCYYMC;
    }

    public void setZCYYMC(String ZCYYMC) {
        this.ZCYYMC = ZCYYMC;
    }

    public String getZRYYDM() {
        return ZRYYDM;
    }

    public void setZRYYDM(String ZRYYDM) {
        this.ZRYYDM = ZRYYDM;
    }

    public String getZRYYMC() {
        return ZRYYMC;
    }

    public void setZRYYMC(String ZRYYMC) {
        this.ZRYYMC = ZRYYMC;
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
        TbServiceFirstStatistic other = (TbServiceFirstStatistic) that;
        return (this.getTJ_TIME() == null ? other.getTJ_TIME() == null : this.getTJ_TIME().equals(other.getTJ_TIME()))
            && (this.getZCYYDM() == null ? other.getZCYYDM() == null : this.getZCYYDM().equals(other.getZCYYDM()))
            && (this.getZCYYMC() == null ? other.getZCYYMC() == null : this.getZCYYMC().equals(other.getZCYYMC()))
            && (this.getZRYYDM() == null ? other.getZRYYDM() == null : this.getZRYYDM().equals(other.getZRYYDM()))
            && (this.getZRYYMC() == null ? other.getZRYYMC() == null : this.getZRYYMC().equals(other.getZRYYMC()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTJ_TIME() == null) ? 0 : getTJ_TIME().hashCode());
        result = prime * result + ((getZCYYDM() == null) ? 0 : getZCYYDM().hashCode());
        result = prime * result + ((getZCYYMC() == null) ? 0 : getZCYYMC().hashCode());
        result = prime * result + ((getZRYYDM() == null) ? 0 : getZRYYDM().hashCode());
        result = prime * result + ((getZRYYMC() == null) ? 0 : getZRYYMC().hashCode());
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
        sb.append(", ZCYYDM=").append(ZCYYDM);
        sb.append(", ZCYYMC=").append(ZCYYMC);
        sb.append(", ZRYYDM=").append(ZRYYDM);
        sb.append(", ZRYYMC=").append(ZRYYMC);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}