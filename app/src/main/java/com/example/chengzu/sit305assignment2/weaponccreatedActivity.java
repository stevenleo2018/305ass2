package com.example.chengzu.sit305assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class weaponccreatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weaponccreated);
    }

    public void goeast(View view) {
        Intent intent = new Intent(this, eastActivity.class);
        startActivity(intent);
    }

    public void gowest(View view) {
        Intent intent = new Intent(this, westActivity.class);
        startActivity(intent);
    }

    public void gosouth(View view) {
        Intent intent = new Intent(this, southActivity.class);
        startActivity(intent);
    }

    public void gonorth(View view) {
        Intent intent = new Intent(this, NorthActivity.class);
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
            Intent intentprofile=new Intent(weaponccreatedActivity.this, MainActivity.class);
            startActivity(intentprofile);
            return true;
        }
        return super.onOptionsItemSelected(item);}
}
