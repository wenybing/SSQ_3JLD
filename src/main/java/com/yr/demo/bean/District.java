package com.yr.demo.bean;

/**
 * Created by Administrator on 2016/11/27.
 */

/**
 * 区县
 */
public class District {
    /**
     * 区县id
     */
    private int id;
    /**
     * 区县名
     */
    private String districtName;
    /**
     * 所属市id
     */
    private int cid;

    public District() {
    }

    public District(int id, String districtName, int cid) {
        this.id = id;
        this.districtName = districtName;
        this.cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", districtName='" + districtName + '\'' +
                ", cid=" + cid +
                '}';
    }
}
