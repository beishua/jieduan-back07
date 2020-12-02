package com.cn.wanxi.service.show;

import com.cn.wanxi.model.CoachModel;
import com.cn.wanxi.model.MapsModel;

import java.util.ArrayList;
import java.util.List;

public class MapsService {
    public  List<MapsModel> getList() {
        List<MapsModel> list=new ArrayList<>();
        MapsModel temp=new MapsModel();
        String imgHrefs[]=temp.getImgHrefs();
        String titles[]=temp.getTitles();

        for(int i=0;i<imgHrefs.length;i++){
            MapsModel mapsModel=new MapsModel();
            mapsModel.setImgHref(imgHrefs[i]);
            mapsModel.setTitle(titles[i]);
            list.add(mapsModel);
        }
        return list;
    }
    public  List<MapsModel> getLista() {
        List<MapsModel> list=new ArrayList<>();
        MapsModel temp=new MapsModel();
        String imgHref1s[]=temp.getImgHref1s();
        String title1s[]=temp.getTitle1s();

        for(int i=0;i<imgHref1s.length;i++){
            MapsModel mapsModel=new MapsModel();
            mapsModel.setImgHref1(imgHref1s[i]);
            mapsModel.setTitle1(title1s[i]);
            list.add(mapsModel);
        }
        return list;
    }
}
