package com.cn.wanxi.service.show;

import com.cn.wanxi.dao.TrainDao;
import com.cn.wanxi.dao.impl.TrainImpl;
import com.cn.wanxi.model.CoachModel;
import com.cn.wanxi.model.TrainModel;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

public class CoachService {
    public static List<CoachModel> getList() {
        Jedis jedis=new Jedis();
        TrainDao trainDao=new TrainImpl();
        List<CoachModel> list=new ArrayList<>();
        if (jedis.llen("positionForhomejsp") > 0) {
            for (int i=0;i<jedis.llen("positionForhomejsp");i++){
                CoachModel coachModel=new CoachModel();
                coachModel.setPictureForhomejsp(jedis.lindex("pictureFrohomejsp",i));
                coachModel.setPositionForhomejsp(jedis.lindex("positionForhomejsp",i));
                coachModel.setNameForhomejsp(jedis.lindex("nameForhomejsp",i));
                list.add(coachModel);
            }
        }else{
            list = trainDao.getList();
            for (int i=0;i<list.size();i++){
                jedis.rpush("pictureFrohomejsp",list.get(i).getPictureForhomejsp());
                jedis.rpush("positionForhomejsp",list.get(i).getPositionForhomejsp());
                jedis.rpush("nameForhomejsp",list.get(i).getNameForhomejsp());
            }
            return list;
        }
        return list;
    }
    public List<CoachModel> getLista() {
        Jedis jedis=new Jedis();
        TrainDao trainDao=new TrainImpl();
        List<CoachModel> list=new ArrayList<>();
        if (jedis.llen("pictureFroTrain") > 0) {
            for (int i=0;i<jedis.llen("pictureFroTrain");i++){
                CoachModel coachModel=new CoachModel();
                coachModel.setPicture(jedis.lindex("pictureFroTrain",i));
                coachModel.setPositionForhomejsp(jedis.lindex("positionFroTrain",i));
                coachModel.setNameForhomejsp(jedis.lindex("nameFroTrain",i));
                list.add(coachModel);
            }
        }else{
            list = trainDao.getLista();
            for (int i=0;i<list.size();i++){
                jedis.rpush("pictureFroTrain",list.get(i).getPicture());
                jedis.rpush("positionFroTrain",list.get(i).getPositionForhomejsp());
                jedis.rpush("nameFroTrain",list.get(i).getNameForhomejsp());
            }
            return list;
        }
        return list;
    }
    public List<CoachModel> getListb() {
        Jedis jedis=new Jedis();
        TrainDao trainDao = new TrainImpl();
        List<CoachModel> list=new ArrayList<>();
        if (jedis.llen("name01") > 0) {
            for (int i = 0; i < jedis.llen("name01"); i++) {
                CoachModel coachModel = new CoachModel();
                coachModel.setName01(jedis.lindex("name01", i));
                coachModel.setPicture01(jedis.lindex("train_picture", i));
                coachModel.setPosition01(jedis.lindex("position01", i));
                list.add(coachModel);
            }
        }else{
            list = trainDao.getListb();
            for (int i=0;i<list.size();i++){
                jedis.rpush("name01",list.get(i).getName01());
                jedis.rpush("train_picture",list.get(i).getPicture01());
                jedis.rpush("position01",list.get(i).getPosition01());
            }
            return list;
        }
        return list;
    }
}
