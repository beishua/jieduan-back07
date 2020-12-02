package com.cn.wanxi.dao.impl;

import com.cn.wanxi.dao.IUserDao;
import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.util.GetSQLSession;
import com.cn.wanxi.util.JDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserImpl implements IUserDao {
    @Override
    public int add(UserModel userModel) {
        return GetSQLSession.getSqlSession().insert("com.cn.wanxi.dao.IUserDao.add",userModel);
    }

    @Override
    public UserModel findByUsername(String username) {
       return (UserModel) GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.IUserDao.findByUsername",username).get(0);
    }
    @Override
    public UserModel isHaveFindByUsernameAndPassword(UserModel userModel) {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.IUserDao.isHaveFindByUsernameAndPassword",userModel);
    }

    @Override
    public List<UserModel> findAll() {
        String sql="select * from user";
        List<UserModel> list=new ArrayList<>();
        ResultSet resultSet=JDBC.getResultSet(sql);
        try{
            while (resultSet.next()){
                UserModel userModel = new UserModel();
                userModel.setId(resultSet.getInt("id"));
                userModel.setUsername(resultSet.getString("username"));
                userModel.setBirthday(resultSet.getString("birthday"));
                userModel.setIntroduce(resultSet.getString("introduce"));
                userModel.setHobby(resultSet.getString("hobby"));
                userModel.setSex(resultSet.getString("sex"));
                userModel.setPhone(resultSet.getString("phone"));
                list.add(userModel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return list;
    }

    @Override
    public int delete(Integer id) {
        return GetSQLSession.getSqlSession().delete("com.cn.wanxi.dao.IUserDao.delete",id);
    }

    @Override
    public List<UserModel> findAllBySome(UserModel userModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.IUserDao.findAllBySome",userModel);
    }

    @Override
    public UserModel findById(Integer id) {
        return  GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.IUserDao.findById",id);
//        userModel.setId(resultSet.getInt("id"));
//        userModel.setBirthday(resultSet.getString("birthday"));
//        userModel.setUsername(resultSet.getString("username"));
//        userModel.setIntroduce(resultSet.getString("introduce"));
//        userModel.setHobby(resultSet.getString("hobby"));
//        userModel.setSex(resultSet.getString("sex"));
//        userModel.setPhone(resultSet.getString("phone"));
    }

    @Override
    public int edit(UserModel userModel) {
        return GetSQLSession.getSqlSession().update("com.cn.wanxi.dao.IUserDao.edit",userModel);
    }

    @Override
    public int getCount(UserModel userModel) {
        return (int) GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.IUserDao.getCount",userModel).get(0);
    }
}
