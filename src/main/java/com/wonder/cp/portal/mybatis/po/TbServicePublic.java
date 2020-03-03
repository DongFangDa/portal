package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_SERVICE_PUBLIC
 * @author 
 */
public class TbServicePublic extends TbServicePublicKey implements Serializable {
    /**
     * 公卫协调总次数
     */
    private BigDecimal GWXTZCS;

    /**
     * 慢病报卡
     */
    private BigDecimal MBBK;

    /**
     * 传染病报卡
     */
    private BigDecimal CRBBK;

    /**
     * 死亡报卡
     */
    private BigDecimal SWBK;

    /**
     * 协调随访
     */
    private BigDecimal XTSF;

    /**
     * 档案调阅次数
     */
    private BigDecimal DADYCS;

    /**
     * 时间
     */
    private Date SJ;

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

    public BigDecimal getGWXTZCS() {
        return GWXTZCS;
    }

    public void setGWXTZCS(BigDecimal GWXTZCS) {
        this.GWXTZCS = GWXTZCS;
    }

    public BigDecimal getMBBK() {
        return MBBK;
    }

    public void setMBBK(BigDecimal MBBK) {
        this.MBBK = MBBK;
    }

    public BigDecimal getCRBBK() {
        return CRBBK;
    }

    public void setCRBBK(BigDecimal CRBBK) {
        this.CRBBK = CRBBK;
    }

    public BigDecimal getSWBK() {
        return SWBK;
    }

    public void setSWBK(BigDecimal SWBK) {
        this.SWBK = SWBK;
    }

    public BigDecimal getXTSF() {
        return XTSF;
    }

    public void setXTSF(BigDecimal XTSF) {
        this.XTSF = XTSF;
    }

    public BigDecimal getDADYCS() {
        return DADYCS;
    }

    public void setDADYCS(BigDecimal DADYCS) {
        this.DADYCS = DADYCS;
    }

    public Date getSJ() {
        return SJ;
    }

    public void setSJ(Date SJ) {
        this.SJ = SJ;
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
        TbServicePublic other = (TbServicePublic) that;
        return (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getJGBM() == null ? other.getJGBM() == null : this.getJGBM().equals(other.getJGBM()))
            && (this.getGWXTZCS() == null ? other.getGWXTZCS() == null : this.getGWXTZCS().equals(other.getGWXTZCS()))
            && (this.getMBBK() == null ? other.getMBBK() == null : this.getMBBK().equals(other.getMBBK()))
            && (this.getCRBBK() == null ? other.getCRBBK() == null : this.getCRBBK().equals(other.getCRBBK()))
            && (this.getSWBK() == null ? other.getSWBK() == null : this.getSWBK().equals(other.getSWBK()))
            && (this.getXTSF() == null ? other.getXTSF() == null : this.getXTSF().equals(other.getXTSF()))
            && (this.getDADYCS() == null ? other.getDADYCS() == null : this.getDADYCS().equals(other.getDADYCS()))
            && (this.getSJ() == null ? other.getSJ() == null : this.getSJ().equals(other.getSJ()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()))
            && (this.getJGMC() == null ? other.getJGMC() == null : this.getJGMC().equals(other.getJGMC()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getJGBM() == null) ? 0 : getJGBM().hashCode());
        result = prime * result + ((getGWXTZCS() == null) ? 0 : getGWXTZCS().hashCode());
        result = prime * result + ((getMBBK() == null) ? 0 : getMBBK().hashCode());
        result = prime * result + ((getCRBBK() == null) ? 0 : getCRBBK().hashCode());
        result = prime * result + ((getSWBK() == null) ? 0 : getSWBK().hashCode());
        result = prime * result + ((getXTSF() == null) ? 0 : getXTSF().hashCode());
        result = prime * result + ((getDADYCS() == null) ? 0 : getDADYCS().hashCode());
        result = prime * result + ((getSJ() == null) ? 0 : getSJ().hashCode());
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
        sb.append(", GWXTZCS=").append(GWXTZCS);
        sb.append(", MBBK=").append(MBBK);
        sb.append(", CRBBK=").append(CRBBK);
        sb.append(", SWBK=").append(SWBK);
        sb.append(", XTSF=").append(XTSF);
        sb.append(", DADYCS=").append(DADYCS);
        sb.append(", SJ=").append(SJ);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", JGMC=").append(JGMC);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}