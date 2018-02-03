package com.example.prabin.gtso.Opportunity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toolbar;

import com.example.prabin.gtso.R;

public class MeditatationActivity extends AppCompatActivity {

    Toolbar toolbar;


    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditatation);
    }

    public void showAbout(View view) {

        int id = view.getId();

        switch (id) {

            case R.id.meditation_item2:
                startActivity(new Intent(MeditatationActivity.this, AnxietyActivity.class));
                break;
        }
    }
}
