package com.cn.wanxi.servlet.leave;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.service.ICompanyService;
import com.cn.wanxi.service.ILeaveService;
import com.cn.wanxi.service.impl.CompanyServiceImpl;
import com.cn.wanxi.service.impl.LeaveServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/leave/del")
public class leaveDelServlet extends HttpServlet {
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
        ILeaveService iLeaveService=new LeaveServiceImpl();
        int count=iLeaveService.del(aa);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}
