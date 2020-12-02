package com.cn.wanxi.service.impl;

import com.cn.wanxi.dao.LeaveDao;
import com.cn.wanxi.dao.impl.LeaveImpl;
import com.cn.wanxi.model.LeaveModel;
import com.cn.wanxi.model.PageModel;
import com.cn.wanxi.service.ILeaveService;
import redis.clients.jedis.Jedis;

import java.util.List;

public class LeaveServiceImpl implements ILeaveService {

    @Override
    public int getCount(LeaveModel leaveModel) {
        LeaveDao leaveDao=new LeaveImpl();
        return leaveDao.getCount();
    }

    @Override
    public int getCount() {
        LeaveDao leaveDao=new LeaveImpl();
        return leaveDao.getCount();
    }

    @Override
    public List<LeaveModel> findAllBySome(LeaveModel leaveModel) {
        LeaveDao leaveDao=new LeaveImpl();
        return leaveDao.findAllBySome(leaveModel);
    }

    @Override
    public int del(Integer id) {
        LeaveDao leaveDao=new LeaveImpl();
        return leaveDao.del(id);
    }

    @Override
    public int add(LeaveModel leaveModel) {
        LeaveDao leaveDao=new LeaveImpl();
        return  leaveDao.add(leaveModel);
    }
}
