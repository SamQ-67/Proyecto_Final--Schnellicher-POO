/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schnellicher;

/**
 *
 * @author ririo
 */
public class Regional extends Productos{
    String region;
    String extra;
    
    public Regional(String nombre, String precio, String region1){
        super();
        this.region = "-Sin region-";
        this.extra = "-Sin extras-";
    }
    public Regional(String marca, String nombre, String ingredientes, String precio, String region, String extra){
        this.marca = marca;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.region = region;
        this.extra = extra;
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
        
        if(!region.equals("-Sin region-")){
            System.out.println("Region: " + region);
        }else{
            System.out.println("-Dato faltante-");
        }
        
        if(!extra.equals("-Sin extras-")){
            System.out.println("Extras: " + extra);
        }else{
            System.out.println("-Dato faltante-");
        }
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: $" + precio + ", Región: " + region;
    }


}
