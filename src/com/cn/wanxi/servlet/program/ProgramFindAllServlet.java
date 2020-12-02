package com.cn.wanxi.servlet.program;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.ProgramModel;
import com.cn.wanxi.service.IProgramService;
import com.cn.wanxi.service.impl.ProgramServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/back/program/findAll")
public class ProgramFindAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
       //调用服务逻辑层
        IProgramService iProgramService = new ProgramServiceImpl();
        List<ProgramModel> list = iProgramService.findAll();
        //返回数据到页面
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list", list);
        resp.getWriter().println(jsonObject);
    }
}
