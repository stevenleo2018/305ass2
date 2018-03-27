package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GotoStartgameActivity(View view) {
        Intent intent = new Intent(this, wakeupActivity.class);
        startActivity(intent);
    }

    public void GotoSettingActivity(View view) {
        Intent intent = new Intent(this, Main2Setting.class);
        startActivity(intent);
    }
}
