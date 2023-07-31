package com.developer.samandar.wallpaerapplicationdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    private static Retrofit retrofit=null;
    public static final String API="gREUCwuVTwzsocnGAlc77v90SsyxglMxyB7AC8I8jQpwbnROgXn427WD";
    public static ApiInterface getApiInterface()
    {
        if (retrofit==null)
        {
            retrofit= new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);
    }
}