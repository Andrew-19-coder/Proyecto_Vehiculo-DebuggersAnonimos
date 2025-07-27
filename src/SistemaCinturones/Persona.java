/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaCinturones;

/**
 *
 * @author itsth
 */
public class Persona {
    private String nombre;
    private RolPersona rol;

    public Persona(RolPersona rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public RolPersona getRol() {
        return rol;
    }
}
