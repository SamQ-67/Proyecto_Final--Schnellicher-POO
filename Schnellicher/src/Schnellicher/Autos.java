/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schnellicher;

/**
 *
 * @author Derek
 */
public class Autos extends Vehiculos_G{
    private String Año;
    private String Serie;
    private String motor;
    private String caballos_de_fuerza;
    private String Suspension;
    private String Frenos;
    private String Luces;
    private String Retrovisores;
    
    public Autos(String text, String text1, String text2, String text3) {
        super();
        this.Año = "---";
        this.Serie = "---";
        this.motor = "---";
        this.caballos_de_fuerza = "----";
        this.Suspension = "---";
        this.Frenos = "---";
        this.Luces = "---";
        this.Retrovisores = "---";
    }

    public Autos(String modelo, String fabricante, String Año, String Serie, String motor, String caballos_de_fuerza, String Suspension, String Frenos, String Luces, String Retrovisores) {
        super(modelo, fabricante);
        this.Año = Año;
        this.Serie = Serie;
        this.motor = motor;
        this.caballos_de_fuerza = caballos_de_fuerza;
        this.Suspension = Suspension;
        this.Frenos = Frenos;
        this.Luces = Luces;
        this.Retrovisores = Retrovisores;
    }


    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCaballos_de_fuerza() {
        return caballos_de_fuerza;
    }

    public void setCaballos_de_fuerza(String caballos_de_fuerza) {
        this.caballos_de_fuerza = caballos_de_fuerza;
    }

    public String getSuspensio() {
        return Suspension;
    }

    public void setSuspensio(String Suspensio) {
        this.Suspension = Suspensio;
    }

    public String getFrenos() {
        return Frenos;
    }

    public void setFrenos(String Frenos) {
        this.Frenos = Frenos;
    }

    public String getLuces() {
        return Luces;
    }

    public void setLuces(String Luces) {
        this.Luces = Luces;
    }

    public String getRetrovisores() {
        return Retrovisores;
    }

    public void setRetrovisores(String Retrovisores) {
        this.Retrovisores = Retrovisores;
    }
    
    @Override
public String toString() {
    return "Modelo: " + modelo +
           ", Fabricante: " + fabricante +
           ", Año: " + Año +
           ", Serie: " + Serie +
           ", Motor: " + motor +
           ", Caballos de Fuerza: " + caballos_de_fuerza +
           ", Suspensión: " + Suspension +
           ", Frenos: " + Frenos +
           ", Luces: " + Luces +
           ", Retrovisores: " + Retrovisores;
}


    @Override
    public void ImprimirDatos() {
        System.out.println("Año del vehiculo: " + Año);
        System.out.println("Numero de Serie: " + Serie);
        System.out.println("Tipo de motor: " + motor);
        System.out.println("Caballos de fuerza: " + caballos_de_fuerza);
        System.out.println("Suspension: " + Suspension);
        System.out.println("Frenos: " + Frenos);
        System.out.println("Luces: " + Luces);
        System.out.println("Espejos Retrovisores: " + Retrovisores);
    }
    

    
}
