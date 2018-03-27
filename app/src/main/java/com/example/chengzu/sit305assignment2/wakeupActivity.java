package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class wakeupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wakeup);
    }

    public void Gotodie(View view) {
        Intent intent = new Intent(this, gameoverActivity.class);
        startActivity(intent);
    }

    public void gotohunt(View view) {
        Intent intent = new Intent(this, WeaponActivity.class);
        startActivity(intent);
    }
}
