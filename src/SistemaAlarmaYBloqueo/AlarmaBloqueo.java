/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAlarmaYBloqueo;
import SistemaPuertas.ControlPuertas;
/**
 *
 * @author itsth
 */
public class AlarmaBloqueo {
    private boolean alarmaActiva;
    private boolean puertasBloqueadas;
    private ControlPuertas bloqueoPuertas;

    public AlarmaBloqueo(ControlPuertas bloqueoPuertas) {
        this.alarmaActiva = false;
        this.puertasBloqueadas = false;
        this.bloqueoPuertas = bloqueoPuertas;
    }
    
    public boolean activarAlarma(){
        if(!bloqueoPuertas.hayPuertasAbiertas()){
            alarmaActiva = true;
            return true;
        }
        return false;
    }
    
    public void apagarAlarma(){
        alarmaActiva = false;
    }
    
    public boolean bloquearPuertas(){
        if(!bloqueoPuertas.hayPuertasAbiertas()){
            puertasBloqueadas = true;
            return true;
        }
        return false;
    }
    
    public void desblquearPuerta(){
        puertasBloqueadas = false;
    }
    
    public boolean isAlarmaActiva(){
        return alarmaActiva;
    }
    
    public boolean isPuertasBloqueadas(){
        return puertasBloqueadas;
    }
}
