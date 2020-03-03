package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_POPULATION_TJ
 * @author 
 */
public class TbPopulationTj implements Serializable {
    /**
     * 序号主键
     */
    private BigDecimal INDEXNO;

    /**
     * 资源项数量
     */
    private BigDecimal ZYXSL;

    /**
     * 数据量
     */
    private BigDecimal SJL;

    /**
     * 常住人口数
     */
    private BigDecimal CZRKS;

    /**
     * 户籍人口数
     */
    private BigDecimal HJRKS;

    /**
     * 流动人口数
     */
    private BigDecimal LDRKS;

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

    public BigDecimal getINDEXNO() {
        return INDEXNO;
    }

    public void setINDEXNO(BigDecimal INDEXNO) {
        this.INDEXNO = INDEXNO;
    }

    public BigDecimal getZYXSL() {
        return ZYXSL;
    }

    public void setZYXSL(BigDecimal ZYXSL) {
        this.ZYXSL = ZYXSL;
    }

    public BigDecimal getSJL() {
        return SJL;
    }

    public void setSJL(BigDecimal SJL) {
        this.SJL = SJL;
    }

    public BigDecimal getCZRKS() {
        return CZRKS;
    }

    public void setCZRKS(BigDecimal CZRKS) {
        this.CZRKS = CZRKS;
    }

    public BigDecimal getHJRKS() {
        return HJRKS;
    }

    public void setHJRKS(BigDecimal HJRKS) {
        this.HJRKS = HJRKS;
    }

    public BigDecimal getLDRKS() {
        return LDRKS;
    }

    public void setLDRKS(BigDecimal LDRKS) {
        this.LDRKS = LDRKS;
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
        TbPopulationTj other = (TbPopulationTj) that;
        return (this.getINDEXNO() == null ? other.getINDEXNO() == null : this.getINDEXNO().equals(other.getINDEXNO()))
            && (this.getZYXSL() == null ? other.getZYXSL() == null : this.getZYXSL().equals(other.getZYXSL()))
            && (this.getSJL() == null ? other.getSJL() == null : this.getSJL().equals(other.getSJL()))
            && (this.getCZRKS() == null ? other.getCZRKS() == null : this.getCZRKS().equals(other.getCZRKS()))
            && (this.getHJRKS() == null ? other.getHJRKS() == null : this.getHJRKS().equals(other.getHJRKS()))
            && (this.getLDRKS() == null ? other.getLDRKS() == null : this.getLDRKS().equals(other.getLDRKS()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getINDEXNO() == null) ? 0 : getINDEXNO().hashCode());
        result = prime * result + ((getZYXSL() == null) ? 0 : getZYXSL().hashCode());
        result = prime * result + ((getSJL() == null) ? 0 : getSJL().hashCode());
        result = prime * result + ((getCZRKS() == null) ? 0 : getCZRKS().hashCode());
        result = prime * result + ((getHJRKS() == null) ? 0 : getHJRKS().hashCode());
        result = prime * result + ((getLDRKS() == null) ? 0 : getLDRKS().hashCode());
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
        sb.append(", ZYXSL=").append(ZYXSL);
        sb.append(", SJL=").append(SJL);
        sb.append(", CZRKS=").append(CZRKS);
        sb.append(", HJRKS=").append(HJRKS);
        sb.append(", LDRKS=").append(LDRKS);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}