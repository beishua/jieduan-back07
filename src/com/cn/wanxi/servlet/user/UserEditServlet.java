package com.cn.wanxi.servlet.user;

import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.IUserService;
import com.cn.wanxi.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/user/userEdit")
public class UserEditServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //1.得到页面传递的值
        String idString = req.getParameter("id");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
//        String code=req.getParameter("code");
        String phone=req.getParameter("phone");
        String sex=req.getParameter("sex");
        String birthday=req.getParameter("birthday");
        String hobby=req.getParameter("hobby");
        hobby = hobby.replace("[","").replace("]","").replace(" ","");
        String introduce=req.getParameter("introduce");
        //  2.  封装数据
        UserModel userModel=new UserModel();
//        int id=0;
//        if (idString==null||"".equals(idString)){
//
//        }else {
//            id=Integer.parseInt(idString);
//        }
        userModel.setId(idString == null || "".equals(idString) ? 0 : Integer.parseInt(idString));
        userModel.setUsername(username);
        userModel.setPassword(password);
//        userModel.setCode(code);
        userModel.setSex(sex);
        userModel.setPhone(phone);
        userModel.setBirthday(birthday);
        userModel.setHobby(hobby.replace("\"",""));//Arrays.toString(hobby)转换字符串
        userModel.setIntroduce(introduce);
        //4.调用服务逻辑层
        IUserService userService=new UserServiceImpl();
        int count= userService.edit(userModel);

        resp.getWriter().println(count);
    }
}
