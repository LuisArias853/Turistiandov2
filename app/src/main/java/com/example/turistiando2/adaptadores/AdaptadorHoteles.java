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
import com.example.turistiando2.R;
import com.example.turistiando2.moldes.Moldehotel;

import java.util.ArrayList;

public class AdaptadorHoteles extends RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {

    //Todos adaptador tine una lista de elementos
    public ArrayList<Moldehotel> listaHoteles;

    //creamo un constructor lleno vacio

    public AdaptadorHoteles() {
    }


    //creamos un constructor lleno


    public AdaptadorHoteles(ArrayList<Moldehotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public AdaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Esta porcion de codigo permite crear n copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {
        holder.actualizarDatos(listaHoteles.get(position));

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotolistahotel);
            nombreHotel =itemView.findViewById(R.id.nombrehotel1);
            precioHotel =itemView.findViewById(R.id.preciohotel1);
            contactoHotel =itemView.findViewById(R.id.telefonolistahotel);
        }

        public  void actualizarDatos(Moldehotel moldehotel) {
            fotoHotel.setImageResource(moldehotel.getFoto());
            nombreHotel.setText(moldehotel.getNombre());
            precioHotel.setText(moldehotel.getPrecio());
            contactoHotel.setText(moldehotel.getTelefono());


            itemView.setOnClickListener(new View.OnClickListener(){

                @Override

                public void onClick(View v){
                    Intent intent=new Intent(itemView.getContext(), AmpliandoHotel.class);
                    intent.putExtra("datoshotel",moldehotel);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
