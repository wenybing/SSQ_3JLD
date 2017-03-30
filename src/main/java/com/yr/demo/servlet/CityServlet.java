package com.yr.demo.servlet;

import com.google.gson.Gson;
import com.yr.demo.bean.City;
import com.yr.demo.service.CityService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */
public class CityServlet extends HttpServlet {
    private CityService cityService = new CityService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 设置响应字符编码
         */
        response.setContentType("text/html;charset=utf-8");
        String pid = request.getParameter("id");
        List<City> cityList = cityService.getCityBypid(pid);
        /**
         * 将list转为json字符串
         */
        Gson gson = new Gson();
        String JSON = gson.toJson(cityList);
        /**
         * 将json作为响应发出
         */
        response.getWriter().println(JSON);
    }
}
