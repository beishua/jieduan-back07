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
//@WebServlet("/back/maps/mapsEdit")
//public class MapsEditServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");
//
//        Upload upload = new Upload();
//        String string = upload.imgUpload(req);
//        String aa[]=string.split("@@");
//        MapsModel mapsModel = new MapsModel();
//        mapsModel.setId(Integer.parseInt(aa[0]));
//        mapsModel.setQQ(aa[1]);
//        mapsModel.setPhone(aa[2]);
//        mapsModel.setWeChat(aa[3]);
//        mapsModel.setMicroblog(aa[4]);
//        mapsModel.setEmail(aa[5]);
//        mapsModel.setAddress(aa[6]);
//        //调用服务逻辑层
//        IMapsService iMapsService=new MapsServiceImpl();
//        int count=iMapsService.edit(mapsModel);
//        //返回数据
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("count",count);
//        resp.getWriter().println(jsonObject);
//    }
//}
