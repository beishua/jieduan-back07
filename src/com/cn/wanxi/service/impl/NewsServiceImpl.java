package com.cn.wanxi.service.impl;

import com.cn.wanxi.dao.CompanyDao;
import com.cn.wanxi.dao.NavDao;
import com.cn.wanxi.dao.NewsDao;
import com.cn.wanxi.dao.impl.CompanyImpl;
import com.cn.wanxi.dao.impl.NavImpl;
import com.cn.wanxi.dao.impl.NewsImpl;
import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.service.INewsService;
import redis.clients.jedis.Jedis;

import java.util.List;

public class NewsServiceImpl implements INewsService {
    @Override
    public int add(NewsModel newsModel) {
//        return newsDao.add(newsModel);
        NewsDao newsDao=new NewsImpl();
        int result=newsDao.add(newsModel);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("picture","year");
        }
        return result;
    }

    @Override
    public int getCount() {
        NewsDao newsDao=new NewsImpl();
        return newsDao.getCount();
    }

    @Override
    public int del(Integer id) {
        NewsDao newsDao=new NewsImpl();
        int result=newsDao.del(id);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("picture","year");
        }
        return result;
    }

    @Override
    public NewsModel findById(Integer id) {
        NewsDao newsDao=new NewsImpl();
        return newsDao.findById(id);
    }

    @Override
    public int getCount(NewsModel newsModel) {
        NewsDao newsDao=new NewsImpl();
        return newsDao.getCount();
    }

    @Override
    public int edit(NewsModel newsModel) {
        NewsDao newsDao=new NewsImpl();
        int data=newsDao.update(newsModel);
        if (data==1){
            Jedis jedis=new Jedis();
            jedis.del("picture","year");
        }
        return data;
    }

    @Override
    public List<NewsModel> findAllByNewsTypeId(NewsModel newsModel) {
        NewsDao newsDao=new NewsImpl();
        return newsDao.findAllByNewsTypeId(newsModel);
    }

    @Override
    public List<NewsModel> findByIdForNewsDetailPage(NewsModel newsModel) {
        NewsDao newsDao=new NewsImpl();
        return newsDao.findByIdForNewsDetailPage(newsModel);
    }

    @Override
    public List<NewsModel> findAllBySome(NewsModel newsModel) {
        NewsDao newsDao=new NewsImpl();
        return newsDao.findAllBySome(newsModel);
    }
}
