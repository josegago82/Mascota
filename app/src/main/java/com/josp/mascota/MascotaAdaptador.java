package com.josp.mascota;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewmascotas, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgMascota.setImageResource(mascota.getFotomascota());
        mascotaViewHolder.imgHueso.setImageResource(mascota.getHueso());
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombre());
        mascotaViewHolder.tvMascotaScore.setText(mascota.getPuntuacion());
        mascotaViewHolder.imgHuesoAmarillo.setImageResource(mascota.getHuesoamarillo());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascota;
        private ImageView imgHueso;
        private TextView tvNombreMascota;
        private TextView tvMascotaScore;
        private ImageView imgHuesoAmarillo;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
            imgHueso = (ImageView) itemView.findViewById(R.id.imgHueso);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvMascotaScore = (TextView) itemView.findViewById(R.id.tvMascotaScore);
            imgHuesoAmarillo = (ImageView) itemView.findViewById(R.id.imgHuesoAmarillo);
        }
    }

}
