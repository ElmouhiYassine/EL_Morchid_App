package com.example.al_morchid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class FruitList extends AppCompatActivity {
    ListView listfruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fruit_list);
        Intent intent = getIntent();

        ListView listView = findViewById(R.id.list_view);

        List<String> fruits = new ArrayList<>();
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("Fraise");
        fruits.add("Kiwi");
        fruits.add("Ananas");
        fruits.add("Cerise");
        fruits.add("Mangue");
        fruits.add("Raisin");
        fruits.add("Pastèque");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fruits);
        listView.setAdapter(adapter);
    }
    public void onBackClick(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}