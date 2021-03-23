package com.example.labwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shoopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoopping);
    }

    public void buClick(View view) {
        EditText un = findViewById(R.id.editTextTextPersonName);
        EditText ps = findViewById(R.id.editTextTextPersonName2);
        CheckBox checkBox1 = findViewById(R.id.checkBox);
        CheckBox checkBox2 = findViewById(R.id.checkBox22);
        RadioButton radioButton1 = findViewById(R.id.radioButton11);
        RadioButton radioButton2 = findViewById(R.id.radioButton3_);
        RadioButton radioButton3 = findViewById(R.id.radioButton4);

        ArrayList values = new ArrayList<String>();
        values.add("User Name: " + un.getText());

        CheckBox[] checkboxes = {checkBox1, checkBox2};
        RadioButton[] radioButtons = {radioButton1, radioButton2, radioButton3};

        boolean x = false;
        for (int i = 0; i < checkboxes.length; i++){
            if(!x){values.add(getString(R.string.wantToBuy)+":\n"); x = true;}


            if(checkboxes[i].isChecked()){values.add(checkboxes[i].getText() + "\n");}



        }


        x = false;


        for (int i = 0; i < radioButtons.length; i++){
            if(!x){values.add(getString(R.string.wantToBuy)+":"); x = true;}


            if(radioButtons[i].isChecked()){values.add(radioButtons[i].getText() + "\n");}



        }



        Intent intent = new Intent(getApplicationContext(), SecondShooppingActivity.class);
        intent.putExtra("values", values);

        startActivity(intent);




    }
}