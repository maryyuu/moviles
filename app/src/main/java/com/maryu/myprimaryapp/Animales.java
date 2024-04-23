package com.maryu.myprimaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Animales extends AppCompatActivity {
    //Declaracion variable CAT
    MediaPlayer sonido1;
    ImageView btnsonarcat;
    TextView catTraduccion;

    //DECLARACION DOG
    MediaPlayer sonidoDog;
    ImageView btnsonarDog;
    TextView dogTraductor;

    //HORSE//CABALLO
    MediaPlayer sonidoHorse;
    ImageView btnCaballo;
    TextView TraductorHorse;

//Cow/vaca
    MediaPlayer sonidocow;
    ImageView btnVaca;
    TextView traductorvaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);

        sonido1 = MediaPlayer.create(this, R.raw.cat);
        btnsonarcat = findViewById(R.id.sndcat);
        catTraduccion = findViewById(R.id.tracat);

        sonidoDog = MediaPlayer.create(this, R.raw.dog);
        btnsonarDog = findViewById(R.id.sndDog);
        dogTraductor = findViewById(R.id.traDog);

        sonidoHorse = MediaPlayer.create(this, R.raw.horse);
        btnCaballo = findViewById(R.id.btnsonidohorse);
        TraductorHorse = findViewById(R.id.trahorse);

        sonidocow = MediaPlayer.create(this, R.raw.vaca);
        btnVaca = findViewById(R.id.btnsonidovaca);
        traductorvaca = findViewById(R.id.textVaca);
        btnsonarcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sonido1.start();
                catTraduccion.setText("Cat");
            }
        });

       btnsonarDog.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               sonidoDog.start();
               dogTraductor.setText("Dog");

           }
       });

       btnCaballo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               sonidoHorse.start();
               TraductorHorse.setText("Horse");
           }
       });

       btnVaca.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               sonidocow.start();
               traductorvaca.setText("Cow");
           }
       });
    }
}