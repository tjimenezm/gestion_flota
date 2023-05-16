package com.restfull.core.entities;

public class Cliente {
    private int idCliente;
    private int personaId;
    private String razonSocial;
    private int direccionId;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(int idCliente, int personaId, String razonSocial, int direccionId) {
        this.idCliente = idCliente;
        this.personaId = personaId;
        this.razonSocial = razonSocial;
        this.direccionId = direccionId;
    }

    // Getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }
}
