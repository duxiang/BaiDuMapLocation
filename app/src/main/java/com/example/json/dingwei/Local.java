package com.example.json.dingwei;

import cn.bmob.v3.BmobObject;


public class Local extends BmobObject {  //位置信息对象

    private String userID;//用户ID
    private String netKind;//获取定位的方式
    private String time;//时间
    private String address;//位置
    private String locationDescribe;//附近标志建筑物
    private double longitude;//获取经度信息
    private double latitude;//获取纬度信息
    private String phoneNumber;//手机号

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getNetKind() {
        return netKind;
    }

    public void setNetKind(String netKind) {
        this.netKind = netKind;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocationDescribe() {
        return locationDescribe;
    }

    public void setLocationDescribe(String locationDescribe) {
        this.locationDescribe = locationDescribe;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Local{" +
                "userID='" + userID + '\'' +
                ", netKind='" + netKind + '\'' +
                ", time='" + time + '\'' +
                ", address='" + address + '\'' +
                ", locationDescribe='" + locationDescribe + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
