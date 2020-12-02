package com.cn.wanxi.servlet.train;

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
@WebServlet("/back/train/trainEdit")
public class TrainEditServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //1.得到页面传递的值
        Upload upload = new Upload();
        String string = upload.imgUpload(req);
        String aa[]=string.split("@@");
        TrainModel trainModel=new TrainModel();
        trainModel.setId(Integer.parseInt(aa[0]));
        trainModel.setTrainname(aa[1]);
        trainModel.setPicture(aa[2]);
        trainModel.setContent(aa[3]);
        //4.调用服务逻辑层
        ITrainService iTrainService=new TrainServiceImpl();
        int count = iTrainService.edit(trainModel);
        resp.getWriter().println(count);
    }
}

