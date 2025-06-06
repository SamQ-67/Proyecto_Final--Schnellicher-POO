/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schnellicher;

/**
 *
 * @author ririo
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MenuP { 
    static ArrayList<Basico> listaBasico = new ArrayList<>();
    static ArrayList<Regional> listaRegional = new ArrayList<>();
    static ArrayList<Papitas> listaPapitas = new ArrayList<>();
    static ArrayList<Alcohol> listaAlcohol = new ArrayList<>();
    static ArrayList<Agua> listaAgua = new ArrayList<>();
    static ArrayList<Autos> listaAutos = new ArrayList<>();
    static ArrayList<Trocas> listaTrocas = new ArrayList<>();
    static ArrayList<Trailers> listaTrailers = new ArrayList<>();
    String ruta = "C:\\Archivos\\";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menú Principal");
        frame.setSize(450, 740);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(9, 1));

        JButton btnBasico = new JButton("Registrar Básico");
        JButton btnRegional = new JButton("Registrar Regional");
        JButton btnPapitas = new JButton("Registrar Papitas");
        JButton btnAlcohol = new JButton("Registrar Alcohol");
        JButton btnAgua = new JButton("Registrar Agua");
        JButton btnAuto = new JButton("Registrar Auto");
        JButton btnTroca = new JButton("Registrar Troca");
        JButton btnTrailer = new JButton("Registrar Trailer");
        JButton btnMostrarTodo = new JButton("Mostrar Todo");

        btnBasico.addActionListener(e -> mostrarFormularioBasico());
        btnRegional.addActionListener(e -> mostrarFormularioRegional());
        btnPapitas.addActionListener(e -> mostrarFormularioPapitas());
        btnAlcohol.addActionListener(e -> mostrarFormularioAlcohol());
        btnAgua.addActionListener(e -> mostrarFormularioAgua());
        btnAuto.addActionListener(e -> mostrarFormularioAuto());
        btnTroca.addActionListener(e -> mostrarFormularioTroca());
        btnTrailer.addActionListener(e -> mostrarFormularioTrailer());
        btnMostrarTodo.addActionListener(e -> mostrarTodo());

        frame.add(btnBasico);
        frame.add(btnRegional);
        frame.add(btnPapitas);
        frame.add(btnAlcohol);
        frame.add(btnAgua);
        frame.add(btnAuto);
        frame.add(btnTroca);
        frame.add(btnTrailer);
        frame.add(btnMostrarTodo);

        frame.setVisible(true);
    }

    static void mostrarFormularioBasico() {
        JTextField nombre = new JTextField();
        JTextField marca = new JTextField();
        JTextField ingredientes = new JTextField();
        JTextField precio = new JTextField();
        JTextField horno = new JTextField();

        Object[] campos = {
            "Nombre:", nombre,
            "Marca:", marca,
            "Ingredientes:", ingredientes,
            "Precio:", precio,
            "Horno:", horno
        };

        int opcion = JOptionPane.showConfirmDialog(null, campos, "Registrar Básico", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            Basico b = new Basico(nombre.getText(), marca.getText(), ingredientes.getText(), precio.getText(), horno.getText());
            listaBasico.add(b);
        }
    }

    static void mostrarFormularioRegional() {
        JTextField nombre = new JTextField();
        JTextField marca = new JTextField();
        JTextField ingredientes = new JTextField();
        JTextField precio = new JTextField();
        JTextField region = new JTextField();
        JTextField extra = new JTextField();

        Object[] campos = {
            "Nombre:", nombre,
            "Marca:", marca,
            "Ingredientes:", ingredientes,
            "Precio:", precio,
            "Región:", region,
            "Extras:", extra
        };

        int opcion = JOptionPane.showConfirmDialog(null, campos, "Registrar Regional", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            Regional r = new Regional(nombre.getText(), marca.getText(), ingredientes.getText(), precio.getText(), region.getText(), extra.getText());
            listaRegional.add(r);
        }
    }

    static void mostrarFormularioPapitas() {
        JTextField nombre = new JTextField();
        JTextField marca = new JTextField();
        JTextField precio = new JTextField();
        JTextField tipo = new JTextField();

        Object[] campos = {
            "Nombre:", nombre,
            "Marca:", marca,
            "Precio:", precio,
            "Tipo:", tipo
        };

        int opcion = JOptionPane.showConfirmDialog(null, campos, "Registrar Papitas", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            Papitas p = new Papitas(nombre.getText(), marca.getText(), precio.getText(), tipo.getText());
            listaPapitas.add(p);
        }
    }

    static void mostrarFormularioAlcohol() {
    JTextField nombre = new JTextField();
    JTextField marca = new JTextField();
    JTextField precio = new JTextField();
    JTextField grado = new JTextField();
    JTextField litros = new JTextField();
    JTextField edad = new JTextField();

    Object[] campos = {
        "Nombre:", nombre,
        "Marca:", marca,
        "Precio:", precio,
        "Grado de Alcohol:", grado,
        "Litros:", litros,
        "Edad:", edad
    };

    int opcion = JOptionPane.showConfirmDialog(null, campos, "Registrar Alcohol", JOptionPane.OK_CANCEL_OPTION);

    if (opcion == JOptionPane.OK_OPTION) {
        try {
            // Obtener texto desde los campos
            String valNombre = nombre.getText();
            String valMarca = marca.getText();
            String valPrecio = precio.getText();
            String valGrado = grado.getText();
            String valLitros = litros.getText();
            String valEdad = edad.getText();

            // Creara objetos con los valores
            Alcohol a = new Alcohol(valNombre, valMarca, valPrecio, valEdad, valGrado, valLitros);
            listaAlcohol.add(a); // agregara a la lista
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: Asegúrate de ingresar números válidos para precio, grado, litros y edad.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}


    static void mostrarFormularioAgua() {
        JTextField nombre = new JTextField();
        JTextField marca = new JTextField();
        JTextField precio = new JTextField();
        JCheckBox esAgua = new JCheckBox("¿Es Agua?");
        JTextField tipoAgua = new JTextField();
        JTextField azucar = new JTextField();
        JTextField litros = new JTextField();
        JTextField fahrenheit = new JTextField();

        Object[] campos = {
            "Nombre:", nombre,
            "Marca:", marca,
            "Precio:", precio,
            esAgua,
            "Tipo de Agua:", tipoAgua,
            "Azúcar:", azucar,
            "Litros:", litros,
            "Fahrenheit:", fahrenheit
        };

        int opcion = JOptionPane.showConfirmDialog(null, campos, "Registrar Agua", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            Agua a = new Agua(nombre.getText(), marca.getText(), precio.getText(),
                              esAgua.isSelected(), tipoAgua.getText(), Double.parseDouble(azucar.getText()),
                              Double.parseDouble(litros.getText()), Double.parseDouble(fahrenheit.getText()));
            listaAgua.add(a);
        }
    }
    
    static void mostrarFormularioAuto() {
    JTextField modelo = new JTextField();
    JTextField fabricante = new JTextField();
    JTextField anio = new JTextField();
    JTextField serie = new JTextField();
    JTextField motor = new JTextField();
    JTextField caballosFuerza = new JTextField();
    JTextField suspension = new JTextField();
    JTextField frenos = new JTextField();
    JTextField luces = new JTextField();
    JTextField retrovisores = new JTextField();

    Object[] campos = {
        "Modelo:", modelo,
        "Fabricante:", fabricante,
        "Año:", anio,
        "Serie:", serie,
        "Motor:", motor,
        "Caballos de Fuerza:", caballosFuerza,
        "Suspensión:", suspension,
        "Frenos:", frenos,
        "Luces:", luces,
        "Retrovisores:", retrovisores
    };

    int opcion = JOptionPane.showConfirmDialog(null, campos, "Registrar Auto", JOptionPane.OK_CANCEL_OPTION);

    if (opcion == JOptionPane.OK_OPTION) {
        Autos auto = new Autos(
            modelo.getText(),
            fabricante.getText(),
            anio.getText(),
            serie.getText(),
            motor.getText(),
            caballosFuerza.getText(),
            suspension.getText(),
            frenos.getText(),
            luces.getText(),
            retrovisores.getText()
        );
        listaAutos.add(auto);
    }
}

    static void mostrarFormularioTroca() {
        JTextField modelo = new JTextField();
        JTextField fabricante = new JTextField();
        JCheckBox cajoneraCheck = new JCheckBox("¿Tiene cajonera?");
        
        Object[] campos = {
            "Modelo:", modelo,
            "Fabricante:", fabricante,
            cajoneraCheck
        };
        
        int opcion = JOptionPane.showConfirmDialog(null, campos, "Registrar Troca", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            Trocas troca = new Trocas(modelo.getText(), fabricante.getText(), cajoneraCheck.isSelected());
            listaTrocas.add(troca);
        }
    }

    static void mostrarFormularioTrailer() {
        JTextField modelo = new JTextField();
        JTextField fabricante = new JTextField();
        JTextField frenos = new JTextField();
        JTextField luces = new JTextField();
        JTextField panel = new JTextField();
        JTextField cuplos = new JTextField();
        JTextField rodines = new JTextField();
        JTextField tanque = new JTextField();

        Object[] campos = {
            "Modelo:", modelo,
            "Fabricante:", fabricante,
            "Sistema de frenos:", frenos,
            "Luces y cableado:", luces,
            "Panel de control:", panel,
            "Cuplos y bancas:", cuplos,
            "Rodines y ejes:", rodines,
            "Tanque de diesel:", tanque
        };

        int opcion = JOptionPane.showConfirmDialog(null, campos, "Registrar Trailer", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            Trailers trailer = new Trailers(
                    modelo.getText(), 
                    fabricante.getText(), 
                    frenos.getText(), 
                    luces.getText(),
                    panel.getText(), 
                    cuplos.getText(), 
                    rodines.getText(), 
                    tanque.getText()
            );
            listaTrailers.add(trailer);
        }
    }

    static void mostrarTablaBasico() {
        JFrame frame = new JFrame("Lista Básico");
        frame.setSize(500, 300);
        String[] columnNames = {"Marca", "Nombre", "Ingredientes", "Precio", "Horno"};
        String[][] data = new String[listaBasico.size()][5];
        for (int i = 0; i < listaBasico.size(); i++) {
            Basico p = listaBasico.get(i);
            data[i][0] = p.getMarca();
            data[i][1] = p.getNombre();
            data[i][2] = p.getIngredientes();
            data[i][3] = String.valueOf(p.getPrecio());
            data[i][4] = p.getHorno();
        }
        JTable table = new JTable(data, columnNames);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }

    static void mostrarTablaRegional() {
        JFrame frame = new JFrame("Lista Regional");
        frame.setSize(500, 300);
        String[] columnNames = {"Marca", "Nombre", "Ingredientes", "Precio", "Región", "Extras"};
        String[][] data = new String[listaRegional.size()][6];
        for (int i = 0; i < listaRegional.size(); i++) {
            Regional r = listaRegional.get(i);
            data[i][0] = r.getMarca();
            data[i][1] = r.getNombre();
            data[i][2] = r.getIngredientes();
            data[i][3] = String.valueOf(r.getPrecio());
            data[i][4] = r.region;
            data[i][5] = r.extra;
        }
        JTable table = new JTable(data, columnNames);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }

    static void mostrarTablaPapitas() {
        JFrame frame = new JFrame("Lista Papitas");
        frame.setSize(500, 300);
        String[] columnNames = {"Nombre", "Marca", "Precio", "Tipo"};
        String[][] data = new String[listaPapitas.size()][4];
        for (int i = 0; i < listaPapitas.size(); i++) {
            Papitas p = listaPapitas.get(i);
            data[i][0] = p.getNombre();
            data[i][1] = p.getMarca();
            data[i][2] = String.valueOf(p.getPrecio());
            data[i][3] = p.getTipo();
        }
        JTable table = new JTable(data, columnNames);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }

    static void mostrarTablaAlcohol() {
        JFrame frame = new JFrame("Lista Alcohol");
        frame.setSize(500, 300);
        String[] columnNames = {"Nombre", "Marca", "Precio", "Gr. Alcohol", "Litros", "Edad"};
        String[][] data = new String[listaAlcohol.size()][6];
        for (int i = 0; i < listaAlcohol.size(); i++) {
            Alcohol a = listaAlcohol.get(i);
            data[i][0] = a.getNombre();
            data[i][1] = a.getMarca();
            data[i][2] = String.valueOf(a.getPrecio());
            data[i][3] = String.valueOf(a.getGr_alcohol());
            data[i][4] = String.valueOf(a.getLitros());
            data[i][5] = String.valueOf(a.getEdad());
        }
        JTable table = new JTable(data, columnNames);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }

    static void mostrarTablaAgua() {
        JFrame frame = new JFrame("Lista Agua");
        frame.setSize(600, 300);
        String[] columnNames = {"Nombre", "Marca", "Precio", "Es Agua", "Tipo Agua", "Azúcar", "Litros", "Grados"};
        String[][] data = new String[listaAgua.size()][8];
        for (int i = 0; i < listaAgua.size(); i++) {
            Agua a = listaAgua.get(i);
            data[i][0] = a.getNombre();
            data[i][1] = a.getMarca();
            data[i][2] = String.valueOf(a.getPrecio());
            data[i][3] = String.valueOf(a.isAgua());
            data[i][4] = a.getTipo_agua();
            data[i][5] = String.valueOf(a.getAzucar());
            data[i][6] = String.valueOf(a.getLitros());
            data[i][7] = String.valueOf(a.getGr());
        }
        JTable table = new JTable(data, columnNames);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }
    
    static void mostrarTablaAutos() {
    JFrame frame = new JFrame("Lista de Autos");
    frame.setSize(900, 300);

    String[] columnNames = {
        "Modelo", "Fabricante", "Año", "Serie", "Motor", "Caballos de Fuerza",
        "Suspensión", "Frenos", "Luces", "Retrovisores"
    };

    String[][] data = new String[listaAutos.size()][10];

    for (int i = 0; i < listaAutos.size(); i++) {
        Autos auto = listaAutos.get(i);
        data[i][0] = auto.getModelo(); 
        data[i][1] = auto.getFabricante(); 
        data[i][2] = auto.getAño();
        data[i][3] = auto.getSerie();
        data[i][4] = auto.getMotor();
        data[i][5] = auto.getCaballos_de_fuerza();
        data[i][6] = auto.getSuspensio(); 
        data[i][7] = auto.getFrenos();
        data[i][8] = auto.getLuces();
        data[i][9] = auto.getRetrovisores();
    }

    JTable table = new JTable(data, columnNames);
    frame.add(new JScrollPane(table));
    frame.setVisible(true);
}
    
    static void mostrarTablaTrocas() {
    JFrame frame = new JFrame("Lista de Trocas");
    frame.setSize(400, 200);

    String[] columnNames = {"Modelo", "Fabricante", "¿Tiene cajonera?"};
    String[][] data = new String[listaTrocas.size()][3];

    for (int i = 0; i < listaTrocas.size(); i++) {
        Trocas troca = listaTrocas.get(i);
        data[i][0] = troca.getModelo(); 
        data[i][1] = troca.getFabricante();  
        data[i][2] = troca.isCajonera() ? "Sí" : "No";
    }

    JTable table = new JTable(data, columnNames);
    frame.add(new JScrollPane(table));
    frame.setVisible(true);
}
    
    static void mostrarTablaTrailers() {
    JFrame frame = new JFrame("Lista Trailers");
    frame.setSize(800, 300);
    String[] columnNames = {
        "Modelo", "Fabricante", "Sistema de Frenos", "Luces y Cableado", 
        "Panel de Control", "Cuplos y Bancas", "Rodines y Ejes", "Tanque de Diesel"
    };
    String[][] data = new String[listaTrailers.size()][8];
    for (int i = 0; i < listaTrailers.size(); i++) {
        Trailers tr = listaTrailers.get(i);
        data[i][0] = tr.getModelo();
        data[i][1] = tr.getFabricante();       
        data[i][2] = tr.getSystem_frenos();
        data[i][3] = tr.getLuces_cableado();
        data[i][4] = tr.getPanel_control();
        data[i][5] = tr.getCuplos_bancas();
        data[i][6] = tr.getRodines_ejes();
        data[i][7] = tr.getTanque_disel();
    }
    JTable table = new JTable(data, columnNames);
    frame.add(new JScrollPane(table));
    frame.setVisible(true);
}



    static void mostrarTodo() {
        JFrame frame = new JFrame("Datos Capturados");
        frame.setSize(800, 600);
        frame.setLayout(new GridLayout(3, 2));

        JButton tablaBasico = new JButton("Ver Básicos");
        JButton tablaRegional = new JButton("Ver Regionales");
        JButton tablaPapitas = new JButton("Ver Papitas");
        JButton tablaAlcohol = new JButton("Ver Alcoholes");
        JButton tablaAgua = new JButton("Ver Aguas");
        JButton tablaAutos = new JButton("Ver Autos");
        JButton tablaTrocas = new JButton("Ver Trocas");
        JButton tablaTrailers = new JButton("Ver Trailers");
        JButton crearArchivo = new JButton("Crear archivo");

        tablaBasico.addActionListener(e -> mostrarTablaBasico());
        tablaRegional.addActionListener(e -> mostrarTablaRegional());
        tablaPapitas.addActionListener(e -> mostrarTablaPapitas());
        tablaAlcohol.addActionListener(e -> mostrarTablaAlcohol());
        tablaAgua.addActionListener(e -> mostrarTablaAgua());
        tablaAutos.addActionListener(e -> mostrarTablaAutos());
        tablaTrocas.addActionListener(e -> mostrarTablaTrocas());
        tablaTrailers.addActionListener(e -> mostrarTablaTrailers());
        
        crearArchivo.addActionListener(e -> {
            String ruta = "C:\\Archivos\\archivo.txt";
            writeUsingBufferedWriter(ruta);
        });
        
        
        
        frame.add(tablaBasico);
        frame.add(tablaRegional);
        frame.add(tablaPapitas);
        frame.add(tablaAlcohol);
        frame.add(tablaAgua);
        frame.add(tablaAutos);
        frame.add(tablaTrocas);
        frame.add(tablaTrailers);
        frame.add(crearArchivo);

        frame.setVisible(true);
    }
    
    static void writeUsingBufferedWriter(String ruta) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write("=== Lista de Básicos ===\n");
            for (Basico b : listaBasico) {
                writer.write(b.toString() + "\n");
            }

            writer.write("\n=== Lista de Regionales ===\n");
            for (Regional r : listaRegional) {
                writer.write(r.toString() + "\n");
            }

            writer.write("\n=== Lista de Papitas ===\n");
            for (Papitas p : listaPapitas) {
                writer.write(p.toString() + "\n");
            }

            writer.write("\n=== Lista de Alcoholes ===\n");
            for (Alcohol a : listaAlcohol) {
                writer.write(a.toString() + "\n");
            }

            writer.write("\n=== Lista de Aguas ===\n");
            for (Agua a : listaAgua) {
                writer.write(a.toString() + "\n");
            }

            writer.write("\n=== Lista de Autos ===\n");
            for (Autos a : listaAutos) {
                writer.write(a.toString() + "\n");
            }

            writer.write("\n=== Lista de Trocas ===\n");
            for (Trocas t : listaTrocas) {
                writer.write(t.toString() + "\n");
            }

            writer.write("\n=== Lista de Trailers ===\n");
            for (Trailers tr : listaTrailers) {
                writer.write(tr.toString() + "\n");
            }

            JOptionPane.showMessageDialog(null, "Se creo exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear archivo: " + e.getMessage());
        }
    }
}

