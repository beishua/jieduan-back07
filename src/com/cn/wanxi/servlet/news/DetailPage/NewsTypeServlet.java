package com.cn.wanxi.servlet.news.DetailPage;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.PageModel;
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

@WebServlet("/newsTypeId")
public class NewsTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String newsId=req.getParameter(("newsId"));
        NewsModel newsModel=new NewsModel();
        newsModel.setNewsId(Integer.parseInt(newsId));
        PageModel pageModel = new PageModel();
        String pageNum = req.getParameter("pageNum");
        String pageSize = req.getParameter("pageSize");
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 8 : Integer.parseInt(pageSize));
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));
        INewsService iNewsService=new NewsServiceImpl();
        List<NewsModel> list = iNewsService.findAllByNewsTypeId(newsModel);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",list);
        resp.getWriter().println(jsonObject);
    }
}
