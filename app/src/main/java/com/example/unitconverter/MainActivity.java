package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CardView currency,weight,time,length,area,temperature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        currency = (CardView)findViewById(R.id.currency);
        weight = (CardView)findViewById(R.id.weight);
        time = (CardView)findViewById(R.id.time);
        length = (CardView)findViewById(R.id.length);
        area = (CardView)findViewById(R.id.area);
        temperature = (CardView)findViewById(R.id.temperature);

        currency.setOnClickListener(this);
        weight.setOnClickListener(this);
        time.setOnClickListener(this);
        length.setOnClickListener(this);
        area.setOnClickListener(this);
        temperature.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.currency){
            Intent intent = new Intent(MainActivity.this, UnitActivity.class);
            intent.putExtra("key","Currency Converter");

            startActivity(intent);
        }
         if (v.getId() == R.id.weight){
             Intent intent = new Intent(MainActivity.this, UnitActivity.class);
             intent.putExtra("key","Weight Converter");
             startActivity(intent);
        }

        if (v.getId() == R.id.time){
            Intent intent = new Intent(MainActivity.this, UnitActivity.class);
            intent.putExtra("key","Time Converter");
            startActivity(intent);
        }

        if (v.getId() == R.id.length){
            Intent intent = new Intent(MainActivity.this, UnitActivity.class);
            intent.putExtra("key","Length Converter");
            startActivity(intent);
        }

        if (v.getId() == R.id.area){
            Intent intent = new Intent(MainActivity.this, UnitActivity.class);
            intent.putExtra("key","Area Converter");
            startActivity(intent);
        }

        if (v.getId() == R.id.temperature){
            Intent intent = new Intent(MainActivity.this, UnitActivity.class);
            intent.putExtra("key","Temperature Converter");
            startActivity(intent);
        }



    }
}