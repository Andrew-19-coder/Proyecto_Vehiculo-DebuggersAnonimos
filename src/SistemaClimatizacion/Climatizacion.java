/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaClimatizacion;

/**
 *
 * @author Joan
 */
public class Climatizacion {
    private int temperatura;
    private int velocidadVentilador;
    private boolean acEncendido;
    private boolean calefaccionEncendida;

    public Climatizacion() {
        this.temperatura = 22;
        this.velocidadVentilador = 0;
        this.acEncendido = false;
        this.calefaccionEncendida = false;
    }
    
    public void subirTemperatura(){
        if(temperatura < 30){
            temperatura++;
        }
    }
    
    public void bajarTemperatura(){
        if(temperatura > 16){
            temperatura--;
        }
    }
    
    public void aumentarVelocidad(){
        if(velocidadVentilador < 5){
            velocidadVentilador++;
        }
    }
    
    public void disminuirVelocidad(){
        if(velocidadVentilador > 0){
            velocidadVentilador--;
        }
    }
    
    public void encenderAC(){
        this.acEncendido = true;
        this.calefaccionEncendida = false;
    }
    
    public void apagarAC(){
        this.acEncendido = false;
    }
    
    public void encenderCalefaccion(){
        this.calefaccionEncendida = true;
        this.acEncendido = false;
    }
    
    public void apagarCalefaccion(){
        this.calefaccionEncendida = false;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getVelocidadVentilador() {
        return velocidadVentilador;
    }

    public boolean isAcEncendido() {
        return acEncendido;
    }

    public boolean isCalefaccionEncendida() {
        return calefaccionEncendida;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
        this.temperatura = temperatura;
    }
    }
    
    
    
}



