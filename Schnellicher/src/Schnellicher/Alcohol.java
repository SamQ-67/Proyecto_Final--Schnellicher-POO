/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Derek
 */
package Schnellicher;

public class Alcohol extends Productos {
    private String gr_alcohol;
    private String litros;
    private String volumen;
    private String edad;

    public Alcohol(String nombre, String marca, String precio, String edad, String gr_alcohol, String litros) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.gr_alcohol = gr_alcohol;
        this.litros = litros;
        this.edad = edad;
    }

    public String getGr_alcohol() {
        return gr_alcohol;
    }

    public void setGr_alcohol(String gr_alcohol) {
        this.gr_alcohol = gr_alcohol;
    }

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
           ", Marca: " + marca +
           ", Precio: " + precio +
           ", Grados de alcohol: " + gr_alcohol +
           ", Litros: " + litros +
           ", Volumen: " + volumen +
           ", Edad requerida: " + edad;
    }

    
    public void Imprimir_Alcohol() {
        super.Imprimir_Pro();
        System.out.println("Grados de alcohol: " + gr_alcohol);
        System.out.println("Litros: " + litros);
        System.out.println("Volumen: " + volumen);
        System.out.println("Edad requerida: " + edad);
    }
}
