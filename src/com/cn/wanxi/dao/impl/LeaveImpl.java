package com.cn.wanxi.dao.impl;

import com.cn.wanxi.dao.LeaveDao;
import com.cn.wanxi.model.LeaveModel;
import com.cn.wanxi.util.GetSQLSession;
import java.util.List;

public class LeaveImpl implements LeaveDao {
    @Override
    public int add(LeaveModel leaveModel) {
        return GetSQLSession.getSqlSession().insert("com.cn.wanxi.dao.LeaveDao.add",leaveModel);
    }

    @Override
    public int getCount() {
        return GetSQLSession.getSqlSession().selectOne("com.cn.wanxi.dao.LeaveDao.getCount");
    }

    @Override
    public List<LeaveModel> findAllBySome(LeaveModel leaveModel) {
       return GetSQLSession.getSqlSession().selectList("com.cn.wanxi.dao.LeaveDao.findAllBySome",leaveModel);
    }

    @Override
    public int del(Integer id) {
        return GetSQLSession.getSqlSession().delete("com.cn.wanxi.dao.LeaveDao.del",id);
    }
}
