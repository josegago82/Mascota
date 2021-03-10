package com.josp.mascota;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setLogo(R.drawable.huella);

    listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

    LinearLayoutManager llm = new LinearLayoutManager(this);
    llm.setOrientation(LinearLayoutManager.VERTICAL);

    listaMascotas.setLayoutManager(llm);
    inicializarListaMascotas();
    inicializarAdaptador();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mAbout:
                Intent intent = new Intent(this,MascotasFavoritas.class);
                startActivity(intent);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    public void irMascotasFavoritas (View v){
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.dog_icon,R.drawable.hueso,"Carlino","2",R.drawable.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.dog_icon_2,R.drawable.hueso,"BullDog","4",R.drawable.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.dog_icon_3,R.drawable.hueso,"Terrier","1",R.drawable.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.dog_icon_4,R.drawable.hueso,"Huskie","5",R.drawable.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.dog_icon_5,R.drawable.hueso,"Dogo","2",R.drawable.hueso_amarillo));

    }
}