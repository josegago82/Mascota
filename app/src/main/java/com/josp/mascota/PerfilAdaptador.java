package com.josp.mascota;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder>{

    public PerfilAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;

    }

    ArrayList<Mascota> mascotas;

    @NonNull
    @Override
    public PerfilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewperfil, parent,false);
        return new PerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PerfilViewHolder perfilViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        perfilViewHolder.imgMascota.setImageResource(mascota.getFotomascota());
        perfilViewHolder.tvMascotaScore.setText(mascota.getPuntuacion());
        perfilViewHolder.imgHuesoAmarillo.setImageResource(mascota.getHuesoamarillo());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class PerfilViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascota;
        private TextView tvMascotaScore;
        private ImageView imgHuesoAmarillo;

        public PerfilViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
            tvMascotaScore = (TextView) itemView.findViewById(R.id.tvMascotaScore);
            imgHuesoAmarillo = (ImageView) itemView.findViewById(R.id.imgHuesoAmarillo);

        }
    }
}
