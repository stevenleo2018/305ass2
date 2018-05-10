package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class RevengeActivity extends AppCompatActivity {
    String description = " ";
    EditText editText;
    Button btn;
    Button b_read;
    TextView tv_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revenge);

        b_read = (Button) findViewById(R.id.b_read);
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
                    InputStream is = getAssets().open("data8.txt");
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

        editText = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameValue = editText.getText().toString();
                Intent intent = new Intent(RevengeActivity.this, AttackActivity.class);
                intent.putExtra("NAME", nameValue);
                intent.putExtra("DESCRIPTION", description);
                startActivity(intent);
            }
        });
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
            Intent intentprofile=new Intent(RevengeActivity.this, MainActivity.class);
            startActivity(intentprofile);
            return true;
        }
        return super.onOptionsItemSelected(item);}
}
