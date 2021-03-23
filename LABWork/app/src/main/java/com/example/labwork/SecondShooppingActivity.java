package com.example.labwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondShooppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_shoopping);

        ArrayList values = getIntent().getStringArrayListExtra("values");

        LinearLayout linearLayout = findViewById(R.id.li);
        for (int i = 0; i < values.size(); i ++){
            TextView textView = new TextView(this);
            textView.setText(values.get(i).toString());
            linearLayout.addView(textView);

        }




    }
}