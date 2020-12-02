package com.cn.wanxi.servlet.leave;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.LeaveModel;
import com.cn.wanxi.model.PageModel;
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
import java.util.List;

@WebServlet("/back/leave/findAllBySome")
public class leaveFindBySomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //提取页面数据
        String name=req.getParameter("name");
        String phone=req.getParameter("phone");
        String email=req.getParameter("email");
        String content=req.getParameter("content");
        String pageNum = req.getParameter("pageNum");
        String pageSize = req.getParameter("pageSize");
        PageModel pageModel = new PageModel();
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 10 : Integer.parseInt(pageSize));
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));

        //封装数据
        LeaveModel leaveModel = new LeaveModel();
        leaveModel.setName(name);
        leaveModel.setPhone(phone);
        leaveModel.setEmail(email);
        leaveModel.setContent(content);
        leaveModel.setPageModel(pageModel);
        //调用服务逻辑层
        ILeaveService iLeaveService=new LeaveServiceImpl();
        //返回数据
        List<LeaveModel> list = iLeaveService.findAllBySome(leaveModel);
        int number = iLeaveService.getCount(leaveModel);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("list",list);
        jsonObject.put("number", number);
        resp.getWriter().println(jsonObject);
    }
}
