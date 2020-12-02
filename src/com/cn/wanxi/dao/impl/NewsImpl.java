package com.cn.wanxi.dao.impl;

import com.cn.wanxi.dao.NewsDao;
import com.cn.wanxi.model.*;
import com.cn.wanxi.util.GetSQLSession;
import com.cn.wanxi.util.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsImpl implements NewsDao {
    @Override
    public int add(NewsModel newsModel) {
        return GetSQLSession.getSqlSession().insert("com.cn.wanxi.dao.NewsDao.add",newsModel);
    }

    @Override
    public int getCount() {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.NewsDao.getCount");
    }

    @Override
    public int del(Integer id) {
        return GetSQLSession.getSqlSession().delete("com.cn.wanxi.dao.NewsDao.del",id);
    }

    @Override
    public NewsModel findById(Integer id) {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.NewsDao.findById",id);
    }
    @Override
    public List<NewsModel> findAllBySome(NewsModel newsModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NewsDao.findAllBySome",newsModel);
    }
    @Override
    public int update(NewsModel newsModel) {
        return GetSQLSession.getSqlSession().update("com.cn.wanxi.dao.NewsDao.update",newsModel);
    }
    //首页信息
    @Override
    public List<NewsModel> getList() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NewsDao.getList");
    }
//新闻页面
    @Override
    public List<NewsModel> getLista() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NewsDao.getLista");
    }

//新闻类型
    @Override
    public List<NewsModel> getListb() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NewsDao.getListb");
    }

    @Override
    public List<NewsModel> findAllByNewsTypeId(NewsModel newsModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NewsDao.findAllByNewsTypeId",newsModel);
    }

    @Override
    public List<NewsModel> getListc() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NewsDao.getListc");
    }

    @Override
    public List<NewsModel> findByIdForNewsDetailPage(NewsModel newsModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.NewsDao.findByIdForNewsDetailPage",newsModel);
    }
}
