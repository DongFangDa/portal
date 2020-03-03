package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.util.Date;

/**
 * TB_SERVER_UPDATE_RECORD_LOG
 * @author 
 */
public class TbServerUpdateRecordLogKey implements Serializable {
    /**
     * 服务器编号
     */
    private String FWQBH;

    /**
     * 操作时间
     */
    private Date CZTIME;

    private static final long serialVersionUID = 1L;

    public String getFWQBH() {
        return FWQBH;
    }

    public void setFWQBH(String FWQBH) {
        this.FWQBH = FWQBH;
    }

    public Date getCZTIME() {
        return CZTIME;
    }

    public void setCZTIME(Date CZTIME) {
        this.CZTIME = CZTIME;
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
        TbServerUpdateRecordLogKey other = (TbServerUpdateRecordLogKey) that;
        return (this.getFWQBH() == null ? other.getFWQBH() == null : this.getFWQBH().equals(other.getFWQBH()))
            && (this.getCZTIME() == null ? other.getCZTIME() == null : this.getCZTIME().equals(other.getCZTIME()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFWQBH() == null) ? 0 : getFWQBH().hashCode());
        result = prime * result + ((getCZTIME() == null) ? 0 : getCZTIME().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", FWQBH=").append(FWQBH);
        sb.append(", CZTIME=").append(CZTIME);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}