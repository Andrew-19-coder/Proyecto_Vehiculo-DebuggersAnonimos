/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaKilometraje;

import SistemaCombustible.Combustible;

/**
 *
 * @author Joan
 */
public class Kilometraje {
  private double kilometrosRecorridos;
    private boolean encendido;
    private Velocimetro velocimetro;
    private RPM rpmControl;
    private Combustible combustible;

    public Kilometraje() {
        this.kilometrosRecorridos = 0;
        this.encendido = false;
        this.velocimetro = new Velocimetro();
        this.rpmControl = new RPM();
    }

    public void encenderVehiculo() {
        encendido = true;
        rpmControl.setRPM(800); // RPM en ralentí
    }

    public void apagarVehiculo() {
        encendido = false;
        rpmControl.setRPM(0);
        velocimetro.setVelocidad(0);
    }

    public void simularConduccion(int segundos) {

        double velocidad = velocimetro.getVelocidad(); 
        double horas = segundos / 3600.0;

        double distancia = velocidad * horas;
        kilometrosRecorridos += distancia;
        combustible.consumirCombustible(rpmControl.getRPM(), segundos);
    }

    public void setVelocidad(double velocidad) {
        velocimetro.setVelocidad(velocidad);
        rpmControl.calcularRPM(velocidad);
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public double getRPM() {
        return rpmControl.getRPM();
    }

    public double getVelocidad() {
        return velocimetro.getVelocidad();
    }
}

