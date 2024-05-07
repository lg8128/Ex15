package com.example.ex15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    Button bt;
    RadioButton RbRED, RbGREEN, RbGRAY, RbBLUE;
    ConstraintLayout cl;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        bt = findViewById(R.id.bt);
        RbRED = findViewById(R.id.RbRED);
        RbGREEN = findViewById(R.id.RbGreen);
        RbGRAY = findViewById(R.id.RbGRAY);
        RbBLUE = findViewById(R.id.RbBLUE);
        cl = findViewById(R.id.cl);
    }

    public void OnBtn(View view) {
        if (sw.isChecked()){
            if (RbRED.isChecked()){
                cl.setBackgroundColor(Color.RED);
            } else if (RbGREEN.isChecked()) {
                cl.setBackgroundColor(Color.GREEN);
            } else if (RbGRAY.isChecked()) {
                cl.setBackgroundColor(Color.GRAY);
            } else  cl.setBackgroundColor(Color.BLUE);
        }
    }

    public void colorChange(View view) {
        if (!sw.isChecked()){
            if (RbRED.isChecked()){
                cl.setBackgroundColor(Color.RED);
            } else if (RbGREEN.isChecked()) {
                cl.setBackgroundColor(Color.GREEN);
            } else if (RbGRAY.isChecked()) {
                cl.setBackgroundColor(Color.GRAY);
            } else  cl.setBackgroundColor(Color.BLUE);
        }
    }
}
