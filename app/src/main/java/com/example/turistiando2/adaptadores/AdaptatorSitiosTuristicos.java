package com.example.turistiando2.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turistiando2.AmpliandoHotel;
import com.example.turistiando2.AmpliandoTurismo;
import com.example.turistiando2.R;
import com.example.turistiando2.moldes.MoldeTurismo;
import com.example.turistiando2.moldes.Moldehotel;

import java.util.ArrayList;

public class AdaptatorSitiosTuristicos  extends RecyclerView.Adapter<AdaptatorSitiosTuristicos.viewHolder>{

    //Todos adaptador tine una lista de elementos
    public ArrayList<MoldeTurismo> listaSitiosturisticos;

    //creamo un constructor lleno vacio
    public AdaptatorSitiosTuristicos() {
    }


    //creamos un constructor lleno
    public AdaptatorSitiosTuristicos(ArrayList<MoldeTurismo> listaSitiosTuristicos) {
        this.listaSitiosturisticos = listaSitiosTuristicos;
    }

    @NonNull
    @Override
    public AdaptatorSitiosTuristicos.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Esta porcion de codigo permite crear n copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptatorSitiosTuristicos.viewHolder holder, int position) {
        holder.actualizarDatos(listaSitiosturisticos.get(position));

    }

    @Override
    public int getItemCount() {
        return listaSitiosturisticos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoTurismo;
        TextView nombreTurismo;
        TextView precioTurismo;
        TextView contactoTurismo;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoTurismo=itemView.findViewById(R.id.imgsitios);
            nombreTurismo =itemView.findViewById(R.id.nombresitios);
            precioTurismo =itemView.findViewById(R.id.preciositios);
            contactoTurismo =itemView.findViewById(R.id.contactositios);
        }

        public  void actualizarDatos(MoldeTurismo moldeTurismo) {
            fotoTurismo.setImageResource(moldeTurismo.getFoto());
            nombreTurismo.setText(moldeTurismo.getNombre());
            precioTurismo.setText(moldeTurismo.getPrecio());
            contactoTurismo.setText(moldeTurismo.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener(){

                @Override

                public void onClick(View v){
                    Intent intent=new Intent(itemView.getContext(), AmpliandoTurismo.class);
                    intent.putExtra("datosturismo",moldeTurismo);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
