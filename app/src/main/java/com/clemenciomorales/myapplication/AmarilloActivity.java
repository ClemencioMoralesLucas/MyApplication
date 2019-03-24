package com.clemenciomorales.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Spinner;

public class AmarilloActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amarillo);
        ConstraintLayout rl = (ConstraintLayout)findViewById(R.id.clAmarillo);
//        rl.setBackgroundColor(Color.BLACK);
    }
}
