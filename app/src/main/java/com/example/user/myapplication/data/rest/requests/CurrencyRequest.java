package com.example.user.myapplication.data.rest.requests;


import com.example.user.myapplication.data.responses.GetConvertedCurrencyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Shahar.Wienrib on 27/02/2018.
 */

public interface CurrencyRequest {
    String BASE_URL = "https://api.fixer.io/";

    @GET("/latest")
    Call<GetConvertedCurrencyResponse> getResponse(@Query("base") String tags);
}
