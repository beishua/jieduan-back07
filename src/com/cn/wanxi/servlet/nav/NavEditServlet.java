package com.cn.wanxi.servlet.nav;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.service.INavService;
import com.cn.wanxi.service.impl.NavServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/nav/navEdit")
public class NavEditServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       0，乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
//1.取值页面的值
        String idString = req.getParameter("id");
        int id = 0;
        try {
            id = Integer.parseInt(idString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String title = req.getParameter("navName");
        String href = req.getParameter("navContent");
//2.封装
        NavModel navModel = new NavModel();
        navModel.setId(id);
        navModel.setTitle(title);
        navModel.setHref(href);
//        3.调用服务逻辑层
        INavService iNavService = new NavServiceImpl();
//        4.得到返回结果
        int result = iNavService.edit(navModel);

//        5.返回页面数据
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", result);
        resp.getWriter().println(jsonObject);
    }
}
