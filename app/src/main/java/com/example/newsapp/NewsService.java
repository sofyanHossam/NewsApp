package com.example.newsapp;

import com.example.newsapp.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsService {
        @GET("v2/top-headlines")
        Call<NewsResponse> getNews(@Query("country") String country,@Query("apiKey") String appiKey);
    }

