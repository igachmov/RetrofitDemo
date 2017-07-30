package com.example.ivan.retrofitdemo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by Ivan on 7/31/2017.
 */

public interface FileDownload {
    @GET("z/well-done-23443783.jpg")
    Call<ResponseBody> downloadFile();

}
