package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_ACQUISITION_QUA_ANAL
 * @author 
 */
public class TbAcquisitionQuaAnal extends TbAcquisitionQuaAnalKey implements Serializable {
    /**
     * 医疗机构名称
     */
    private String YLJGMC;

    /**
     * 评价指标 1.一致性，2.完整性。。。待补充完整）
     */
    private Short PJZB;

    /**
     * 评分
     */
    private BigDecimal GRADE;

    /**
     * 评价更新时间
     */
    private Date UPDATETIME;

    private String YL1;

    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getYLJGMC() {
        return YLJGMC;
    }

    public void setYLJGMC(String YLJGMC) {
        this.YLJGMC = YLJGMC;
    }

    public Short getPJZB() {
        return PJZB;
    }

    public void setPJZB(Short PJZB) {
        this.PJZB = PJZB;
    }

    public BigDecimal getGRADE() {
        return GRADE;
    }

    public void setGRADE(BigDecimal GRADE) {
        this.GRADE = GRADE;
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
        TbAcquisitionQuaAnal other = (TbAcquisitionQuaAnal) that;
        return (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getTABLECODE() == null ? other.getTABLECODE() == null : this.getTABLECODE().equals(other.getTABLECODE()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getYLJGMC() == null ? other.getYLJGMC() == null : this.getYLJGMC().equals(other.getYLJGMC()))
            && (this.getPJZB() == null ? other.getPJZB() == null : this.getPJZB().equals(other.getPJZB()))
            && (this.getGRADE() == null ? other.getGRADE() == null : this.getGRADE().equals(other.getGRADE()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getTABLECODE() == null) ? 0 : getTABLECODE().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getYLJGMC() == null) ? 0 : getYLJGMC().hashCode());
        result = prime * result + ((getPJZB() == null) ? 0 : getPJZB().hashCode());
        result = prime * result + ((getGRADE() == null) ? 0 : getGRADE().hashCode());
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
        sb.append(", YLJGMC=").append(YLJGMC);
        sb.append(", PJZB=").append(PJZB);
        sb.append(", GRADE=").append(GRADE);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}