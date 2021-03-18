package com.josp.mascota;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {

    void generarLinearLayoutVertical();

    MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    void inicializarAdaptadorRV(MascotaAdaptador mascotas);
}


