package com.cn.wanxi.dao;

import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.PageModel;

import java.util.List;

public interface NavDao {
    List<NavModel> findAll(PageModel pageModel);

    int getCount();

    int add(NavModel navModel);

    List<NavModel> findAllBySome(NavModel navModel);

    NavModel findById(Integer id);

    int del(Integer id);

    List<NavModel> getList();

    int edit(NavModel navModel);
}
