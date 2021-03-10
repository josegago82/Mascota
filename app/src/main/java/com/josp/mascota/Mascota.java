package com.josp.mascota;

public class Mascota {
    private int fotomascota;
    private int hueso;
    private String nombre;

    public Mascota(int fotomascota, String puntuacion, int huesoamarillo) {
        this.fotomascota = fotomascota;
        this.puntuacion = puntuacion;
        this.huesoamarillo = huesoamarillo;
    }

    private String puntuacion;
    private int huesoamarillo;

    public int getFotomascota() {
        return fotomascota;
    }

    public void setFotomascota(int fotomascota) {
        this.fotomascota = fotomascota;
    }

    public Mascota(int fotomascota, int hueso, String nombre, String puntuacion, int huesoamarillo) {
        this.fotomascota = fotomascota;
        this.hueso = hueso;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.huesoamarillo = huesoamarillo;
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

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getHuesoamarillo() {
        return huesoamarillo;
    }

    public void setHuesoamarillo(int huesoamarillo) {
        this.huesoamarillo = huesoamarillo;
    }
}
