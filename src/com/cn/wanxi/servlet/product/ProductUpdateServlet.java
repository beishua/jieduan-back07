package com.cn.wanxi.servlet.product;

import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.IProductService;
import com.cn.wanxi.service.ITrainService;
import com.cn.wanxi.service.IUserService;
import com.cn.wanxi.service.impl.ProductServiceImpl;
import com.cn.wanxi.service.impl.TrainServiceImpl;
import com.cn.wanxi.service.impl.UserServiceImpl;
import com.cn.wanxi.util.Upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back/product/productUpdate")
public class ProductUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Upload upload = new Upload();
        String string = upload.imgUpload(req);
        String aa[]=string.split("@@");
        ProductModel productModel=new ProductModel();
        productModel.setId(Integer.parseInt(aa[0]));
        productModel.setTitle(aa[1]);
        productModel.setImgHref(aa[2]);
        productModel.setContent(aa[3]);
        productModel.setContentForDetailed(aa[4]);
        //调用服务逻辑层
        IProductService iProductService=new ProductServiceImpl();
        int count=iProductService.update(productModel);
        //返回数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("count",count);
        resp.getWriter().println(jsonObject);
    }
}