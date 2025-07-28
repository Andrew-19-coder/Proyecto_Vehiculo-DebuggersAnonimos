/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPuertas;

/**
 *
 * @author Joan
 */
public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }
    
    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public boolean isAbierta() {
        return abierta;
    }
}

