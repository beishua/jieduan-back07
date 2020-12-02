package com.cn.wanxi.service;

import com.cn.wanxi.model.CoachModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.TrainModel;

import java.util.List;

public interface ITrainService {

    int add(TrainModel trainModel);

    int del(Integer id);
    int getCount();

    TrainModel findById(Integer aa);

//    int edit(CoachModel coachModel);


    int getCount(TrainModel trainModel);

    List<TrainModel> findAllBySome(TrainModel trainModel);

    int edit(TrainModel trainModel);

//    int edit(TrainModel trainModel);
}
