package com.cn.wanxi.servlet.company;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.service.ICompanyService;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.impl.CompanyServiceImpl;
import com.cn.wanxi.service.impl.TrainServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/back/company/findAllBySome")
public class CompanyFindBySomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //提取页面数据
//        String title=req.getParameter("title");
        String content=req.getParameter("content");

        String pageNum = req.getParameter("pageNum");
        String pageSize = req.getParameter("pageSize");
        PageModel pageModel = new PageModel();
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 10 : Integer.parseInt(pageSize));
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));

        //封装数据
        CompanyModel companyModel = new CompanyModel();
        companyModel.setCompanyContent(content);
        companyModel.setPageModel(pageModel);
        //调用服务逻辑层
        ICompanyService iCompanyService=new CompanyServiceImpl();
        //返回数据
        List<CompanyModel> list = iCompanyService.findAllBySome(companyModel);
        int number = iCompanyService.getCount(companyModel);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("list",list);
        jsonObject.put("number", number);
        resp.getWriter().println(jsonObject);
    }
}
