package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_ACQUISITION_QUA_ANAL
 * @author 
 */
public class TbAcquisitionQuaAnalKey implements Serializable {
    /**
     * 医疗机构编码 复合主键
     */
    private String YLJGDM;

    /**
     * 数据表编码 复合主键，（与《数据表抽取字典表》的数据表编码进行关
     */
    private String TABLECODE;

    /**
     * 数据年月
     */
    private String DATEYM;

    private static final long serialVersionUID = 1L;

    public String getYLJGDM() {
        return YLJGDM;
    }

    public void setYLJGDM(String YLJGDM) {
        this.YLJGDM = YLJGDM;
    }

    public String getTABLECODE() {
        return TABLECODE;
    }

    public void setTABLECODE(String TABLECODE) {
        this.TABLECODE = TABLECODE;
    }

    public String getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(String DATEYM) {
        this.DATEYM = DATEYM;
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
        TbAcquisitionQuaAnalKey other = (TbAcquisitionQuaAnalKey) that;
        return (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()))
            && (this.getTABLECODE() == null ? other.getTABLECODE() == null : this.getTABLECODE().equals(other.getTABLECODE()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        result = prime * result + ((getTABLECODE() == null) ? 0 : getTABLECODE().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", YLJGDM=").append(YLJGDM);
        sb.append(", TABLECODE=").append(TABLECODE);
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}