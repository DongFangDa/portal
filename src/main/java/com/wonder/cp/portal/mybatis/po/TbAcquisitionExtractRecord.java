package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_ACQUISITION_EXTRACT_RECORD
 * @author 
 */
public class TbAcquisitionExtractRecord extends TbAcquisitionExtractRecordKey implements Serializable {
    /**
     * 医疗机构名称
     */
    private String YLJGMC;

    /**
     * 操作原因 1.日常自动抽取，2.手动补传）
     */
    private String OPERATIONREASON;

    /**
     * 抽取数量
     */
    private String GETCOUNT;

    /**
     * 抽取完成（0.是，1.否）
     */
    private Short ISSUCCESSFUL;

    /**
     * 抽取失败原因
     */
    private String FAILREASON;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getYLJGMC() {
        return YLJGMC;
    }

    public void setYLJGMC(String YLJGMC) {
        this.YLJGMC = YLJGMC;
    }

    public String getOPERATIONREASON() {
        return OPERATIONREASON;
    }

    public void setOPERATIONREASON(String OPERATIONREASON) {
        this.OPERATIONREASON = OPERATIONREASON;
    }

    public String getGETCOUNT() {
        return GETCOUNT;
    }

    public void setGETCOUNT(String GETCOUNT) {
        this.GETCOUNT = GETCOUNT;
    }

    public Short getISSUCCESSFUL() {
        return ISSUCCESSFUL;
    }

    public void setISSUCCESSFUL(Short ISSUCCESSFUL) {
        this.ISSUCCESSFUL = ISSUCCESSFUL;
    }

    public String getFAILREASON() {
        return FAILREASON;
    }

    public void setFAILREASON(String FAILREASON) {
        this.FAILREASON = FAILREASON;
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
        TbAcquisitionExtractRecord other = (TbAcquisitionExtractRecord) that;
        return (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getTABLENAME() == null ? other.getTABLENAME() == null : this.getTABLENAME().equals(other.getTABLENAME()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getDATEYMD() == null ? other.getDATEYMD() == null : this.getDATEYMD().equals(other.getDATEYMD()))
            && (this.getYLJGMC() == null ? other.getYLJGMC() == null : this.getYLJGMC().equals(other.getYLJGMC()))
            && (this.getOPERATIONREASON() == null ? other.getOPERATIONREASON() == null : this.getOPERATIONREASON().equals(other.getOPERATIONREASON()))
            && (this.getGETCOUNT() == null ? other.getGETCOUNT() == null : this.getGETCOUNT().equals(other.getGETCOUNT()))
            && (this.getISSUCCESSFUL() == null ? other.getISSUCCESSFUL() == null : this.getISSUCCESSFUL().equals(other.getISSUCCESSFUL()))
            && (this.getFAILREASON() == null ? other.getFAILREASON() == null : this.getFAILREASON().equals(other.getFAILREASON()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getTABLENAME() == null) ? 0 : getTABLENAME().hashCode());
        result = prime * result + ((getUPDATETIME() == null) ? 0 : getUPDATETIME().hashCode());
        result = prime * result + ((getDATEYMD() == null) ? 0 : getDATEYMD().hashCode());
        result = prime * result + ((getYLJGMC() == null) ? 0 : getYLJGMC().hashCode());
        result = prime * result + ((getOPERATIONREASON() == null) ? 0 : getOPERATIONREASON().hashCode());
        result = prime * result + ((getGETCOUNT() == null) ? 0 : getGETCOUNT().hashCode());
        result = prime * result + ((getISSUCCESSFUL() == null) ? 0 : getISSUCCESSFUL().hashCode());
        result = prime * result + ((getFAILREASON() == null) ? 0 : getFAILREASON().hashCode());
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
        sb.append(", YLJGMC=").append(YLJGMC);
        sb.append(", OPERATIONREASON=").append(OPERATIONREASON);
        sb.append(", GETCOUNT=").append(GETCOUNT);
        sb.append(", ISSUCCESSFUL=").append(ISSUCCESSFUL);
        sb.append(", FAILREASON=").append(FAILREASON);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}