package com.cn.wanxi.servlet.nav;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.service.INavService;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.impl.NavServiceImpl;
import com.cn.wanxi.service.impl.TrainServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/back/nav/findAll")
public class NavFindAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //取得页面的值
        String pageSize = req.getParameter("pageSize");
        String pageNum = req.getParameter("pageNum");
        //封装页面的值
        PageModel pageModel = new PageModel();
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 10 : Integer.parseInt(pageSize));
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));
        //调用服务逻辑层
        INavService iNavService = new NavServiceImpl();
        //得到数据
        List<NavModel> list = iNavService.findAll(pageModel);
        int number=iNavService.getCount();
        //返回数据
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list", list);
        jsonObject.put("number", number);
        resp.getWriter().println(jsonObject);
    }
}
