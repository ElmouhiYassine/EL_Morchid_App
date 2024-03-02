package com.example.al_morchid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class VilleDetails extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ville_details);
        listView = findViewById(R.id.listView);

        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville(R.drawable.casablanca, "Casablanca", "Casablanca est une ville portuaire située dans l'ouest du Maroc, sur la côte atlantique. Connue pour son architecture art déco, elle abrite la célèbre mosquée Hassan II, dont le minaret s'élève au-dessus de l'océan. La médina médiévale de Casablanca, ou vieille ville, est un labyrinthe de rues étroites bordées de boutiques et de marchés animés.", "Position : Nord-Ouest"));
        villes.add(new Ville(R.drawable.marrakesh, "Marrakech", "Marrakech, fondée au XIe siècle, est une ville du Maroc qui abrite des palais somptueux, des jardins florissants et des ruelles labyrinthiques. La médina est un labyrinthe de rues animées bordées de boutiques et de marchés traditionnels. Le minaret de la mosquée Koutoubia, symbole de la ville, domine l'horizon.", "Position : Centre"));
        villes.add(new Ville(R.drawable.ouarzazate, "Ouarzazate", "Ouarzazate est une ville du sud du Maroc, située à proximité du désert du Sahara. Elle est connue pour son imposante kasbah en pisé, Ait Benhaddou, classée au patrimoine mondial de l'UNESCO. La ville est également un point de départ pour les excursions dans les montagnes de l'Atlas et les vastes déserts du sud.", "Position : Sud"));
        villes.add(new Ville(R.drawable.agadir, "Agadir", "Agadir est une ville balnéaire du sud-ouest du Maroc, réputée pour ses plages de sable doré et son climat ensoleillé toute l'année. Après avoir été détruite par un tremblement de terre en 1960, la ville a été reconstruite avec des rues larges et des bâtiments modernes.", "Position : Sud-Ouest"));
        villes.add(new Ville(R.drawable.tanger, "Tanger", "Tanger est une ville portuaire du nord du Maroc, située sur le détroit de Gibraltar, où la Méditerranée rencontre l'océan Atlantique. Elle est réputée pour son médina (vieille ville) médiévale, son port animé et ses plages de sable fin. La ville a attiré des artistes et des écrivains du monde entier au cours du XXe siècle.", "Position : Nord"));
        villes.add(new Ville(R.drawable.fes, "Fès", "Fès est une ville impériale du Maroc, fondée au VIIIe siècle, connue pour sa médina (vieille ville) médiévale bien conservée. La médina de Fès el-Bali est un labyrinthe de rues étroites bordées de souks (marchés) et de mosquées historiques, dont la célèbre mosquée universitaire Al Quaraouiyine, fondée en 859.", "Position : Centre-Nord"));

        VilleAdapter adapter = new VilleAdapter(this, villes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ville ville = villes.get(position);

                Intent intent = new Intent(VilleDetails.this, DetailVilleActivity.class);
                intent.putExtra("ville", ville);
                startActivity(intent);
            }
        });
    }
    public void onBackClick(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

}