package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_DIC_PRACTITIONER
 * @author 
 */
public class TbDicPractitioner extends TbDicPractitionerKey implements Serializable {
    /**
     * 注册名称
     */
    private String ZCM;

    /**
     * 姓名
     */
    private String XM;

    /**
     * 身份证号
     */
    private String SFZH;

    /**
     * 所属科室
     */
    private String SSKS;

    /**
     * 职务代码
     */
    private String ZWDM;

    /**
     * 职务名称
     */
    private String ZHIW;

    /**
     * 职称代码
     */
    private String ZCDM;

    /**
     * 职称名称
     */
    private String ZHIC;

    /**
     * 出生日期
     */
    private String CSRQ;

    /**
     * 人员类别
     */
    private String LB;

    /**
     * 人员级别
     */
    private String RYJB;

    /**
     * 医生职称
     */
    private String YSZC;

    /**
     * 医师/卫生监督员执业证书编码
     */
    private String ZYZSB;

    /**
     * 专业
     */
    private String ZHUANY;

    /**
     * 修改标志0.未修改 1.已修改
     */
    private BigDecimal XGBZ;

    /**
     * 更改时间
     */
    private Date GGSJ;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getZCM() {
        return ZCM;
    }

    public void setZCM(String ZCM) {
        this.ZCM = ZCM;
    }

    public String getXM() {
        return XM;
    }

    public void setXM(String XM) {
        this.XM = XM;
    }

    public String getSFZH() {
        return SFZH;
    }

    public void setSFZH(String SFZH) {
        this.SFZH = SFZH;
    }

    public String getSSKS() {
        return SSKS;
    }

    public void setSSKS(String SSKS) {
        this.SSKS = SSKS;
    }

    public String getZWDM() {
        return ZWDM;
    }

    public void setZWDM(String ZWDM) {
        this.ZWDM = ZWDM;
    }

    public String getZHIW() {
        return ZHIW;
    }

    public void setZHIW(String ZHIW) {
        this.ZHIW = ZHIW;
    }

    public String getZCDM() {
        return ZCDM;
    }

    public void setZCDM(String ZCDM) {
        this.ZCDM = ZCDM;
    }

    public String getZHIC() {
        return ZHIC;
    }

    public void setZHIC(String ZHIC) {
        this.ZHIC = ZHIC;
    }

    public String getCSRQ() {
        return CSRQ;
    }

    public void setCSRQ(String CSRQ) {
        this.CSRQ = CSRQ;
    }

    public String getLB() {
        return LB;
    }

    public void setLB(String LB) {
        this.LB = LB;
    }

    public String getRYJB() {
        return RYJB;
    }

    public void setRYJB(String RYJB) {
        this.RYJB = RYJB;
    }

    public String getYSZC() {
        return YSZC;
    }

    public void setYSZC(String YSZC) {
        this.YSZC = YSZC;
    }

    public String getZYZSB() {
        return ZYZSB;
    }

    public void setZYZSB(String ZYZSB) {
        this.ZYZSB = ZYZSB;
    }

    public String getZHUANY() {
        return ZHUANY;
    }

    public void setZHUANY(String ZHUANY) {
        this.ZHUANY = ZHUANY;
    }

    public BigDecimal getXGBZ() {
        return XGBZ;
    }

    public void setXGBZ(BigDecimal XGBZ) {
        this.XGBZ = XGBZ;
    }

    public Date getGGSJ() {
        return GGSJ;
    }

