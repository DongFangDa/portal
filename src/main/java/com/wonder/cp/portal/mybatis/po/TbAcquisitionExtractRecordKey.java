package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.util.Date;

/**
 * TB_ACQUISITION_EXTRACT_RECORD
 * @author 
 */
public class TbAcquisitionExtractRecordKey implements Serializable {
    /**
     * 医疗机构编码  复合主键
     */
    private String YLJGDM;

    /**
     * 抽取数据表名称 复合主键，（与《数据表抽取字典表》的数据表编码进行关联）
     */
    private String TABLENAME;

    /**
     * 抽取完成时间 复合主键
     */
    private Date UPDATETIME;

    /**
     * 业务时间 复合主键，yyyy-MM-dd
     */
    private String DATEYMD;

    private static final long serialVersionUID = 1L;

    public String getYLJGDM() {
        return YLJGDM;
    }

    public void setYLJGDM(String YLJGDM) {
        this.YLJGDM = YLJGDM;
    }

    public String getTABLENAME() {
        return TABLENAME;
    }

    public void setTABLENAME(String TABLENAME) {
        this.TABLENAME = TABLENAME;
    }

    public Date getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(Date UPDATETIME) {
        this.UPDATETIME = UPDATETIME;
    }

    public String getDATEYMD() {
        return DATEYMD;
    }

    public void setDATEYMD(String DATEYMD) {
        this.DATEYMD = DATEYMD;
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
        TbAcquisitionExtractRecordKey other = (TbAcquisitionExtractRecordKey) that;
        return (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getTABLENAME() == null ? other.getTABLENAME() == null : this.getTABLENAME().equals(other.getTABLENAME()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getDATEYMD() == null ? other.getDATEYMD() == null : this.getDATEYMD().equals(other.getDATEYMD()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getTABLENAME() == null) ? 0 : getTABLENAME().hashCode());
        result = prime * result + ((getUPDATETIME() == null) ? 0 : getUPDATETIME().hashCode());
        result = prime * result + ((getDATEYMD() == null) ? 0 : getDATEYMD().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", YLJGDM=").append(YLJGDM);
        sb.append(", TABLENAME=").append(TABLENAME);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", DATEYMD=").append(DATEYMD);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}