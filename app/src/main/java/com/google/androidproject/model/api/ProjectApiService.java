package com.google.androidproject.model.api;

import com.google.androidproject.model.bean.BaseResponse;
import com.google.androidproject.model.bean.ListUnifiedBookBean;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * AndroidProject
 * <p>
 * Created by xuminmin on 2018/12/11.
 * Email: iminminxu@gmail.com
 * Copyright © 2018年 Hangzhou Gravity Cyberinfo. All rights reserved.
 * ProjectApiService
 */
public interface ProjectApiService {

    @FormUrlEncoded
    @POST("UnifiedBook/ListUnifiedBook")
    Flowable<BaseResponse<ListUnifiedBookBean>> getListUnifiedBook(@Field("Token") String token, @Field("GradeName") String gradeName, @Field("PageIndex") int pageIndex, @Field("PageSize") int pageSize);
}
