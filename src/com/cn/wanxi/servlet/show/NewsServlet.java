package com.cn.wanxi.servlet.show;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.service.show.NavService;
import com.cn.wanxi.service.show.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NavService navService = new NavService();
        NewsService newsService=new NewsService();
        JSONObject jsonObject=new JSONObject();
        PageModel pageModel = new PageModel();
        String pageNum = req.getParameter("pageNum");
        String pageSize = req.getParameter("pageSize");
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 8 : Integer.parseInt(pageSize));
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));
        jsonObject.put("newsType",newsService.getListb());
        jsonObject.put("newsLista",newsService.getLista());
        jsonObject.put("newsListc",newsService.getListc());
        jsonObject.put("navList",navService.getList());
        resp.getWriter().println(jsonObject);
    }
}