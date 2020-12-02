package com.cn.wanxi.servlet;

import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.IUserService;
import com.cn.wanxi.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/userRegister")
public class UserRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //处理乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
   //1.得到页面传递的值
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String sex=req.getParameter("sex");
        String phone=req.getParameter("phone");
        String birthday=req.getParameter("birthday");
        String hobby=req.getParameter("hobby");
        String introduce=req.getParameter("introduce");
        hobby = hobby.replace("[","").replace("]","").replace(" ","");
        //  2.  封装数据
        UserModel userModel=new UserModel();
        userModel.setUsername(username);
        userModel.setPassword(password);
        userModel.setPhone(phone);
        userModel.setSex(sex);
        userModel.setBirthday(birthday);
        userModel.setHobby(hobby.replace("\"",""));//Arrays.toString(hobby)转换字符串
        userModel.setIntroduce(introduce);

        //4.调用服务逻辑层
        IUserService iUserService=new UserServiceImpl();
        //5.得到数据
        int result=iUserService.add(userModel);
        //6返回数据
        resp.getWriter().println(result);
//        req.setAttribute("result",result);
        //页面转发
        req.getRequestDispatcher("/login.html").forward(req,resp);
    }
}
