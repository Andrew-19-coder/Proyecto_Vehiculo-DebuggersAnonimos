/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaKilometraje;

/**
 *
 * @author Joan
 */
public class Velocimetro {
     private double velocidad;

    public Velocimetro() {
        this.velocidad = 0;
    }

    public void setVelocidad(double velocidad) {
        if (velocidad < 0) {
            this.velocidad = 0;
        } else {
            this.velocidad = velocidad;
        }
    }

    public double getVelocidad() {
        return velocidad;
    }
}   

