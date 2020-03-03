package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_HOS_MZ_JZTJ
 * @author 
 */
public class TbHosMzJztj extends TbHosMzJztjKey implements Serializable {
    /**
     * 门诊人数
     */
    private BigDecimal MZRS;

    /**
     * 门诊收入
     */
    private BigDecimal MZSR;

    /**
     * 入院人数
     */
    private BigDecimal RYRS;

    /**
     * 入院收入
     */
    private BigDecimal RYSR;

    /**
     * 统计记录生成时间
     */
    private Date TJSJ;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public BigDecimal getMZRS() {
        return MZRS;
    }

    public void setMZRS(BigDecimal MZRS) {
        this.MZRS = MZRS;
    }

    public BigDecimal getMZSR() {
        return MZSR;
    }

    public void setMZSR(BigDecimal MZSR) {
        this.MZSR = MZSR;
    }

    public BigDecimal getRYRS() {
        return RYRS;
    }

    public void setRYRS(BigDecimal RYRS) {
        this.RYRS = RYRS;
    }

    public BigDecimal getRYSR() {
        return RYSR;
    }

    public void setRYSR(BigDecimal RYSR) {
        this.RYSR = RYSR;
    }

    public Date getTJSJ() {
        return TJSJ;
    }

    public void setTJSJ(Date TJSJ) {
        this.TJSJ = TJSJ;
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
        TbHosMzJztj other = (TbHosMzJztj) that;
        return (this.getJGBM() == null ? other.getJGBM() == null : this.getJGBM().equals(other.getJGBM()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getMZRS() == null ? other.getMZRS() == null : this.getMZRS().equals(other.getMZRS()))
            && (this.getMZSR() == null ? other.getMZSR() == null : this.getMZSR().equals(other.getMZSR()))
            && (this.getRYRS() == null ? other.getRYRS() == null : this.getRYRS().equals(other.getRYRS()))
            && (this.getRYSR() == null ? other.getRYSR() == null : this.getRYSR().equals(other.getRYSR()))
            && (this.getTJSJ() == null ? other.getTJSJ() == null : this.getTJSJ().equals(other.getTJSJ()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJGBM() == null) ? 0 : getJGBM().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getMZRS() == null) ? 0 : getMZRS().hashCode());
        result = prime * result + ((getMZSR() == null) ? 0 : getMZSR().hashCode());
        result = prime * result + ((getRYRS() == null) ? 0 : getRYRS().hashCode());
        result = prime * result + ((getRYSR() == null) ? 0 : getRYSR().hashCode());
        result = prime * result + ((getTJSJ() == null) ? 0 : getTJSJ().hashCode());
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
        sb.append(", MZRS=").append(MZRS);
        sb.append(", MZSR=").append(MZSR);
        sb.append(", RYRS=").append(RYRS);
        sb.append(", RYSR=").append(RYSR);
        sb.append(", TJSJ=").append(TJSJ);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}