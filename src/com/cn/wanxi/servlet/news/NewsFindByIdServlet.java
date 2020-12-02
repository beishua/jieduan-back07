package com.cn.wanxi.servlet.news;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.service.INavService;
import com.cn.wanxi.service.INewsService;
import com.cn.wanxi.service.impl.NavServiceImpl;
import com.cn.wanxi.service.impl.NewsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/news/findById")
public class NewsFindByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String id=req.getParameter("id");//取值
        Integer aa = -1;
        if (id == null || "".equals(id)) {
            aa = 0;
        } else {
            aa = Integer.parseInt(id);
        }
        //调用逻辑层
        INewsService iNewsService = new NewsServiceImpl();
        NewsModel newsModel = iNewsService.findById(aa);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("newsModel", newsModel);
        resp.getWriter().println(jsonObject);
    }
}
