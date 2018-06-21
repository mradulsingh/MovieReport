package com.android.example.github.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class client {
    public static final String BASE_URl = "https://api.themoviedb.org/3/";
    public static Retrofit retrofit = null;

    public static Retrofit client() {
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
