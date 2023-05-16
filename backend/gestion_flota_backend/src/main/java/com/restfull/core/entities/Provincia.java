package com.restfull.core.entities;

public class Provincia {
    private int idProvincia;
    private String nombreProvincia;
    private int regionId;

    public Provincia() {
    }

    public Provincia(int idProvincia, String nombreProvincia, int regionId) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.regionId = regionId;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }
}
