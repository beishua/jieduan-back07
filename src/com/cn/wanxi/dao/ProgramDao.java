package com.cn.wanxi.dao;

import com.cn.wanxi.model.ProgramModel;
import java.util.List;

public interface ProgramDao {
    List<ProgramModel> findAll();
}
