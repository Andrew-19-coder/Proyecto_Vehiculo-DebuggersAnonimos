/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaLuces;

/**
 *
 * @author itsth
 */
public class LucesIntermitentes {
     private Luz izquierda;
    private Luz derecha;
    private Luz emergencia;

    public LucesIntermitentes() {
        izquierda = new Luz();
        derecha = new Luz();
        emergencia = new Luz();
    }

    public void activarIzquierda() {
        apagarTodas();
        izquierda.encenderLuz();
    }

    public void activarDerecha() {
        apagarTodas();
        derecha.encenderLuz();
    }

    public void activarEmergencia() {
        apagarTodas();
        derecha.encenderLuz();
        izquierda.encenderLuz();
    }

    public void apagarTodas() {
        izquierda.apagarLuz();
        derecha.apagarLuz();
        emergencia.apagarLuz();
    }

    public boolean isActivaIzquierda() {
        return izquierda.isEncendida();
    }

    public boolean isActivaDerecha() {
        return derecha.isEncendida();
    }

    public boolean isActivaEmergencia() {
        return emergencia.isEncendida();
    }
}
