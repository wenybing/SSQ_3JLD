package com.yr.demo.dao;

import com.yr.demo.bean.District;

import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */
public interface DistrictDao {
    List<District> getDistrictBycid(String cid);
}
