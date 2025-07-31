/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaVehiculo;

/**
 *
 * @author itsth
 */
public class Motor {
    private boolean encendido;

    public Motor() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }
    
    public void encenderMotor(){
        this.encendido = true;
    }
    
    public void apagarMotor(){
        this.encendido = false;
    }
}