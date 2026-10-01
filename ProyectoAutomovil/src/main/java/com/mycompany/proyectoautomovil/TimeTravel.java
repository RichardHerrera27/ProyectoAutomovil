/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoautomovil;

/**
 *
 * @author MSI
 */
public class TimeTravel extends Automovil {

    private float distance;
    private float tiempoViaje;

    public TimeTravel(float velocidad_Inicial, float maxima_Velocidad, String brand, String model, float volumen, int numeroPuertas, int numeroAsientos, carType tipoAuto, fuelType tipoCombustible, colorAuto colourAuto) {
        super(velocidad_Inicial, maxima_Velocidad, brand, model, volumen, numeroPuertas, numeroAsientos, tipoAuto, tipoCombustible, colourAuto);
    }

    public TimeTravel(String brand, String model, float volumen, int numeroPuertas, int numeroAsientos, carType tipoAuto, fuelType tipoCombustible, colorAuto colourAuto) {
        super(brand, model, volumen, numeroPuertas, numeroAsientos, tipoAuto, tipoCombustible, colourAuto);
    }

    public TimeTravel(float distance, float tiempoViaje) {
        this.distance = distance;
        this.tiempoViaje = tiempoViaje;
    }

    public TimeTravel() {
    }

    public float getDistance() {
        return distance;
    }

    public float getTiempoViaje() {
        return tiempoViaje;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setTiempoViaje(float tiempoViaje) {
        this.tiempoViaje = tiempoViaje;
    }

    public void distanciaViaje() {
    }

    public void tiempoViaje() {
    }
}
