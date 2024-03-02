package com.example.al_morchid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class YearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
        Intent intent = getIntent();
        String[] years = {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030","2031", "2032", "2033","2034", "2035", "2036","2037", "2038", "2039","2040", "2041", "2042","2043", "2044", "2045"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, years);

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
    }


    public void onBackClick(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

}