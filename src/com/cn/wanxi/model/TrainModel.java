package com.cn.wanxi.model;

import com.cn.wanxi.model.show.CoachModel;

public class TrainModel extends CoachModel {
    private  Integer id;
    private Integer trainId;
    private String trainname;
    private String content;
    private String picture;
    private PageModel pageModel;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer traineId) {
        this.trainId = traineId;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
