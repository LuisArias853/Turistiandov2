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
    ImageView fotoAmpliandoHotel2;
    TextView nombreAmpliandoHotel;
    TextView precioAmpliandoHotel;
    TextView telefonoAmpliandoHotel;
    TextView descripcionAmpliandoHotel;
    TextView calificacionAmpliandoHotel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.imgampliandohotel);
        fotoAmpliandoHotel2=findViewById(R.id.imgampliandohotel2);
        nombreAmpliandoHotel=findViewById(R.id.NombreAmpliando1);
        precioAmpliandoHotel=findViewById(R.id.precioampliandohotel);
        telefonoAmpliandoHotel=findViewById(R.id.telefonoampliandohotel);
        descripcionAmpliandoHotel=findViewById(R.id.loremampliandohotel);
        calificacionAmpliandoHotel=findViewById(R.id.calificacionampliandohotel);

        moldehotel = (Moldehotel) getIntent().getSerializableExtra("datoshotel");
        //cargando la ingo en los componentes graficos
        fotoAmpliandoHotel.setImageResource(moldehotel.getFoto());
        fotoAmpliandoHotel2.setImageResource(moldehotel.getFoto2());
        nombreAmpliandoHotel.setText(moldehotel.getNombre());
        precioAmpliandoHotel.setText(moldehotel.getPrecio());
        telefonoAmpliandoHotel.setText(moldehotel.getTelefono());
        descripcionAmpliandoHotel.setText(moldehotel.getDescripcion());
        calificacionAmpliandoHotel.setText(moldehotel.getCalificacion());

    }
}