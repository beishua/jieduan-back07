package com.cn.wanxi.dao.impl;

import com.cn.wanxi.dao.ProductDao;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.util.GetSQLSession;
import com.cn.wanxi.util.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements ProductDao {
    @Override
    public int add(ProductModel productModel) {
        return GetSQLSession.getSqlSession().insert("com.cn.wanxi.dao.ProductDao.add", productModel);
//        String sql = "insert into product (title,imgHref,pice,program_id) " +
//                "values('" + productModel.getTitle() + "'," +
//                "'" + productModel.getImgHref() + "'," +
//                "'" + productModel.getContent() + "'," +
//                "'" + productModel.getProgramId() + "')";
//        return JDBC.excuteUpdate(sql);
    }

    @Override
    public ProductModel findById(Integer id) {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.ProductDao.findById", id);
    }

    public int update(ProductModel productModel) {
        return GetSQLSession.getSqlSession().update("com.cn.wanxi.dao.ProductDao.update", productModel);
    }

    @Override
    public int del(Integer id) {
        return GetSQLSession.getSqlSession().delete("com.cn.wanxi.dao.ProductDao.del", id);
    }

    @Override
    public int getCount() {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.ProductDao.getCount");
    }

    @Override
    public List<ProductModel> findAllBySome(ProductModel productModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.ProductDao.findAllBySome", productModel);
    }

    //拿到产品页面
    @Override
    public List<ProductModel> getList() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.ProductDao.getList");
//        String sql = "select * from product";
//        ResultSet resultSet = JDBC.getResultSet(sql);
//        List<ProductModel> list = new ArrayList<>();
//        try {
//            while (resultSet.next()) {
//                ProductModel productModel = new ProductModel();
//                productModel.setId(resultSet.getInt("id"));
//                productModel.setPicture(resultSet.getString("imgHref"));
//                productModel.setName(resultSet.getString("title"));
//                productModel.setPice(resultSet.getString("pice"));
//                list.add(productModel);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    //    得到四个项目名
    @Override
    public List<ProductModel> getLista() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.ProductDao.getLista");
//        String sql = "select * from tab_program";
//        ResultSet resultSet = JDBC.getResultSet(sql);
//        List<ProductModel> list = new ArrayList<>();
//        try {
//            while (resultSet.next()) {
//                ProductModel productModel = new ProductModel();
//                productModel.setProgramId(resultSet.getInt("id"));
//                productModel.setProgramName(resultSet.getString("name"));
//                list.add(productModel);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    //    详细页面
    @Override
    public List<ProductModel> getListb() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.ProductDao.getListb");
//        String sql = "select * from product";
//        ResultSet resultSet = JDBC.getResultSet(sql);
//        List<ProductModel> list = new ArrayList<>();
//        try {
//            while (resultSet.next()) {
//                ProductModel productModel = new ProductModel();
//                productModel.setId(resultSet.getInt("id"));
//                productModel.setPicture(resultSet.getString("imgHref"));
//                productModel.setTitleForDetailed(resultSet.getString("name"));
//                productModel.setDataForDetailed(resultSet.getString("data"));
//                productModel.setSmallTileForDetailed(resultSet.getString("smallTile"));
//                productModel.setContentForDetailed(resultSet.getString("contentForDetailed"));
//                list.add(productModel);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    @Override
    public List<ProductModel> findAllByTypeId(ProductModel productModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.ProductDao.findAllByTypeId",productModel);
    }

    @Override
    public List<ProductModel> findByIdForDetailPage(ProductModel productModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.ProductDao.findByIdForDetailPage", productModel);
    }
}

