package com.akhilagarwal96.icicihack.rest;

import com.akhilagarwal96.icicihack.models.MiniStatement;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mayur on 18/04/17.
 */

public interface ApiInterface {

    @GET("https://retailbanking.mybluemix.net/banking/icicibank/recenttransaction?client_id=rishabh19038@yahoo.in&token=5c2429b90e94&accountno=4722540718014347")
    Call<MiniStatement> getMini();

}
