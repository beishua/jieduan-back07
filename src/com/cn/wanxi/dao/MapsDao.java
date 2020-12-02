package com.cn.wanxi.dao;

import com.cn.wanxi.model.MapsModel;

import java.util.List;

public interface MapsDao {
//    List<MapsModel> getList();
//
//    List<MapsModel> getLista();

    int add(MapsModel mapsModel);

    int edit(MapsModel mapsModel);

    List<MapsModel> findAllBySome(MapsModel mapsModel);

    int getCount(MapsModel mapsModel);

    int del(Integer id);

    MapsModel findById(Integer id);
}
