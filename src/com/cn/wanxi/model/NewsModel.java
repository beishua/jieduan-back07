package com.cn.wanxi.model;

public class NewsModel extends com.cn.wanxi.model.show.NewsModel {
    private Integer id;
    private String newsHeadlines;
    private String newsContent;
    private String picture;
    private String date;
    private String day;
    private String year;
    private String title;
    private String content;
    private String content01;
    private String content02;
    private String title05;
    private String content05;
    private String content06;
    private String content07;
    private String nameForDetaile;
    private Integer NewsId;
    private String titleForNewsDetailed;
    private String dateForNewsDetailed;
    private String contentForNewsDetailed;

    public String getTitleForNewsDetailed() {
        return titleForNewsDetailed;
    }

    public void setTitleForNewsDetailed(String titleForNewsDetailed) {
        this.titleForNewsDetailed = titleForNewsDetailed;
    }

    public String getDateForNewsDetailed() {
        return dateForNewsDetailed;
    }

    public void setDateForNewsDetailed(String dateForNewsDetailed) {
        this.dateForNewsDetailed = dateForNewsDetailed;
    }

    public String getContentForNewsDetailed() {
        return contentForNewsDetailed;
    }

    public void setContentForNewsDetailed(String contentForNewsDetailed) {
        this.contentForNewsDetailed = contentForNewsDetailed;
    }

    public Integer getNewsId() {
        return NewsId;
    }

    public void setNewsId(Integer newsId) {
        NewsId = newsId;
    }

    public String getNameForDetaile() {
        return nameForDetaile;
    }

    public void setNameForDetaile(String nameForDetaile) {
        this.nameForDetaile = nameForDetaile;
    }

    public String getContent06() {
        return content06;
    }

    public void setContent06(String content06) {
        this.content06 = content06;
    }

    public String getContent07() {
        return content07;
    }

    public void setContent07(String content07) {
        this.content07 = content07;
    }

    public String getTitle05() {
        return title05;
    }

    public void setTitle05(String title05) {
        this.title05 = title05;
    }

    public String getContent05() {
        return content05;
    }

    public void setContent05(String content05) {
        this.content05 = content05;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public String getContent01() {
        return content01;
    }

    public void setContent01(String content01) {
        this.content01 = content01;
    }

    public String getContent02() {
        return content02;
    }

    public void setContent02(String content02) {
        this.content02 = content02;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private PageModel pageModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsHeadlines() {
        return newsHeadlines;
    }

    public void setNewsHeadlines(String newsHeadlines) {
        this.newsHeadlines = newsHeadlines;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }
}
