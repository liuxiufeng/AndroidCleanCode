package com.shadow.cleancode.retrofit.Clients;


import com.shadow.cleancode.main.User;
import com.shadow.cleancode.retrofit.Result;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by lxf on 2017/7/4.
 */

public interface ShadowClient {

    @FormUrlEncoded
    @POST("login")
    Observable<Result<User>> login(@FieldMap Map<String, String> params);

}
