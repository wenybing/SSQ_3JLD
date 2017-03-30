package com.yr.demo.dao;

import com.yr.demo.bean.City;

import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */
public interface CityDao {
    List<City> getCityBypid(String pid);
}
