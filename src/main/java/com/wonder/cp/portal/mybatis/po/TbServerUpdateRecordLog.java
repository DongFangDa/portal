package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_SERVER_UPDATE_RECORD_LOG
 * @author 
 */
public class TbServerUpdateRecordLog extends TbServerUpdateRecordLogKey implements Serializable {
    /**
     * 操作事件
     */
    private String CZSJ;

    /**
     * 操作后备注
     */
    private String CZHBZ;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getCZSJ() {
        return CZSJ;
    }

    public void setCZSJ(String CZSJ) {
        this.CZSJ = CZSJ;
    }

    public String getCZHBZ() {
        return CZHBZ;
    }

    public void setCZHBZ(String CZHBZ) {
        this.CZHBZ = CZHBZ;
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
        TbServerUpdateRecordLog other = (TbServerUpdateRecordLog) that;
        return (this.getFWQBH() == null ? other.getFWQBH() == null : this.getFWQBH().equals(other.getFWQBH()))
            && (this.getCZTIME() == null ? other.getCZTIME() == null : this.getCZTIME().equals(other.getCZTIME()))
            && (this.getCZSJ() == null ? other.getCZSJ() == null : this.getCZSJ().equals(other.getCZSJ()))
            && (this.getCZHBZ() == null ? other.getCZHBZ() == null : this.getCZHBZ().equals(other.getCZHBZ()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFWQBH() == null) ? 0 : getFWQBH().hashCode());
        result = prime * result + ((getCZTIME() == null) ? 0 : getCZTIME().hashCode());
        result = prime * result + ((getCZSJ() == null) ? 0 : getCZSJ().hashCode());
        result = prime * result + ((getCZHBZ() == null) ? 0 : getCZHBZ().hashCode());
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
        sb.append(", CZSJ=").append(CZSJ);
        sb.append(", CZHBZ=").append(CZHBZ);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}