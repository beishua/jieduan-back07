package com.cn.wanxi.servlet;

import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.IUserService;
import com.cn.wanxi.service.impl.UserServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //1得到页面数据
    String username=req.getParameter("username");
    String password=req.getParameter("password");
    String code=req.getParameter("code");
    String sessionCode= (String) req.getSession().getAttribute("code");
    //2封装数据
        UserModel userModel=new UserModel();
        userModel.setUsername(username);
        userModel.setPassword(password);
        userModel.setCode(code);
        userModel.setSessionCode(sessionCode);
        //3调用服务逻辑层
        IUserService iUserService=new UserServiceImpl();
        //4得到数据
        int result=iUserService.login(userModel);
        if (result==1){
            HttpSession session=req.getSession();
            session.setAttribute("username",username);
        }
        resp.getWriter().println(result);
    }
}
