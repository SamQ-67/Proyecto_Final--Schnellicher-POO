/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schnellicher;

/**
 *
 * @author Derek
 */
public abstract class Vehiculos_G {
    public String modelo;
    public String fabricante;
    
     public Vehiculos_G() {
        this.modelo = "---";
        this.fabricante = "----";
    }

    public Vehiculos_G(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    
    // Método abstracto
    public abstract void ImprimirDatos();
       
}

