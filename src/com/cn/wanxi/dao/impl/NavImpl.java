package com.cn.wanxi.dao.impl;

import com.cn.wanxi.dao.NavDao;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.util.GetSQLSession;
import com.cn.wanxi.util.JDBC;
import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NavImpl implements NavDao {
    @Override
    public List<NavModel> findAll(PageModel pageModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NavDao.findAll",pageModel);
//        String sql = "select * from nav" +
//                " limit " + (pageModel.getPageNum() - 1) * pageModel.getPageSize() + "," + pageModel.getPageSize() + "";
//        ResultSet resultSet = JDBC.getResultSet(sql);
//        List<NavModel> list = new ArrayList<>();
//        try {
//            while (resultSet.next()) {
//                NavModel model = new NavModel();
//                model.setId(resultSet.getInt("id"));
//                model.setNavName(resultSet.getString("navName"));
//                model.setNavContent(resultSet.getString("navContent"));
//                list.add(model);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    @Override
    public int getCount() {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.NavDao.getCount");
//        String sql = "select count(*) count from nav";
//        ResultSet resultSet = JDBC.getResultSet(sql);
//        int count = 0;
//        try {
//            while (resultSet.next()) {
//                count = resultSet.getInt("count");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return count;
    }

    @Override
    public int add(NavModel navModel) {
        return GetSQLSession.getSqlSession().insert("com.cn.wanxi.dao.NavDao.add",navModel);
//        String sql = "insert into nav (navName,navContent) " +
//                "values('" + navModel.getNavName() + "'," +
//                "'" + navModel.getNavContent() + "')";
//        return JDBC.excuteUpdate(sql);
    }

    @Override
    public List<NavModel> findAllBySome(NavModel navModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NavDao.findAllBySome",navModel);
//        StringBuilder sql = new StringBuilder("select * from nav where 1=1");
//        if (!"".equals(navModel.getNavName())) {
//            sql.append(" and navName like '%").append(navModel.getNavName()).append("%' ");
//        }
//        if (!"".equals(navModel.getNavContent())) {
//            sql.append(" and navContent like '%").append(navModel.getNavContent()).append("%' ");
//        }
//        sql.append(" limit ").append((navModel.getPageModel().getPageNum() - 1) * navModel.
//                getPageModel().getPageSize()).append(",").append(navModel.getPageModel().getPageSize());
//        List<NavModel> list = new ArrayList<>();
//        ResultSet resultSet = JDBC.getResultSet(sql.toString());
//        try {
//            while (resultSet.next()) {
//                NavModel model = new NavModel();
//                model.setId(resultSet.getInt("id"));
//                model.setNavName(resultSet.getString("navName"));
//                model.setNavContent(resultSet.getString("navContent"));
//                list.add(model);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    @Override
    public NavModel findById(Integer id) {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.NavDao.findById",id);
//        String sql = "select * from nav where id=" + id;
//        ResultSet resultSet = JDBC.getResultSet(sql);
//        NavModel navModel = new NavModel();
//        try {
//            while (resultSet.next()) {
//                navModel.setId(resultSet.getInt("id"));
//                navModel.setNavName(resultSet.getString("navName"));
//                navModel.setNavContent(resultSet.getString("navContent"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return navModel;
    }

    @Override
    public int del(Integer id) {
        return GetSQLSession.getSqlSession().delete("com.cn.wanxi.dao.NavDao.del",id);
//        String sql = "delete from nav where id=" + id;
//        return JDBC.excuteUpdate(sql);
    }

    @Override
    public List<NavModel> getList() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NavDao.getList");
//        String sql="select * from nav";
//        ResultSet resultSet=JDBC.getResultSet(sql);
//        List<NavModel> list=new ArrayList<>();
//        try{
//            while (resultSet.next()){
//                NavModel navModel=new NavModel();
//                navModel.setHref(resultSet.getString("navContent"));
//                navModel.setTitle(resultSet.getString("navName"));
//                list.add(navModel);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    @Override
    public int edit(NavModel navModel) {
        return GetSQLSession.getSqlSession().update("com.cn.wanxi.dao.NavDao.edit",navModel);
//        String sql = "update nav set navName='" + navModel.getTitle() + "'," +
//                "navContent='" + navModel.getHref() + "'";
//        sql += "where id=" + navModel.getId();
//        return JDBC.excuteUpdate(sql);
    }
}
