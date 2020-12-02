package com.cn.wanxi.servlet.show;

//import com.cn.wanxi.service.MapsService;
import com.alibaba.fastjson.JSONObject;
import com.cn.wanxi.service.show.MapsService;
import com.cn.wanxi.service.show.NavService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lianxi")
public class MapsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NavService navService = new NavService();
//        req.setAttribute("navList",navService.getList());
        MapsService mapsService=new MapsService();
//        req.setAttribute("mapsList",mapsService.getList());
//        req.setAttribute("mapsLista",mapsService.getLista());
        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("mapsList",mapsService.getList());
//        jsonObject.put("mapsLista",mapsService.getLista());
        jsonObject.put("navList",navService.getList());
        resp.getWriter().println(jsonObject);
    }
}
