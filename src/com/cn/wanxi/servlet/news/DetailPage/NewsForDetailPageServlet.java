package com.cn.wanxi.servlet.news.DetailPage;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.service.INewsService;
import com.cn.wanxi.service.impl.NewsServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/newsId")
public class NewsForDetailPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String id=req.getParameter("id");
        NewsModel newsModel=new NewsModel();
        newsModel.setId(Integer.parseInt(id));
        INewsService iNewsService=new NewsServiceImpl();
        List<NewsModel> list=iNewsService.findByIdForNewsDetailPage(newsModel);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("list",list);
        resp.getWriter().println(jsonObject);
    }
}
