/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaLuces;

/**
 *
 * @author itsth
 */
public class Luz {
    protected boolean encendida;
    protected String ubicacion;

    public Luz(String ubicacion) {
        this.encendida = false;
        this.ubicacion = ubicacion;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
    public void encenderLuz(){
        this.encendida = true;
    }
    
    public void apagarLuz(){
        this.encendida = false;   
    }
}
