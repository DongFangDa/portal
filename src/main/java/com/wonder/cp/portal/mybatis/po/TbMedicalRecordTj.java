package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_MEDICAL_RECORD_TJ
 * @author 
 */
public class TbMedicalRecordTj implements Serializable {
    /**
     * 机构代码
     */
    private String YLJGDM;

    /**
     * 电子病历总数
     */
    private BigDecimal DZBLZS;

    /**
     * 健康档案总数
     */
    private BigDecimal JKDAZS;

    /**
     * 体检报告总数
     */
    private BigDecimal TJBGZS;

    /**
     * 检验报告总数
     */
    private BigDecimal JYBGZS;

    /**
     * 检查报告总数
     */
    private BigDecimal JCBGZS;

    /**
     * 统计时间
     */
    private Date TJSJ;

    /**
     * 年-月
     */
    private BigDecimal DATEYM;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getYLJGDM() {
        return YLJGDM;
    }

    public void setYLJGDM(String YLJGDM) {
        this.YLJGDM = YLJGDM;
    }

    public BigDecimal getDZBLZS() {
        return DZBLZS;
    }

    public void setDZBLZS(BigDecimal DZBLZS) {
        this.DZBLZS = DZBLZS;
    }

    public BigDecimal getJKDAZS() {
        return JKDAZS;
    }

    public void setJKDAZS(BigDecimal JKDAZS) {
        this.JKDAZS = JKDAZS;
    }

    public BigDecimal getTJBGZS() {
        return TJBGZS;
    }

    public void setTJBGZS(BigDecimal TJBGZS) {
        this.TJBGZS = TJBGZS;
    }

    public BigDecimal getJYBGZS() {
        return JYBGZS;
    }

    public void setJYBGZS(BigDecimal JYBGZS) {
        this.JYBGZS = JYBGZS;
    }

    public BigDecimal getJCBGZS() {
        return JCBGZS;
    }

    public void setJCBGZS(BigDecimal JCBGZS) {
        this.JCBGZS = JCBGZS;
    }

    public Date getTJSJ() {
        return TJSJ;
    }

    public void setTJSJ(Date TJSJ) {
        this.TJSJ = TJSJ;
    }

    public BigDecimal getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(BigDecimal DATEYM) {
        this.DATEYM = DATEYM;
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
        TbMedicalRecordTj other = (TbMedicalRecordTj) that;
        return (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getDZBLZS() == null ? other.getDZBLZS() == null : this.getDZBLZS().equals(other.getDZBLZS()))
            && (this.getJKDAZS() == null ? other.getJKDAZS() == null : this.getJKDAZS().equals(other.getJKDAZS()))
            && (this.getTJBGZS() == null ? other.getTJBGZS() == null : this.getTJBGZS().equals(other.getTJBGZS()))
            && (this.getJYBGZS() == null ? other.getJYBGZS() == null : this.getJYBGZS().equals(other.getJYBGZS()))
            && (this.getJCBGZS() == null ? other.getJCBGZS() == null : this.getJCBGZS().equals(other.getJCBGZS()))
            && (this.getTJSJ() == null ? other.getTJSJ() == null : this.getTJSJ().equals(other.getTJSJ()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getDZBLZS() == null) ? 0 : getDZBLZS().hashCode());
        result = prime * result + ((getJKDAZS() == null) ? 0 : getJKDAZS().hashCode());
        result = prime * result + ((getTJBGZS() == null) ? 0 : getTJBGZS().hashCode());
        result = prime * result + ((getJYBGZS() == null) ? 0 : getJYBGZS().hashCode());
        result = prime * result + ((getJCBGZS() == null) ? 0 : getJCBGZS().hashCode());
        result = prime * result + ((getTJSJ() == null) ? 0 : getTJSJ().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
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
        sb.append(", YLJGDM=").append(YLJGDM);
        sb.append(", DZBLZS=").append(DZBLZS);
        sb.append(", JKDAZS=").append(JKDAZS);
        sb.append(", TJBGZS=").append(TJBGZS);
        sb.append(", JYBGZS=").append(JYBGZS);
        sb.append(", JCBGZS=").append(JCBGZS);
        sb.append(", TJSJ=").append(TJSJ);
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}