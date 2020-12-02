package com.cn.wanxi.service;

import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.PageModel;

import java.util.List;

public interface INavService {
    List<NavModel> findAll(PageModel pageModel);

    int getCount();

    int add(NavModel navModel);

    List<NavModel> findAllBySome(NavModel navModel);

    int getCount(NavModel navModel);

    NavModel findById(Integer aa);

    int del(Integer id);

    int edit(NavModel navModel);

//    List<NavModel> getNavModelList();


//    int getCount(NavModel navModel);
}
