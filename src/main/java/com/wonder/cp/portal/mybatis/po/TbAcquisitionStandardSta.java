package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_ACQUISITION_STANDARD_STA
 * @author 
 */
public class TbAcquisitionStandardSta implements Serializable {
    /**
     * 标准代码 主键
     */
    private String BZDM;

    /**
     * 标准名称
     */
    private String BZMC;

    /**
     * 标准上传时间 yyyy-dd-mm
     */
    private String SCSJ;

    /**
     * 标准类型（平台标准或国加标准）
     */
    private Short BZTYPE;

    /**
     * 信息项数目
     */
    private BigDecimal INFOR_ITEM;

    private String YL1;

    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getBZDM() {
        return BZDM;
    }

    public void setBZDM(String BZDM) {
        this.BZDM = BZDM;
    }

    public String getBZMC() {
        return BZMC;
    }

    public void setBZMC(String BZMC) {
        this.BZMC = BZMC;
    }

    public String getSCSJ() {
        return SCSJ;
    }

    public void setSCSJ(String SCSJ) {
        this.SCSJ = SCSJ;
    }

    public Short getBZTYPE() {
        return BZTYPE;
    }

    public void setBZTYPE(Short BZTYPE) {
        this.BZTYPE = BZTYPE;
    }

    public BigDecimal getINFOR_ITEM() {
        return INFOR_ITEM;
    }

    public void setINFOR_ITEM(BigDecimal INFOR_ITEM) {
        this.INFOR_ITEM = INFOR_ITEM;
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
        TbAcquisitionStandardSta other = (TbAcquisitionStandardSta) that;
        return (this.getBZDM() == null ? other.getBZDM() == null : this.getBZDM().equals(other.getBZDM()))
            && (this.getBZMC() == null ? other.getBZMC() == null : this.getBZMC().equals(other.getBZMC()))
            && (this.getSCSJ() == null ? other.getSCSJ() == null : this.getSCSJ().equals(other.getSCSJ()))
            && (this.getBZTYPE() == null ? other.getBZTYPE() == null : this.getBZTYPE().equals(other.getBZTYPE()))
            && (this.getINFOR_ITEM() == null ? other.getINFOR_ITEM() == null : this.getINFOR_ITEM().equals(other.getINFOR_ITEM()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBZDM() == null) ? 0 : getBZDM().hashCode());
        result = prime * result + ((getBZMC() == null) ? 0 : getBZMC().hashCode());
        result = prime * result + ((getSCSJ() == null) ? 0 : getSCSJ().hashCode());
        result = prime * result + ((getBZTYPE() == null) ? 0 : getBZTYPE().hashCode());
        result = prime * result + ((getINFOR_ITEM() == null) ? 0 : getINFOR_ITEM().hashCode());
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
        sb.append(", BZDM=").append(BZDM);
        sb.append(", BZMC=").append(BZMC);
        sb.append(", SCSJ=").append(SCSJ);
        sb.append(", BZTYPE=").append(BZTYPE);
        sb.append(", INFOR_ITEM=").append(INFOR_ITEM);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}