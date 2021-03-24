package com.example.labwork;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //loadLocale();
        setContentView(R.layout.activity_main);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle(getResources().getString(R.string.app_name));

//        ActionBar actionBar;
//        actionBar = getSupportActionBar();
//        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("E2340E"));
//        actionBar.setBackgroundDrawable(colorDrawable);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.AR:
                System.out.println("arabic");
                setLocal("ar");
                return true;
            case R.id.EN:
                setLocal("en");
                return true;
            case R.id.Conversion:
                findViewById(R.id.Conversion).setBackgroundColor(0xff000000);
                startActivity(new Intent(this, Conversion.class));
                return true;
            case R.id.Shopping:
                findViewById(R.id.Shopping).setBackgroundColor(0xff000000);
                startActivity(new Intent(this, Shoopping.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void setLocal(String lang){
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.setLocale(locale);

        getBaseContext().getResources().getConfiguration().setTo(config);

        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("MY_Lang", lang);
        editor.apply();
        Intent refresh = new Intent(this, MainActivity.class);

        startActivity(refresh);



    }


    public void loadLocale() {
        SharedPreferences pref = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = pref.getString("MY_Lang", "");
        setLocal(language);



    }



}