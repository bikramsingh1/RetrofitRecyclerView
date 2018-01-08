package com.apkglobal.retrofitir;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by HP on 04-Jan-18.
 */

public interface RegisterAPI {
    @FormUrlEncoded
    @POST("/htdocs/insertion.php")//in this http address your server's API address only file name or folder if exist
    public  void insertUser(
            @Field("name")String name,
            @Field("email")String email,
            @Field("phn")String phn,
            Callback<Response>callback
    );
}
