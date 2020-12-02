package com.cn.wanxi.servlet.user;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.IUserService;
import com.cn.wanxi.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/back/user/findAll")
public class UserFindAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //取页面的值
        //封装model
        //逻辑层
        IUserService iUserService=new UserServiceImpl();
        List<UserModel> list=iUserService.findAll();
        //返回数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("list",list);
        resp.getWriter().println(jsonObject);
    }
}
