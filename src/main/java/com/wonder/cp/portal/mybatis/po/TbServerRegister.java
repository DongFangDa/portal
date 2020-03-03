package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_SERVER_REGISTER
 * @author 
 */
public class TbServerRegister implements Serializable {
    /**
     * 编号主键
     */
    private String BH;

    /**
     * 厂商/分组 代码
     */
    private String FZDM;

    /**
     * 厂商/分组 名称
     */
    private String FZMC;

    /**
     * 服务器作用类型1.数据库服务2.应用服务3.测试服务4.一体机
     */
    private BigDecimal FWQ_TYPE;

    /**
     * 服务器网络开放类型1.内网2.外网
     */
    private BigDecimal FWQ_INTERNET_TYPE;

    /**
     * 名称
     */
    private String MC;

    /**
     * CPU
     */
    private String CPU;

    /**
     * 内存/GB单位：GB
     */
    private BigDecimal NC;

    /**
     * 系统盘
     */
    private String XTP;

    /**
     * 云硬盘
     */
    private String YYP;

    /**
     * 操作系统
     */
    private String CZXT;

    /**
     * 用户名
     */
    private String YHM;

    /**
     * 新密码
     */
    private String NEW_PSW;

    /**
     * 原root密码
     */
    private String ROOT_PSW;

    /**
     * 内网IP
     */
    private String NWIP;

    /**
     * 内网网关
     */
    private String NWWG;

    /**
     * 政务外网IP
     */
    private String ZWWWIP;

    /**
     * 光纤直联地址
     */
    private String GXZLDZ;

    /**
     * 是否需要镜像恢复
     */
    private String SFXYJXHF;

    /**
     * 提供时间
     */
    private BigDecimal TGSJ;

    /**
     * 说明
     */
    private String SM;

    /**
     * 配置说明
     */
    private String PZSM;

    /**
     * 服务器增设时间
     */
    private BigDecimal FWQZSSJ;

    /**
     * 启用状态1.启用2.未启用
     */
    private BigDecimal QYZT;

    /**
     * 信息更新时间
     */
    private BigDecimal UPDATETIME;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getBH() {
        return BH;
    }

    public void setBH(String BH) {
        this.BH = BH;
    }

    public String getFZDM() {
        return FZDM;
    }

    public void setFZDM(String FZDM) {
        this.FZDM = FZDM;
    }

    public String getFZMC() {
        return FZMC;
    }

    public void setFZMC(String FZMC) {
        this.FZMC = FZMC;
    }

    public BigDecimal getFWQ_TYPE() {
        return FWQ_TYPE;
    }

    public void setFWQ_TYPE(BigDecimal FWQ_TYPE) {
        this.FWQ_TYPE = FWQ_TYPE;
    }

    public BigDecimal getFWQ_INTERNET_TYPE() {
        return FWQ_INTERNET_TYPE;
    }

    public void setFWQ_INTERNET_TYPE(BigDecimal FWQ_INTERNET_TYPE) {
        this.FWQ_INTERNET_TYPE = FWQ_INTERNET_TYPE;
    }

    public String getMC() {
        return MC;
    }

