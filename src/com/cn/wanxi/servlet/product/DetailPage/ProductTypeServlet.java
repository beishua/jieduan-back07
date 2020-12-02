package com.cn.wanxi.servlet.product.DetailPage;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.service.IProductService;
import com.cn.wanxi.service.impl.ProductServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/typeId")
public class ProductTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String programId=req.getParameter("programId");
        ProductModel productModel=new ProductModel();
        productModel.setProgramId(Integer.parseInt(programId));
        PageModel pageModel = new PageModel();
        String pageNum = req.getParameter("pageNum");
        String pageSize = req.getParameter("pageSize");
        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 8 : Integer.parseInt(pageSize));
        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));
        IProductService iProductService=new ProductServiceImpl();
        List<ProductModel> list = iProductService.findAllByTypeId(productModel);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",list);
        resp.getWriter().println(jsonObject);
    }
}
