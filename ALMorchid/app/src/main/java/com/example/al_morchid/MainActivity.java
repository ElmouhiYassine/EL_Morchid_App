package com.example.al_morchid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

       if(id == R.id.action_ville){
                Intent intent = new Intent(this, VilleDetails.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void fruits(View view){
        Intent intent = new Intent(MainActivity.this, FruitList.class);
        startActivity(intent);
    }

    public void annees(View view){
        Intent intent = new Intent(MainActivity.this, YearActivity.class);
        startActivity(intent);
    }

    public void pays(View view){
        Intent intent = new Intent(MainActivity.this, PaysActivity.class);
        startActivity(intent);
    }

}