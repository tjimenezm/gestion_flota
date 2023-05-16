package com.restfull.core.entities;

public class Empleado {
    private int idEmpleado;
    private int personaId;
    private String tipoEmpleado;
    private String tipoContrato;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(int idEmpleado, int personaId, String tipoEmpleado, String tipoContrato) {
        this.idEmpleado = idEmpleado;
        this.personaId = personaId;
        this.tipoEmpleado = tipoEmpleado;
        this.tipoContrato = tipoContrato;
    }

    // Getters y setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
