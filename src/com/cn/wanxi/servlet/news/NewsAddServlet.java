package com.cn.wanxi.servlet.news;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.service.ICompanyService;
import com.cn.wanxi.service.INewsService;
import com.cn.wanxi.service.impl.CompanyServiceImpl;
import com.cn.wanxi.service.impl.NewsServiceImpl;
import com.cn.wanxi.util.Upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/news/add")
public class NewsAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Upload upload = new Upload();
        String string = upload.imgUpload(req);
        String aa[]=string.split("@@");
        NewsModel newsModel = new NewsModel();
        newsModel.setNewsHeadlines(aa[0]);
        newsModel.setNewsContent(aa[1]);
        //调用服务逻辑层
        INewsService iNewsService=new NewsServiceImpl();
        int count=iNewsService.add(newsModel);
        //返回数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}
