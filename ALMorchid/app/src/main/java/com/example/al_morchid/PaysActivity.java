package com.example.al_morchid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class PaysActivity extends AppCompatActivity {
    ImageView layout;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pays);
        layout = findViewById(R.id.payview);
        spinner = findViewById(R.id.spinner_pays);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem = parent.getItemAtPosition(position).toString();


                if (selectedItem.equals("Algerie")) {
                    layout.setImageResource(R.drawable.algerie);
                } else if (selectedItem.equals("Allemagne")) {
                    layout.setImageResource(R.drawable.allemagne);
                } else if (selectedItem.equals("France")) {
                    layout.setImageResource(R.drawable.france);
                }
                else if (selectedItem.equals("Royaume-Uni")) {
                    layout.setImageResource(R.drawable.royaumeuni);
                }
                else if (selectedItem.equals("Canada")) {
                    layout.setImageResource(R.drawable.canada);
                }
                else if (selectedItem.equals("États-Unis")) {
                    layout.setImageResource(R.drawable.etatsunis);
                }
                else if (selectedItem.equals("Maroc")) {
                    layout.setImageResource(R.drawable.morocco);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
    });
    }
    public void onBackClick(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

}