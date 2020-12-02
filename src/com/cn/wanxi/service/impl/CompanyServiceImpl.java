package com.cn.wanxi.service.impl;

import com.cn.wanxi.dao.CompanyDao;
import com.cn.wanxi.dao.TrainDao;
import com.cn.wanxi.dao.impl.CompanyImpl;
import com.cn.wanxi.dao.impl.TrainImpl;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.service.ICompanyService;
import redis.clients.jedis.Jedis;

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {
    @Override
    public int add(CompanyModel companyModel) {
        CompanyDao companyDao=new CompanyImpl();
        int result=companyDao.add(companyModel);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("positionForhomejsp","pictureFroTrain","name01");
        }
        return result;
    }

    @Override
    public List<CompanyModel> findAll(PageModel pageModel) {
        CompanyDao companyDao=new CompanyImpl();
        return companyDao.findAll(pageModel);
    }

    @Override
    public int getCount() {
        CompanyDao companyDao=new CompanyImpl();
        return companyDao.getCount();
    }

    @Override
    public int del(Integer id) {
        CompanyDao companyDao=new CompanyImpl();
        int result=companyDao.del(id);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("positionForhomejsp","pictureFroTrain","name01");
        }
        return result;
    }

    @Override
    public CompanyModel findById(Integer id) {
        CompanyDao companyDao=new CompanyImpl();
        return companyDao.findById(id);
    }

    @Override
    public List<CompanyModel> findAllBySome(CompanyModel companyModel) {
        CompanyDao companyDao=new CompanyImpl();
        return companyDao.findAllBySome(companyModel);
    }

    @Override
    public int getCount(CompanyModel companyModel) {
        CompanyDao companyDao=new CompanyImpl();
        return companyDao.getCount();
    }

    @Override
    public int edit(CompanyModel companyModel) {
        CompanyDao companyDao=new CompanyImpl();
        int result=companyDao.edit(companyModel);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("positionForhomejsp","pictureFroTrain","name01");
        }
        return result;
    }
}