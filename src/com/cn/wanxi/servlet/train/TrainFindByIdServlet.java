package com.cn.wanxi.servlet.train;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.IUserService;
import com.cn.wanxi.service.impl.TrainServiceImpl;
import com.cn.wanxi.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/back/train/findById")
public class TrainFindByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String id=req.getParameter("id");//取值
        Integer aa = -1;
        if (id == null || "".equals(id)) {
            aa = 0;
        } else {
            aa = Integer.parseInt(id);
        }
        //调用逻辑层
        ITrainService iTrainService = new TrainServiceImpl();
        TrainModel trainModel = iTrainService.findById(aa);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("trainModel", trainModel);
        resp.getWriter().println(jsonObject);
    }
}
