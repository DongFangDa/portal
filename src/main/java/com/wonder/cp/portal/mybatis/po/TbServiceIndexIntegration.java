package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_SERVICE_INDEX_INTEGRATION
 * @author 
 */
public class TbServiceIndexIntegration implements Serializable {
    /**
     * 序号 主键
     */
    private String XH;

    /**
     * 关联类型（0.未关联，1.身份证，2.免疫卡，3.出生医学证明，4.健康卡，9.其他）
     */
    private BigDecimal GLLX;

    /**
     * 数据来源（条线）1家医签约2预约平台3计划免疫4孕妇保健5健康档案
6全员人口7电子病历
8出生医学证明9儿童保健

     */
    private BigDecimal SJLY;

    /**
     * 数量
     */
    private BigDecimal SL;

    /**
     * 年-月
     */
    private String DATEYM;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getXH() {
        return XH;
    }

    public void setXH(String XH) {
        this.XH = XH;
    }

    public BigDecimal getGLLX() {
        return GLLX;
    }

    public void setGLLX(BigDecimal GLLX) {
        this.GLLX = GLLX;
    }

    public BigDecimal getSJLY() {
        return SJLY;
    }

    public void setSJLY(BigDecimal SJLY) {
        this.SJLY = SJLY;
    }

    public BigDecimal getSL() {
        return SL;
    }

    public void setSL(BigDecimal SL) {
        this.SL = SL;
    }

    public String getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(String DATEYM) {
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
        TbServiceIndexIntegration other = (TbServiceIndexIntegration) that;
        return (this.getXH() == null ? other.getXH() == null : this.getXH().equals(other.getXH()))
            && (this.getGLLX() == null ? other.getGLLX() == null : this.getGLLX().equals(other.getGLLX()))
            && (this.getSJLY() == null ? other.getSJLY() == null : this.getSJLY().equals(other.getSJLY()))
            && (this.getSL() == null ? other.getSL() == null : this.getSL().equals(other.getSL()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getXH() == null) ? 0 : getXH().hashCode());
        result = prime * result + ((getGLLX() == null) ? 0 : getGLLX().hashCode());
        result = prime * result + ((getSJLY() == null) ? 0 : getSJLY().hashCode());
        result = prime * result + ((getSL() == null) ? 0 : getSL().hashCode());
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
        sb.append(", XH=").append(XH);
        sb.append(", GLLX=").append(GLLX);
        sb.append(", SJLY=").append(SJLY);
        sb.append(", SL=").append(SL);
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}