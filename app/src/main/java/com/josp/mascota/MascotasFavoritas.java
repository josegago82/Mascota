package com.josp.mascota;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MascotasFavoritas extends AppCompatActivity {

    private TextView tvNombreMascota;
    private TextView tvMascotaScore;
    private ImageView imgMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString(getResources().getString(R.string.nombremascota));


        tvNombreMascota = (TextView) findViewById(R.id.tvNombreMascota);
        tvMascotaScore = (TextView) findViewById(R.id.tvMascotaScore);
        imgMascota = (ImageView) findViewById(R.id.imgMascota);


        tvNombreMascota.setText(nombre);



        androidx.appcompat.widget.Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


}