package com.cn.wanxi.servlet.show;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
//import com.cn.wanxi.service.CompanyModelService;
//import com.cn.wanxi.service.NavService;
import com.cn.wanxi.service.show.CompanyService;
import com.cn.wanxi.service.show.NavService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/aboutus")
public class CompanyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NavService navService = new NavService();
//        req.setAttribute("navList",navService.getList());
        CompanyModel companyModel =new CompanyModel();
//        req.setAttribute("companyModel",companyModel);
        CompanyService companyService=new CompanyService();
//        req.setAttribute("companyList",companyService.getList());
//        req.setAttribute("companyLista",companyService.getLista());
//        req.setAttribute("companyListb",companyService.getListb());
//        req.getRequestDispatcher("/jsp/aboutus.jsp").forward(req,resp);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("companyList",companyService.getList());
        jsonObject.put("companyLista",companyService.getLista());
        jsonObject.put("companyListb",companyService.getListb());
        jsonObject.put("navList",navService.getList());
        jsonObject.put("companyModel",companyModel);
        resp.getWriter().println(jsonObject);
    }
}
