package com.cn.wanxi.servlet.product;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.service.ICompanyService;
import com.cn.wanxi.service.IProductService;
import com.cn.wanxi.service.impl.CompanyServiceImpl;
import com.cn.wanxi.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/back/product/findAllBySome")
public class ProductFindAllBySomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //提取页面数据
        String productTitle=req.getParameter("productTitle");
        String imgHref=req.getParameter("imgHref");
        String productContent=req.getParameter("productContent");
        String contentForDetailed=req.getParameter("contentForDetailed");

        String pageNum = req.getParameter("pageNum");
        String pageSize = req.getParameter("pageSize");
        PageModel pageModel = new PageModel();
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 10 : Integer.parseInt(pageSize));
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));

        //封装数据
        ProductModel productModel = new ProductModel();
        productModel.setTitle(productTitle);
        productModel.setImgHref(imgHref);
        productModel.setContent(productContent);
        productModel.setContentForDetailed(contentForDetailed);
        productModel.setPageModel(pageModel);
        //调用服务逻辑层
        IProductService iProductService=new ProductServiceImpl();
        //返回数据
        List<ProductModel> list = iProductService.findAllBySome(productModel);
        int number = iProductService.getCount(productModel);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("list",list);
        jsonObject.put("number", number);
        resp.getWriter().println(jsonObject);
    }
}
