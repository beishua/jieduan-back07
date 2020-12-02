package com.cn.wanxi.dao;

import com.cn.wanxi.model.CoachModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.model.UserModel;

import java.util.List;

public interface TrainDao {
    int add(TrainModel trainModel);

//    List<TrainModel> findAll(PageModel pageModel);

    int getCount();
    int del(Integer id);

    TrainModel findById(Integer id);

    int edit(TrainModel trainModel);

    List<TrainModel> findAllBySome(TrainModel trainModel);

    List<CoachModel> getList();

    List<CoachModel> getLista();

    List<CoachModel> getListb();

//    int add(CoachModel coachModel);
//
//    int del(CoachModel coachModel);
//
////    int update(CoachModel coachModel);
//
//    int edit(CoachModel coachModel);
}
