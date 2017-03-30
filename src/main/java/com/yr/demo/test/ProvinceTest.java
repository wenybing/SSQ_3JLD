package com.yr.demo.test;

import com.yr.demo.bean.City;
import com.yr.demo.bean.District;
import com.yr.demo.bean.Province;
import com.yr.demo.service.CityService;
import com.yr.demo.service.DistrictService;
import com.yr.demo.service.ProvinceService;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */
public class ProvinceTest {
    private ProvinceService provinceService = new ProvinceService();
    private CityService cityService = new CityService();
    private DistrictService districtService = new DistrictService();
    @Test
    public void test(){
        List<Province> provinceList = provinceService.getProvinceList();
        System.out.println("----------省份----------");
        for (Province province:provinceList){
            System.out.println(province);
        }
        System.out.println("----------城市----------");
        List<City> cityList = cityService.getCityBypid("3");
        for(City city:cityList){
            System.out.println(city);
        }
        System.out.println("----------下辖区----------");
        List<District> districtList = districtService.getDistrictBycid("4");
        for (District district:districtList){
            System.out.println(district);
        }
    }
}
