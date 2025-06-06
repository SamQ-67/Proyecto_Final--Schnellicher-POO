/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schnellicher;

/**
 *
 * @author Derek
 */
public class Trailers extends Vehiculos_G{
    private String System_frenos;
    private String Luces_cableado;
    private String Panel_control;
    private String Cuplos_bancas;
    private String Rodines_ejes;
    private String tanque_disel;

    public Trailers(String modelo, String fabricante, String System_frenos, String Luces_cableado, String Panel_control, String Cuplos_bancas, String Rodines_ejes, String tanque_disel) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.System_frenos = System_frenos;
        this.Luces_cableado = Luces_cableado;
        this.Panel_control = Panel_control;
        this.Cuplos_bancas = Cuplos_bancas;
        this.Rodines_ejes = Rodines_ejes;
        this.tanque_disel = tanque_disel;
    }

    public Trailers() {
        super();
        this.System_frenos = "----";
        this.Luces_cableado = "----";
        this.Panel_control = "----";
        this.Cuplos_bancas = "----";
        this.Rodines_ejes = "----";
        this.tanque_disel = "----";
    }

   
    public String getSystem_frenos() {
        return System_frenos;
    }

    public void setSystem_frenos(String System_frenos) {
        this.System_frenos = System_frenos;
    }

    public String getLuces_cableado() {
        return Luces_cableado;
    }

    public void setLuces_cableado(String Luces_cableado) {
        this.Luces_cableado = Luces_cableado;
    }

    public String getPanel_control() {
        return Panel_control;
    }

    public void setPanel_control(String Panel_control) {
        this.Panel_control = Panel_control;
    }

    public String getCuplos_bancas() {
        return Cuplos_bancas;
    }

    public void setCuplos_bancas(String Cuplos_bancas) {
        this.Cuplos_bancas = Cuplos_bancas;
    }

    public String getRodines_ejes() {
        return Rodines_ejes;
    }

    public void setRodines_ejes(String Rodines_ejes) {
        this.Rodines_ejes = Rodines_ejes;
    }

    public String getTanque_disel() {
        return tanque_disel;
    }

    public void setTanque_disel(String tanque_disel) {
        this.tanque_disel = tanque_disel;
    }
    
    @Override
    public String toString() {
        return "Modelo: " + modelo +
           ", Fabricante: " + fabricante +
           ", Frenos: " + System_frenos +
           ", Luces: " + Luces_cableado +
           ", Panel: " + Panel_control +
           ", Cuplos: " + Cuplos_bancas +
           ", Rodines: " + Rodines_ejes +
           ", Tanque: " + tanque_disel;
    }


    @Override
    public void ImprimirDatos() {
        System.out.println("----Datos de Trailer----");
        System.out.println("Sistemas de frenos: " + System_frenos);
        System.out.println("Luces y cableado: " + Luces_cableado);
        System.out.println("Panel de Control: " + Panel_control);
        System.out.println("Cuplos y Bancas: " + Cuplos_bancas);
        System.out.println("Rodines y Ejes: " + Rodines_ejes);
        System.out.println("Tanque de Diesel: " + tanque_disel);
       
    }
}
