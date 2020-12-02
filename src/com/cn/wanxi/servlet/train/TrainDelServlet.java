package com.cn.wanxi.servlet.train;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.service.IProductService;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.IUserService;
import com.cn.wanxi.service.impl.ProductServiceImpl;
import com.cn.wanxi.service.impl.TrainServiceImpl;
import com.cn.wanxi.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/back/train/del")
public class TrainDelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        String id=req.getParameter("id");
//        Integer aa=id==null || "".equals(id) ? 0 : Integer.parseInt(id);//三元运算符
        Integer aa = -1;
        if (id== null||"".equals(id)){
            aa=0;
        }else{
            aa=Integer.parseInt(id);
        }
        ITrainService iTrainService=new TrainServiceImpl();
        int count=iTrainService.del(aa);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}
