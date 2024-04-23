package com.maryu.myprimaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Colores extends AppCompatActivity {
    MediaPlayer sonidoYellow;
    ImageView btnAmarillo;
    TextView traduccionAmarillo;

    MediaPlayer sonidoGreen;
    ImageView btnVerde;
    TextView traductorVerde;

    MediaPlayer sonidoRosa;
    ImageView btnRosa;
    TextView traductorRosa;

    MediaPlayer  sonidorRojo;
    ImageView btnRojo;
    TextView traductorRojo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);

        sonidoYellow = MediaPlayer.create(this, R.raw.yellow);
        btnAmarillo = findViewById(R.id.sndAmarillo);
        traduccionAmarillo = findViewById(R.id.traAmarillo);

        sonidoGreen = MediaPlayer.create(this, R.raw.verde);
        btnVerde = findViewById(R.id.sndverde);
        traductorVerde = findViewById(R.id.traverde);

        sonidoRosa = MediaPlayer.create(this, R.raw.rosa);
        btnRosa = findViewById(R.id.sndrosa);
        traductorRosa = findViewById(R.id.trarosa);

        sonidorRojo = MediaPlayer.create(this, R.raw.rojo);
        btnRojo = findViewById(R.id.sndrojo);
        traductorRojo = findViewById(R.id.trarojo);
        btnAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoYellow.start();
                traduccionAmarillo.setText("Yellow");
            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoGreen.start();
                traductorVerde.setText("Green");
            }
        });

        btnRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoRosa.start();
                traductorRosa.setText("Pink");
            }
        });

        btnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidorRojo.start();
                traductorRojo.setText("Red");
            }
        });
    }
}