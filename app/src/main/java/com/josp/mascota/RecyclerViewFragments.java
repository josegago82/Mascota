package com.josp.mascota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.josp.mascota.R;

import java.util.ArrayList;

public class RecyclerViewFragments extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container,false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();


        return v;
    }
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador =  new MascotaAdaptador(mascotas);
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
