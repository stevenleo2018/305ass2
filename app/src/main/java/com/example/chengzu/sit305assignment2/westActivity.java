package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class westActivity extends AppCompatActivity {
    Button b_read;
    TextView tv_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);
        b_read = (Button) findViewById(R.id.b_read);
        tv_text = (TextView) findViewById(R.id.tv_text);
        b_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";
                try {
                    InputStream is = getAssets().open("data2.txt");
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

    public void goback(View view) {
        Intent intent = new Intent(this, weaponccreatedActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu manu){
        getMenuInflater().inflate(R.menu.main,manu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.id_profile){
            Intent intentprofile=new Intent(westActivity.this, MainActivity.class);
            startActivity(intentprofile);
            return true;
        }
        return super.onOptionsItemSelected(item);}
}
