package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_SERVICE_MEDICAL
 * @author 
 */
public class TbServiceMedical extends TbServiceMedicalKey implements Serializable {
    /**
     * 诊疗辅助总次数
     */
    private BigDecimal ZLFZZCS;

    /**
     * 重复用药
     */
    private BigDecimal CFYY;

    /**
     * 重复检查
     */
    private BigDecimal CFJC;

    /**
     * 重复检验
     */
    private BigDecimal CFJY;

    /**
     * 区级转诊
     */
    private BigDecimal QJZZ;

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

    public BigDecimal getZLFZZCS() {
        return ZLFZZCS;
    }

    public void setZLFZZCS(BigDecimal ZLFZZCS) {
        this.ZLFZZCS = ZLFZZCS;
    }

    public BigDecimal getCFYY() {
        return CFYY;
    }

    public void setCFYY(BigDecimal CFYY) {
        this.CFYY = CFYY;
    }

    public BigDecimal getCFJC() {
        return CFJC;
    }

    public void setCFJC(BigDecimal CFJC) {
        this.CFJC = CFJC;
    }

    public BigDecimal getCFJY() {
        return CFJY;
    }

    public void setCFJY(BigDecimal CFJY) {
        this.CFJY = CFJY;
    }

    public BigDecimal getQJZZ() {
        return QJZZ;
    }

    public void setQJZZ(BigDecimal QJZZ) {
        this.QJZZ = QJZZ;
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
        TbServiceMedical other = (TbServiceMedical) that;
        return (this.getJGBM() == null ? other.getJGBM() == null : this.getJGBM().equals(other.getJGBM()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getZLFZZCS() == null ? other.getZLFZZCS() == null : this.getZLFZZCS().equals(other.getZLFZZCS()))
            && (this.getCFYY() == null ? other.getCFYY() == null : this.getCFYY().equals(other.getCFYY()))
            && (this.getCFJC() == null ? other.getCFJC() == null : this.getCFJC().equals(other.getCFJC()))
            && (this.getCFJY() == null ? other.getCFJY() == null : this.getCFJY().equals(other.getCFJY()))
            && (this.getQJZZ() == null ? other.getQJZZ() == null : this.getQJZZ().equals(other.getQJZZ()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()))
            && (this.getJGMC() == null ? other.getJGMC() == null : this.getJGMC().equals(other.getJGMC()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJGBM() == null) ? 0 : getJGBM().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getZLFZZCS() == null) ? 0 : getZLFZZCS().hashCode());
        result = prime * result + ((getCFYY() == null) ? 0 : getCFYY().hashCode());
        result = prime * result + ((getCFJC() == null) ? 0 : getCFJC().hashCode());
        result = prime * result + ((getCFJY() == null) ? 0 : getCFJY().hashCode());
        result = prime * result + ((getQJZZ() == null) ? 0 : getQJZZ().hashCode());
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
        sb.append(", ZLFZZCS=").append(ZLFZZCS);
        sb.append(", CFYY=").append(CFYY);
        sb.append(", CFJC=").append(CFJC);
        sb.append(", CFJY=").append(CFJY);
        sb.append(", QJZZ=").append(QJZZ);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", JGMC=").append(JGMC);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}