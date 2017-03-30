package com.yr.demo.servlet;

import com.google.gson.Gson;
import com.yr.demo.bean.Province;
import com.yr.demo.service.ProvinceService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */
public class ProvinceServlet extends HttpServlet {
    private ProvinceService provinceService = new ProvinceService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 设置字符编码
         */
        response.setContentType("text/html;charset=utf-8");
        /**
         * 加载所有省份
         */
        List<Province> provinceList = provinceService.getProvinceList();
        /**
         * 将list转为json字符串
         */
        Gson gson = new Gson();
        String JSON = gson.toJson(provinceList);
        /**
         * 将json作为响应发送
         */
        response.getWriter().println(JSON);
    }
}
