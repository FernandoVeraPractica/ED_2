/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseunoabril;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author artur
 */
public class inicioSesion extends JFrame implements ActionListener {
    private JTextField campoUsuario;
    private JPasswordField campoContra;
    private JButton botonInicioSesion;
    
    public inicioSesion(){
        setTitle("Login");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /*
        establece la acción que ocurrirá cuando el usuario cierre la ventana de la aplicación. En este caso, 
        EXIT_ON_CLOSE es una constante definida en la clase JFrame que indica que la aplicación 
        debe salir (terminar) cuando el usuario cierre la ventana principal.
        */
        setLocationRelativeTo(null);
        /*
        establece la posición inicial de la ventana en la pantalla. En este caso, al pasar null como argumento, 
        la ventana se posicionará en el centro de la pantalla en el momento de su aparición.
        */
        
        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        /*
        En un GridLayout, los componentes se colocan en una cuadrícula regular de filas y columnas. 
        En este caso, al especificar 3 para el número de filas y 2 para el número de columnas, 
        el panel se dividirá en tres filas y dos columnas, y los componentes se distribuirán en 
        esta cuadrícula.
        */
        
        JLabel usuarioLabel = new JLabel("User Name:");
        JLabel contraLabel = new JLabel("Password:");
        campoUsuario = new JTextField();
        campoContra = new JPasswordField();
        botonInicioSesion = new JButton("Enter");
        botonInicioSesion.addActionListener(this);
        
        // Agregar componentes al panel
        panel.add(usuarioLabel);
        panel.add(campoUsuario);
        panel.add(contraLabel);
        panel.add(campoContra);
        panel.add(botonInicioSesion);

        // Agregar panel al frame
        add(panel);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonInicioSesion) {
            String usuario = campoUsuario.getText();
            String contraseña = new String(campoContra.getPassword());

            // Verificar el usuario y la contraseña
            if (usuario.equals("admin") && contraseña.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Correct Login");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect: wrong password or user name");
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }
    
   
}
