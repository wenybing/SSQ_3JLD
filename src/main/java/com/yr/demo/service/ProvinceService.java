package com.yr.demo.service;

import com.yr.demo.bean.Province;
import com.yr.demo.dao.ProvinceDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */
public class ProvinceService implements ProvinceDao {
    private static List<Province> provinceList = new ArrayList<Province>();
    static {
        provinceList.add(new Province(1,"北京"));
        provinceList.add(new Province(2,"天津"));
        provinceList.add(new Province(3,"河北"));
    }
    public List<Province> getProvinceList() {
        return provinceList;
    }
}
