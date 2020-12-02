package com.cn.wanxi.servlet.maps;//package com.cn.wanxi.servlet.maps;
//
//import com.alibaba.fastjson.JSONObject;
//import com.cn.wanxi.model.MapsModel;
//import com.cn.wanxi.model.PageModel;
//import com.cn.wanxi.service.IMapsService;
//import com.cn.wanxi.service.impl.MapsServiceImpl;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet("/back/maps/findAllBySome")
//public class MapsFindBySomeServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //乱码
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");
//        //提取页面数据
//        String id=req.getParameter("id");
//        String QQ=req.getParameter("QQ");
//        String phone=req.getParameter("phone");
//        String weChat=req.getParameter("weChat");
//        String microblog=req.getParameter("microblog");
//        String email=req.getParameter("email");
//        String address=req.getParameter("address");
//
//        String pageNum = req.getParameter("pageNum");
//        String pageSize = req.getParameter("pageSize");
//        PageModel pageModel = new PageModel();
//        pageModel.setPageSize(pageSize == null || "".equals(pageSize) ? 10 : Integer.parseInt(pageSize));
//        pageModel.setPageNum(pageNum == null || "".equals(pageNum) ? 1 : Integer.parseInt(pageNum));
//
//        //封装数据
//        MapsModel mapsModel = new MapsModel();
////        mapsModel.setId(Integer.parseInt(id));
//        mapsModel.setQQ(QQ);
//        mapsModel.setPhone(phone);
//        mapsModel.setWeChat(weChat);
//        mapsModel.setMicroblog(microblog);
//        mapsModel.setEmail(email);
//        mapsModel.setAddress(address);
//        mapsModel.setPageModel(pageModel);
//        //调用服务逻辑层
//        IMapsService iMapsService=new MapsServiceImpl();
//        //返回数据
//        List<MapsModel> list = iMapsService.findAllBySome(mapsModel);
//        int number = iMapsService.getCount(mapsModel);
//
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("list",list);
//        jsonObject.put("number", number);
//        resp.getWriter().println(jsonObject);
//    }
//}
