package com.restfull.core.entities;

import java.time.LocalDateTime;

public class Vehiculo {
    private int idVehiculo;
    private String patente;
    private String numeroMotor;
    private LocalDateTime fechaRevisionTecnica;
    private String marca;
    private int anio;
    private String modelo;
    private String consecionario;
    private String aseguradora;
    private String poliza;
    private LocalDateTime fechaPoliza;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaBaja;
    private String tipo;
    private String estado;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(int idVehiculo, String patente, String numeroMotor, LocalDateTime fechaRevisionTecnica, String marca,
                    int anio, String modelo, String consecionario, String aseguradora, String poliza,
                    LocalDateTime fechaPoliza, LocalDateTime fechaIngreso, LocalDateTime fechaBaja, String tipo,
                    String estado) {
        this.idVehiculo = idVehiculo;
        this.patente = patente;
        this.numeroMotor = numeroMotor;
        this.fechaRevisionTecnica = fechaRevisionTecnica;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.consecionario = consecionario;
        this.aseguradora = aseguradora;
        this.poliza = poliza;
        this.fechaPoliza = fechaPoliza;
        this.fechaIngreso = fechaIngreso;
        this.fechaBaja = fechaBaja;
        this.tipo = tipo;
        this.estado = estado;
    }

    // Getters y setters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public LocalDateTime getFechaRevisionTecnica() {
        return fechaRevisionTecnica;
    }

    public void setFechaRevisionTecnica(LocalDateTime fechaRevisionTecnica) {
        this.fechaRevisionTecnica = fechaRevisionTecnica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConsecionario() {
        return consecionario;
    }

    public void setConsecionario(String consecionario) {
        this.consecionario = consecionario;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public LocalDateTime getFechaPoliza() {
    	return fechaPoliza;
    }
    public void setFechaPoliza(LocalDateTime fechaPoliza) {
        this.fechaPoliza = fechaPoliza;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDateTime fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
