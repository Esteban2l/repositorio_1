package org.example.Vista;

import org.example.Conection.Conector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnIngresar;
    private JPanel panelMain;
    private JLabel bienvenido;
    private JLabel btnRegistrarse;

    public Login() {
        // Inicializa el panel principal y configura el diseño
        panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

        // Componentes de la interfaz de usuario
        txtUsuario = new JTextField(20);
        txtPassword = new JPasswordField(20);
        btnIngresar = new JButton("Ingresar");

        // Configura el botón de ingreso
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conector c = new Conector();
                c.conectar();
            }
        });

        // Agrega componentes al panel principal
        panelMain.add(new JLabel("Usuario:"));
        panelMain.add(txtUsuario);
        panelMain.add(new JLabel("Contraseña:"));
        panelMain.add(txtPassword);
        panelMain.add(btnIngresar);

        // Agrega los nuevos JLabel al panel principal
        bienvenido = new JLabel("¡Bienvenido!");
        panelMain.add(bienvenido);

        btnRegistrarse = new JLabel("Registrarse");
        panelMain.add(btnRegistrarse);

        // Establece el panel principal como el contenido de la ventana
        setContentPane(panelMain);

        // Configuración de la ventana
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // Ajusta automáticamente el tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }
}
