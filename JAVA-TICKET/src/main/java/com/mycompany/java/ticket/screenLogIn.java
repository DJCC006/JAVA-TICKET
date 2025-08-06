/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;
import java.awt.Frame;
import  javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;

/**
 *
 * @author David
 */
public class screenLogIn {
    
    public screenLogIn(){
        JFrame LogIn = new JFrame();
        LogIn.setSize(351, 478);
        LogIn.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        LogIn.setLocationRelativeTo(null);
        LogIn.setResizable(false);
        LogIn.setLayout(null);
       
        JLabel titulo= new JLabel("INICIO DE SESION");
        titulo.setBounds(90, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        LogIn.add(titulo);
        
        
        JTextField ingresoUsuario = new JTextField("Ingrese el nombre de Usuario");
        ingresoUsuario.setBounds(85, 125, 170, 25);
        JTextField ingresoContra = new JTextField("Ingrese Contrasenia");
        ingresoContra.setBounds(85, 160, 170, 25);
        LogIn.add(ingresoUsuario);
        LogIn.add(ingresoContra);
        
        JButton ingresar = new JButton("Ingresar");
        ingresar.setBounds(120, 190, 100, 45);
        ingresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              String name =ingresoUsuario.getText();
              String password = ingresoContra.getText();
              
              
              userBase temporal= BaseDatos.getInstancia().getBaseActual().buscarMandar(name);
              if(temporal!= null){
                  String actualname= temporal.getNombre();
                  System.out.println(actualname);
                  if(temporal.getPassword().equals(password)){
                      System.out.println("INICIO DE SESION EXITOSO");
                      screenMenu Menu = new screenMenu();
                      LogIn.dispose();
                  }else{
                      System.out.println("Contraseña incorrecta");
                  }
              }else{
                  System.out.println("No existe el usuario");
              }
              
              
              
              System.out.println("Se ejecuta el proceso de hacer Log In");
          }
                    
        });
        LogIn.add(ingresar);
        
        JButton regresar = new JButton("Regresar");
        regresar.setBounds(120, 260, 100, 45);
        regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
            screenInicial inicio = new screenInicial();
            LogIn.dispose();
          }
                    
        });
        
        LogIn.add(regresar);
        LogIn.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        screenLogIn LogIn = new screenLogIn();
    }
}
