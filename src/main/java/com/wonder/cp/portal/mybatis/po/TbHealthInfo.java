package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_HEALTH_INFO
 * @author 
 */
public class TbHealthInfo implements Serializable {
    /**
     * 序号主键
     */
    private BigDecimal INDEXNO;

    /**
     * 性别（1.男，2.女，0：未知）
     */
    private BigDecimal XB;

    /**
     * 年纪分布1：0-17，2：18-28，3：29-40，4：41-65，5：66及以上，0：未知
     */
    private BigDecimal NJFB;

    /**
     * 人口数量
     */
    private BigDecimal RKSL;

    /**
     * 总人口数量标识（0：否，1：是）
     */
    private BigDecimal ZRKSLBS;

    /**
     * 年份yyyy
     */
    private String NF;

    /**
     * 数据更新时间
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

    public BigDecimal getXB() {
        return XB;
    }

    public void setXB(BigDecimal XB) {
        this.XB = XB;
    }

    public BigDecimal getNJFB() {
        return NJFB;
    }

    public void setNJFB(BigDecimal NJFB) {
        this.NJFB = NJFB;
    }

    public BigDecimal getRKSL() {
        return RKSL;
    }

    public void setRKSL(BigDecimal RKSL) {
        this.RKSL = RKSL;
    }

    public BigDecimal getZRKSLBS() {
        return ZRKSLBS;
    }

    public void setZRKSLBS(BigDecimal ZRKSLBS) {
        this.ZRKSLBS = ZRKSLBS;
    }

    public String getNF() {
        return NF;
    }

    public void setNF(String NF) {
        this.NF = NF;
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
        TbHealthInfo other = (TbHealthInfo) that;
        return (this.getINDEXNO() == null ? other.getINDEXNO() == null : this.getINDEXNO().equals(other.getINDEXNO()))
            && (this.getXB() == null ? other.getXB() == null : this.getXB().equals(other.getXB()))
            && (this.getNJFB() == null ? other.getNJFB() == null : this.getNJFB().equals(other.getNJFB()))
            && (this.getRKSL() == null ? other.getRKSL() == null : this.getRKSL().equals(other.getRKSL()))
            && (this.getZRKSLBS() == null ? other.getZRKSLBS() == null : this.getZRKSLBS().equals(other.getZRKSLBS()))
            && (this.getNF() == null ? other.getNF() == null : this.getNF().equals(other.getNF()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getINDEXNO() == null) ? 0 : getINDEXNO().hashCode());
        result = prime * result + ((getXB() == null) ? 0 : getXB().hashCode());
        result = prime * result + ((getNJFB() == null) ? 0 : getNJFB().hashCode());
        result = prime * result + ((getRKSL() == null) ? 0 : getRKSL().hashCode());
        result = prime * result + ((getZRKSLBS() == null) ? 0 : getZRKSLBS().hashCode());
        result = prime * result + ((getNF() == null) ? 0 : getNF().hashCode());
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
        sb.append(", XB=").append(XB);
        sb.append(", NJFB=").append(NJFB);
        sb.append(", RKSL=").append(RKSL);
        sb.append(", ZRKSLBS=").append(ZRKSLBS);
        sb.append(", NF=").append(NF);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}