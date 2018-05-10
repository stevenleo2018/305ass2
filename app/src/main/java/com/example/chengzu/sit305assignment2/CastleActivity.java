package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class CastleActivity extends AppCompatActivity {
    Button b_read;
    TextView tv_text;
    Button button23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castle);
        b_read = (Button) findViewById(R.id.b_read);
        button23 = (Button) findViewById(R.id.button23);
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
                    InputStream is = getAssets().open("data12.txt");
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
        //which is the button that connect to another data text file and it will show different content.
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";
                try {
                    InputStream is = getAssets().open("data13.txt");
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

    // which is the intent to the question activity
    public void q(View view) {
        Intent intent = new Intent(CastleActivity.this, questionActivity.class);
        startActivity(intent);
    }
}
