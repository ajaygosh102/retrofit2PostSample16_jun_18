package com.example.nano.redditretrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RedditApi {

    String BASE_URL = "http://purplenode.in/sid-new/api/";

  //  @Headers("Content-Type: application/json")
  //  @GET(".json")
   // Call<Feed> getData();

    @FormUrlEncoded
    @POST("signin/forgot_password")

    Call<Files> login(
            @Header("SID-API-KEY") String SID_API_KEY,
            @Field("username") String usename    //&api-type=json
    );
}
