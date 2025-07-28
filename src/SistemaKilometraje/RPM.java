/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaKilometraje;

/**
 *
 * @author Joan
 */
public class RPM {
  private double rpm;

    public RPM() {
        this.rpm = 0;
    }

    public void setRPM(double rpm) {
        this.rpm = rpm;
    }

    public void calcularRPM(double velocidad) {
        this.rpm = 800 + (velocidad * 50); 
    }

    public double getRPM() {
        return rpm;
    }
}   

