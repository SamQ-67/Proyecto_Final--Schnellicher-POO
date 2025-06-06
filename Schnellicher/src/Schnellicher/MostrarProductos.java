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

public class MostrarProductos extends JFrame {
    private JComboBox<String> filtroCombo;
    private JTextArea resultadoArea;

    public MostrarProductos() {
        setTitle("Productos Registrados");
        setSize(500, 400);
        setLayout(new BorderLayout());

        filtroCombo = new JComboBox<>(new String[] {
            "Todos", "Basico", "Pan Dulce", "Regional", "Relleno", "Salado"
        });
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(resultadoArea);

        filtroCombo.addActionListener(e -> actualizarVista());

        add(filtroCombo, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);

        actualizarVista();  // mostrara todos por defecto asi que pongan sus clases en orden
    }

    private void actualizarVista() {
        StringBuilder sb = new StringBuilder();
        String seleccion = (String) filtroCombo.getSelectedItem();

        switch (seleccion) {
            case "Basico":
                for (Basico b : RegistroProductos.basicos) {
                    sb.append(b).append("\n");
                }
                break;
            case "Regional":
                for (Regional r : RegistroProductos.regionales) {
                    sb.append(r).append("\n");
                }
                break;
            case "Todos":
                for (Basico b : RegistroProductos.basicos)
                    sb.append("Basico: ").append(b).append("\n");
                for (Regional r : RegistroProductos.regionales)
                    sb.append("Regional: ").append(r).append("\n");
                break;
        }

        resultadoArea.setText(sb.toString());
    }
}

