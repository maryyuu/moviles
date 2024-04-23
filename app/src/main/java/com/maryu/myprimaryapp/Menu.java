package com.maryu.myprimaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button btnanimales;
    Button btnColores;
    Button btnFrutas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnanimales= findViewById(R.id.btnanimales);
        btnColores = findViewById(R.id.btncolores);
        btnFrutas = findViewById(R.id.btnfrutas);
        btnanimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageAnimales = new Intent(Menu.this, Animales.class);
                startActivity(pageAnimales);
            }
        });
        btnColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageColors = new Intent(Menu.this, Colores.class);
                startActivity(pageColors);
            }
        });
        btnFrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageFrutas = new Intent(Menu.this, Frutas.class);
                startActivity(pageFrutas);
            }
        });

    }
}