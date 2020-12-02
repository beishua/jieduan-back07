package com.cn.wanxi.servlet.leave;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.LeaveModel;
import com.cn.wanxi.service.ILeaveService;
import com.cn.wanxi.service.impl.LeaveServiceImpl;
import com.cn.wanxi.util.Upload;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/leave/add")
public class leaveAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Upload upload = new Upload();
        String string = upload.imgUpload(req);
        String aa[]=string.split("@@");
        LeaveModel leaveModel = new LeaveModel();
        leaveModel.setName(aa[0]);
        leaveModel.setPhone(aa[1]);
        leaveModel.setEmail(aa[2]);
        leaveModel.setContent(aa[3]);
        //调用服务逻辑层
        ILeaveService iLeaveService=new LeaveServiceImpl();
        int count=iLeaveService.add(leaveModel);
        //返回数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}
