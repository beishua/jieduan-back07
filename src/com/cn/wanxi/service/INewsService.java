package com.cn.wanxi.service;

import com.cn.wanxi.model.NavModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;

import java.util.List;

public interface INewsService {
    int add(NewsModel newsModel);
//    List<NewsModel> findAll(PageModel pageModel);
    int getCount();
    List<NewsModel> findAllBySome(NewsModel newsModel);
    int del(Integer id);

    NewsModel findById(Integer aa);

    int getCount(NewsModel newsModel);

    int edit(NewsModel newsModel);

    List<NewsModel> findAllByNewsTypeId(NewsModel newsModel);

    List<NewsModel> findByIdForNewsDetailPage(NewsModel newsModel);
}
