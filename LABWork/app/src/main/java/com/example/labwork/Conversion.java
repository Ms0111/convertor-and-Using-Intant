package com.example.labwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Conversion extends AppCompatActivity {
      String conversionType = "";

//    RadioButton radioButton2 = findViewById(R.id.radioButton);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

//      title.setText("@string/Temperature");
//        RadioButton radioButton1.setChecked(true);
//        RadioButtonradioButton1.setText("@string/CelsiusToFahrenheit");
//     radioButton2.setText("@string/FahrenheitTOCelsius");
//       findViewById(R.id.Temperature).setBackgroundColor(0xff000000);
        //findViewById(R.id.Conversion).setBackgroundColor(0);
        conversionType = getString(R.string.Temperature);
        System.out.println(conversionType);
        TextView conversionTitle = findViewById(R.id.title1);
        conversionTitle.setText(conversionType);
        RadioButton radioButton1 = findViewById(R.id.radioButton);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        radioButton1.setText(getString(R.string.CelsiusToFahrenheit));
        radioButton2.setText(getString(R.string.FahrenheitTOCelsius));

        radioChecked();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.convmen, menu);
        return true;
    }


    public void radioChecked(){
        RadioButton radioButton1 = findViewById(R.id.radioButton);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        TextView conversionTitle = findViewById(R.id.title1);
// Celsius  Fahrenheit  Miles kilom
        if(radioButton1.isChecked() && conversionType.equalsIgnoreCase("Temperature conversion") || conversionType.equalsIgnoreCase("تحويل درجة الحرارة")){

            //findViewById(R.id.Conversion).setBackgroundColor(0xff000000);



        }
        else if(radioButton2.isChecked() && conversionType.equalsIgnoreCase("Temperature conversion" ) || conversionType.equalsIgnoreCase("تحويل درجة الحرارة")){}


        else if(radioButton1.isChecked() && conversionType.equalsIgnoreCase("Distance conversion") || conversionType.equalsIgnoreCase("تحويل المساف")){}
        else if(radioButton2.isChecked() && conversionType.equalsIgnoreCase("Distance conversion") || conversionType.equalsIgnoreCase("تحويل المساف")){}



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // Handle item selection
        switch (item.getItemId()) {
            case R.id.Temperature:
                findViewById(R.id.Distance).setBackgroundColor(23);
                findViewById(R.id.Temperature).setBackgroundColor(0xff000000);
                RadioButton radioButton1 = findViewById(R.id.radioButton);
                RadioButton radioButton2 = findViewById(R.id.radioButton2);
                radioButton1.setText(getString(R.string.CelsiusToFahrenheit));
                radioButton2.setText(getString(R.string.FahrenheitTOCelsius));
                conversionType = getString(R.string.Temperature);
                TextView conversionTitle = findViewById(R.id.title1);
                conversionTitle.setText(conversionType);
                return true;
            case R.id.Distance:
                findViewById(R.id.Temperature).setBackgroundColor(23);
                findViewById(R.id.Distance).setBackgroundColor(0xff000000);
                RadioButton radioButton3 = findViewById(R.id.radioButton);
                RadioButton radioButton4 = findViewById(R.id.radioButton2);
                radioButton3.setText(getString(R.string.MilestoKm));
                radioButton4.setText(getString(R.string.KmtoMiles));
                conversionType = getString(R.string.Distance);
                TextView conversionTitle2 = findViewById(R.id.title1);
                conversionTitle2.setText(conversionType);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    /*public void rc(View view) {
        TextView conversionTitle = findViewById(R.id.title1);
        conversionTitle.setText(getString(R.string.CelsiusToFahrenheit));
        RadioButton radioButton1 = findViewById(R.id.radioButton);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        if(conversionType.equalsIgnoreCase("Temperature conversion") || conversionType.equalsIgnoreCase("تحويل درجة الحرارة")){
            if(radioButton1.isChecked()){
                conversionTitle.setText(getString(R.string.CelsiusToFahrenheit));

            }

           else if(radioButton2.isChecked()){
                conversionTitle.setText(getString(R.string.FahrenheitTOCelsius));

            }




        }


        else if(conversionType.equalsIgnoreCase("Distance conversion") || conversionType.equalsIgnoreCase("تحويل المساف")){
            if(radioButton1.isChecked()){
                conversionTitle.setText(getString(R.string.MilestoKm));

            }

           else if(radioButton2.isChecked()){
                conversionTitle.setText(getString(R.string.KmtoMiles));

            }




        }


    }*/

    public void buClick(View view) {
        TextView result = findViewById(R.id.resultTextView);
        EditText editText = findViewById(R.id.editTextNumber);
        double input = Double.parseDouble(editText.getText().toString());
       double calcu = 0;
       RadioButton radioButton1 = findViewById(R.id.radioButton);
       RadioButton radioButton2 = findViewById(R.id.radioButton2);
        if(conversionType.equalsIgnoreCase("Temperature conversion") || conversionType.equalsIgnoreCase("تحويل درجة الحرارة")){

            if(radioButton1.isChecked()){
                calcu = input * 1.8 + 32;
                result.setText(getString(R.string.Result)+ ": " + calcu + "°F");

            }

            else if(radioButton2.isChecked()){
                calcu = (input - 32) /1.8;
                result.setText(getString(R.string.Result)+ ": " + calcu + "°C");

            }





        }


       else if(conversionType.equalsIgnoreCase("Distance conversion") || conversionType.equalsIgnoreCase("تحويل المساف")){



            if(radioButton1.isChecked()){
                calcu = input * 1.609344;
                result.setText(getString(R.string.Result)+ ": " + calcu + "km");

            }

            else if(radioButton2.isChecked()){
                calcu = input/1.609344;
                result.setText(getString(R.string.Result)+ ": " + calcu + "mi");

            }





        }



    }
}