    public void setMC(String MC) {
        this.MC = MC;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public BigDecimal getNC() {
        return NC;
    }

    public void setNC(BigDecimal NC) {
        this.NC = NC;
    }

    public String getXTP() {
        return XTP;
    }

    public void setXTP(String XTP) {
        this.XTP = XTP;
    }

    public String getYYP() {
        return YYP;
    }

    public void setYYP(String YYP) {
        this.YYP = YYP;
    }

    public String getCZXT() {
        return CZXT;
    }

    public void setCZXT(String CZXT) {
        this.CZXT = CZXT;
    }

    public String getYHM() {
        return YHM;
    }

    public void setYHM(String YHM) {
        this.YHM = YHM;
    }

    public String getNEW_PSW() {
        return NEW_PSW;
    }

    public void setNEW_PSW(String NEW_PSW) {
        this.NEW_PSW = NEW_PSW;
    }

    public String getROOT_PSW() {
        return ROOT_PSW;
    }

    public void setROOT_PSW(String ROOT_PSW) {
        this.ROOT_PSW = ROOT_PSW;
    }

    public String getNWIP() {
        return NWIP;
    }

    public void setNWIP(String NWIP) {
        this.NWIP = NWIP;
    }

    public String getNWWG() {
        return NWWG;
    }

    public void setNWWG(String NWWG) {
        this.NWWG = NWWG;
    }

    public String getZWWWIP() {
        return ZWWWIP;
    }

    public void setZWWWIP(String ZWWWIP) {
        this.ZWWWIP = ZWWWIP;
    }

    public String getGXZLDZ() {
        return GXZLDZ;
    }

    public void setGXZLDZ(String GXZLDZ) {
        this.GXZLDZ = GXZLDZ;
    }

    public String getSFXYJXHF() {
        return SFXYJXHF;
    }

    public void setSFXYJXHF(String SFXYJXHF) {
        this.SFXYJXHF = SFXYJXHF;
    }

    public BigDecimal getTGSJ() {
        return TGSJ;
    }

    public void setTGSJ(BigDecimal TGSJ) {
        this.TGSJ = TGSJ;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public String getPZSM() {
        return PZSM;
    }

    public void setPZSM(String PZSM) {
        this.PZSM = PZSM;
    }

    public BigDecimal getFWQZSSJ() {
        return FWQZSSJ;
    }

    public void setFWQZSSJ(BigDecimal FWQZSSJ) {
        this.FWQZSSJ = FWQZSSJ;
    }

    public BigDecimal getQYZT() {
        return QYZT;
    }

    public void setQYZT(BigDecimal QYZT) {
        this.QYZT = QYZT;
    }

    public BigDecimal getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(BigDecimal UPDATETIME) {
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
        TbServerRegister other = (TbServerRegister) that;
        return (this.getBH() == null ? other.getBH() == null : this.getBH().equals(other.getBH()))
            && (this.getFZDM() == null ? other.getFZDM() == null : this.getFZDM().equals(other.getFZDM()))
            && (this.getFZMC() == null ? other.getFZMC() == null : this.getFZMC().equals(other.getFZMC()))
            && (this.getFWQ_TYPE() == null ? other.getFWQ_TYPE() == null : this.getFWQ_TYPE().equals(other.getFWQ_TYPE()))
            && (this.getFWQ_INTERNET_TYPE() == null ? other.getFWQ_INTERNET_TYPE() == null : this.getFWQ_INTERNET_TYPE().equals(other.getFWQ_INTERNET_TYPE()))
            && (this.getMC() == null ? other.getMC() == null : this.getMC().equals(other.getMC()))
            && (this.getCPU() == null ? other.getCPU() == null : this.getCPU().equals(other.getCPU()))
            && (this.getNC() == null ? other.getNC() == null : this.getNC().equals(other.getNC()))
            && (this.getXTP() == null ? other.getXTP() == null : this.getXTP().equals(other.getXTP()))
            && (this.getYYP() == null ? other.getYYP() == null : this.getYYP().equals(other.getYYP()))
            && (this.getCZXT() == null ? other.getCZXT() == null : this.getCZXT().equals(other.getCZXT()))
            && (this.getYHM() == null ? other.getYHM() == null : this.getYHM().equals(other.getYHM()))
            && (this.getNEW_PSW() == null ? other.getNEW_PSW() == null : this.getNEW_PSW().equals(other.getNEW_PSW()))
            && (this.getROOT_PSW() == null ? other.getROOT_PSW() == null : this.getROOT_PSW().equals(other.getROOT_PSW()))
            && (this.getNWIP() == null ? other.getNWIP() == null : this.getNWIP().equals(other.getNWIP()))
            && (this.getNWWG() == null ? other.getNWWG() == null : this.getNWWG().equals(other.getNWWG()))
            && (this.getZWWWIP() == null ? other.getZWWWIP() == null : this.getZWWWIP().equals(other.getZWWWIP()))
            && (this.getGXZLDZ() == null ? other.getGXZLDZ() == null : this.getGXZLDZ().equals(other.getGXZLDZ()))
            && (this.getSFXYJXHF() == null ? other.getSFXYJXHF() == null : this.getSFXYJXHF().equals(other.getSFXYJXHF()))
            && (this.getTGSJ() == null ? other.getTGSJ() == null : this.getTGSJ().equals(other.getTGSJ()))
            && (this.getSM() == null ? other.getSM() == null : this.getSM().equals(other.getSM()))
            && (this.getPZSM() == null ? other.getPZSM() == null : this.getPZSM().equals(other.getPZSM()))
            && (this.getFWQZSSJ() == null ? other.getFWQZSSJ() == null : this.getFWQZSSJ().equals(other.getFWQZSSJ()))
            && (this.getQYZT() == null ? other.getQYZT() == null : this.getQYZT().equals(other.getQYZT()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBH() == null) ? 0 : getBH().hashCode());
        result = prime * result + ((getFZDM() == null) ? 0 : getFZDM().hashCode());
        result = prime * result + ((getFZMC() == null) ? 0 : getFZMC().hashCode());
        result = prime * result + ((getFWQ_TYPE() == null) ? 0 : getFWQ_TYPE().hashCode());
        result = prime * result + ((getFWQ_INTERNET_TYPE() == null) ? 0 : getFWQ_INTERNET_TYPE().hashCode());
        result = prime * result + ((getMC() == null) ? 0 : getMC().hashCode());
        result = prime * result + ((getCPU() == null) ? 0 : getCPU().hashCode());
        result = prime * result + ((getNC() == null) ? 0 : getNC().hashCode());
        result = prime * result + ((getXTP() == null) ? 0 : getXTP().hashCode());
        result = prime * result + ((getYYP() == null) ? 0 : getYYP().hashCode());
        result = prime * result + ((getCZXT() == null) ? 0 : getCZXT().hashCode());
        result = prime * result + ((getYHM() == null) ? 0 : getYHM().hashCode());
        result = prime * result + ((getNEW_PSW() == null) ? 0 : getNEW_PSW().hashCode());
        result = prime * result + ((getROOT_PSW() == null) ? 0 : getROOT_PSW().hashCode());
        result = prime * result + ((getNWIP() == null) ? 0 : getNWIP().hashCode());
        result = prime * result + ((getNWWG() == null) ? 0 : getNWWG().hashCode());
        result = prime * result + ((getZWWWIP() == null) ? 0 : getZWWWIP().hashCode());
        result = prime * result + ((getGXZLDZ() == null) ? 0 : getGXZLDZ().hashCode());
        result = prime * result + ((getSFXYJXHF() == null) ? 0 : getSFXYJXHF().hashCode());
        result = prime * result + ((getTGSJ() == null) ? 0 : getTGSJ().hashCode());
        result = prime * result + ((getSM() == null) ? 0 : getSM().hashCode());
        result = prime * result + ((getPZSM() == null) ? 0 : getPZSM().hashCode());
        result = prime * result + ((getFWQZSSJ() == null) ? 0 : getFWQZSSJ().hashCode());
        result = prime * result + ((getQYZT() == null) ? 0 : getQYZT().hashCode());
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
        sb.append(", BH=").append(BH);
        sb.append(", FZDM=").append(FZDM);
        sb.append(", FZMC=").append(FZMC);
        sb.append(", FWQ_TYPE=").append(FWQ_TYPE);
        sb.append(", FWQ_INTERNET_TYPE=").append(FWQ_INTERNET_TYPE);
        sb.append(", MC=").append(MC);
        sb.append(", CPU=").append(CPU);
        sb.append(", NC=").append(NC);
        sb.append(", XTP=").append(XTP);
        sb.append(", YYP=").append(YYP);
        sb.append(", CZXT=").append(CZXT);
        sb.append(", YHM=").append(YHM);
        sb.append(", NEW_PSW=").append(NEW_PSW);
        sb.append(", ROOT_PSW=").append(ROOT_PSW);
        sb.append(", NWIP=").append(NWIP);
        sb.append(", NWWG=").append(NWWG);
        sb.append(", ZWWWIP=").append(ZWWWIP);
        sb.append(", GXZLDZ=").append(GXZLDZ);
        sb.append(", SFXYJXHF=").append(SFXYJXHF);
        sb.append(", TGSJ=").append(TGSJ);
        sb.append(", SM=").append(SM);
        sb.append(", PZSM=").append(PZSM);
        sb.append(", FWQZSSJ=").append(FWQZSSJ);
        sb.append(", QYZT=").append(QYZT);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}