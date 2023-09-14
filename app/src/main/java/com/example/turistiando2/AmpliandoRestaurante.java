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
    ImageView fotoAmpliandoRestaurante2;
    TextView nombreAmpliandoRestaurante;
    TextView precioAmpliandoRestaurante;
    TextView telefonoAmpliandoRestaurante;
    TextView descripcionrestaurante;
    TextView calificacionrestaurante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        fotoAmpliandoRestaurante=findViewById(R.id.imgampliandorestaurante);
        fotoAmpliandoRestaurante2=findViewById(R.id.imgampliandorestaurante2);
        nombreAmpliandoRestaurante=findViewById(R.id.NombreAmpliando2);
        precioAmpliandoRestaurante=findViewById(R.id.precioampliandorestaurante);
        telefonoAmpliandoRestaurante=findViewById(R.id.telefonoampliandorestaurante);
        descripcionrestaurante=findViewById(R.id.loremampliandorestaurante);
        calificacionrestaurante=findViewById(R.id.calificacionampliandorestaurante);

        moldeRestaurante = (MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");
        //cargando la ingo en los componentes graficos
        fotoAmpliandoRestaurante.setImageResource(moldeRestaurante.getFoto());
        fotoAmpliandoRestaurante2.setImageResource(moldeRestaurante.getFoto2());
        nombreAmpliandoRestaurante.setText(moldeRestaurante.getNombre());
        precioAmpliandoRestaurante.setText(moldeRestaurante.getPrecio());
        telefonoAmpliandoRestaurante.setText(moldeRestaurante.getTelefono());
        descripcionrestaurante.setText(moldeRestaurante.getDescrpcion());
        calificacionrestaurante.setText(moldeRestaurante.getCalificacion());
    }
}