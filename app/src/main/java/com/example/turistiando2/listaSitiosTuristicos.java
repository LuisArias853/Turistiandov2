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
        listaSitiosTuristicos.add(new MoldeTurismo("Museo Cultural", "Emanuel Canno","32253167897","Visita el museo que desmuestra la gran historia cultural de esté maravilloso pueblo","Calificacion = 5/5","Sin costo de visita", R.drawable.lugarlista1,R.drawable.comple9));
        listaSitiosTuristicos.add(new MoldeTurismo("Parque Principal", "Juan Camilo Uribe","351245632","Demostracion religiosa y arquitectonica de la ciudad con gran historia","Calificacion = 1/5","Sin costo de visita", R.drawable.lugarlista2,R.drawable.comple10));
        listaSitiosTuristicos.add(new MoldeTurismo("Iglesia 2da", "Pedro Sarmiento","3147896437","Iglesia que muestra fuerte influecia de la religion en la vida de los Marinillos","Calificacion = 2.5/5","Sin costo de visita", R.drawable.lugarlista3,R.drawable.comple11));
        listaSitiosTuristicos.add(new MoldeTurismo("Monumento a los caidos", "Luis Miguel Arias","3315669889"," Monumento en representación de la lucha por la independencia colombiana","Calificacion = 4.5/5","Sin costo de visita", R.drawable.lugarlista4,R.drawable.comple9));
        listaSitiosTuristicos.add(new MoldeTurismo("Zona Rosa", "Guillermo Paredez","3217046963","Gran muestra de gastronomiay vida nocturna del hermoso pueblo Marinilla. ","Calificacion = 3/5","Sin costo de visita", R.drawable.lugarlista5,R.drawable.comple13));
    }
}