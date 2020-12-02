package com.cn.wanxi.servlet.user;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.PageModel;
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

@WebServlet("/back/user/findAllBySome")
public class UserFindAllBySomeServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //提取页面数据
        String username=req.getParameter("username");
        String phone=req.getParameter("phone");
        String sex=req.getParameter("sex");
        String startBirthday=req.getParameter("startBirthday");
        String endBirthday=req.getParameter("endBirthday");
        String hobby=req.getParameter("hobby");
        hobby = hobby.replace("[", "").replace("]", "").replace("\"", "");
//        hobby = hobby.replace("\"", "");
        String introduce=req.getParameter("introduce");

        String pageSize = req.getParameter("pageSize");
        String pageNum = req.getParameter("pageNum");
        PageModel pageModel = new PageModel();
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 10 : Integer.parseInt(pageSize));
        //封装数据
        UserModel userModel = new UserModel();
        userModel.setUsername(username);
        userModel.setPhone(phone);
        userModel.setSex(sex);
        userModel.setStartBirthday(startBirthday);
        userModel.setEndBirthday(endBirthday);
        userModel.setHobby(hobby);
        userModel.setIntroduce(introduce);
        userModel.setPageModel(pageModel);
        if (!"".equals(userModel.getHobby())){
            String[] hobbys=userModel.getHobby().split(",");
            userModel.setHobbys(hobbys);
        }
        //调用服务逻辑层
        IUserService iUserService=new UserServiceImpl();
        //返回数据
        List<UserModel> list=iUserService.findAllBySome(userModel);
        int number = iUserService.getCount(userModel);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("list",list);
        jsonObject.put("number", number);
        resp.getWriter().println(jsonObject);
    }
}