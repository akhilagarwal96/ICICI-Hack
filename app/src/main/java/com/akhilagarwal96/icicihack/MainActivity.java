package com.akhilagarwal96.icicihack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import static com.akhilagarwal96.icicihack.R.id.login_password;

public class MainActivity extends AppCompatActivity {

    EditText login, password;
    Button login_b;

    String id = "icicilogin";
    String pass = "12345";

    String l, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.login_id);
        password = (EditText) findViewById(login_password);
        login_b = (Button) findViewById(R.id.login_button);

        l = login.getText().toString();
        p = password.getText().toString();

        Intent logged_in = new Intent(MainActivity.this, Services.class);
        startActivity(logged_in);

/*
        login_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(login.getText().toString()) && !TextUtils.isEmpty(password.getText().toString())) {
                    if (login.getText().toString().equals(id) && password.getText().toString().equals(pass)) {
                        Intent logged_in = new Intent(getApplicationContext(), Services.class);
                        startActivity(logged_in);
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please fill in the details!", Toast.LENGTH_SHORT).show();
                }
            }
        });
*/
    }
}