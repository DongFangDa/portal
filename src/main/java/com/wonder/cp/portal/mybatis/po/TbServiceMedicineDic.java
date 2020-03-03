package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_SERVICE_MEDICINE_DIC
 * @author 
 */
public class TbServiceMedicineDic implements Serializable {
    /**
     * 海虹码
     */
    private String PRODUCT_ID;

    /**
     * 通用名
     */
    private String NAME_CHN;

    /**
     * 产品名称
     */
    private String PRODUCT_NAME;

    /**
     * 商品名
     */
    private String TRADE_NAME;

    /**
     * 剂型
     */
    private String DOSAGE_FORM_NAME;

    /**
     * 规格
     */
    private String SPEC;

    /**
     * 装换比
     */
    private String STAND_RATE;

    /**
     * 规格单位
     */
    private String SPEC_UNIT;

    /**
     * 包材
     */
    private String WRAP_NAME;

    /**
     * 生成企业名称
     */
    private String MANUFACTURE_NAME;

    /**
     * 投标价格
     */
    private BigDecimal BID_PRICE;

    private static final long serialVersionUID = 1L;

    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(String PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public String getNAME_CHN() {
        return NAME_CHN;
    }

    public void setNAME_CHN(String NAME_CHN) {
        this.NAME_CHN = NAME_CHN;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.PRODUCT_NAME = PRODUCT_NAME;
    }

    public String getTRADE_NAME() {
        return TRADE_NAME;
    }

    public void setTRADE_NAME(String TRADE_NAME) {
        this.TRADE_NAME = TRADE_NAME;
    }

    public String getDOSAGE_FORM_NAME() {
        return DOSAGE_FORM_NAME;
    }

    public void setDOSAGE_FORM_NAME(String DOSAGE_FORM_NAME) {
        this.DOSAGE_FORM_NAME = DOSAGE_FORM_NAME;
    }

    public String getSPEC() {
        return SPEC;
    }

    public void setSPEC(String SPEC) {
        this.SPEC = SPEC;
    }

    public String getSTAND_RATE() {
        return STAND_RATE;
    }

    public void setSTAND_RATE(String STAND_RATE) {
        this.STAND_RATE = STAND_RATE;
    }

    public String getSPEC_UNIT() {
        return SPEC_UNIT;
    }

    public void setSPEC_UNIT(String SPEC_UNIT) {
        this.SPEC_UNIT = SPEC_UNIT;
    }

    public String getWRAP_NAME() {
        return WRAP_NAME;
    }

    public void setWRAP_NAME(String WRAP_NAME) {
        this.WRAP_NAME = WRAP_NAME;
    }

    public String getMANUFACTURE_NAME() {
        return MANUFACTURE_NAME;
    }

    public void setMANUFACTURE_NAME(String MANUFACTURE_NAME) {
        this.MANUFACTURE_NAME = MANUFACTURE_NAME;
    }

    public BigDecimal getBID_PRICE() {
        return BID_PRICE;
    }

    public void setBID_PRICE(BigDecimal BID_PRICE) {
        this.BID_PRICE = BID_PRICE;
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
        TbServiceMedicineDic other = (TbServiceMedicineDic) that;
        return (this.getPRODUCT_ID() == null ? other.getPRODUCT_ID() == null : this.getPRODUCT_ID().equals(other.getPRODUCT_ID()))
            && (this.getNAME_CHN() == null ? other.getNAME_CHN() == null : this.getNAME_CHN().equals(other.getNAME_CHN()))
            && (this.getPRODUCT_NAME() == null ? other.getPRODUCT_NAME() == null : this.getPRODUCT_NAME().equals(other.getPRODUCT_NAME()))
            && (this.getTRADE_NAME() == null ? other.getTRADE_NAME() == null : this.getTRADE_NAME().equals(other.getTRADE_NAME()))
            && (this.getDOSAGE_FORM_NAME() == null ? other.getDOSAGE_FORM_NAME() == null : this.getDOSAGE_FORM_NAME().equals(other.getDOSAGE_FORM_NAME()))
            && (this.getSPEC() == null ? other.getSPEC() == null : this.getSPEC().equals(other.getSPEC()))
            && (this.getSTAND_RATE() == null ? other.getSTAND_RATE() == null : this.getSTAND_RATE().equals(other.getSTAND_RATE()))
            && (this.getSPEC_UNIT() == null ? other.getSPEC_UNIT() == null : this.getSPEC_UNIT().equals(other.getSPEC_UNIT()))
            && (this.getWRAP_NAME() == null ? other.getWRAP_NAME() == null : this.getWRAP_NAME().equals(other.getWRAP_NAME()))
            && (this.getMANUFACTURE_NAME() == null ? other.getMANUFACTURE_NAME() == null : this.getMANUFACTURE_NAME().equals(other.getMANUFACTURE_NAME()))
            && (this.getBID_PRICE() == null ? other.getBID_PRICE() == null : this.getBID_PRICE().equals(other.getBID_PRICE()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPRODUCT_ID() == null) ? 0 : getPRODUCT_ID().hashCode());
        result = prime * result + ((getNAME_CHN() == null) ? 0 : getNAME_CHN().hashCode());
        result = prime * result + ((getPRODUCT_NAME() == null) ? 0 : getPRODUCT_NAME().hashCode());
        result = prime * result + ((getTRADE_NAME() == null) ? 0 : getTRADE_NAME().hashCode());
        result = prime * result + ((getDOSAGE_FORM_NAME() == null) ? 0 : getDOSAGE_FORM_NAME().hashCode());
        result = prime * result + ((getSPEC() == null) ? 0 : getSPEC().hashCode());
        result = prime * result + ((getSTAND_RATE() == null) ? 0 : getSTAND_RATE().hashCode());
        result = prime * result + ((getSPEC_UNIT() == null) ? 0 : getSPEC_UNIT().hashCode());
        result = prime * result + ((getWRAP_NAME() == null) ? 0 : getWRAP_NAME().hashCode());
        result = prime * result + ((getMANUFACTURE_NAME() == null) ? 0 : getMANUFACTURE_NAME().hashCode());
        result = prime * result + ((getBID_PRICE() == null) ? 0 : getBID_PRICE().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", PRODUCT_ID=").append(PRODUCT_ID);
        sb.append(", NAME_CHN=").append(NAME_CHN);
        sb.append(", PRODUCT_NAME=").append(PRODUCT_NAME);
        sb.append(", TRADE_NAME=").append(TRADE_NAME);
        sb.append(", DOSAGE_FORM_NAME=").append(DOSAGE_FORM_NAME);
        sb.append(", SPEC=").append(SPEC);
        sb.append(", STAND_RATE=").append(STAND_RATE);
        sb.append(", SPEC_UNIT=").append(SPEC_UNIT);
        sb.append(", WRAP_NAME=").append(WRAP_NAME);
        sb.append(", MANUFACTURE_NAME=").append(MANUFACTURE_NAME);
        sb.append(", BID_PRICE=").append(BID_PRICE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}