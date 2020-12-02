package com.cn.wanxi.service.show;

import com.cn.wanxi.dao.CompanyDao;
import com.cn.wanxi.dao.impl.CompanyImpl;
import com.cn.wanxi.model.CompanyModel;
import redis.clients.jedis.Jedis;
import java.util.ArrayList;
import java.util.List;

public class CompanyService {
    public List<CompanyModel> getList(){
        Jedis jedis=new Jedis();
        CompanyDao companyDao=new CompanyImpl();
        List<CompanyModel> list=new ArrayList<>();
        if (jedis.llen("picture01") > 0) {
            for (int i=0;i<jedis.llen("picture01");i++){
                CompanyModel companyModel=new CompanyModel();
                companyModel.setPicture01(jedis.lindex("picture01",i));
                companyModel.setTitle01(jedis.lindex("title01",i));
                companyModel.setContent01(jedis.lindex("content01",i));
                list.add(companyModel);
            }
        }else{
            list = companyDao.getList();
            for (int i=0;i<list.size();i++){
                jedis.rpush("picture01",list.get(i).getPicture01());
                jedis.rpush("title01",list.get(i).getTitle01());
                jedis.rpush("content01",list.get(i).getContent01());
            }
            return list;
        }
        return list;
    }
    public List<CompanyModel> getLista(){
        Jedis jedis=new Jedis();
        CompanyDao companyDao=new CompanyImpl();
        List<CompanyModel> list=new ArrayList<>();
        if (jedis.llen("pictureForCompany") > 0) {
            for (int i = 0; i < jedis.llen("pictureForCompany"); i++) {
                CompanyModel companyModel = new CompanyModel();
                companyModel.setPicture02(jedis.lindex("pictureForCompany", i));
                list.add(companyModel);
            }
        } else {
            list = companyDao.getLista();
            for (int i = 0; i < list.size(); i++) {
                jedis.rpush("pictureForCompany", list.get(i).getPicture02());
            }
            return list;
        }
        return list;
    }
    public List<CompanyModel> getListb(){
        Jedis jedis=new Jedis();
        CompanyDao companyDao=new CompanyImpl();
        List<CompanyModel> list=new ArrayList<>();
        if (jedis.llen("picture03") > 0) {
            for (int i=0;i<jedis.llen("picture03");i++){
                CompanyModel companyModel=new CompanyModel();
                companyModel.setPicture03(jedis.lindex("picture03",i));
                list.add(companyModel);
            }
        }else{
            list = companyDao.getListb();
            for (int i=0;i<list.size();i++){
                jedis.rpush("picture03",list.get(i).getPicture03());
            }
            return list;
        }
        return list;
    }
}
