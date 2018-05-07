package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class StrategyActivity extends AppCompatActivity {
    Button b_read;
    TextView tv_text;
    Button b_read1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        b_read = (Button) findViewById(R.id.b_read);
        b_read1 = (Button) findViewById(R.id.b_read1);
        tv_text = (TextView) findViewById(R.id.tv_text);


        /* retrieve data from external data text file, which data file has been stored in the
         text file, and i can save load and modify the data from data text file.
         and i have many data text files that can help me to store different dialogues
         in different data text files. */
        b_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";
                try {
                    InputStream is = getAssets().open("data9.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    text= new String(buffer);
                } catch (IOException ex){
                    ex.printStackTrace();
                }
                tv_text.setText(text);
            }
        });
        b_read1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";
                try {
                    InputStream is = getAssets().open("data10.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    text= new String(buffer);
                } catch (IOException ex){
                    ex.printStackTrace();
                }
                tv_text.setText(text);
            }
        });
    }

    public void godie(View view) {
        Intent intent = new Intent(StrategyActivity.this, gameoverActivity.class);
        startActivity(intent);
    }

    public void gospy(View view) {
        Intent intent = new Intent(StrategyActivity.this, SpybackActivity.class);
        startActivity(intent);
    }
}
