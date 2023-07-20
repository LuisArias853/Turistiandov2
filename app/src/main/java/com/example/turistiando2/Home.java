package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {
    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonLugares;

    TextView nombreCliente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String nombre=getIntent().getStringExtra("nombre");

        botonHoteles = findViewById(R.id.buttonhoteles);
        botonRestaurantes = findViewById(R.id.buttonrestaurantes);
        botonLugares = findViewById(R.id.buttonlugares);
        nombreCliente=findViewById(R.id.text4);
        //uniendo el texto del PUTEXTRA

        nombreCliente.setText(nombre);

        //DETECTANDO EVENTOS
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHoteles=new Intent(Home.this,HotelesHome.class);
                startActivity(intentHoteles);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRestaurantes=new Intent(Home.this,RestaurantesHome.class);
                startActivity(intentRestaurantes);
            }
        });

        botonLugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHoteles=new Intent(Home.this,LugaresHome.class);
                startActivity(intentHoteles);
            }
        });


    }

    public void cambiarIdioma(String idioma){
        //configurar el lenguaje del telefono
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //Configuracion globalmente el telefono
        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;
        // Ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){

            case(R.id.opcion1):
                this.cambiarIdioma("en");
                Intent intentIngles=new Intent(Home.this,Home.class);
                startActivity(intentIngles);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("es");
                Intent intentEspañol=new Intent(Home.this,Home.class);
                startActivity(intentEspañol);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("it");
                Intent intentItaliano=new Intent(Home.this,Home.class);
                startActivity(intentItaliano);
                break;
            case(R.id.opcion4):
                Intent intentAcercade=new Intent(Home.this,acercade.class);
                startActivity(intentAcercade);
                break;

        }

        return super.onOptionsItemSelected(item);
    }




}