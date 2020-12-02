package com.cn.wanxi.servlet.nav;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.NavModel;
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

@WebServlet("/back/nav/findById")
public class NavFindByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
//        String id=req.getParameter("id");//取值
        String idString = req.getParameter("id");
        Integer id = idString == null || "".equals(idString) ? 0 : Integer.parseInt(idString);
//        Integer aa = -1;
//        if (id == null || "".equals(id)) {
//            aa = 0;
//        } else {
//            aa = Integer.parseInt(id);
//        }
        //调用逻辑层
        INavService iNavService = new NavServiceImpl();
        NavModel navModel = iNavService.findById(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("navModel", navModel);
        resp.getWriter().println(jsonObject);
    }
}
