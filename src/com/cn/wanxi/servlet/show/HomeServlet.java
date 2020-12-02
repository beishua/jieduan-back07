package com.cn.wanxi.servlet.show;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.service.show.CoachService;
import com.cn.wanxi.service.show.NavService;
import com.cn.wanxi.service.show.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NavService navService = new NavService();
//        req.setAttribute("navList",navService.getList());
        NewsService homeService=new NewsService();
//        req.setAttribute("newsList",homeService.getList());
        CoachService coachService=new CoachService();
//        req.setAttribute("coachList",coachService.getList());
        CompanyModel companyModel=new CompanyModel();
        req.setAttribute("companyModel",companyModel);
//        req.getRequestDispatcher("/jsp/home.jsp").forward(req,resp);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("coachList",coachService.getList());
        jsonObject.put("newsList",homeService.getList());
        jsonObject.put("navList",navService.getList());
        jsonObject.put("companyModel",companyModel);
        resp.getWriter().println(jsonObject);

    }
}
