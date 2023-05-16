package com.restfull.core.entities;

public class Persona {
    private int idPersona;
    private int run;
    private String dv;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(int idPersona, int run, String dv, String nombre, String primerApellido, String segundoApellido) {
        this.idPersona = idPersona;
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    // Getters y setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
