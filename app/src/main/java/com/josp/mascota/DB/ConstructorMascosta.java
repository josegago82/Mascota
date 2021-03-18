package com.josp.mascota.DB;

import android.content.ContentValues;
import android.content.Context;

import com.josp.mascota.Mascota;
import com.josp.mascota.R;

import java.util.ArrayList;

public class ConstructorMascosta {

    private static final int LIKE = 1;
    private final Context context;

    public ConstructorMascosta(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos() {

  /*
        ArrayList<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Mascota(R.drawable.dog_icon,R.drawable.hueso,"Carlino",2,R.drawable.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.dog_icon_2,R.drawable.hueso,"BullDog",4,R.drawable.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.dog_icon_3,R.drawable.hueso,"Terrier",1,R.drawable.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.dog_icon_4,R.drawable.hueso,"Huskie",5,R.drawable.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.dog_icon_5,R.drawable.hueso,"Dogo",2,R.drawable.hueso_amarillo));
        return mascotas;

*/
        BaseDatos db = new BaseDatos(context);
        insertarTresMascotas(db);
        return db.obtenerTodasMascotas();
    }

    public void insertarTresMascotas(BaseDatos db) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog_icon);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESO, R.drawable.hueso);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NAME, "Carlino");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_PUNTUACION, 2);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESOAMARILLO, R.drawable.hueso_amarillo);


        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog_icon_2);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESO, R.drawable.hueso);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NAME, "Bulldog");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_PUNTUACION, 4);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESOAMARILLO, R.drawable.hueso_amarillo);


        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog_icon_3);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESO, R.drawable.hueso);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NAME, "Terrier");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_PUNTUACION, 1);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESOAMARILLO, R.drawable.hueso_amarillo);


        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog_icon_4);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESO, R.drawable.hueso);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NAME, "Hueskie");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_PUNTUACION, 5);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESOAMARILLO, R.drawable.hueso_amarillo);


        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.dog_icon_5);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESO, R.drawable.hueso);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NAME, "Dogo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_PUNTUACION, 2);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO_HUESOAMARILLO, R.drawable.hueso_amarillo);


        db.insertarMascota(contentValues);
    }

    public void darLikeMascota(Mascota mascota) {
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID_MASCOTAS, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID_NUMERO_LIKES, LIKE);
        db.insertarLikeMascota(contentValues);

    }

    public int obtenerLikesMascota(Mascota mascota) {
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);
    }

}
