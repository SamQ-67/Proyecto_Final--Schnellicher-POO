/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schnellicher;

/**
 *
 * @author ririo
 */

import java.util.ArrayList;

public class RegistroProductos {
    public static final int LIMITE = 15;

    public static ArrayList<Basico> basicos = new ArrayList<>();
    public static ArrayList<Regional> regionales = new ArrayList<>();
    public static ArrayList<Papitas> papitas = new ArrayList<>();
    public static ArrayList<Alcohol> alcoholes = new ArrayList<>();
    public static ArrayList<Agua> aguas = new ArrayList<>();

    static int contRelleno;

    public static boolean agregarBasico(Basico b) {
        if (basicos.size() < LIMITE) {
            basicos.add(b);
            return true;
        }
        return false;
    }

    public static boolean agregarRegional(Regional r) {
        if (regionales.size() < LIMITE) {
            regionales.add(r);
            return true;
        }
        return false;
    }

    public static boolean agregarPapitas(Papitas p) {
        if (papitas.size() < LIMITE) {
            papitas.add(p);
            return true;
        }
        return false;
    }

    public static boolean agregarAlcohol(Alcohol a) {
        if (alcoholes.size() < LIMITE) {
            alcoholes.add(a);
            return true;
        }
        return false;
    }

    public static boolean agregarAgua(Agua a) {
        if (aguas.size() < LIMITE) {
            aguas.add(a);
            return true;
        }
        return false;
    }

}


