package com.cn.wanxi.servlet.maps;//package com.cn.wanxi.servlet.maps;
//
//import com.alibaba.fastjson.JSONObject;
//import com.cn.wanxi.model.CompanyModel;
//import com.cn.wanxi.model.MapsModel;
//import com.cn.wanxi.service.ICompanyService;
//import com.cn.wanxi.service.IMapsService;
//import com.cn.wanxi.service.impl.CompanyServiceImpl;
//import com.cn.wanxi.service.impl.MapsServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/back/maps/findById")
//public class MapsFindByIdServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");
//        String id=req.getParameter("id");//取值
//        Integer aa = -1;
//        if (id == null || "".equals(id)) {
//            aa = 0;
//        } else {
//            aa = Integer.parseInt(id);
//        }
//        //调用逻辑层
//        IMapsService iMapsService=new MapsServiceImpl();
//        MapsModel mapsModel = iMapsService.findById(aa);
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("mapsModel", mapsModel);
//        resp.getWriter().println(jsonObject);
//    }
//}
