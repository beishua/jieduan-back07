package com.cn.wanxi.service;

import com.cn.wanxi.model.ProductModel;
import java.util.List;

public interface IProductService {
    int add(ProductModel productModel);
    ProductModel findById(Integer id);
    int del(Integer id);
    int getCount();
    List<ProductModel> findAllBySome(ProductModel productModel);
    int update(ProductModel productModel);
    int getCount(ProductModel productModel);
    List<ProductModel> findAllByTypeId(ProductModel productModel);

    List<ProductModel> findByIdForDetailPage(ProductModel productModel);
}
