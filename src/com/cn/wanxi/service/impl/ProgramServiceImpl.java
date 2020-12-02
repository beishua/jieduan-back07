package com.cn.wanxi.service.impl;

import com.cn.wanxi.dao.ProgramDao;
import com.cn.wanxi.dao.impl.ProgramImpl;
import com.cn.wanxi.model.ProgramModel;
import com.cn.wanxi.service.IProgramService;
import java.util.List;

/**
 * 服务逻辑实现层，调用数据层
 */
public class ProgramServiceImpl implements IProgramService {
    @Override
    public List<ProgramModel> findAll() {
        ProgramDao programDao=new ProgramImpl();
        return programDao.findAll();
    }
}
