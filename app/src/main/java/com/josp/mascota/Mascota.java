package com.josp.mascota;

public class Mascota {
    public int Id;
    private int puntuacion;
    private int huesoamarillo;
    private int fotomascota;
    private int hueso;
    private String nombre;

    public Mascota(int id, int fotomascota, int hueso, String nombre, int puntuacion, int huesoamarillo) {
        Id = id;
        this.fotomascota = fotomascota;
        this.hueso = hueso;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.huesoamarillo = huesoamarillo;
    }

    public Mascota(int fotomascota, String nombre, int huesoamarillo) {
        this.fotomascota = fotomascota;
        this.nombre = nombre;
        this.huesoamarillo = huesoamarillo;
    }

    public Mascota(int fotomascota, int hueso, String nombre, int puntuacion, int huesoamarillo) {
        this.fotomascota = fotomascota;
        this.hueso = hueso;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.huesoamarillo = huesoamarillo;
    }

    public Mascota(int fotomascota, int puntuacion, int huesoamarillo) {
        this.fotomascota = fotomascota;
        this.puntuacion = puntuacion;
        this.huesoamarillo = huesoamarillo;
    }

    public Mascota() {

    }

    public Mascota(String nombre, int puntuacion, int fotomascota) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.fotomascota = fotomascota;
    }

    public int getFotomascota() {
        return fotomascota;
    }

    public void setFotomascota(int fotomascota) {
        this.fotomascota = fotomascota;
    }

    public int getHueso() {
        return hueso;
    }

    public void setHueso(int hueso) {
        this.hueso = hueso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getHuesoamarillo() {
        return huesoamarillo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setHuesoamarillo(int huesoamarillo) {
        this.huesoamarillo = huesoamarillo;
    }
}