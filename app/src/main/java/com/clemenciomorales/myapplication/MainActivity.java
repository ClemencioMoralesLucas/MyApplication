package com.clemenciomorales.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.buttonAmarillo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AmarilloActivity.class);
                view.getContext().startActivity(intent);}
        });

        Button button2 = (Button) findViewById(R.id.buttonNaranja);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), NaranjaActivity.class);
                view.getContext().startActivity(intent);}
        });
    }

    public void amarilloPressed(View view) {
        Toast.makeText(getApplicationContext(), "Amarillo pressed", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(MainActivity.this, AmarilloActivity.class);
//        myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }
}
