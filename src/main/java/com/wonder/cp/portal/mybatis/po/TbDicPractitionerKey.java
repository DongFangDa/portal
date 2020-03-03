package com.wonder.cp.portal.mybatis.po;

import java.io.Serializable;

/**
 * TB_DIC_PRACTITIONER
 * @author 
 */
public class TbDicPractitionerKey implements Serializable {
    /**
     * 工号复合主键
     */
    private String GH;

    /**
     * 医院代码复合主键，外键连接：《医疗机构》机构代码
     */
    private String YLJGDM;

    private static final long serialVersionUID = 1L;

    public String getGH() {
        return GH;
    }

    public void setGH(String GH) {
        this.GH = GH;
    }

    public String getYLJGDM() {
        return YLJGDM;
    }

    public void setYLJGDM(String YLJGDM) {
        this.YLJGDM = YLJGDM;
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
        TbDicPractitionerKey other = (TbDicPractitionerKey) that;
        return (this.getGH() == null ? other.getGH() == null : this.getGH().equals(other.getGH()))
            && (this.getYLJGDM() == null ? other.getYLJGDM() == null : this.getYLJGDM().equals(other.getYLJGDM()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGH() == null) ? 0 : getGH().hashCode());
        result = prime * result + ((getYLJGDM() == null) ? 0 : getYLJGDM().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", GH=").append(GH);
        sb.append(", YLJGDM=").append(YLJGDM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}