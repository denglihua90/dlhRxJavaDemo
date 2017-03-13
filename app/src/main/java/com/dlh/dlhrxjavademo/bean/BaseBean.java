package com.dlh.dlhrxjavademo.bean;

import java.io.Serializable;

/**
 * Created by dlh on 2017/3/13.
 */
public class BaseBean implements Serializable {
    private int status;
    private String result;
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}
