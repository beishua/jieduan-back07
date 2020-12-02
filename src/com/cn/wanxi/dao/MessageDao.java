package com.cn.wanxi.dao;

import com.cn.wanxi.model.LeaveModel;
import com.cn.wanxi.model.PageModel;

import java.util.List;

public interface MessageDao {
    List<LeaveModel> findAll(PageModel pageModel);
}
