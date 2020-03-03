package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_SERVICE_PUBLIC
 * @author 
 */
public class TbServicePublicKey implements Serializable {
    /**
     * 年月
     */
    private String DATEYM;

    /**
     * 机构编码
     */
    private String JGBM;

    private static final long serialVersionUID = 1L;

    public String getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(String DATEYM) {
        this.DATEYM = DATEYM;
    }

    public String getJGBM() {
        return JGBM;
    }

    public void setJGBM(String JGBM) {
        this.JGBM = JGBM;
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
        TbServicePublicKey other = (TbServicePublicKey) that;
        return (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getJGBM() == null ? other.getJGBM() == null : this.getJGBM().equals(other.getJGBM()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getJGBM() == null) ? 0 : getJGBM().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", JGBM=").append(JGBM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}