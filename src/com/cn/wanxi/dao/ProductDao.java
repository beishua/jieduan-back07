package com.cn.wanxi.dao;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.model.ProductModel;
import java.util.List;
/**
 * 数据接口层
 */
public interface ProductDao {
    int add(ProductModel productModel);
    ProductModel findById(Integer id);

    int update(ProductModel productModel);

    int del(Integer id);

    int getCount();

    List<ProductModel> findAllBySome(ProductModel productModel);

    List<ProductModel> getList();
    List<ProductModel> getLista();
    List<ProductModel> getListb();

    List<ProductModel> findAllByTypeId(ProductModel productModel);

    List<ProductModel> findByIdForDetailPage(ProductModel productModel);
}
