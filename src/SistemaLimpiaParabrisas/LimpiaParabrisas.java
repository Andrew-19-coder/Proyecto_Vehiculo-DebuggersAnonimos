/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaLimpiaParabrisas;

/**
 *
 * @author Joan
 */
public class LimpiaParabrisas {
 private Velocidad velocidadActual;
    private boolean enFuncionamiento;

    public LimpiaParabrisas() {
        this.velocidadActual = Velocidad.APAGADO;
        this.enFuncionamiento = false;
    }

    public void encender(Velocidad velocidad) {
        if (velocidad != Velocidad.APAGADO) {
            this.velocidadActual = velocidad;
            this.enFuncionamiento = true;
        }
    }

    public void apagar() {
        this.velocidadActual = Velocidad.APAGADO;
        this.enFuncionamiento = false;
    }

    public void cambiarVelocidad(Velocidad nuevaVelocidad) {
        if (enFuncionamiento && nuevaVelocidad != Velocidad.APAGADO) {
            this.velocidadActual = nuevaVelocidad;
        } else if (nuevaVelocidad == Velocidad.APAGADO) {
            apagar();
        }
    }

    public Velocidad getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isEnFuncionamiento() {
        return enFuncionamiento;
    }

    public String obtenerEstado() {
        if (!enFuncionamiento) {
            return "Limpia parabrisas apagado.";
        } else {
            return "Limpia parabrisas encendido - Velocidad: " + velocidadActual;
        }
    }
}   

