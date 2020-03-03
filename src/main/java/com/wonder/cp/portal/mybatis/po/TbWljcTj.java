package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * TB_WLJC_TJ
 * @author 
 */
public class TbWljcTj implements Serializable {
    /**
     * 年-月主键（yyyyMM）
     */
    private String DATEYM;

    /**
     * 婚姻数据信息总数
     */
    private BigDecimal HYSJXX;

    /**
     * 经信委共享数据总数
     */
    private BigDecimal JXWGXSJ;

    /**
     * 公安数据总数
     */
    private BigDecimal GASJ;

    /**
     * 信息更新时间
     */
    private Date UPDATETIME;

    /**
     * 预留1
     */
    private String YL1;

    /**
     * 预留2
     */
    private String YL2;

    private static final long serialVersionUID = 1L;

    public String getDATEYM() {
        return DATEYM;
    }

    public void setDATEYM(String DATEYM) {
        this.DATEYM = DATEYM;
    }

    public BigDecimal getHYSJXX() {
        return HYSJXX;
    }

    public void setHYSJXX(BigDecimal HYSJXX) {
        this.HYSJXX = HYSJXX;
    }

    public BigDecimal getJXWGXSJ() {
        return JXWGXSJ;
    }

    public void setJXWGXSJ(BigDecimal JXWGXSJ) {
        this.JXWGXSJ = JXWGXSJ;
    }

    public BigDecimal getGASJ() {
        return GASJ;
    }

    public void setGASJ(BigDecimal GASJ) {
        this.GASJ = GASJ;
    }

    public Date getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(Date UPDATETIME) {
        this.UPDATETIME = UPDATETIME;
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
        TbWljcTj other = (TbWljcTj) that;
        return (this.getDATEYM() == null ? other.getDATEYM() == null : this.getDATEYM().equals(other.getDATEYM()))
            && (this.getHYSJXX() == null ? other.getHYSJXX() == null : this.getHYSJXX().equals(other.getHYSJXX()))
            && (this.getJXWGXSJ() == null ? other.getJXWGXSJ() == null : this.getJXWGXSJ().equals(other.getJXWGXSJ()))
            && (this.getGASJ() == null ? other.getGASJ() == null : this.getGASJ().equals(other.getGASJ()))
            && (this.getUPDATETIME() == null ? other.getUPDATETIME() == null : this.getUPDATETIME().equals(other.getUPDATETIME()))
            && (this.getYL1() == null ? other.getYL1() == null : this.getYL1().equals(other.getYL1()))
            && (this.getYL2() == null ? other.getYL2() == null : this.getYL2().equals(other.getYL2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDATEYM() == null) ? 0 : getDATEYM().hashCode());
        result = prime * result + ((getHYSJXX() == null) ? 0 : getHYSJXX().hashCode());
        result = prime * result + ((getJXWGXSJ() == null) ? 0 : getJXWGXSJ().hashCode());
        result = prime * result + ((getGASJ() == null) ? 0 : getGASJ().hashCode());
        result = prime * result + ((getUPDATETIME() == null) ? 0 : getUPDATETIME().hashCode());
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
        sb.append(", DATEYM=").append(DATEYM);
        sb.append(", HYSJXX=").append(HYSJXX);
        sb.append(", JXWGXSJ=").append(JXWGXSJ);
        sb.append(", GASJ=").append(GASJ);
        sb.append(", UPDATETIME=").append(UPDATETIME);
        sb.append(", YL1=").append(YL1);
        sb.append(", YL2=").append(YL2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}