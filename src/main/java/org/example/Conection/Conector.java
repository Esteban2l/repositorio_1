package org.example.Conection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    Connection con;
    public void conectar(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/primerproyecto", "root", "shadow");
            JOptionPane.showMessageDialog(null, "Conexión a la base de datos exitosa");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        }
    }

}
