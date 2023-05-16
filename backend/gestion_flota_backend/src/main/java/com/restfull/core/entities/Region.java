package com.restfull.core.entities;

public class Region {
    private int idRegion;
    private String nombreRegion;

    public Region() {
    }

    public Region(int idRegion, String nombreRegion) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }
}
