package com.cn.wanxi.servlet.train;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.impl.TrainServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/back/train/findAllBySome")
public class TrainFindBySomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //提取页面数据
        String name=req.getParameter("name");
        String picture=req.getParameter("picture");
        String content=req.getParameter("content");

        String pageNum = req.getParameter("pageNum");
        String pageSize = req.getParameter("pageSize");
        PageModel pageModel = new PageModel();
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 10 : Integer.parseInt(pageSize));
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));

        //封装数据
        TrainModel trainModel = new TrainModel();
        trainModel.setTrainname(name);
        trainModel.setPicture(picture);
        trainModel.setContent(content);
        trainModel.setPageModel(pageModel);
        //调用服务逻辑层
        ITrainService iTrainService=new TrainServiceImpl();
        //返回数据
        List<TrainModel> list = iTrainService.findAllBySome(trainModel);
        int number = iTrainService.getCount(trainModel);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("list",list);
        jsonObject.put("number", number);
        resp.getWriter().println(jsonObject);
    }
}
