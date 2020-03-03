package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_SERVICE_PURCHASE_STATISTIC
 * @author 
 */
public class TbServicePurchaseStatistic implements Serializable {
    /**
     * 采购单号
     */
    private String ORDERID;

    /**
     * 采购药品种类
     */
    private String TYPE_COUNT;

    /**
     * 采购药品金额
     */
    private BigDecimal AMOUNT;

    /**
     * 采购到货时间（年月）
     */
    private String DATEYM;

    /**
     * 信息更新时间
     */
    private Date UPDATETIME;

    /**
     * 社区编码
     */
    private String YLJGDM;

    /**
     * 社区名称
     */
    private String YLJGMC;

    private static final long serialVersionUID = 1L;

    public String getORDERID() {
        return ORDERID;
    }

    public void setORDERID(String ORDERID) {
        this.ORDERID = ORDERID;
    }

    public String getTYPE_COUNT() {
        return TYPE_COUNT;
    }

    public void setTYPE_COUNT(String TYPE_COUNT) {
        this.TYPE_COUNT = TYPE_COUNT;
    }

    public BigDecimal getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(String DATEYM) {
        this.DATEYM = DATEYM;
    }

    public Date getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(Date UPDATETIME) {
        this.UPDATETIME = UPDATETIME;
    }

    public String getYLJGDM() {
        return YLJGDM;
    }

    public void setYLJGDM(String YLJGDM) {
        this.YLJGDM = YLJGDM;
    }

    public String getYLJGMC() {
        return YLJGMC;
    }

    public void setYLJGMC(String YLJGMC) {
        this.YLJGMC = YLJGMC;
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
        TbServicePurchaseStatistic other = (TbServicePurchaseStatistic) that;
        return (this.getORDERID() == null ? other.getORDERID() == null : this.getORDERID().equals(other.getORDERID()))
            && (this.getTYPE_COUNT() == null ? other.getTYPE_COUNT() == null : this.getTYPE_COUNT().equals(other.getTYPE_COUNT()))
            && (this.getAMOUNT() == null ? other.getAMOUNT() == null : this.getAMOUNT().equals(other.getAMOUNT()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getYLJGMC() == null ? other.getYLJGMC() == null : this.getYLJGMC().equals(other.getYLJGMC()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getORDERID() == null) ? 0 : getORDERID().hashCode());
        result = prime * result + ((getTYPE_COUNT() == null) ? 0 : getTYPE_COUNT().hashCode());
        result = prime * result + ((getAMOUNT() == null) ? 0 : getAMOUNT().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getUPDATETIME() == null) ? 0 : getUPDATETIME().hashCode());
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getYLJGMC() == null) ? 0 : getYLJGMC().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ORDERID=").append(ORDERID);
        sb.append(", TYPE_COUNT=").append(TYPE_COUNT);
        sb.append(", AMOUNT=").append(AMOUNT);
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YLJGDM=").append(YLJGDM);
        sb.append(", YLJGMC=").append(YLJGMC);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}