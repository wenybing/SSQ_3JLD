package com.yr.demo.servlet;

import com.google.gson.Gson;
import com.yr.demo.bean.District;
import com.yr.demo.service.DistrictService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */
public class DistrictServlet extends HttpServlet {
    private DistrictService districtService = new DistrictService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应编码
        response.setContentType("text/html;charset=utf-8");
        //获取请求参数
        String cid = request.getParameter("cid");
        //获取区县列表
        List<District> districtList = districtService.getDistrictBycid(cid);
        //将list转为json字符串
        Gson gson = new Gson();
        String JSON = gson.toJson(districtList);
        //将json作为响应发送
        response.getWriter().println(JSON);
    }
}
