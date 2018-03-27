package com.example.chengzu.sit305assignment2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Setting extends AppCompatActivity {

    Button bt_on;
    Button bt_off;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_setting);

        bt_on = (Button)findViewById(R.id.start);
        bt_off = (Button)findViewById(R.id.stop);

        bt_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Main2Setting.this, R.raw.merrychristmas);
                mp.start();
            }
        });

        bt_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
            }
        });

    }
}