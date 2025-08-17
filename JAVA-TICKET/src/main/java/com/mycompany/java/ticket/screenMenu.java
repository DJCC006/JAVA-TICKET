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
public class screenMenu {
    
    public screenMenu(){
        JFrame Menu = new JFrame();
        Menu.setSize(351, 478);
        Menu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Menu.setLocationRelativeTo(null);
        Menu.setResizable(false);
        Menu.setLayout(null);
        
        JLabel titulo= new JLabel("MENU PRINCIPAL");
        titulo.setBounds(90, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Menu.add(titulo);
        
        
        
        
        //Botones Here
        JButton AdminEventos = new JButton("Administracion de Eventos");
        AdminEventos.setBounds(85, 100, 200, 45);
        AdminEventos.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screenSubMenuEventos ventana = new screenSubMenuEventos();
              Menu.dispose();
          }
                    
        });
        
        JButton AdminUsuarios = new JButton("Administracion de Usuarios");
        AdminUsuarios.setBounds(85, 150, 200, 45);
        AdminUsuarios.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screenSubMenuUsers previo = new screenSubMenuUsers();
              Menu.dispose();
              
          }
                    
        });
        
        
        
        JButton Reportes = new JButton("Reportes");
        Reportes.setBounds(85, 200, 200, 45);
        Reportes.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Se ejecuta el proceso C");
          }
                    
        });
        
        JButton Regresar = new JButton("Log Out");
        Regresar.setBounds(85, 250, 200, 45);
        Regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screenInicial inicial = new screenInicial();
              Menu.dispose();
          }
                    
        });
        
        
        Menu.add(AdminEventos);
        Menu.add(AdminUsuarios);
        Menu.add(Reportes);
        Menu.add(Regresar);
        
        Menu.setVisible(true);
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        screenMenu menu = new screenMenu();
    }
    
    
}
