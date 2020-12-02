package com.cn.wanxi.servlet.nav;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.service.INavService;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.impl.NavServiceImpl;
import com.cn.wanxi.service.impl.TrainServiceImpl;
import com.cn.wanxi.util.Upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/back/nav/add")
public class NavAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Upload upload = new Upload();
        String string = upload.imgUpload(req);
        String aa[]=string.split("@@");
        NavModel navModel=new NavModel();
//        trainModel.setTrainId(Integer.parseInt(aa[0]));
        navModel.setNavName(aa[0]);
        navModel.setNavContent(aa[1]);
        //调用服务逻辑层
        INavService iNavService=new NavServiceImpl();
        int count=iNavService.add(navModel);
        //返回数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}
