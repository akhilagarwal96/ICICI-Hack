package com.akhilagarwal96.icicihack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.akhilagarwal96.icicihack.models.MiniStatement;
import com.akhilagarwal96.icicihack.rest.ApiClient;
import com.akhilagarwal96.icicihack.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MiniStatementActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_statement);

        String url = "https://retailbanking.mybluemix.net/banking/icicibank/participantmapping?client_id=rishabh19038@yahoo.in&token=5c2429b90e94&accountno=4444777755552421/";
        String client_id="rishabh19038@yahoo.in";
        String token="5c2429b90e94";
        String accountno= "4444777755552421";

        t1 = (TextView) findViewById(R.id.tv_account_no);
        t2 = (TextView) findViewById(R.id.tv_cust_id);
        t3 = (TextView) findViewById(R.id.tv_debit_card_no);
        t4 = (TextView) findViewById(R.id.tv_loan_acc_no);
        t5 = (TextView) findViewById(R.id.tv_securities_scheme_id);
        t6 = (TextView) findViewById(R.id.tv_policy_no);
        t7 = (TextView) findViewById(R.id.tv_policyh_pan_no);
        t8 = (TextView) findViewById(R.id.tv_policyh_mob_no);


        ApiInterface apiInterface = ApiClient.getClient(this).create(ApiInterface.class);
        Call<List<MiniStatement>> call = apiInterface.getMini();
        call.enqueue(new Callback<List<MiniStatement>>() {
            @Override
            public void onResponse(Call<List<MiniStatement>> call, Response<List<MiniStatement>> response) {
                System.out.println(response.body().get(0));
                t1.setText(response.body().get(0).getAccountNo());
                t2.setText(response.body().get(0).getCustId());
                t3.setText(response.body().get(0).getDebitCardNo());
                t4.setText(response.body().get(0).getLoanAccountNo());
                t5.setText(response.body().get(0).getSecuritiesSchemeId());
                t6.setText(response.body().get(9).getPolicyNo());
                t7.setText(response.body().get(9).getPolicyHolderPanNo());
                t8.setText(response.body().get(9).getPolicyHolderMobileNo());
            }

            @Override
            public void onFailure(Call<List<MiniStatement>> call, Throwable t) {

            }
        });
    }
}