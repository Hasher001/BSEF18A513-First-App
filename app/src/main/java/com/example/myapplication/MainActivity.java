package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void green(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("green");
        txt.setTextColor(Color.parseColor("#009C08"));
    }

    public void blue(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Blue");
        txt.setTextColor(Color.parseColor("#3F51B5"));
    }

    public void red(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Red");
        txt.setTextColor(Color.parseColor("#F44336"));
    }

    public void orange(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Orange");
        txt.setTextColor(Color.parseColor("#FF5722"));
    }

    public void purple(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Purple");
        txt.setTextColor(Color.parseColor("#9C27B0"));
    }

    public void yellow(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Yellow");
        txt.setTextColor(Color.parseColor("#FAE002"));
    }

    public void pink(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Pink");
        txt.setTextColor(Color.parseColor("#FF19E0"));
    }

    public void black(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Black");
        txt.setTextColor(Color.parseColor("#222222"));
    }

    public void grey(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Grey");
        txt.setTextColor(Color.parseColor("#7A7A7A"));
    }

    public void brown(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Brown");
        txt.setTextColor(Color.parseColor("#4E3B00"));
    }

    public void aqua(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Aqua");
        txt.setTextColor(Color.parseColor("#03A9F4"));
    }

    public void golden(View v){
        TextView txt = (TextView) findViewById(R.id.Output);
        txt.setText("Golden");
        txt.setTextColor(Color.parseColor("#FF9800"));
    }



}