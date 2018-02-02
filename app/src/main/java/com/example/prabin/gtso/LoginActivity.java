package com.example.prabin.gtso;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView tvAppHeader1, tvAppHeader2, tvUsername, tvPassword;

    Button btnLogin, btnSurf;

    Typeface fontGothic, fontAllRound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvAppHeader1 = findViewById(R.id.app_header1);
        tvAppHeader2 = findViewById(R.id.app_header2);
        tvUsername = findViewById(R.id.login_field_1);
        tvPassword = findViewById(R.id.login_field_2);
        tvPassword = findViewById(R.id.login_field_2);
        btnLogin = findViewById(R.id.login_btn_login);
        btnSurf = findViewById(R.id.login_surf);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });

        btnSurf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });

        //fontGothic = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/GOTHIC.TTF");
        //fontAllRound = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/AllRound.tff");

        setTextFonts();
    }

    private void attemptLogin() {

        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finishAffinity();
    }

    private void setTextFonts() {

        /*tvAppHeader1.setTypeface(fontGothic);
        tvPassword.setTypeface(fontAllRound);
        tvPassword.setTypeface(fontAllRound);
        btnLogin.setTypeface(fontAllRound);
        btnSurf.setTypeface(fontAllRound);*/
    }
}
