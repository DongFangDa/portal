package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_SERVICE_HOME_STATISTIC
 * @author 
 */
public class TbServiceHomeStatisticKey implements Serializable {
    /**
     * 医疗机构
     */
    private String YLJG;

    /**
     * 年月
     */
    private String DATEYM;

    private static final long serialVersionUID = 1L;

    public String getYLJG() {
        return YLJG;
    }

    public void setYLJG(String YLJG) {
        this.YLJG = YLJG;
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
        TbServiceHomeStatisticKey other = (TbServiceHomeStatisticKey) that;
        return (this.getYLJG() == null ? other.getYLJG() == null : this.getYLJG().equals(other.getYLJG()))
            && (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYLJG() == null) ? 0 : getYLJG().hashCode());
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", YLJG=").append(YLJG);
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}