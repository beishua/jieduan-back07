package com.cn.wanxi.servlet.show;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.service.show.CoachService;
import com.cn.wanxi.service.show.NavService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/coach")
public class CoachServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NavService navService = new NavService();
        CoachService coachService=new CoachService();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("coachListb",coachService.getListb());
        jsonObject.put("coachLista",coachService.getLista());
        jsonObject.put("navList",navService.getList());
        resp.getWriter().println(jsonObject);
    }
}