package com.cn.wanxi.dao.impl;

import com.cn.wanxi.dao.TrainDao;
import com.cn.wanxi.model.*;
import com.cn.wanxi.util.GetSQLSession;
import com.cn.wanxi.util.JDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrainImpl implements TrainDao {
//添加数据
    @Override
    public int add(TrainModel trainModel) {
        return GetSQLSession.getSqlSession().insert("com.cn.wanxi.dao.TrainDao.add",trainModel);
//        String sql = "insert into tab_train (name,picture,content) " +
//                "values('" + trainModel.getTrainname() + "'," +
//                "'" + trainModel.getPicture() + "'," +
//                "'" + trainModel.getContent() + "')";
//        return JDBC.excuteUpdate(sql);
    }
//删除数据
    @Override
    public int del(Integer id) {
        return GetSQLSession.getSqlSession().delete("com.cn.wanxi.dao.TrainDao.del",id);
//        String sql = "delete from tab_train where id=" + id;
//        return JDBC.excuteUpdate(sql);
    }
//编辑页面赋值
    @Override
    public TrainModel findById(Integer id) {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.TrainDao.findById",id);
//        String sql = "select * from tab_train where id=" + id;
//        ResultSet resultSet = JDBC.getResultSet(sql);
//        TrainModel trainModel = new TrainModel();
//        try {
//            while (resultSet.next()) {
//                trainModel.setId(resultSet.getInt("id"));
//                trainModel.setTrainname(resultSet.getString("name"));
//                trainModel.setContent(resultSet.getString("content"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return trainModel;
    }
//修改
    @Override
    public int edit(TrainModel trainModel) {
        return GetSQLSession.getSqlSession().update("com.cn.wanxi.dao.TrainDao.edit",trainModel);
//        StringBuilder sql = new StringBuilder("update tab_train set ");
//        if (trainModel.getTrainname() != "" ){
//            sql.append(" name='" + trainModel.getTrainname() + "',");
//        }
//        if (trainModel.getPicture() != "" ){
//            sql.append(" picture='" + trainModel.getPicture() + "',");
//        }
//        if (trainModel.getContent() != "" ){
//            sql.append(" content='" + trainModel.getContent() + "',");
//        }
//        sql.append(" remark='' where id=" + trainModel.getId());
//        return JDBC.excuteUpdate(sql.toString());
    }

    @Override
    public int getCount() {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.TrainDao.getCount");
//        String sql = "select count(*) count from tab_train";
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
//模糊查询
    @Override
    public List<TrainModel> findAllBySome(TrainModel trainModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.TrainDao.findAllBySome",trainModel);
//        StringBuilder sql = new StringBuilder("select * from tab_train where 1=1");
//        if (trainModel.getTrainname()!=null) {
//            sql.append(" and name like '%").append(trainModel.getTrainname()).append("%' ");
//        }
//        if (trainModel.getPicture()!=null) {
//            sql.append(" and picture like '%").append(trainModel.getPicture()).append("%' ");
//        }
//        if (trainModel.getContent()!=null) {
//            sql.append(" and content like '%").append(trainModel.getContent()).append("%' ");
//        }
//        sql.append(" limit ").append((trainModel.getPageModel().getPageNum() - 1) * trainModel.
//                getPageModel().getPageSize()).append(",").append(trainModel.getPageModel().getPageSize());
//        List<TrainModel> list = new ArrayList<>();
//        ResultSet resultSet = JDBC.getResultSet(sql.toString());
//        try {
//            while (resultSet.next()) {
//                TrainModel model = new TrainModel();
//                model.setId(resultSet.getInt("id"));
//                model.setPicture(resultSet.getString("picture"));
//                model.setTrainname(resultSet.getString("name"));
//                model.setContent(resultSet.getString("content"));
//                list.add(model);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    @Override
    public List<CoachModel> getList() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.TrainDao.getList");
//        String sql="select * from tab_train where is_show=1";
//        ResultSet resultSet=JDBC.getResultSet(sql);
//        List<CoachModel> list=new ArrayList<>();
//        try{
//            while (resultSet.next()){
//                CoachModel coachModel=new CoachModel();
//                coachModel.setNameForhomejsp(resultSet.getString("name"));
//                coachModel.setPositionForhomejsp(resultSet.getString("content"));
//                coachModel.setPictureForhomejsp(resultSet.getString("picture"));
//                list.add(coachModel);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    @Override
    public List<CoachModel> getLista() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.TrainDao.getLista");
//        String sql="select * from tab_train where is_show=1";
//        ResultSet resultSet=JDBC.getResultSet(sql);
//        List<CoachModel> list=new ArrayList<>();
//        try{
//            while(resultSet.next()){
//                CoachModel coachModel=new CoachModel();
//                coachModel.setNameForhomejsp(resultSet.getString("name"));
//                coachModel.setPositionForhomejsp(resultSet.getString("content"));
//                coachModel.setPicture(resultSet.getString("picture"));
//                list.add(coachModel);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    @Override
    public List<CoachModel> getListb() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.TrainDao.getListb");
//        String sql="select * from tab_train where is_show=2";
//        ResultSet resultSet=JDBC.getResultSet(sql);
//        List<CoachModel> list=new ArrayList<>();
//        try{
//            while(resultSet.next()){
//                CoachModel coachModel=new CoachModel();
//                coachModel.setName01(resultSet.getString("name"));
//                coachModel.setPosition01(resultSet.getString("content"));
//                coachModel.setPicture01(resultSet.getString("picture"));
//                list.add(coachModel);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }
}