package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiando2.moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    ImageView fotoAmpliandoTurismo;
    TextView nombreAmpliandoTurismo;
    TextView precioAmpliandoTurismo;
    TextView telefonoAmpliandoTurismo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);
        fotoAmpliandoTurismo=findViewById(R.id.imgampliandositios);
        nombreAmpliandoTurismo=findViewById(R.id.NombreAmpliando3);
        precioAmpliandoTurismo=findViewById(R.id.precioampliandositios);
        telefonoAmpliandoTurismo=findViewById(R.id.telefonoampliandositios);


        moldeTurismo = (MoldeTurismo) getIntent().getSerializableExtra("datosturismo");
        //cargando la ingo en los componentes graficos
        fotoAmpliandoTurismo.setImageResource(moldeTurismo.getFoto());
        nombreAmpliandoTurismo.setText(moldeTurismo.getNombre());
        precioAmpliandoTurismo.setText(moldeTurismo.getPrecio());
        telefonoAmpliandoTurismo.setText(moldeTurismo.getTelefono());
    }
}