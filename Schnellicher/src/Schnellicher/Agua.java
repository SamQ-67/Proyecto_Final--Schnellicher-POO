package Schnellicher;


import Schnellicher.Productos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Derek
 */
public class Agua extends Productos{
   private boolean agua;
   private String tipo_agua;
   private double fa;
   private double gr;
   private double azucar;
   private double litros;
   private double g;
   
   public Agua(){
       super();
       this.agua = false;
       this.tipo_agua = "NO TIENE TIPO";
       this.gr = 0.0; 
    }
   
   public Agua(String tipo_agua, String nombre, String marca, boolean agua, String precio, double gr, double litros, double azucar) {
        super(nombre, marca, precio);
        this.agua = agua;
        this.tipo_agua = tipo_agua;
        this.gr = gr;
        this.azucar = azucar;
        this.litros = litros;
    }
   
   public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }
   
    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public String getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }

    public double getGr() {
        return gr;
    }

    public void setGr(double gr) {
        this.gr = gr;
    }
  
    public String calcular_agua(){
        if(agua == true){
            System.out.println("ES AGUA");
        }
        return null;
    }
    
    
    public double calcular_sugar(){
        double calcular_sugar = azucar * 250 / 10;
        return (azucar*litros/g);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
           ", Marca: " + marca +
           ", Precio: " + precio +
           ", Tipo de Agua: " + tipo_agua +
           ", Es Agua: " + (agua ? "Sí" : "No") +
           ", Grados: " + gr +
           ", Litros: " + litros +
           ", Azúcar: " + azucar;
    }

    
    public void imprimir_Agua(){
        System.out.println("Tipo: "+ tipo_agua);
        System.out.println("Es agua: "+ agua);
        System.out.println("Litros: "+ litros);
        System.out.println("Grados: "+ gr);
    }
}