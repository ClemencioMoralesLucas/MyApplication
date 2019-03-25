package com.clemenciomorales.myapplication.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clemenciomorales.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ExampleActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    private Adapter adapter;
    private LinearLayoutManager layoutManager;

    // dummy list of items to be populated manually
    List<Model> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pru);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Adapter adapter = new Adapter();
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        fillItems();

        adapter.loadItems(items);
    }

    private void fillItems() {
        items.addAll(AmarilloTechniques.getTechniques());
    }
}
