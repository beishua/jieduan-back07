package com.cn.wanxi.dao.impl;

import com.cn.wanxi.dao.CompanyDao;
import com.cn.wanxi.model.CompanyModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.util.GetSQLSession;
import java.util.List;

public class CompanyImpl implements CompanyDao {
    @Override
    public int add(CompanyModel companyModel) {
        return GetSQLSession.getSqlSession().insert("com.cn.wanxi.dao.CompanyDao.add",companyModel);
    }

    @Override
    public List<CompanyModel> findAll(PageModel pageModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.CompanyDao.findAll",pageModel);
    }

    @Override
    public int getCount() {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.CompanyDao.getCount");
    }
    @Override
    public int edit(CompanyModel companyModel) {
        return GetSQLSession.getSqlSession().update("com.cn.wanxi.dao.CompanyDao.edit",companyModel);
    }
    @Override
    public int del(Integer id) {
        return GetSQLSession.getSqlSession().delete("com.cn.wanxi.dao.CompanyDao.del",id);
    }

    @Override
    public CompanyModel findById(Integer id) {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.CompanyDao.findById",id);
    }

    @Override
    public List<CompanyModel> findAllBySome(CompanyModel companyModel) {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.CompanyDao.findAllBySome",companyModel);
//        StringBuilder sql = new StringBuilder("select * from company where 1=1");
//        if (!"".equals(companyModel.getCompanyContent())) {
//            sql.append(" and content like '%").append(companyModel.getCompanyContent()).append("%' ");
//        }
//        sql.append(" limit ").append((companyModel.getPageModel().getPageNum() - 1) * companyModel.
//                getPageModel().getPageSize()).append(",").append(companyModel.getPageModel().getPageSize());
//        List<CompanyModel> list = new ArrayList<>();
//        ResultSet resultSet = JDBC.getResultSet(sql.toString());
//        try {
//            while (resultSet.next()) {
//                CompanyModel model = new CompanyModel();
//                model.setId(resultSet.getInt("id"));
////                model.setCorporateName(resultSet.getString("title"));
//                model.setCompanyContent(resultSet.getString("content"));
//                list.add(model);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

    @Override
    public List<CompanyModel> getList() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.CompanyDao.getList");
    }

    @Override
    public List<CompanyModel> getLista() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.CompanyDao.getLista");
    }

    @Override
    public List<CompanyModel> getListb() {
        return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.CompanyDao.getListb");
    }
}
