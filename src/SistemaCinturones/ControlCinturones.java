/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaCinturones;

/**
 *
 * @author itsth
 */
public class ControlCinturones {
    private Cinturon cinturonConductor;
    private Cinturon cinturonPasajero;

    public ControlCinturones() {
        Persona conductor = new Persona(RolPersona.CONDUCTOR);
        Persona pasajero = new Persona(RolPersona.PASAJERO);
        cinturonConductor = new Cinturon(conductor);
        cinturonPasajero = new Cinturon(pasajero);
    }
    
    public void colocarConductor(){
        cinturonConductor.colocar();
    }
    
    public void quitarConductor(){
        cinturonConductor.quitar();
    }
    
    public void colocarPasajero(){
        cinturonPasajero.colocar();
    }
    
    public void quitarPasajero(){
        cinturonPasajero.quitar();
    }
}
