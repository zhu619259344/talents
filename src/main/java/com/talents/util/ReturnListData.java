package com.talents.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReturnListData<T> implements Serializable {
    public static final ReturnListData ERROR = new ReturnListData(-1, "错误");
    public static final ReturnListData SUCCESS = new ReturnListData(0, "操作成功");
    private List<T> result = new ArrayList();
    private int total;
    private Integer ret = 0;
    private String msg = "操作成功";

    public ReturnListData() {
    }

    public ReturnListData(List<T> result, int total) {
        this.result = result;
        this.total = total;
    }

    public ReturnListData(List<T> result, int total, int ret, String msg) {
        this.result = result;
        this.ret = ret;
        this.msg = msg;
        this.total = total;
    }

    public ReturnListData(int ret, String msg) {
        this.ret = ret;
        this.msg = msg;
    }

    public List<T> getResult() {
        return this.result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public List<T> Tesult() {
        return this.result;
    }

    public Integer getRet() {
        return this.ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
