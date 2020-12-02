package com.cn.wanxi.dao;

import com.cn.wanxi.model.LeaveModel;
import com.cn.wanxi.model.PageModel;

import java.util.List;

public interface    LeaveDao {

    int getCount();

    List<LeaveModel> findAllBySome(LeaveModel leaveModel);

    int del(Integer id);

    int add(LeaveModel leaveModel);
}
