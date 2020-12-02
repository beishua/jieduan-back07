package com.cn.wanxi.model.show;

public class NavModel {
    private String href;
    private String title;
    private String[] hrefs;
    private String[] titles;

    public String[] getHrefs() {
        return hrefs;
    }

    public void setHrefs(String[] hrefs) {
        this.hrefs = hrefs;
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

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
}
