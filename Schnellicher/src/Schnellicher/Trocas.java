/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schnellicher;

/**
 *
 * @author Derek
 */
public class Trocas extends Vehiculos_G{
    private boolean cajonera;
    
    public Trocas(String text, String text1, String text2, String text3) {
        this.cajonera = true;
    }


    public Trocas(String modelo, String fabricante, boolean cajonera) {
        super(modelo, fabricante);
        this.cajonera = cajonera;
    }

    public boolean isCajonera() {
        return cajonera;
    }

    public void setCajonera(boolean cajonera) {
        this.cajonera = cajonera;
    }
    
    @Override
    public String toString(){
        return "Modelo: " + modelo +
                ", Fabricante: " + fabricante + 
                ", Tiene cajonera: " + (cajonera ? "Sí" : "No");
    }
    
    @Override
    public void ImprimirDatos() {
        System.out.println("¿Tiene cajonera?: " + cajonera);
    }
    
}

