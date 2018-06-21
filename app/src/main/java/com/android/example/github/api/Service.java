package com.android.example.github.api;

import com.android.example.github.vo.MoviesInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("movie/popular")
    Call<MoviesInfo> getPopularMovies(@Query("api_key") String apiKey, @Query("page") int pageIndex);

    @GET("movie/top_rated")
    Call<MoviesInfo> getTopRatedMovies(@Query("api_key") String apiKey, @Query("page") int pageIndex);

}
