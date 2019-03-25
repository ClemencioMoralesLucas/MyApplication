package com.clemenciomorales.myapplication.example;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clemenciomorales.myapplication.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ExampleActivity extends AppCompatActivity {

    public static final String CURRENT_TECH_LIST_PREFS = "currentTechList";
    public static final String TECHNIQUES_YELLOW_PREF = "TECHNIQUES_YELLOW";
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

        SharedPreferences preferences = getSharedPreferences(CURRENT_TECH_LIST_PREFS, Context.MODE_PRIVATE);
        if(preferences.contains(TECHNIQUES_YELLOW_PREF)) {
            final List<Model> savedTechniquesList = retrieveSavedTechListFromPrefs(preferences);
            fillPredefinedItems(savedTechniquesList);
        } else {
            fillItems();
        }
        adapter.loadItems(items);
    }

    private List<Model> retrieveSavedTechListFromPrefs(SharedPreferences preferences) {
        String techniquesJson = "";
        techniquesJson = preferences.getString(TECHNIQUES_YELLOW_PREF, techniquesJson);
        Type listType = new TypeToken<ArrayList<Model>>(){}.getType();
        return new Gson().fromJson(techniquesJson, listType);
    }

    private void fillPredefinedItems(List<Model> yourClassList) {
        items.addAll(yourClassList);
    }

    private void fillItems() {
        items.addAll(AmarilloTechniques.getTechniques());
    }

    @Override
    public void onDestroy() {
        //Save techniques to json so we can restore them on creation
        SharedPreferences prefs = getSharedPreferences(CURRENT_TECH_LIST_PREFS, Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String techniquesListJson = gson.toJson(items);
        prefs.edit()
                .putString(TECHNIQUES_YELLOW_PREF, techniquesListJson)
                .commit();
        super.onDestroy();
    }
}
