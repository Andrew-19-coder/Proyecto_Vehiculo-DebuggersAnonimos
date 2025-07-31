/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;

import java.awt.event.ActionListener;

/**
 *
 * @author Joan
 */
public class Radio {

    public static void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private boolean encendido;
    private ModoRadio modoActual;
    private double frecuencia;

    public Radio() {
        this.encendido = false;
        this.modoActual = ModoRadio.FM;
        this.frecuencia = 99.5;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public boolean estaEncendida() {
        return encendido;
    }

    public void cambiarModo(ModoRadio nuevoModo) {
        if (encendido) {
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
        if (encendido && (modoActual == ModoRadio.AM || modoActual == ModoRadio.FM)) {
            frecuencia += (modoActual == ModoRadio.AM) ? 10 : 0.2;
        }
    }

    public void bajarFrecuencia() {
        if (encendido && (modoActual == ModoRadio.AM || modoActual == ModoRadio.FM)) {
            frecuencia -= (modoActual == ModoRadio.AM) ? 10 : 0.2;
        }
    }

    public String obtenerEstado() {
        if (!encendido) {
            return "Radio apagada";
        }

        if (modoActual == ModoRadio.BLUETOOTH) {
            return "Radio encendida en modo Bluetooth";
        } else {
            return "Radio encendida en modo " + modoActual + " - Frecuencia: " + frecuencia;
        }
    }
} 