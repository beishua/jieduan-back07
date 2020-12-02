package com.cn.wanxi.servlet.company;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.service.ICompanyService;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.impl.CompanyServiceImpl;
import com.cn.wanxi.service.impl.TrainServiceImpl;
import com.cn.wanxi.util.Upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/company/add")
public class CompanyAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Upload upload = new Upload();
        String string = upload.imgUpload(req);
        String aa[]=string.split("@@");
        CompanyModel companyModel = new CompanyModel();
        companyModel.setCompanyContent(aa[0]);
        //调用服务逻辑层
        ICompanyService iCompanyService=new CompanyServiceImpl();
        int count=iCompanyService.add(companyModel);
        //返回数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}
