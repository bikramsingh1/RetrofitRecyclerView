package com.apkglobal.retrofitir.retrofit_fetch;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by HP on 05-Jan-18.
 */

public interface RequestInterface {

    @GET("example/fetching.php")//in this http address your server's API file address or folder if exist
    Call<JSONResponse> getJSON();
}
