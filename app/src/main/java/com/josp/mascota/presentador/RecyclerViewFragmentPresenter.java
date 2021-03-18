package com.josp.mascota.presentador;

import android.content.Context;

import com.josp.mascota.DB.ConstructorMascosta;
import com.josp.mascota.IRecyclerViewFragmentView;
import com.josp.mascota.Mascota;

import java.util.ArrayList;

public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {

    private final IRecyclerViewFragmentView IRecyclerViewFragmentView;
    private final Context context;
    private ConstructorMascosta constructorMascota;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView IRecyclerViewFragmentView, Context context) {
        this.IRecyclerViewFragmentView = IRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();

    }


    @Override
    public void obtenerMascotasBaseDatos() {

        constructorMascota = new ConstructorMascosta(context);
        mascotas = constructorMascota.obtenerDatos();
        mostrarMascotasRV();

    }

    @Override
    public void mostrarMascotasRV() {
        IRecyclerViewFragmentView.inicializarAdaptadorRV(IRecyclerViewFragmentView.crearAdaptador(mascotas));
        IRecyclerViewFragmentView.generarLinearLayoutVertical();

    }


}
