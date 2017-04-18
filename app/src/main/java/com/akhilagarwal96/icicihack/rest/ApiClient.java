package com.akhilagarwal96.icicihack.rest;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mayur on 18/04/17.
 */

public class ApiClient {

    public static final String BASE_URL = " ";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(final Context context) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        return retrofit;
    }
}
