package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TB_HOS_MZ_JZTJ
 * @author 
 */
public class TbHosMzJztjKey implements Serializable {
    /**
     * 机构编码
     */
    private String JGBM;

    /**
     * 年-月
     */
    private BigDecimal DATEYM;

    private static final long serialVersionUID = 1L;

    public String getJGBM() {
        return JGBM;
    }

    public void setJGBM(String JGBM) {
        this.JGBM = JGBM;
    }

    public BigDecimal getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(BigDecimal DATEYM) {
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
        TbHosMzJztjKey other = (TbHosMzJztjKey) that;
        return (this.getJGBM() == null ? other.getJGBM() == null : this.getJGBM().equals(other.getJGBM()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJGBM() == null) ? 0 : getJGBM().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", JGBM=").append(JGBM);
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}