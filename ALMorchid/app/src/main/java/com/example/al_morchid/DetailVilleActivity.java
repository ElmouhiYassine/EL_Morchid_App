package com.example.al_morchid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailVilleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ville);
        Intent intent = getIntent();
        Ville ville = intent.getParcelableExtra("ville");

        ImageView imageView = findViewById(R.id.imageVille);
        TextView nomTextView = findViewById(R.id.nomVille);
        TextView descriptionTextView = findViewById(R.id.description);
        TextView position = findViewById(R.id.position);

        imageView.setImageResource(ville.getImageResourceId());
        nomTextView.setText(ville.getNom());
        descriptionTextView.setText(ville.getDescription());
        position.setText(ville.getPosition());
    }

    public void onBackClick(View view){
        startActivity(new Intent(this, VilleDetails.class));
    }

}