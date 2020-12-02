package com.cn.wanxi.service;

import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.PageModel;

import java.util.List;

public interface ICompanyService {
    int add(CompanyModel companyModel);

    List<CompanyModel> findAll(PageModel pageModel);

    int getCount();

    int del(Integer id);

    CompanyModel findById(Integer id);

    List<CompanyModel> findAllBySome(CompanyModel companyModel);

    int getCount(CompanyModel companyModel);

    int edit(CompanyModel companyModel);

//    CompanyModel getCompanyModel();
}
