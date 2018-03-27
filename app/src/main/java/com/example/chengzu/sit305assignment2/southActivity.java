package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class southActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south);
    }
    public void gosurvive1(View view) {
        Intent intent = new Intent(this, weaponccreatedActivity.class);
        startActivity(intent);
    }
}
