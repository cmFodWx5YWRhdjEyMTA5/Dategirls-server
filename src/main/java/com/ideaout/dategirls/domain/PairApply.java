package com.ideaout.dategirls.domain;

public class PairApply {
    private String id;

    private String name;

    private Integer age;

    private String weixin;

    private String qq;

    private String phone;

    private String sex;

    private Double height;

    private String city;

    private String imagelist;

    private String sexPrefer;

    private String cityAdjust;

    private String hobby;

    private String joinWay;

    private String payment;

    private String shareClickCount;

    private String indroduce;

    private String leaveMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getImagelist() {
        return imagelist;
    }

    public void setImagelist(String imagelist) {
        this.imagelist = imagelist == null ? null : imagelist.trim();
    }

    public String getSexPrefer() {
        return sexPrefer;
    }

    public void setSexPrefer(String sexPrefer) {
        this.sexPrefer = sexPrefer == null ? null : sexPrefer.trim();
    }

    public String getCityAdjust() {
        return cityAdjust;
    }

    public void setCityAdjust(String cityAdjust) {
        this.cityAdjust = cityAdjust == null ? null : cityAdjust.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getJoinWay() {
        return joinWay;
    }

    public void setJoinWay(String joinWay) {
        this.joinWay = joinWay == null ? null : joinWay.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getShareClickCount() {
        return shareClickCount;
    }

    public void setShareClickCount(String shareClickCount) {
        this.shareClickCount = shareClickCount == null ? null : shareClickCount.trim();
    }

    public String getIndroduce() {
        return indroduce;
    }

    public void setIndroduce(String indroduce) {
        this.indroduce = indroduce == null ? null : indroduce.trim();
    }

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage == null ? null : leaveMessage.trim();
    }
}