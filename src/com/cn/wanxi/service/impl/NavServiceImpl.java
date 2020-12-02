package com.cn.wanxi.service.impl;

import com.cn.wanxi.dao.NavDao;
import com.cn.wanxi.dao.impl.NavImpl;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.service.INavService;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

public class NavServiceImpl implements INavService {
    @Override
    public List<NavModel> findAll(PageModel pageModel) {
        NavDao navDao=new NavImpl();
        return navDao.findAll(pageModel);
    }

    @Override
    public int getCount() {
        NavDao navDao=new NavImpl();
        return navDao.getCount();
    }

    @Override
    public int add(NavModel navModel) {
        NavDao navDao=new NavImpl();
        return navDao.add(navModel);
    }

    @Override
    public List<NavModel> findAllBySome(NavModel navModel) {
        NavDao navDao=new NavImpl();
        return navDao.findAllBySome(navModel);
    }

    @Override
    public int getCount(NavModel navModel) {
        NavDao navDao=new NavImpl();
        return navDao.getCount();
    }

    @Override
    public NavModel findById(Integer id) {
        NavDao navDao=new NavImpl();
        return navDao.findById(id);
    }

    @Override
    public int del(Integer id) {
        NavDao navDao=new NavImpl();
        return navDao.del(id);
    }

    @Override
    public int edit(NavModel navModel) {
        int result = 1;
        NavDao navDao = new NavImpl();
        result = navDao.edit(navModel);
        return result;
    }
}
