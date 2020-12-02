package com.cn.wanxi.service.impl;

import com.cn.wanxi.dao.IUserDao;
import com.cn.wanxi.dao.NavDao;
import com.cn.wanxi.dao.ProductDao;
import com.cn.wanxi.dao.impl.NavImpl;
import com.cn.wanxi.dao.impl.ProductImpl;
import com.cn.wanxi.dao.impl.UserImpl;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;
import com.cn.wanxi.model.UserModel;
import com.cn.wanxi.service.IProductService;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * 服务实现层
 */
public class ProductServiceImpl implements IProductService {
    @Override
    public int add(ProductModel productModel) {
        ProductDao productDao=new ProductImpl();
        int result=productDao.add(productModel);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("pictureForProduct","picture01ForProduct");
        }
        return result;
    }

    @Override
    public ProductModel findById(Integer id) {
        ProductDao productDao=new ProductImpl();
        ProductModel productModel=productDao.findById(id);
        ProgramServiceImpl programService=new ProgramServiceImpl();
        productModel.setList(programService.findAll());//得到findAll方法
        return productModel;
    }

    @Override
    public int del(Integer id) {
        ProductDao productDao=new ProductImpl();
        int result=productDao.del(id);
        if (result==1){
            Jedis jedis=new Jedis();
            jedis.del("pictureForProduct","picture01ForProduct");
        }
        return result;
    }
    @Override//重写
    public int getCount() {
        ProductDao productDao=new ProductImpl();
        return productDao.getCount();
    }

    @Override
    public List<ProductModel> findAllBySome(ProductModel productModel) {
        ProductDao productDao=new ProductImpl();
        return productDao.findAllBySome(productModel);
    }

    @Override
    public int getCount(ProductModel productModel) {
        ProductDao productDao=new ProductImpl();
        return productDao.getCount();
    }

    @Override
    public List<ProductModel> findAllByTypeId(ProductModel productModel) {
        ProductDao productDao=new ProductImpl();
        return productDao.findAllByTypeId(productModel);
    }

    @Override
    public List<ProductModel> findByIdForDetailPage(ProductModel productModel) {
        ProductDao productDao=new ProductImpl();
        return productDao.findByIdForDetailPage(productModel);
    }

    @Override
    public int update(ProductModel productModel) {
        ProductDao productDao=new ProductImpl();
        int data=productDao.update(productModel);
        if (data==1){
            Jedis jedis=new Jedis();
            jedis.del("pictureForProduct","picture01ForProduct");
        }
        return data;
    }
}
