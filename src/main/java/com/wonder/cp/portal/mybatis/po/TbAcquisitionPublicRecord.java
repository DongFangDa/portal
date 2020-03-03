package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.util.Date;

/**
 * TB_ACQUISITION_PUBLIC_RECORD
 * @author 
 */
public class TbAcquisitionPublicRecord implements Serializable {
    /**
     * 序号
     */
    private String BM;

    /**
     * 系统编码 （与《系统字典表》中“系统编码”关联）
     */
    private String XTBM;

    /**
     * 操作代码 （与《系统公共操作字典表》中“操作代码”关联）
     */
    private String CZDM;

    /**
     * 具体操作内容
     */
    private String JTCZNR;

    /**
     * 操作用户编码
     */
    private String CZYHBM;

    /**
     * 操作用户名
     */
    private String CZYHM;

    /**
     * 操作时间
     */
    private Date CZTIME;

    private String YL1;

    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getBM() {
        return BM;
    }

    public void setBM(String BM) {
        this.BM = BM;
    }

    public String getXTBM() {
        return XTBM;
    }

    public void setXTBM(String XTBM) {
        this.XTBM = XTBM;
    }

    public String getCZDM() {
        return CZDM;
    }

    public void setCZDM(String CZDM) {
        this.CZDM = CZDM;
    }

    public String getJTCZNR() {
        return JTCZNR;
    }

    public void setJTCZNR(String JTCZNR) {
        this.JTCZNR = JTCZNR;
    }

    public String getCZYHBM() {
        return CZYHBM;
    }

    public void setCZYHBM(String CZYHBM) {
        this.CZYHBM = CZYHBM;
    }

    public String getCZYHM() {
        return CZYHM;
    }

    public void setCZYHM(String CZYHM) {
        this.CZYHM = CZYHM;
    }

    public Date getCZTIME() {
        return CZTIME;
    }

    public void setCZTIME(Date CZTIME) {
        this.CZTIME = CZTIME;
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
        TbAcquisitionPublicRecord other = (TbAcquisitionPublicRecord) that;
        return (this.getBM() == null ? other.getBM() == null : this.getBM().equals(other.getBM()))
            && (this.getXTBM() == null ? other.getXTBM() == null : this.getXTBM().equals(other.getXTBM()))
            && (this.getCZDM() == null ? other.getCZDM() == null : this.getCZDM().equals(other.getCZDM()))
            && (this.getJTCZNR() == null ? other.getJTCZNR() == null : this.getJTCZNR().equals(other.getJTCZNR()))
            && (this.getCZYHBM() == null ? other.getCZYHBM() == null : this.getCZYHBM().equals(other.getCZYHBM()))
            && (this.getCZYHM() == null ? other.getCZYHM() == null : this.getCZYHM().equals(other.getCZYHM()))
            && (this.getCZTIME() == null ? other.getCZTIME() == null : this.getCZTIME().equals(other.getCZTIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBM() == null) ? 0 : getBM().hashCode());
        result = prime * result + ((getXTBM() == null) ? 0 : getXTBM().hashCode());
        result = prime * result + ((getCZDM() == null) ? 0 : getCZDM().hashCode());
        result = prime * result + ((getJTCZNR() == null) ? 0 : getJTCZNR().hashCode());
        result = prime * result + ((getCZYHBM() == null) ? 0 : getCZYHBM().hashCode());
        result = prime * result + ((getCZYHM() == null) ? 0 : getCZYHM().hashCode());
        result = prime * result + ((getCZTIME() == null) ? 0 : getCZTIME().hashCode());
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
        sb.append(", BM=").append(BM);
        sb.append(", XTBM=").append(XTBM);
        sb.append(", CZDM=").append(CZDM);
        sb.append(", JTCZNR=").append(JTCZNR);
        sb.append(", CZYHBM=").append(CZYHBM);
        sb.append(", CZYHM=").append(CZYHM);
        sb.append(", CZTIME=").append(CZTIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}