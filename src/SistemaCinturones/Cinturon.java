/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaCinturones;

/**
 *
 * @author itsth
 */
public class Cinturon {
    private boolean colocado;
    private Persona personaAsignada;

    public Cinturon(Persona persona) {
        this.colocado = false;
        this.personaAsignada = persona;
    }
    
    public void colocar(){
        this.colocado = true;
    }
    
    public void quitar(){
        this.colocado = false;
    }

    public boolean isColocado() {
        return colocado;
    }

    public Persona getPersonaAsignada() {
        return personaAsignada;
    }
}
