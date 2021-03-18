package com.josp.mascota;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.josp.mascota.DB.ConstructorMascosta;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
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
        mascotaViewHolder.tvMascotaScore.setText(String.valueOf(mascota.getPuntuacion()));
        mascotaViewHolder.imgHuesoAmarillo.setImageResource(mascota.getHuesoamarillo());

        mascotaViewHolder.imgMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, MascotasFavoritas.class);
                activity.startActivity(intent);
            }
        });

        mascotaViewHolder.imgHueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Diste Like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
                ConstructorMascosta constructorMascosta = new ConstructorMascosta(activity);
                constructorMascosta.darLikeMascota(mascota);
                mascotaViewHolder.tvMascotaScore.setText(constructorMascosta.obtenerLikesMascota(mascota));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imgMascota;
        private final ImageView imgHueso;
        private final TextView tvNombreMascota;
        private final TextView tvMascotaScore;
        private final ImageView imgHuesoAmarillo;

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
