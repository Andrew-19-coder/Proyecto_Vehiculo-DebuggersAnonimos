/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaLuces;

/**
 *
 * @author Joan
 */
public class LuzDelantera {
    private Luz luzAlta;
    private Luz luzBaja;

    public LuzDelantera() {
        super();
        this.luzAlta = new Luz();
        this.luzBaja = new Luz();    
    }
    
    public void encenderLuzAlta(){
        luzAlta.encenderLuz();
    }
    
    public void apagarLuzAlta(){
        luzAlta.apagarLuz();
    }
    
    public void encenderLuzBaja(){
        luzBaja.encenderLuz();
    }
    
    public void apagarLuzBaja(){
        luzBaja.apagarLuz();
    }
    
    public boolean isLuzAltaEncendida(){
        return luzAlta.isEncendida();
    }
    
    public boolean isLuzBajaEncendido(){
        return luzAlta.isEncendida();
    }
}
