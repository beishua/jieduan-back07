package com.cn.wanxi.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        HttpServletResponse resp= (HttpServletResponse) servletResponse;//强制转换
        resp.setHeader("Access-Control-Allow-Origin", "http://localhost:8088");
        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        resp.setHeader("Access-Control-Max-Age", "3600");
        resp.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
        resp.setHeader("Access-Control-Allow-Credentials", "true");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String url=req.getServletPath();
        System.out.println(url);
        if (url.startsWith("/back/")){
            String username= (String) req.getSession().getAttribute("username");
            if (username==null){
//                resp.sendRedirect("/login.html");
                resp.getWriter().println(400);
            }else{
                filterChain.doFilter(req,resp);//放行操作
            }
        }else{
            filterChain.doFilter(req,resp);//放行操作
        }
    }

    @Override
    public void destroy() {
    }
}
