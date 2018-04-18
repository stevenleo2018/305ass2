package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, AppointmentActivity.class);
                    startActivity(intent);
                }
            }
        };
        th.start();


    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
