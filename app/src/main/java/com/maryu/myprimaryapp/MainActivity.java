package com.maryu.myprimaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texInicio;
    ImageView imgInicial;
    Button btnsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Le doy poderes a mis variables para que puedann ver las propiedads delas views.

        texInicio= findViewById(R.id.textingles);
        imgInicial = findViewById(R.id.imginicio);
        btnsiguiente = findViewById(R.id.btnsiguiente);
        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Varibale para cambiar de view
                Intent next = new Intent(MainActivity.this, Menu.class);
                startActivity(next);
            }
        });



    }
}