package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class westActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);
    }

    public void goback(View view) {
        Intent intent = new Intent(this, weaponccreatedActivity.class);
        startActivity(intent);
    }

}
