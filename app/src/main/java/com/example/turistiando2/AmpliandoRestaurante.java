package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiando2.moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;
    ImageView fotoAmpliandoRestaurante;
    TextView nombreAmpliandoRestaurante;
    TextView precioAmpliandoRestaurante;
    TextView telefonoAmpliandoRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        fotoAmpliandoRestaurante=findViewById(R.id.imgampliandorestaurante);
        nombreAmpliandoRestaurante=findViewById(R.id.NombreAmpliando2);
        precioAmpliandoRestaurante=findViewById(R.id.precioampliandorestaurante);
        telefonoAmpliandoRestaurante=findViewById(R.id.telefonoampliandorestaurante);

        moldeRestaurante = (MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");
        //cargando la ingo en los componentes graficos
        fotoAmpliandoRestaurante.setImageResource(moldeRestaurante.getFoto());
        nombreAmpliandoRestaurante.setText(moldeRestaurante.getNombre());
        precioAmpliandoRestaurante.setText(moldeRestaurante.getPrecio());
        telefonoAmpliandoRestaurante.setText(moldeRestaurante.getTelefono());
    }
}