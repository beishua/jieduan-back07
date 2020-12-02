package com.cn.wanxi.service;

import com.cn.wanxi.model.LeaveModel;
import com.cn.wanxi.model.PageModel;

import java.util.List;

public interface ILeaveService {

    int getCount(LeaveModel leaveModel);

    List<LeaveModel> findAllBySome(LeaveModel leaveModel);
    int getCount();

    int del(Integer id);

    int add(LeaveModel leaveModel);
}
