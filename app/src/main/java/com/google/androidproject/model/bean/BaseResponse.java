package com.google.androidproject.model.bean;

/**
 * AndroidProject
 * <p>
 * Created by xuminmin on 2018/12/11.
 * Email: iminminxu@gmail.com
 * Copyright © 2018年 Hangzhou Gravity Cyberinfo. All rights reserved.
 * BaseResponse
 */
public class BaseResponse<T> {

    //是否成功
    private boolean Success;
    //错误信息
    private String ErrorMessage;
    //错误码
    private int ErrorNumber;
    //数据
    private T Data;

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public int getErrorNumber() {
        return ErrorNumber;
    }

    public void setErrorNumber(int errorNumber) {
        ErrorNumber = errorNumber;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
