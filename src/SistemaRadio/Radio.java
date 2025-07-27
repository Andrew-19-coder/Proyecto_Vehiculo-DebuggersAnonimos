/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author Joan
 */
public class Radio {
    private boolean encendida;
    private ModoRadio modoActual;
    private double frecuencia; // Solo para AM/FM

    public Radio() {
        this.encendida = false;
        this.modoActual = ModoRadio.FM;
        this.frecuencia = 99.5;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public void cambiarModo(ModoRadio nuevoModo) {
        if (encendida) {
            this.modoActual = nuevoModo;
            if (nuevoModo == ModoRadio.AM) {
                frecuencia = 820; 
            } else if (nuevoModo == ModoRadio.FM) {
                frecuencia = 99.5;
            } else {
                frecuencia = 0;
            }
        }
    }

    public ModoRadio getModoActual() {
        return modoActual;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void subirFrecuencia() {
        if (encendida && (modoActual == ModoRadio.AM || modoActual == ModoRadio.FM)) {
            frecuencia += (modoActual == ModoRadio.AM) ? 10 : 0.2;
        }
    }

    public void bajarFrecuencia() {
        if (encendida && (modoActual == ModoRadio.AM || modoActual == ModoRadio.FM)) {
            frecuencia -= (modoActual == ModoRadio.AM) ? 10 : 0.2;
        }
    }

    public String obtenerEstado() {
        if (!encendida) {
            return "Radio apagada";
        }

        if (modoActual == ModoRadio.BLUETOOTH) {
            return "Radio encendida en modo Bluetooth";
        } else {
            return "Radio encendida en modo " + modoActual + " - Frecuencia: " + frecuencia;
        }
    }
} 

