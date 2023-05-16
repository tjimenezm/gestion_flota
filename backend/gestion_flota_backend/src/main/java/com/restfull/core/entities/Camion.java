package com.restfull.core.entities;

public class Camion {
    private int idCamion;
    private int vehiculoId;
    private float capacidad;
    private String tipo;

    // Constructor vacío
    public Camion() {
    }

    // Constructor con parámetros
    public Camion(int idCamion, int vehiculoId, float capacidad, String tipo) {
        this.idCamion = idCamion;
        this.vehiculoId = vehiculoId;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    // Getters y setters
    public int getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(int idCamion) {
        this.idCamion = idCamion;
    }

    public int getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
