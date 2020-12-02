package com.cn.wanxi.dao.impl;

import com.cn.wanxi.dao.ProgramDao;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.model.ProgramModel;
import com.cn.wanxi.util.GetSQLSession;
import com.cn.wanxi.util.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProgramImpl implements ProgramDao {
    @Override
    public List<ProgramModel> findAll() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.ProgramDao.findAll");
//        String sql ="select * from tab_program";
//        ResultSet resultSet= JDBC.getResultSet(sql);
//        List<ProgramModel> list=new ArrayList<>();
//        try{
//            while (resultSet.next()){
//                ProgramModel programModel=new ProgramModel();
//                programModel.setId(resultSet.getInt("id"));
//                programModel.setName(resultSet.getString("name"));
//                list.add(programModel);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }
}
