package com.cn.wanxi.dao;

import com.cn.wanxi.model.UserModel;

import java.util.List;

public interface IUserDao {
     int add(UserModel userModel);

    UserModel findByUsername(String username);

    UserModel isHaveFindByUsernameAndPassword(UserModel userModel);

    List<UserModel> findAll();

    int delete(Integer aa);

    List<UserModel> findAllBySome(UserModel userModel);

    UserModel findById(Integer id);

    int edit(UserModel userModel);

    int getCount(UserModel userModel);

//    int findByUsernameAndPassword(UserModel userModel);

//    UserModel isHaveFindByUsernameAndPasswordAndSessionCode(UserModel userModel);
}
