package com.cn.wanxi.service.impl;//package com.cn.wanxi.service.impl;
//
//import com.cn.wanxi.dao.MapsDao;
//import com.cn.wanxi.dao.impl.MapsImpl;
//import com.cn.wanxi.model.MapsModel;
//import com.cn.wanxi.service.IMapsService;
//import redis.clients.jedis.Jedis;
//import java.util.List;
//
//public class MapsServiceImpl implements IMapsService {
//    @Override
//    public int add(MapsModel mapsModel) {
//        MapsDao mapsDao=new MapsImpl();
//        int result=mapsDao.add(mapsModel);
//        if (result==1){
//            Jedis jedis=new Jedis();
//            jedis.del("imgHref","imgHref1");
//        }
//        return result;
//    }
//
//    @Override
//    public int edit(MapsModel mapsModel) {
//        MapsDao mapsDao=new MapsImpl();
//        int result=mapsDao.edit(mapsModel);
//        if (result==1){
//            Jedis jedis=new Jedis();
//            jedis.del("imgHref","imgHref1");
//        }
//        return result;
//    }
//
//    @Override
//    public List<MapsModel> findAllBySome(MapsModel mapsModel) {
//        MapsDao mapsDao=new MapsImpl();
//        return mapsDao.findAllBySome(mapsModel);
//    }
//
//    @Override
//    public int getCount(MapsModel mapsModel) {
//        MapsDao mapsDao=new MapsImpl();
//        return mapsDao.getCount(mapsModel);
//    }
//
//    @Override
//    public int del(Integer id) {
//        MapsDao mapsDao=new MapsImpl();
//        int result=mapsDao.del(id);
//        if (result==1){
//            Jedis jedis=new Jedis();
//            jedis.del("imgHref","imgHref1");
//        }
//        return result;
//    }
//
//    @Override
//    public MapsModel findById(Integer id) {
//        MapsDao mapsDao=new MapsImpl();
//        return mapsDao.findById(id);
//    }
//}
