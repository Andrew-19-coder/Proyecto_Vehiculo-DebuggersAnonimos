/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaLuces;
import SistemaPuertas.Puerta;
/**
 *
 * @author itsth
 */
public class LuzPuerta {
    private Puerta puertaAsignada;
    private Luz luzPuerta;

    public LuzPuerta(Puerta puertaAsignada) {
        this.luzPuerta = new Luz();
        this.puertaAsignada = puertaAsignada;
    }
    
    public void encender(){
        luzPuerta.encenderLuz();
    }
    
    public void apagar(){
        luzPuerta.apagarLuz();
    }
    
    public void actualizarEstado(){
        if(puertaAsignada.isAbierta()){
            luzPuerta.encenderLuz();
        }else{
            luzPuerta.apagarLuz();
        }
    }

    public boolean isPuertaAbierta() {
        return puertaAsignada.isAbierta();
    }

    public boolean isLuzEncendida() {
        return luzPuerta.isEncendida();
    }
}
