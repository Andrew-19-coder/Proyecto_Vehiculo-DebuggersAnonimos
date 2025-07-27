/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Control_Puertas;

/**
 *
 * @author Joan
 */
public class ControlPuertas {
    private Puerta[] puertas;

    public ControlPuertas(int cantidadPuertas) {
        puertas = new Puerta[cantidadPuertas];
        for (int i = 0; i < cantidadPuertas; i++) {
            puertas[i] = new Puerta();
        }
    }

    public Puerta getPuerta(int index) {
        return puertas[index];
    }
}

