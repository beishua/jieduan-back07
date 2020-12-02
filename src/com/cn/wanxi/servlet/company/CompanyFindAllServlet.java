package com.cn.wanxi.servlet.company;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.service.ICompanyService;
import com.cn.wanxi.service.impl.CompanyServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/back/company/findAll")
public class CompanyFindAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        //取得页面的值
        String pageNum = req.getParameter("pageNum");
        String pageSize = req.getParameter("pageSize");
        //封装页面的值
        PageModel pageModel = new PageModel();
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 10 : Integer.parseInt(pageSize));
        //调用服务逻辑层
        ICompanyService iCompanyService = new CompanyServiceImpl();
        //得到数据
        List<CompanyModel> list = iCompanyService.findAll(pageModel);
        int number=iCompanyService.getCount();
        //返回数据
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list", list);
        jsonObject.put("number", number);
        resp.getWriter().println(jsonObject);
    }
}
