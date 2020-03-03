package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.util.Date;

/**
 * TB_ACQUISITION_SYSTEM_DIC
 * @author 
 */
public class TbAcquisitionSystemDic implements Serializable {
    /**
     * 系统编码 主键
     */
    private String XTBM;

    /**
     * 系统名称
     */
    private String XTMC;

    /**
     * 系统部署所属服务器（多项以逗号隔开）
     */
    private String XTFWQ;

    /**
     * 系统源码来源
     */
    private String XTYMLY;

    /**
     * 系统具有的操作功能
     */
    private String XTJYDCZ;

    /**
     * 更新时间
     */
    private String PC_UPDATETIME;

    /**
     * 信息更新时间
     */
    private Date UPDATETIME;

    private String YL1;

    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getXTBM() {
        return XTBM;
    }

    public void setXTBM(String XTBM) {
        this.XTBM = XTBM;
    }

    public String getXTMC() {
        return XTMC;
    }

    public void setXTMC(String XTMC) {
        this.XTMC = XTMC;
    }

    public String getXTFWQ() {
        return XTFWQ;
    }

    public void setXTFWQ(String XTFWQ) {
        this.XTFWQ = XTFWQ;
    }

    public String getXTYMLY() {
        return XTYMLY;
    }

    public void setXTYMLY(String XTYMLY) {
        this.XTYMLY = XTYMLY;
    }

    public String getXTJYDCZ() {
        return XTJYDCZ;
    }

    public void setXTJYDCZ(String XTJYDCZ) {
        this.XTJYDCZ = XTJYDCZ;
    }

    public String getPC_UPDATETIME() {
        return PC_UPDATETIME;
    }

    public void setPC_UPDATETIME(String PC_UPDATETIME) {
        this.PC_UPDATETIME = PC_UPDATETIME;
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
        TbAcquisitionSystemDic other = (TbAcquisitionSystemDic) that;
        return (this.getXTBM() == null ? other.getXTBM() == null : this.getXTBM().equals(other.getXTBM()))
            && (this.getXTMC() == null ? other.getXTMC() == null : this.getXTMC().equals(other.getXTMC()))
            && (this.getXTFWQ() == null ? other.getXTFWQ() == null : this.getXTFWQ().equals(other.getXTFWQ()))
            && (this.getXTYMLY() == null ? other.getXTYMLY() == null : this.getXTYMLY().equals(other.getXTYMLY()))
            && (this.getXTJYDCZ() == null ? other.getXTJYDCZ() == null : this.getXTJYDCZ().equals(other.getXTJYDCZ()))
            && (this.getPC_UPDATETIME() == null ? other.getPC_UPDATETIME() == null : this.getPC_UPDATETIME().equals(other.getPC_UPDATETIME()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getXTBM() == null) ? 0 : getXTBM().hashCode());
        result = prime * result + ((getXTMC() == null) ? 0 : getXTMC().hashCode());
        result = prime * result + ((getXTFWQ() == null) ? 0 : getXTFWQ().hashCode());
        result = prime * result + ((getXTYMLY() == null) ? 0 : getXTYMLY().hashCode());
        result = prime * result + ((getXTJYDCZ() == null) ? 0 : getXTJYDCZ().hashCode());
        result = prime * result + ((getPC_UPDATETIME() == null) ? 0 : getPC_UPDATETIME().hashCode());
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
        sb.append(", XTBM=").append(XTBM);
        sb.append(", XTMC=").append(XTMC);
        sb.append(", XTFWQ=").append(XTFWQ);
        sb.append(", XTYMLY=").append(XTYMLY);
        sb.append(", XTJYDCZ=").append(XTJYDCZ);
        sb.append(", PC_UPDATETIME=").append(PC_UPDATETIME);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}