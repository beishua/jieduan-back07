package com.cn.wanxi.service.show;

import com.cn.wanxi.dao.ProductDao;
import com.cn.wanxi.dao.impl.ProductImpl;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;
import redis.clients.jedis.Jedis;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<ProductModel> getList() {
//       Jedis jedis=new Jedis();
        ProductDao productDao = new ProductImpl();
        List<ProductModel> list = productDao.getList();
//        if (jedis.llen("pictureForProduct") > 0) {
//            for (int i = 0; i < jedis.llen("pictureForProduct"); i++) {
//                ProductModel productModel=new ProductModel();
//                productModel.setPicture(jedis.lindex("pictureForProduct",i));
//                productModel.setName(jedis.lindex("nameForProduct",i));
//                productModel.setPice(jedis.lindex("pice",i));
//                list.add(productModel);
//            }
//        }else {
//
//            list=productDao.getList();
//            for (int i=0;i<list.size();i++){
//                jedis.rpush("pictureForProduct",list.get(i).getPicture());
//                jedis.rpush("nameForProduct",list.get(i).getName());
//                jedis.rpush("pice",list.get(i).getPice());
//            }
//        }
        return list;
    }
    public List<ProductModel> getLista() {
        ProductDao productDao=new ProductImpl();
        List<ProductModel> list =productDao.getLista();
        return list;
    }
    public List<ProductModel> getListb() {
//        Jedis jedis=new Jedis();
        ProductDao productDao=new ProductImpl();
        List<ProductModel> list =productDao.getListb();
//        if (jedis.llen("contentForDetailed") > 0) {
//            for (int i = 0; i < jedis.llen("contentForDetailed"); i++) {
//                ProductModel productModel=new ProductModel();
//                productModel.setContentForDetailed(jedis.lindex("contentForDetailed",i));
//                list.add(productModel);
//            }
//        }else {
//            list=productDao.getListb();
//            for (int i=0;i<list.size();i++){
//                jedis.rpush("contentForDetailed",list.get(i).getContentForDetailed());
//            }
//        }
        return list;
    }
}