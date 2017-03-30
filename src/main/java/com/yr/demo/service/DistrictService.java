package com.yr.demo.service;

import com.yr.demo.bean.District;
import com.yr.demo.dao.DistrictDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/27.
 */
public class DistrictService implements DistrictDao {
    /**
     * map保存区县信息
     * key:保存所属市id
     * value:保存区县信息列表
     */
    private static Map<String, Object> map = new HashMap<String, Object>();

    static {
        /**
         * 北京下辖区
         */
        List<District> bjList = new ArrayList<District>();
        bjList.add(new District(1, "东城区", 1));
        bjList.add(new District(2, "西城区", 1));
        bjList.add(new District(3, "丰台区", 1));
        bjList.add(new District(4, "朝阳区", 1));
        bjList.add(new District(5, "海淀区", 1));
        map.put("1", bjList);
        /**
         * 天津下辖属区
         */
        List<District> tjList = new ArrayList<District>();
        tjList.add(new District(1,"河东区",2));
        tjList.add(new District(2,"河西区",2));
        tjList.add(new District(3,"南开区",2));
        tjList.add(new District(4,"塘沽区",2));
        tjList.add(new District(5,"和平区",2));
        map.put("2",tjList);
        /**
         * 保定下辖属区
         */
        List<District> bdList = new ArrayList<District>();
        bdList.add(new District(1,"竞秀区",3));
        bdList.add(new District(2,"莲池区",3));
        bdList.add(new District(3,"满城区",3));
        bdList.add(new District(4,"清苑区",3));
        bdList.add(new District(5,"徐水区",3));
        map.put("3",bdList);
        /**
         * 石家庄下辖区
         */
        List<District> sjzList = new ArrayList<District>();
        sjzList.add(new District(1,"长安区",4));
        sjzList.add(new District(2,"桥西区",4));
        sjzList.add(new District(3,"新华区",4));
        sjzList.add(new District(4,"井陉矿区",4));
        sjzList.add(new District(5,"裕华区",4));
        sjzList.add(new District(6,"藁城区",4));
        sjzList.add(new District(7,"鹿泉区",4));
        sjzList.add(new District(8,"栾城区",4));
        map.put("4",sjzList);
    }
    public List<District> getDistrictBycid(String cid) {
        return (List<District>) map.get(cid);
    }
}
