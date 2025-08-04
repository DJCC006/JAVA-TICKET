/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;
import java.awt.FlowLayout;
import java.awt.Frame;
import  javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Point;
/**
 *
 * @author David
 */
public class ventanaTesting {
    //Creacion de ventana 
    public static void main(String[] args) {
        //Se crea el frame, se pone el size, se establece el close operation y se hace visible
        JFrame fraime = new JFrame("XD");
        fraime.setSize(1000, 800);
        fraime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fraime.setLocationRelativeTo(null);
        fraime.setResizable(false);
        fraime.setLayout(null);
        
        //Creacion de botones para testear
        JButton BAdmin = new JButton("Crear Admin");
        BAdmin.setBounds(800, 600, 200, 100);
        BAdmin.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                userAdministrador newAdmin = new userAdministrador();
                newAdmin.setNombre("Carlitos");
                newAdmin.setEdad(10);
                newAdmin.setUsername("CarlitosGamer");
                newAdmin.setPassword("supersecreto");
                System.out.println("Se ha creado un usuario de manera exitosa");
            }
                    
        });
        
        fraime.add(BAdmin);
  
        
        //Creacion de textfield para obtener usuario
        JTextField textfield = new JTextField("Ingrese el nombre de usuario");
        textfield.setBounds(600, 200, 170, 45);
        //TextField para contrasenia
        JTextField textcontra = new JTextField("Ingrese la contrasenia");
        textcontra.setBounds(600, 250, 170, 45);
        fraime.add(textcontra);
        fraime.add(textfield);        
        fraime.setVisible(true);
        
       
        
    }
    
    

    
}
