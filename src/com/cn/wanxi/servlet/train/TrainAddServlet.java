package com.cn.wanxi.servlet.train;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CoachModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.impl.TrainServiceImpl;
import com.cn.wanxi.util.Upload;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/train/add")
public class TrainAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Upload upload = new Upload();
        String string = upload.imgUpload(req);
        String aa[]=string.split("@@");
        TrainModel trainModel=new TrainModel();
//        trainModel.setId(Integer.parseInt(aa[0]));
        trainModel.setTrainname(aa[0]);
        trainModel.setPicture(aa[1]);
        trainModel.setContent(aa[2]);
        //调用服务逻辑层
        ITrainService iTrainService=new TrainServiceImpl();
        int count=iTrainService.add(trainModel);
        //返回数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}
