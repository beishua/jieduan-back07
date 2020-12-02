package com.cn.wanxi.service.impl;

import com.cn.wanxi.dao.IUserDao;
import com.cn.wanxi.dao.TrainDao;
import com.cn.wanxi.dao.impl.TrainImpl;
import com.cn.wanxi.dao.impl.UserImpl;
import com.cn.wanxi.model.CoachModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.TrainModel;
import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.ITrainService;
import redis.clients.jedis.Jedis;

import java.util.List;

public class TrainServiceImpl implements ITrainService {
    @Override
    public int add(TrainModel trainModel) {
        TrainDao trainDao=new TrainImpl();
        int result=trainDao.add(trainModel);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("positionForhomejsp","pictureFroTrain","name01");
        }
        return result;
    }
    @Override
    public int del(Integer id) {
        TrainDao trainDao=new TrainImpl();
        int result=trainDao.del(id);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("positionForhomejsp","pictureFroTrain","name01");
        }
        return result;
    }
    @Override
    public int getCount() {
        TrainDao trainDao=new TrainImpl();
        return trainDao.getCount();
    }

    @Override
    public TrainModel findById(Integer id) {
        TrainDao trainDao=new TrainImpl();
        return trainDao.findById(id);
    }

    @Override
    public int edit(TrainModel trainModel) {
        TrainDao trainDao=new TrainImpl();
        int result=trainDao.edit(trainModel);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("positionForhomejsp","pictureFroTrain","name01");
        }
        return result;
    }

    @Override
    public int getCount(TrainModel trainModel) {
        TrainDao trainDao=new TrainImpl();
        return trainDao.getCount();
    }

    @Override
    public List<TrainModel> findAllBySome(TrainModel trainModel) {
        TrainDao trainDao=new TrainImpl();
        List<TrainModel> list=trainDao.findAllBySome(trainModel);
        return list;
    }
}