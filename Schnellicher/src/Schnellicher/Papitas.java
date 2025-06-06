package Schnellicher;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Schnellicher.Productos;
import Schnellicher.Productos;

public class Papitas extends Productos{
    private String tipo; 

    public Papitas() {
        super();
        this.tipo = "Sin tipo";
    }

    public Papitas(String nombre, String marca, String precio, String tipo) {
       super(nombre, marca, precio);
       this.tipo = tipo;
}



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected void VerificadorDatos() {
        if (!tipo.equals("Sin tipo")) {
            System.out.println("Tipo: " + tipo);
        } else {
            System.out.println("No hay datos del tipo");
        }
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
           ", Marca: " + marca +
           ", Precio: " + precio +
           ", Tipo: " + (tipo.equals("Sin tipo") ? "No especificado" : tipo);
}


    public void ImprimirPapitas() {
        super.Imprimir_Pro();
        VerificadorDatos();
    }
}
