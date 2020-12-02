package com.cn.wanxi.model;

public class NavModel {
    private Integer id;
    private String navName;
    private String navContent;
    private PageModel pageModel;
    private String href;
    private String title;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNavName() {
        return navName;
    }

    public void setNavName(String navName) {
        this.navName = navName;
    }

    public String getNavContent() {
        return navContent;
    }

    public void setNavContent(String navContent) {
        this.navContent = navContent;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }
}
