/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPuertas;
import java.util.ArrayList;
/**
 *
 * @author Joan
 */
public class ControlPuertas {
    private ArrayList<Puerta> puertas;

    public ControlPuertas() {
        this.puertas = new ArrayList<>();
    }
    
    public void agregarPuerta(Puerta p){
        puertas.add(p);
    }
    
    public boolean hayPuertasAbiertas(){
        for(Puerta p : puertas){
            if(p.isAbierta()){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Integer> obtenerPuertasAbiertas(){
        ArrayList<Integer> abiertas = new ArrayList<>();
        for(int i=0; i<puertas.size(); i++){
            if(puertas.get(i).isAbierta()){
                abiertas.add(i);
            }
        }
        return abiertas;
    }
}

