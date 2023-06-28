package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonLugares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles=findViewById(R.id.buttonhoteles);
        botonRestaurantes=findViewById(R.id.buttonrestaurantes);
        botonLugares=findViewById(R.id.buttonlugares);
    //DETECTANDO EVENTOS
        botonHoteles.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View v) {
                Toast.makeText(Home.this)
            }
        });
    }
}