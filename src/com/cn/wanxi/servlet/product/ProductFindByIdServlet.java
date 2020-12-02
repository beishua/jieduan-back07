package com.cn.wanxi.servlet.product;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.service.IProductService;
import com.cn.wanxi.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/product/findById")
public class ProductFindByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String idString = req.getParameter("id");
        Integer id = idString == null || "".equals(idString) ? 0 : Integer.parseInt(idString);
//        Integer id =0;
//        if (idString == null || "".equals(idString)){
//            id = 0;
//        }else {
//            id = Integer.parseInt(idString);
//        }
        IProductService iProductService = new ProductServiceImpl();
        ProductModel productModel=iProductService.findById(id);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("productModel",productModel);
        resp.getWriter().println(jsonObject);
    }
}
