package com.cn.wanxi.servlet.maps;//package com.cn.wanxi.servlet.maps;
//
//import com.alibaba.fastjson.JSONObject;
//import com.cn.wanxi.model.CompanyModel;
//import com.cn.wanxi.model.MapsModel;
//import com.cn.wanxi.service.ICompanyService;
//import com.cn.wanxi.service.IMapsService;
//import com.cn.wanxi.service.impl.CompanyServiceImpl;
//import com.cn.wanxi.service.impl.MapsServiceImpl;
//import com.cn.wanxi.util.Upload;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/back/maps/add")
//public class MapsAddServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");
//
//        Upload upload = new Upload();
//        String string = upload.imgUpload(req);
//        String aa[]=string.split("@@");
//        MapsModel mapsModel = new MapsModel();
//        mapsModel.setQQ(aa[0]);
//        mapsModel.setPhone(aa[1]);
//        mapsModel.setWeChat(aa[2]);
//        mapsModel.setMicroblog(aa[3]);
//        mapsModel.setEmail(aa[4]);
//        mapsModel.setAddress(aa[5]);
//        //调用服务逻辑层
//        IMapsService iMapsService=new MapsServiceImpl();
//        int count=iMapsService.add(mapsModel);
//        //返回数据
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("count",count);
//        resp.getWriter().println(jsonObject);
//    }
//}
