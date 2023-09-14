package com.example.turistiando2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.turistiando2.adaptadores.AdaptadorHoteles;
import com.example.turistiando2.moldes.Moldehotel;
import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<Moldehotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView =findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDactos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
    }
    public void llenarListaConDactos(){
        listaHoteles.add(new Moldehotel("Hotel El Cielo", "$150000","Contacto: 32253167897",R.drawable.hotelcomplemento2,R.drawable.hotellista2, "Hotel hermoso y agradable","Calificacion = 5/5"));
        listaHoteles.add(new Moldehotel("Hotel Los Caminos", "$120000","Contacto: 3235386789",R.drawable.hotellista2,R.drawable.compl1 ,"Hotel sucio y desagradable","Calificacion = 3/5"));
        listaHoteles.add(new Moldehotel("Hotel Avenida", "$1380000","Contacto: 396423467897",R.drawable.hotellista3,R.drawable.compl3 ,"Hotel ingreible con vistas inimaginables","Calificacion = 4.5/5"));
        listaHoteles.add(new Moldehotel("Hotel El Descanso", "$200000","Contacto: 35267897787",R.drawable.hotellista4,R.drawable.compl4 ,"Hotel con fallas de logistica y sofocante","Calificacion = 5/5"));
        listaHoteles.add(new Moldehotel("Hotel Manantial", "$180000","Contacto: 31178564321",R.drawable.hotellista5,R.drawable.compl1 ,"Hotel que cumple de buena manara las expectativas de los clientes","Calificacion = 2/5"));
    }
}