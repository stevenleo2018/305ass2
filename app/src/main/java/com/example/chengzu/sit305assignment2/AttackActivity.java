package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
/*
which is attack activity that stored information of 3 text views
and it also enable user to read the data that from external data text file
And it also intent to strategy activity
 */

public class AttackActivity extends AppCompatActivity {
    //variables
    TextView tv, tv1, tv2;
    Button b_read;
    TextView tv_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attack);

/* retrieve data from external data text file, which data file has been stored in the
         text file, and i can save load and modify the data from data text file.
         and i have many data text files that can help me to store different dialogues
         in different data text files. */
        b_read = (Button) findViewById(R.id.b_read);
        tv_text = (TextView) findViewById(R.id.tv_text);
        b_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";
                try {
                    InputStream is = getAssets().open("data.txt");
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

        // find id
        tv = (TextView) findViewById(R.id.textView2);
        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView5);

        // show the text from previous page inputted
        tv.setText("The number of soldiers you have:"+getIntent().getStringExtra("NAME"));
        tv1.setText("Great! You got soldiers for help. Attack now! ");
        tv2.setText(getIntent().getStringExtra("DESCRIPTION"));
    }

    // intent to strategy activity
    public void gostrategy(View view) {
        Intent intent = new Intent(AttackActivity.this, StrategyActivity.class);
        startActivity(intent);
    }
}
