/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoautomovil;

/**
 *
 * @author MSI
 */
public class FabricaAutomovil {

    private String brand;
    private String model;
    private float volumen;
    private int numeroPuertas;
    private int numeroAsientos;
    carType tipoAuto;
    fuelType tipoCombustible;
    colorAuto colourAuto;

    public FabricaAutomovil(String brand, String model, float volumen, int numeroPuertas, int numeroAsientos, carType tipoAuto, fuelType tipoCombustible, colorAuto colourAuto) {
        this.brand = brand;
        this.model = model;
        this.volumen = volumen;
        this.numeroPuertas = numeroPuertas;
        this.numeroAsientos = numeroAsientos;
        this.tipoAuto = tipoAuto;
        this.tipoCombustible = tipoCombustible;
        this.colourAuto = colourAuto;
    }

    public FabricaAutomovil() {
    }

    public carType getTipoAuto() {
        return tipoAuto;
    }

    public fuelType getTipoCombustible() {
        return tipoCombustible;
    }

    public colorAuto getColourAuto() {
        return colourAuto;
    }

    public void setTipoAuto(carType tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public void setTipoCombustible(fuelType tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void setColourAuto(colorAuto colourAuto) {
        this.colourAuto = colourAuto;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getVolumen() {
        return volumen;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

}
