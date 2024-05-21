/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.labrary.control;

import static com.labrary.control.ConnectionBase.Author;
import com.labrary.vista.AddAuthor;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConnectionBase {

    public static String[] Author = {"Miguel de Cervantes", "Gabriel García Márquez", "George Orwell"};
    public static String[] names = {"El Quijote", "Cien Años de Soledad", "1984"};
    public static int[] pages = {863, 471, 328};

    DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(Author);
    public static DefaultTableModel model;

    static {
       
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }
        };
        model.addColumn("Nombre");
        model.addColumn("Autor");
        model.addColumn("Páginas");

        // Agregar filas al modelo de la tabla
        for (int i = 0; i < names.length; i++) {
            model.addRow(new Object[]{names[i], Author[i], pages[i]});
        }

    }

}
