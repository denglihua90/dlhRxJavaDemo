package com.dlh.dlhrxjavademo.bean;

import java.io.Serializable;

/**
 * Created by dlh on 2017/3/13.
 */

public class User implements Serializable {
//    {
//        "status": 100,
//            "result": {
//        "uid": 9,
//                "nickname": "邓李华",
//                "fullname": "邓李华",
//                "gender": 1,
//                "birthday": null,
//                "portraitFile": "ade843f90503cea8384ce9dad4076e90.png",
//                "intro": null,
//                "mobileZone": "86",
//                "mobile": "13367338125",
//                "createTime": 1483433877,
//                "updateTime": 1484812966,
//                "accessToken": "xdLdBYRo8kCAjfkbQWel6pqbh736AQd0A9U32-lMFOjLv2nhzJzxZtyVpcLRU_aX"
//    }
//    }

    private int uid;
    private String nickname;
    private String fullname;
    private int gender;
    private String birthday;
    private String portraitFile;
    private String intro;
    private String mobileZone;
    private String mobile;
    private long createTime;
    private long updateTime;
    private String accessToken;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPortraitFile() {
        return portraitFile;
    }

    public void setPortraitFile(String portraitFile) {
        this.portraitFile = portraitFile;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getMobileZone() {
        return mobileZone;
    }

    public void setMobileZone(String mobileZone) {
        this.mobileZone = mobileZone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
