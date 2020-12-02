package com.cn.wanxi.dao;

import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.NewsModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;

import java.util.List;

public interface NewsDao {
    int add(NewsModel newsModel);
//    List<NewsModel> findAll(PageModel pageModel);
    int getCount();
    List<NewsModel> findAllBySome(NewsModel newsModel);
    int del(Integer id);

    NewsModel findById(Integer id);

    List<NewsModel> getList();

    List<NewsModel> getLista();

    int update(NewsModel newsModel);

    List<NewsModel> getListb();

    List<NewsModel> findAllByNewsTypeId(NewsModel newsModel);

    List<NewsModel> getListc();

    List<NewsModel> findByIdForNewsDetailPage(NewsModel newsModel);
}
