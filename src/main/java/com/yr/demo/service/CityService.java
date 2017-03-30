package com.yr.demo.service;

import com.yr.demo.bean.City;
import com.yr.demo.dao.CityDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityService implements CityDao {
    /**
     * map用来保存city信息
     * key:保存省份id
     * value:保存city信息列表
     */
    private static Map<String,Object> map = new HashMap<String, Object>();
    static {
        /**
         * 北京
         */

        List<City> bjList = new ArrayList<City>();
        bjList.add(new City(1,"北京",1));
        map.put("1",bjList);
        /**
         * 天津
         */
        List<City> tjList = new ArrayList<City>();
        tjList.add(new City(2,"天津",2));
        map.put("2",tjList);
        /**
         * 河北省
         */
        List<City> hbList = new ArrayList<City>();
        hbList.add(new City(3,"保定",3));
        hbList.add(new City(4,"石家庄",3));
        map.put("3",hbList);
    }

    public List<City> getCityBypid(String pid) {
        return (List<City>) map.get(pid);
    }
}
