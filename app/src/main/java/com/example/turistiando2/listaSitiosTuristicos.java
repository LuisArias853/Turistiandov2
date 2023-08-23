package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.turistiando2.adaptadores.AdaptatorSitiosTuristicos;
import com.example.turistiando2.moldes.MoldeTurismo;
import java.util.ArrayList;

public class listaSitiosTuristicos extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaSitiosTuristicos = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView =findViewById(R.id.listadinamicasitiosturisticos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        llenarListaConDactos();
        AdaptatorSitiosTuristicos adaptatorSitiosTuristicos =new AdaptatorSitiosTuristicos(listaSitiosTuristicos);
        recyclerView.setAdapter(adaptatorSitiosTuristicos);
    }
    public void llenarListaConDactos(){
        listaSitiosTuristicos.add(new MoldeTurismo("Museo Cultural", "Emanuel Canno","32253167897","0", R.drawable.lugarlista1));
        listaSitiosTuristicos.add(new MoldeTurismo("Parque Principal", "Juan Camilo Uribe","351245632","0", R.drawable.lugarlista2));
        listaSitiosTuristicos.add(new MoldeTurismo("Iglesia 2da", "Pedro Sarmiento","3147896437","0", R.drawable.lugarlista3));
        listaSitiosTuristicos.add(new MoldeTurismo("Monumento a los caidos", "Luis Miguel Arias","3315669889","0", R.drawable.lugarlista4));
        listaSitiosTuristicos.add(new MoldeTurismo("Zona Rosa", "Guillermo Paredez","3217046963","0", R.drawable.lugarlista5));
    }
}