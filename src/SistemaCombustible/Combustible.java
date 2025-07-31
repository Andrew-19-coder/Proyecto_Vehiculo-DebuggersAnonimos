/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaCombustible;

/**
 *
 * @author Joan
 */
public class Combustible {
       private double nivelCombustible;
    private boolean motorEncendido;
    private final double consumoRPM = 0.00002; 

    public Combustible() {
        this.nivelCombustible = 100;
        this.motorEncendido = false;
    }

    public void encenderMotor() {
        if (nivelCombustible > 0) {
            motorEncendido = true;
        } else {
            apagarMotor();
        }
    }

    public void apagarMotor() {
        motorEncendido = false;
    }

    public void consumirCombustible(double rpm, double segundos) {
        if (!motorEncendido) {
            return;
        }

        double consumo = rpm * consumoRPM * segundos;

        if (nivelCombustible >= consumo) {
            nivelCombustible -= consumo;
        } else {
            nivelCombustible = 0;
            apagarMotor();
         
        }
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }
} 

