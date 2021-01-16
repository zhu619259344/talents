package com.talents.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

public class ReturnData<T> implements Serializable {
    public static final ReturnData SUCCESS = new ReturnData(0, "操作成功");
    public static final ReturnData FAILURE = new ReturnData(-3, "操作失败");
    public static final ReturnData SYSTEM_IS_BUSY = new ReturnData(-2, "服务器繁忙");
    public static final ReturnData SYSTEM_ERROR = new ReturnData(-1000, "系统错误");
    public static final ReturnData OPERATION_NOT_PERMIT = new ReturnData(-6, "没有权限执行操作");
    public static final ReturnData NOT_LOGIN = new ReturnData(-7, "您还未登录或者登录超时，请重新登录");
    public static final ReturnData ERROR = new ReturnData(-1, "异常错误");
    public static final ReturnData WARN_ADVERTISEMENT = new ReturnData(-1001, "该时间区间内有正在运行的广告！");
    public static final ReturnData WARN_PUBLISHTIMEGTOVERDUETIME = new ReturnData(-1001, "结束时间小于开始时间！");
    public static final ReturnData INVALID_VISIT = new ReturnData(-1002, "非法访问");
    public static final ReturnData AD_ERROR = new ReturnData(-1003, "该广告已经存在");
    public static final ReturnData ZX_ERROR = new ReturnData(-1004, "该资讯已经存在");
    public static final ReturnData UN_DUP = new ReturnData(-1005, "只允许存在一个上线活动");
    public static final ReturnData SYS_NONE_AUTH = new ReturnData(-405, "请重新登录");
    public static final ReturnData SYS_OUT_DATE = new ReturnData(-304, "请升级客户端");
    private T result;
    private Integer ret = 0;
    private String msg = "操作成功";

    public ReturnData() {
    }

    public ReturnData(T result) {
        this.result = result;
    }

    public ReturnData(T result, long total) {
        this.result = result;
    }

    public ReturnData(T result, int ret, String msg) {
        this.result = result;
        this.ret = ret;
        this.msg = msg;
    }

    public ReturnData(T result, int ret) {
        this.result = result;
        this.ret = ret;
    }

    public ReturnData(int ret, String msg) {
        this.ret = ret;
        this.msg = msg;
    }

    public Object getResult() {
        return this.result;
    }

    @JsonIgnore
    public T TResult() {
        return this.result;
    }

    private void setResult(T result) {
        this.result = result;
    }

    public Integer getRet() {
        return this.ret;
    }

    private void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}