package com.cn.wanxi.servlet.company;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.service.ICompanyService;
import com.cn.wanxi.service.INewsService;
import com.cn.wanxi.service.IProductService;
import com.cn.wanxi.service.impl.CompanyServiceImpl;
import com.cn.wanxi.service.impl.NewsServiceImpl;
import com.cn.wanxi.service.impl.ProductServiceImpl;
import com.cn.wanxi.util.Upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/company/companyEdit")
public class CompanyEditServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Upload upload = new Upload();
        String string = upload.imgUpload(req);
        String aa[]=string.split("@@");
        CompanyModel companyModel = new CompanyModel();
        companyModel.setId(Integer.parseInt(aa[0]));
        companyModel.setCompanyContent(aa[1]);
        //调用服务逻辑层
        ICompanyService iCompanyService=new CompanyServiceImpl();
        int count=iCompanyService.edit(companyModel);
        //返回数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}
