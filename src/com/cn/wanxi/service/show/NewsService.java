package com.cn.wanxi.service.show;

import com.cn.wanxi.dao.NewsDao;
import com.cn.wanxi.dao.impl.NewsImpl;
import com.cn.wanxi.model.NewsModel;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

public class NewsService {
    public List<NewsModel> getList() {//home页面值
        NewsDao newsDao =new NewsImpl();
        List<NewsModel> list=newsDao.getList();
        return list;
    }

    public List<NewsModel> getLista() {
        NewsDao newsDao =new NewsImpl();
        List<NewsModel> list=newsDao.getLista();
            return list;
        }

    public List<NewsModel> getListb() {
        NewsDao newsDao =new NewsImpl();
        List<NewsModel> list=newsDao.getListb();
        return list;
    }

    public List<NewsModel> getListc() {
        NewsDao newsDao =new NewsImpl();
        List<NewsModel> list=newsDao.getListc();
        return list;
    }
}



