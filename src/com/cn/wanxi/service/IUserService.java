package com.cn.wanxi.service;

import com.cn.wanxi.model.UserModel;

import java.util.List;

public interface IUserService {

    int login(UserModel userModel);

    int add(UserModel userModel);

    List<UserModel> findAll();

    int delete(Integer aa);

    List<UserModel> findAllBySome(UserModel userModel);

    UserModel findById(Integer aa);

    int edit(UserModel userModel);

    int getCount(UserModel userModel);
}
