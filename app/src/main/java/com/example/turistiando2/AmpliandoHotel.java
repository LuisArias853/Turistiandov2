package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiando2.moldes.Moldehotel;

public class AmpliandoHotel extends AppCompatActivity {

    Moldehotel moldehotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView precioAmpliandoHotel;
    TextView telefonoAmpliandoHotel;
    TextView descripcionAmpliandoHotel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.imgampliandohotel);
        nombreAmpliandoHotel=findViewById(R.id.NombreAmpliando1);
        precioAmpliandoHotel=findViewById(R.id.precioampliandohotel);
        telefonoAmpliandoHotel=findViewById(R.id.telefonoampliandohotel);
        descripcionAmpliandoHotel=findViewById(R.id.loremampliandohotel);

        moldehotel = (Moldehotel) getIntent().getSerializableExtra("datoshotel");
        //cargando la ingo en los componentes graficos
        fotoAmpliandoHotel.setImageResource(moldehotel.getFoto());
        nombreAmpliandoHotel.setText(moldehotel.getNombre());
        precioAmpliandoHotel.setText(moldehotel.getPrecio());
        telefonoAmpliandoHotel.setText(moldehotel.getTelefono());
        descripcionAmpliandoHotel.setText(moldehotel.getDescripcion());

    }
}