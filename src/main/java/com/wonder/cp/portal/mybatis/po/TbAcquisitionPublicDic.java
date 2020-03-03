package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.util.Date;

/**
 * TB_ACQUISITION_PUBLIC_DIC
 * @author 
 */
public class TbAcquisitionPublicDic implements Serializable {
    /**
     * 操作代码 主键
     */
    private String CZDM;

    /**
     * 操作名称
     */
    private String CZMC;

    /**
     * 操作权限角色代码
     */
    private String CZQX_ROLE_DM;

    /**
     * 操作权限角色名称
     */
    private String CZQX_ROLE_MC;

    /**
     * 更新时间
     */
    private Date UPDATETIME;

    private String YL1;

    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getCZDM() {
        return CZDM;
    }

    public void setCZDM(String CZDM) {
        this.CZDM = CZDM;
    }

    public String getCZMC() {
        return CZMC;
    }

    public void setCZMC(String CZMC) {
        this.CZMC = CZMC;
    }

    public String getCZQX_ROLE_DM() {
        return CZQX_ROLE_DM;
    }

    public void setCZQX_ROLE_DM(String CZQX_ROLE_DM) {
        this.CZQX_ROLE_DM = CZQX_ROLE_DM;
    }

    public String getCZQX_ROLE_MC() {
        return CZQX_ROLE_MC;
    }

    public void setCZQX_ROLE_MC(String CZQX_ROLE_MC) {
        this.CZQX_ROLE_MC = CZQX_ROLE_MC;
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
        TbAcquisitionPublicDic other = (TbAcquisitionPublicDic) that;
        return (this.getCZDM() == null ? other.getCZDM() == null : this.getCZDM().equals(other.getCZDM()))
            && (this.getCZMC() == null ? other.getCZMC() == null : this.getCZMC().equals(other.getCZMC()))
            && (this.getCZQX_ROLE_DM() == null ? other.getCZQX_ROLE_DM() == null : this.getCZQX_ROLE_DM().equals(other.getCZQX_ROLE_DM()))
            && (this.getCZQX_ROLE_MC() == null ? other.getCZQX_ROLE_MC() == null : this.getCZQX_ROLE_MC().equals(other.getCZQX_ROLE_MC()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCZDM() == null) ? 0 : getCZDM().hashCode());
        result = prime * result + ((getCZMC() == null) ? 0 : getCZMC().hashCode());
        result = prime * result + ((getCZQX_ROLE_DM() == null) ? 0 : getCZQX_ROLE_DM().hashCode());
        result = prime * result + ((getCZQX_ROLE_MC() == null) ? 0 : getCZQX_ROLE_MC().hashCode());
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
        sb.append(", CZDM=").append(CZDM);
        sb.append(", CZMC=").append(CZMC);
        sb.append(", CZQX_ROLE_DM=").append(CZQX_ROLE_DM);
        sb.append(", CZQX_ROLE_MC=").append(CZQX_ROLE_MC);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}