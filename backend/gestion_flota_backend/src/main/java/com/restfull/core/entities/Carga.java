package com.restfull.core.entities;

public class Carga {
    private int idCarga;
    private int solicitudId;
    private String tipo;
    private float peso;
    private String dimension;
    private String detalle;

    // Constructor vacío
    public Carga() {
    }

    // Constructor con parámetros
    public Carga(int idCarga, int solicitudId, String tipo, float peso, String dimension, String detalle) {
        this.idCarga = idCarga;
        this.solicitudId = solicitudId;
        this.tipo = tipo;
        this.peso = peso;
        this.dimension = dimension;
        this.detalle = detalle;
    }

    // Getters y setters
    public int getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(int idCarga) {
        this.idCarga = idCarga;
    }

    public int getSolicitudId() {
        return solicitudId;
    }

    public void setSolicitudId(int solicitudId) {
        this.solicitudId = solicitudId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
