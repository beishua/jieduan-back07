package com.cn.wanxi.service.show;

import com.cn.wanxi.dao.NavDao;
import com.cn.wanxi.dao.impl.NavImpl;
import com.cn.wanxi.model.NavModel;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

public class NavService {

    public List<NavModel> getList() {
        Jedis jedis=new Jedis();
        NavDao navDao=new NavImpl();
        List<NavModel> list = navDao.getList();
        if (jedis.llen("navHref1") > 0) {
            for (int i = 0; i < jedis.llen("navHref"); i++) {
                NavModel navModel = new NavModel();
                navModel.setHref(jedis.lindex("navHref", i));
                navModel.setTitle(jedis.lindex("navTile", i));
                list.add(navModel);
            }
        } else {
            list = navDao.getList();
            for (int i = 0; i < list.size(); i++) {
                jedis.rpush("navHref1", list.get(i).getHref());
                jedis.rpush("navTitle", list.get(i).getTitle());
            }
        }
        return list;
    }
//        NavModel temp=new NavModel();
//        String hrefs[]=temp.getHrefs();
//        String titles[]=temp.getTitles();
//        for (int i=0;i<hrefs.length;i++){
//            NavModel navModel = new NavModel();
//            navModel.setHref(hrefs[i]);
//            navModel.setTitle((titles[i]));
//            list.add(navModel);
//        }
//        return list;
//    }
}
