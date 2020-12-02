package com.cn.wanxi.dao;

import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.PageModel;

import java.util.List;

public interface CompanyDao {
    int add(CompanyModel companyModel);

    List<CompanyModel> findAll(PageModel pageModel);

    int getCount();

    int del(Integer id);

    CompanyModel findById(Integer id);

    List<CompanyModel> findAllBySome(CompanyModel companyModel);

    List<CompanyModel> getList();

    List<CompanyModel> getLista();

    List<CompanyModel> getListb();

    int edit(CompanyModel companyModel);

//    CompanyModel getCompanyModel();
}