    public void setGGSJ(Date GGSJ) {
        this.GGSJ = GGSJ;
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
        TbDicPractitioner other = (TbDicPractitioner) that;
        return (this.getGH() == null ? other.getGH() == null : this.getGH().equals(other.getGH()))
            && (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getZCM() == null ? other.getZCM() == null : this.getZCM().equals(other.getZCM()))
            && (this.getXM() == null ? other.getXM() == null : this.getXM().equals(other.getXM()))
            && (this.getSFZH() == null ? other.getSFZH() == null : this.getSFZH().equals(other.getSFZH()))
            && (this.getSSKS() == null ? other.getSSKS() == null : this.getSSKS().equals(other.getSSKS()))
            && (this.getZWDM() == null ? other.getZWDM() == null : this.getZWDM().equals(other.getZWDM()))
            && (this.getZHIW() == null ? other.getZHIW() == null : this.getZHIW().equals(other.getZHIW()))
            && (this.getZCDM() == null ? other.getZCDM() == null : this.getZCDM().equals(other.getZCDM()))
            && (this.getZHIC() == null ? other.getZHIC() == null : this.getZHIC().equals(other.getZHIC()))
            && (this.getCSRQ() == null ? other.getCSRQ() == null : this.getCSRQ().equals(other.getCSRQ()))
            && (this.getLB() == null ? other.getLB() == null : this.getLB().equals(other.getLB()))
            && (this.getRYJB() == null ? other.getRYJB() == null : this.getRYJB().equals(other.getRYJB()))
            && (this.getYSZC() == null ? other.getYSZC() == null : this.getYSZC().equals(other.getYSZC()))
            && (this.getZYZSB() == null ? other.getZYZSB() == null : this.getZYZSB().equals(other.getZYZSB()))
            && (this.getZHUANY() == null ? other.getZHUANY() == null : this.getZHUANY().equals(other.getZHUANY()))
            && (this.getXGBZ() == null ? other.getXGBZ() == null : this.getXGBZ().equals(other.getXGBZ()))
            && (this.getGGSJ() == null ? other.getGGSJ() == null : this.getGGSJ().equals(other.getGGSJ()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGH() == null) ? 0 : getGH().hashCode());
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getZCM() == null) ? 0 : getZCM().hashCode());
        result = prime * result + ((getXM() == null) ? 0 : getXM().hashCode());
        result = prime * result + ((getSFZH() == null) ? 0 : getSFZH().hashCode());
        result = prime * result + ((getSSKS() == null) ? 0 : getSSKS().hashCode());
        result = prime * result + ((getZWDM() == null) ? 0 : getZWDM().hashCode());
        result = prime * result + ((getZHIW() == null) ? 0 : getZHIW().hashCode());
        result = prime * result + ((getZCDM() == null) ? 0 : getZCDM().hashCode());
        result = prime * result + ((getZHIC() == null) ? 0 : getZHIC().hashCode());
        result = prime * result + ((getCSRQ() == null) ? 0 : getCSRQ().hashCode());
        result = prime * result + ((getLB() == null) ? 0 : getLB().hashCode());
        result = prime * result + ((getRYJB() == null) ? 0 : getRYJB().hashCode());
        result = prime * result + ((getYSZC() == null) ? 0 : getYSZC().hashCode());
        result = prime * result + ((getZYZSB() == null) ? 0 : getZYZSB().hashCode());
        result = prime * result + ((getZHUANY() == null) ? 0 : getZHUANY().hashCode());
        result = prime * result + ((getXGBZ() == null) ? 0 : getXGBZ().hashCode());
        result = prime * result + ((getGGSJ() == null) ? 0 : getGGSJ().hashCode());
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
        sb.append(", ZCM=").append(ZCM);
        sb.append(", XM=").append(XM);
        sb.append(", SFZH=").append(SFZH);
        sb.append(", SSKS=").append(SSKS);
        sb.append(", ZWDM=").append(ZWDM);
        sb.append(", ZHIW=").append(ZHIW);
        sb.append(", ZCDM=").append(ZCDM);
        sb.append(", ZHIC=").append(ZHIC);
        sb.append(", CSRQ=").append(CSRQ);
        sb.append(", LB=").append(LB);
        sb.append(", RYJB=").append(RYJB);
        sb.append(", YSZC=").append(YSZC);
        sb.append(", ZYZSB=").append(ZYZSB);
        sb.append(", ZHUANY=").append(ZHUANY);
        sb.append(", XGBZ=").append(XGBZ);
        sb.append(", GGSJ=").append(GGSJ);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}