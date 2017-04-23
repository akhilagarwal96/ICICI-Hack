package com.akhilagarwal96.icicihack.rest;

import com.akhilagarwal96.icicihack.models.MiniStatement;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mayur on 18/04/17.
 */

public interface ApiInterface {

 /*   @GET("https://retailbanking.mybluemix.net/banking/icicibank/participantmapping?client_id=rishabh19038@yahoo.in&token=5c2429b90e94&accountno=4444777755552421/")
    Call<MiniStatement> getMini();*/


    @GET("icicibank/participantmapping?client_id=rishabh19038@yahoo.in&token=5c2429b90e94&accountno=4444777755552421/")
    Call<List<MiniStatement>> getMini();

}
