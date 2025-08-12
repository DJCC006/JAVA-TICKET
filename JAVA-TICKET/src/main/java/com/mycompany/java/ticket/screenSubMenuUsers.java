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
public class screenSubMenuUsers {
    
    public screenSubMenuUsers(){
        JFrame userPage = new JFrame();
        userPage.setSize(351, 478);
        userPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userPage.setLocationRelativeTo(null);
        userPage.setResizable(false);
        userPage.setLayout(null);
        
        JLabel titulo= new JLabel("Administracion de Usuarios");
        titulo.setBounds(65, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        userPage.add(titulo);
        
        JButton crearUser = new JButton("Usuario Nuevo");
        crearUser.setBounds(70, 60, 200, 45);
        crearUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              windowPostUser seleccion = new windowPostUser();
              userPage.dispose();;
          }
                    
        });
        
        
        JButton editarUser = new JButton("Editar Usuario");
        editarUser.setBounds(70, 120, 200, 45);
        editarUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              windowPreEdicion ventana= new windowPreEdicion();
              userPage.dispose();
          }
                    
        });
        
        JButton borrarUser = new JButton("Borrar Usuario");
        borrarUser.setBounds(70, 180, 200, 45);
        borrarUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Se ejecuta el proceso C");
          }
                    
        });
        
         JButton regresar = new JButton("Regresar");
        regresar.setBounds(70, 240, 200, 45);
        regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screenMenu menu = new screenMenu();
              userPage.dispose();
          }
                    
        });
        
        
        
        userPage.add(regresar);
        userPage.add(borrarUser);
        userPage.add(editarUser);
        userPage.add(crearUser);
        
        userPage.setVisible(true);
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        screenSubMenuUsers subVentana = new screenSubMenuUsers();
        
    }
    
}
