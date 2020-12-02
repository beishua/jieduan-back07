package com.cn.wanxi.model;

public class UserModel {
    private Integer id;
    private String username;
    private String password;
    private String code;
    private String phone;
    private String sex;
    private String birthday;
    private String startBirthday;
    private String endBirthday;
    private String hobby;
    private String introduce;
    private String sessionCode;
    private PageModel pageModel;
    private String[] hobbys;

    public String[] getHobbys() {
        return hobbys;
    }

    public void setHobbys(String[] hobbys) {
        this.hobbys = hobbys;
    }

    public String getSessionCode() {
        return sessionCode;
    }

    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }

    public String getStartBirthday() {
        return startBirthday;
    }

    public void setStartBirthday(String startBirthday) {
        this.startBirthday = startBirthday;
    }

    public String getEndBirthday() {
        return endBirthday;
    }

    public void setEndBirthday(String endBirthday) {
        this.endBirthday = endBirthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
