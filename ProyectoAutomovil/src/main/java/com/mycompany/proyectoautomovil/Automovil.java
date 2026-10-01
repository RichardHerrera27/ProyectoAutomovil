/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoautomovil;

/**
 *
 * @author MSI
 */
public class Automovil extends FabricaAutomovil {

    private float velocidad_Inicial;
    private float maxima_Velocidad;

    public Automovil(float velocidad_Inicial, float maxima_Velocidad, String brand, String model, float volumen, int numeroPuertas, int numeroAsientos, carType tipoAuto, fuelType tipoCombustible, colorAuto colourAuto) {
        super(brand, model, volumen, numeroPuertas, numeroAsientos, tipoAuto, tipoCombustible, colourAuto);
        this.velocidad_Inicial = velocidad_Inicial;
        this.maxima_Velocidad = maxima_Velocidad;
    }

    public Automovil(String brand, String model, float volumen, int numeroPuertas, int numeroAsientos, carType tipoAuto, fuelType tipoCombustible, colorAuto colourAuto) {
        super(brand, model, volumen, numeroPuertas, numeroAsientos, tipoAuto, tipoCombustible, colourAuto);
    }

    public float getVelocidad_Inicial() {
        return velocidad_Inicial;
    }

    public float getMaxima_Velocidad() {
        return maxima_Velocidad;
    }

    public void setVelocidad_Inicial(float velocidad_Inicial) {
        this.velocidad_Inicial = velocidad_Inicial;
    }

    public void setMaxima_Velocidad(float maxima_Velocidad) {
        this.maxima_Velocidad = maxima_Velocidad;
    }

    public void accelerate() {
        boolean encendido = true;
        if (encendido) {
            System.out.println("El auto esta encendido");
        }
    }

    public void incrementoVelocidad() {
        float velocidadInicial = 0;
        while (velocidadInicial < 120) {
            velocidadInicial += 20;
            System.out.println("la velocidad actual es: " + velocidad_Inicial);
        }
    }

    public void disminuirVelocidad() {
    }

    public void decelarate() {
    }

    public void brake() {
    }

    public void mostrarDatos() {
    }
}
