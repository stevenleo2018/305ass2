package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class questionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }

    public void gameover(View view) {
        Intent intent = new Intent(questionActivity.this, gameoverActivity.class);
        startActivity(intent);
    }

    public void gameover1(View view) {
        Intent intent = new Intent(questionActivity.this, gameoverActivity.class);
        startActivity(intent);
    }



    public void con(View view) {
        Intent intent = new Intent(questionActivity.this, congratsActivity.class);
        startActivity(intent);
    }
}
