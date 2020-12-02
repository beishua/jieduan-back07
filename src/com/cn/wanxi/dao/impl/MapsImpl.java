package com.cn.wanxi.dao.impl;//package com.cn.wanxi.dao.impl;
//
//import com.cn.wanxi.dao.MapsDao;
//import com.cn.wanxi.model.MapsModel;
//import com.cn.wanxi.util.JDBC;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MapsImpl implements MapsDao {
////    @Override
////    public List<MapsModel> getList() {
////        String sql="select * from maps where is_show=1";
////        ResultSet resultSet= JDBC.getResultSet(sql);
////        List<MapsModel> list=new ArrayList<>();
////        try{
////            while (resultSet.next()){
////                MapsModel mapsModel=new MapsModel();
////                mapsModel.setQQ(resultSet.getString("QQ"));
////                mapsModel.setPhone(resultSet.getString("phone"));
////                mapsModel.setWeChat(resultSet.getString("weChat"));
////                list.add(mapsModel);
////            }
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        return list;
////    }
//
////    @Override
////    public List<MapsModel> getLista() {
////        String sql="select * from maps where is_show=2";
////        ResultSet resultSet= JDBC.getResultSet(sql);
////        List<MapsModel> list=new ArrayList<>();
////        try{
////            while (resultSet.next()){
////                MapsModel mapsModel=new MapsModel();
////                mapsModel.setMicroblog(resultSet.getString("microblog"));
////                mapsModel.setEmail(resultSet.getString("email"));
////                mapsModel.setAddress(resultSet.getString("address"));
////                list.add(mapsModel);
////            }
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        return list;
////    }
//
//    @Override
//    public int add(MapsModel mapsModel) {
//        String sql = "insert into maps (QQ,phone,weChat,microblog,email,address) " +
//                "values('" + mapsModel.getQQ() + "'," +
//                "'" + mapsModel.getPhone() + "'," +
//                "'" + mapsModel.getWeChat() + "'," +
//                "'" + mapsModel.getMicroblog() + "'," +
//                "'" + mapsModel.getEmail() + "'," +
//                "'" + mapsModel.getAddress() + "')";
//        return JDBC.excuteUpdate(sql);
//    }
//
//    @Override
//    public int edit(MapsModel mapsModel) {
//        String sql = "update maps set";
//        if (mapsModel.getQQ() != null) {
//            sql += " QQ='" + mapsModel.getQQ() + "',";
//        }
//        if (mapsModel.getPhone() != null) {
//            sql += " phone='" + mapsModel.getPhone() + "',";
//        }
//        if (mapsModel.getWeChat() != null) {
//            sql += " weChat='" + mapsModel.getWeChat() + "',";
//        }
//        if (mapsModel.getMicroblog() != null) {
//            sql += " microblog='" + mapsModel.getMicroblog() + "',";
//        }
//        if (mapsModel.getEmail() != null) {
//            sql += " email='" + mapsModel.getEmail() + "',";
//        }
//        if (mapsModel.getAddress() != null) {
//            sql += " address='" + mapsModel.getAddress() + "',";
//        }
//        sql += " remark='' where id='" + mapsModel.getId() + "'";
//        return JDBC.excuteUpdate(sql);
//    }
//
//    @Override
//    public List<MapsModel> findAllBySome(MapsModel mapsModel) {
//        StringBuilder sql = new StringBuilder("select * from maps where 1=1");
//        if (mapsModel.getQQ()!=null) {
//            sql.append(" and QQ like '%").append(mapsModel.getQQ()).append("%'");
//        }
//        if (mapsModel.getPhone()!=null) {
//            sql.append(" and phone like '%").append(mapsModel.getPhone()).append("%'");
//        }
//        if (mapsModel.getWeChat()!=null) {
//            sql.append(" and weChat like '%").append(mapsModel.getWeChat()).append("%'");
//        }
//        if (mapsModel.getMicroblog()!=null) {
//            sql.append(" and microblog like '%").append(mapsModel.getMicroblog()).append("%'");
//        }
//        if (mapsModel.getEmail()!=null) {
//            sql.append(" and email like '%").append(mapsModel.getEmail()).append("%'");
//        }
//        if (mapsModel.getAddress()!=null) {
//            sql.append(" and address like '%").append(mapsModel.getAddress()).append("%'");
//        }
//        sql.append(" limit ").append((mapsModel.getPageModel().getPageNum() - 1) * mapsModel.
//                getPageModel().getPageSize()).append(",").append(mapsModel.getPageModel().getPageSize());
//        List<MapsModel> list = new ArrayList<>();
//        ResultSet resultSet = JDBC.getResultSet(sql.toString());
//        try {
//            while (resultSet.next()) {
//                MapsModel model = new MapsModel();
//                model.setId(resultSet.getInt("id"));
//                model.setQQ(resultSet.getString("QQ"));
//                model.setPhone(resultSet.getString("phone"));
//                model.setWeChat(resultSet.getString("weChat"));
//                model.setMicroblog(resultSet.getString("microblog"));
//                model.setEmail(resultSet.getString("email"));
//                model.setAddress(resultSet.getString("address"));
//                list.add(model);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    @Override
//    public int getCount(MapsModel mapsModel) {
//        String sql = "select count(*) count from maps";
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
//    }
//
//    @Override
//    public int del(Integer id) {
//        String sql = "delete from maps where id=" + id;
//        return JDBC.excuteUpdate(sql);
//    }
//
//    @Override
//    public MapsModel findById(Integer id) {
//        String sql="select * from maps where id=" + id;
//        ResultSet resultSet=JDBC.getResultSet(sql);
//        MapsModel mapsModel = new MapsModel();
//        try{
//            while (resultSet.next()) {
//                mapsModel.setId(resultSet.getInt("id"));
//                mapsModel.setQQ(resultSet.getString("QQ"));
//                mapsModel.setPhone(resultSet.getString("phone"));
//                mapsModel.setWeChat(resultSet.getString("weChat"));
//                mapsModel.setMicroblog(resultSet.getString("microblog"));
//                mapsModel.setEmail(resultSet.getString("email"));
//                mapsModel.setAddress(resultSet.getString("address"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return mapsModel;
//    }
//}
