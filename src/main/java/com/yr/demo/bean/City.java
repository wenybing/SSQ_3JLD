package com.yr.demo.bean;

/**
 * Created by Administrator on 2016/11/27.
 */

/**
 * 城市
 */
public class City {
    /**
     * 城市id
     */
    private int  id;
    /**
     * 城市名
     */
    private String cityName;
    /**
     * 所属省id
     */
    private int pid;

    public City() {
    }


    public City(int id, String cityName, int pid) {
        this.id = id;
        this.cityName = cityName;
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", pid=" + pid +
                '}';
    }
}
