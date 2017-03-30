package com.yr.demo.bean;

/**
 * Created by Administrator on 2016/11/27.
 */

/**
 * 省份
 */
public class Province {
    /**
     * 省份id
     */
    private int id;
    /**
     * 省份名字
     */
    private String provinceName;

    public Province() {
    }

    public Province(int id, String provinceName) {
        this.id = id;
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
