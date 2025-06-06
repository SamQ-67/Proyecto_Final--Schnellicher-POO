/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schnellicher;


/**
 *
 * @author ririo
 */
public class Basico extends Productos{
    private String horno;
    
    public Basico(String nombre1, String precio){
        super();
        this.horno = "-Sin dato-";
    }
    public Basico(String marca, String nombre, String ingredientes, String precio, String horno){
        this.marca = marca;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.horno = horno;
    }

    public String getHorno() {
        return horno;
    }

    public void setHorno(String horno) {
        this.horno = horno;
    }
    
    @Override
    protected void DatosPan() {
        if (!marca.equals("-Sin marca-")) {
            System.out.println("Marca: " + marca);
        } else {
            System.out.println("-No hay datos de la marca-");
        }

        if (!nombre.equals("-Sin nombre-")) {
            System.out.println("Nombre: " + nombre);
        } else {
            System.out.println("-No hay datos del nombre-");
        }

        if (!ingredientes.equals("-Sin datos-")) {
            System.out.println("Ingredientes: " + ingredientes);
        } else {
            System.out.println("-No hay datos de los ingredientes-");
        }
        
        if (!precio.equals("0")) {
            System.out.println("Precio: " + precio);
        }else{
            System.out.println("-No hay precio-");
        }
        
        if(!horno.equals("-Sin dato-")){
            System.out.println("Horno: " + horno);
        }else{
            System.out.println("-No hay datos de horno-");
        }
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: $" + precio;
    }


    
}
