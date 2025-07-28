/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaSensores;

/**
 *
 * @author itsth
 */
public class Sensores {
    private boolean frenoMano;
    private boolean enReversa;
    private boolean alarmaActiva;

    public Sensores() {
        this.frenoMano = true;
        this.enReversa = false;
        this.alarmaActiva = false;
    }

    public void activarFrenoMano() {
        this.frenoMano = true;
    }

    public void desactivarFrenoMano() {
        this.frenoMano = false;
    }

    public void ponerReversa() {
        this.enReversa = true;
    }

    public void quitarReversa() {
        this.enReversa = false;
    }

    public void verificarSensores(double velocidadActual) {
        boolean hayObstaculo = Math.random() < 0.3;

        if (frenoMano && velocidadActual > 0) {
         
        } else if (enReversa && hayObstaculo) {
           
        } else {
            desactivarAlarma();
        }
    }

    private void activarAlarma() {
        this.alarmaActiva = true;    
    }

    private void desactivarAlarma() {
        if (alarmaActiva) {
            System.out.println("Alarma desactivada.");
        }
        this.alarmaActiva = false;
    }

    public boolean isAlarmaActiva() {
        return alarmaActiva;
    }

    public boolean isFrenoManoActivado() {
        return frenoMano;
    }

    public boolean isEnReversa() {
        return enReversa;
    }
}
