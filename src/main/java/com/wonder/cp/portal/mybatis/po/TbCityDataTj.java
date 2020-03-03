package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_CITY_DATA_TJ
 * @author 
 */
public class TbCityDataTj implements Serializable {
    /**
     * 年-月主键：yyyyMM
     */
    private String DATEYM;

    /**
     * 妇幼数据总数
     */
    private BigDecimal FYSJZS;

    /**
     * 计免数据总数
     */
    private BigDecimal JMSJZS;

    /**
     * 全员人口总数
     */
    private BigDecimal QYRKZS;

    /**
     * 市卫统总数
     */
    private BigDecimal SWTZS;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(String DATEYM) {
        this.DATEYM = DATEYM;
    }

    public BigDecimal getFYSJZS() {
        return FYSJZS;
    }

    public void setFYSJZS(BigDecimal FYSJZS) {
        this.FYSJZS = FYSJZS;
    }

    public BigDecimal getJMSJZS() {
        return JMSJZS;
    }

    public void setJMSJZS(BigDecimal JMSJZS) {
        this.JMSJZS = JMSJZS;
    }

    public BigDecimal getQYRKZS() {
        return QYRKZS;
    }

    public void setQYRKZS(BigDecimal QYRKZS) {
        this.QYRKZS = QYRKZS;
    }

    public BigDecimal getSWTZS() {
        return SWTZS;
    }

    public void setSWTZS(BigDecimal SWTZS) {
        this.SWTZS = SWTZS;
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
        TbCityDataTj other = (TbCityDataTj) that;
        return (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getFYSJZS() == null ? other.getFYSJZS() == null : this.getFYSJZS().equals(other.getFYSJZS()))
            && (this.getJMSJZS() == null ? other.getJMSJZS() == null : this.getJMSJZS().equals(other.getJMSJZS()))
            && (this.getQYRKZS() == null ? other.getQYRKZS() == null : this.getQYRKZS().equals(other.getQYRKZS()))
            && (this.getSWTZS() == null ? other.getSWTZS() == null : this.getSWTZS().equals(other.getSWTZS()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getFYSJZS() == null) ? 0 : getFYSJZS().hashCode());
        result = prime * result + ((getJMSJZS() == null) ? 0 : getJMSJZS().hashCode());
        result = prime * result + ((getQYRKZS() == null) ? 0 : getQYRKZS().hashCode());
        result = prime * result + ((getSWTZS() == null) ? 0 : getSWTZS().hashCode());
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
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", FYSJZS=").append(FYSJZS);
        sb.append(", JMSJZS=").append(JMSJZS);
        sb.append(", QYRKZS=").append(QYRKZS);
        sb.append(", SWTZS=").append(SWTZS);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}