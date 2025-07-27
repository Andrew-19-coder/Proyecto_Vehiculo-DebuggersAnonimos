/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaClimatizacion;

/**
 *
 * @author Joan
 */
public class Ventilacion {

    private boolean encendido;
    private ModoClima modo;
    private int temperatura; 

    public Ventilacion() {
        this.encendido = false;
        this.modo = ModoClima.VENTILACION; 
        this.temperatura = 22;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public void cambiarModo(ModoClima nuevoModo) {
        if (encendido) {
            this.modo = nuevoModo;
        }
    }

    public ModoClima getModo() {
        return modo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void subirTemperatura() {
        if (encendido && temperatura < 30) {
            temperatura++;
        }
    }

    public void bajarTemperatura() {
        if (encendido && temperatura > 16) {
            temperatura--;
        }
    }

    public String obtenerEstado() {
        if (!encendido) {
            return "Ventilación apagada";
        }
        return "Ventilación encendida en modo " + modo + " - Temperatura: " + temperatura + "°C";
    }
}

