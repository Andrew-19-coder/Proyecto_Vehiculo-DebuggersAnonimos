/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaVehiculo;

import SistemaLuces.*;
import SistemaPuertas.*;
import SistemaCinturones.*;
import SistemaAlarmaYBloqueo.*;
import SistemaLimpiaParabrisas.*;
import SistemaRadio.*;
import SistemaClimatizacion.*;
import SistemaCombustible.*;
import SistemaSensores.*;
import SistemaKilometraje.*;
/**
 *
 * @author itsth
 */
public class Vehiculo {
    private LuzDelantera luzDelantera;
    private LuzPuerta luzPuerta;
    private LucesIntermitentes luzIntermitente;
    
    private Puerta puerta;
    private ControlPuertas controlPuertas;
    
    private Cinturon cinturonConductor;
    private Cinturon cinturonPasajero;
    
    private AlarmaBloqueo alarma;
    private LimpiaParabrisas limpiaParabrisas;
    private Radio radio;
    private Climatizacion climatizacion;
    private Combustible combustible;
    private Sensores sensor;
    private Kilometraje kilometraje;
    private RPM rpm;
    private Velocimetro velocimetro;
    
    private Persona conductor;
    private Persona pasajero;

    public Vehiculo() {
        this.conductor = new Persona(RolPersona.CONDUCTOR);
        this.pasajero = new Persona(RolPersona.PASAJERO);

        this.puerta = new Puerta();
        this.controlPuertas = new ControlPuertas();

        this.luzDelantera = new LuzDelantera();
        this.luzPuerta = new LuzPuerta(puerta);
        this.luzIntermitente = new LucesIntermitentes();
        this.cinturonConductor = new Cinturon(conductor);
        this.cinturonPasajero = new Cinturon(pasajero);
        this.alarma = new AlarmaBloqueo(controlPuertas);
        
        this.limpiaParabrisas = new LimpiaParabrisas();
        this.radio = new Radio();
        this.climatizacion = new Climatizacion();
        this.combustible = new Combustible();
        this.sensor = new Sensores();
        this.kilometraje = new Kilometraje();
        this.rpm = new RPM();
        this.velocimetro = new Velocimetro();
    }

    public LuzDelantera getLuzDelantera() {
        return luzDelantera;
    }

    public LuzPuerta getLuzPuerta() {
        return luzPuerta;
    }

    public LucesIntermitentes getLuzIntermitente() {
        return luzIntermitente;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public ControlPuertas getControlPuertas() {
        return controlPuertas;
    }

    public Cinturon getCinturonConductor() {
        return cinturonConductor;
    }

    public Cinturon getCinturonPasajero() {
        return cinturonPasajero;
    }

    public AlarmaBloqueo getAlarma() {
        return alarma;
    }

    public LimpiaParabrisas getLimpiaParabrisas() {
        return limpiaParabrisas;
    }

    public Radio getRadio() {
        return radio;
    }

    public Climatizacion getClimatizacion() {
        return climatizacion;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public Sensores getSensor() {
        return sensor;
    }

    public Kilometraje getKilometraje() {
        return kilometraje;
    }

    public RPM getRpm() {
        return rpm;
    }

    public Velocimetro getVelocimetro() {
        return velocimetro;
    }

    public Persona getConductor() {
        return conductor;
    }

    public Persona getPasajero() {
        return pasajero;
    }
}
