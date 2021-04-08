package com.josp.mascota;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class  PerfilFragment extends Fragment {

    ArrayList<Mascota> mascotasperfil;
    private RecyclerView listaMascotasperfil;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container,false);

        listaMascotasperfil = (RecyclerView) v.findViewById(R.id.rvPerfil);

        /*LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);*/

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        listaMascotasperfil.setLayoutManager(glm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;

    }

    public void inicializarAdaptador(){
        PerfilAdaptador adaptador =  new PerfilAdaptador(mascotasperfil);
        listaMascotasperfil.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {

        mascotasperfil = new ArrayList<Mascota>();

        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 2, R.drawable.hueso_amarillo));
        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 4, R.drawable.hueso_amarillo));
        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 1, R.drawable.hueso_amarillo));
        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 6, R.drawable.hueso_amarillo));
        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 2, R.drawable.hueso_amarillo));
        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 1, R.drawable.hueso_amarillo));
        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 3, R.drawable.hueso_amarillo));
        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 4, R.drawable.hueso_amarillo));
        mascotasperfil.add(new Mascota(R.drawable.dog_icon, 1, R.drawable.hueso_amarillo));

    }
}