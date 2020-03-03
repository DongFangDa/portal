package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_SERVICE_SELFHELP_STATISTIC
 * @author 
 */
public class TbServiceSelfhelpStatisticKey implements Serializable {
    /**
     * 年月 复合主键，yyyy-MM
     */
    private String DATEYM;

    /**
     * 机构代码
     */
    private String JGDM;

    private static final long serialVersionUID = 1L;

    public String getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(String DATEYM) {
        this.DATEYM = DATEYM;
    }

    public String getJGDM() {
        return JGDM;
    }

    public void setJGDM(String JGDM) {
        this.JGDM = JGDM;
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
        TbServiceSelfhelpStatisticKey other = (TbServiceSelfhelpStatisticKey) that;
        return (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getJGDM() == null ? other.getJGDM() == null : this.getJGDM().equals(other.getJGDM()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getJGDM() == null) ? 0 : getJGDM().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", JGDM=").append(JGDM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}