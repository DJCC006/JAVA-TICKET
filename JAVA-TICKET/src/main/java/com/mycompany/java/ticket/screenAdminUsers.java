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
public class screenAdminUsers {
    
    public screenAdminUsers(){
        JFrame AdminUsers = new JFrame();
        AdminUsers.setSize(351, 478);
        AdminUsers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AdminUsers.setLocationRelativeTo(null);
        AdminUsers.setResizable(false);
        AdminUsers.setLayout(null);
        
        JLabel titulo= new JLabel("Administrador de Usuarios");
        titulo.setBounds(50, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        AdminUsers.add(titulo);
        
        
        //Botones here
        JButton crearUser = new JButton("Crear Usuario");
        crearUser.setBounds(85, 100, 200, 45);
        crearUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Se ejecuta el proceso A");
          }
                    
        });
        
        JButton editarUser = new JButton("Editar Usuario");
        editarUser.setBounds(85, 150, 200, 45);
        editarUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Se ejecuta el proceso B");
          }
                    
        });
        
        JButton borrarUser = new JButton("Borrar Usuario");
        borrarUser.setBounds(85, 200, 200, 45);
        borrarUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              windowBorrarUser ventana = new windowBorrarUser();
              AdminUsers.dispose();
          }
                    
        });
        
        JButton regresar = new JButton("Regresar");
        regresar.setBounds(85, 250, 200, 45);
        regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("vuelve a menu principal");
              screenMenu menu = new screenMenu();
              AdminUsers.dispose();
          }
                    
        });
        
        AdminUsers.add(crearUser);
        AdminUsers.add(editarUser);
        AdminUsers.add(borrarUser);
        AdminUsers.add(regresar);
        AdminUsers.setVisible(true);
        
        
        
    }
    
    public static void main(String[] args) {
        screenAdminUsers adminUsers= new screenAdminUsers();
    }
  
}
