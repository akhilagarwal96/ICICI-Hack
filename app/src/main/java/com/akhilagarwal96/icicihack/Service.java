package com.akhilagarwal96.icicihack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.akhilagarwal96.icicihack.models.MiniStatement;
import com.akhilagarwal96.icicihack.rest.ApiClient;
import com.akhilagarwal96.icicihack.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        final ApiInterface apiInterface = ApiClient.getClient(this).create(ApiInterface.class);
        Call<MiniStatement> miniStatementCall = apiInterface.getMini();

        miniStatementCall.enqueue(new Callback<MiniStatement>() {
            @Override
            public void onResponse(Call<MiniStatement> call, Response<MiniStatement> response) {
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<MiniStatement> call, Throwable t) {

            }
        });

    }
}
