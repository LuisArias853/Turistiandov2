package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

        botonHoteles = findViewById(R.id.buttonhoteles);
        botonRestaurantes = findViewById(R.id.buttonrestaurantes);
        botonLugares = findViewById(R.id.buttonlugares);
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
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){
            case(R.id.opcion1):
                Toast.makeText(this, "quiero que este en español", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.opcion2):
                Toast.makeText(this, "quiero que este ingles", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.opcion3):
                Toast.makeText(this, "quiero que este en italiano", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.opcion4):
                Toast.makeText(this, "quiero que este en acerca de", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void cambiarIdioma(String idioma){

    }

}