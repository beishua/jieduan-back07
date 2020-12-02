package com.cn.wanxi.model;

import java.util.List;

public class ProductModel extends com.cn.wanxi.model.show.ProductModel {
    private Integer programId;
    private  Integer id;
    private String imgHref;
    private String title;
    private String content;
    private String picture;
    private String name;
    private String pice;
    private String programName;
    private String contentForDetailed;
    private String typeId;
    private String titleForDetailed;
    private String dataForDetailed;
    private String smallTileForDetailed;
    private PageModel pageModel;

    public String getTitleForDetailed() {
        return titleForDetailed;
    }

    public void setTitleForDetailed(String titleForDetailed) {
        this.titleForDetailed = titleForDetailed;
    }

    public String getDataForDetailed() {
        return dataForDetailed;
    }

    public void setDataForDetailed(String dataForDetailed) {
        this.dataForDetailed = dataForDetailed;
    }

    public String getSmallTileForDetailed() {
        return smallTileForDetailed;
    }

    public void setSmallTileForDetailed(String smallTileForDetailed) {
        this.smallTileForDetailed = smallTileForDetailed;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getContentForDetailed() {
        return contentForDetailed;
    }

    public void setContentForDetailed(String contentForDetailed) {
        this.contentForDetailed = contentForDetailed;
    }
//
//    public String getPicture01() {
//        return picture01;
//    }
//
//    public String getName01() {
//        return name01;
//    }
//
//    public void setPicture01(String picture01) {
//        this.picture01 = picture01;
//    }
//
//    public void setName01(String name01) {
//        this.name01 = name01;
//    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPice() {
        return pice;
    }

    public void setPice(String pice) {
        this.pice = pice;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }

    private List<ProgramModel> list;

    public List<ProgramModel> getList() {
        return list;
    }

    public void setList(List<ProgramModel> list) {
        this.list = list;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public Integer getId() {
        return id;
    }



    public String getImgHref() {
        return imgHref;
    }

    public void setImgHref(String imgHref) {
        this.imgHref = imgHref;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
