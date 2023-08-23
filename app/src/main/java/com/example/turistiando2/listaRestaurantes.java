package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.turistiando2.adaptadores.AdaptadorRestaurante;
import com.example.turistiando2.moldes.MoldeRestaurante;
import java.util.ArrayList;

public class listaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurantes=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView =findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        llenarListaConDactos();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurante);
    }
    public void llenarListaConDactos(){
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Con tradicion", "12000","32253167897","Arepas de queso", R.drawable.comida1));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Doña Gloria", "10000","32253167897","Arepas de Mote",R.drawable.comida2));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Antioqueño de corazón", "19000","32253167897","Entrada Familiar", R.drawable.comida3));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante El molino", "6000","32253167897","Empanadas",R.drawable.comida4));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante El Asadero", "350000","32253167897","Costillas BBQ",R.drawable.comida5));
    }
}