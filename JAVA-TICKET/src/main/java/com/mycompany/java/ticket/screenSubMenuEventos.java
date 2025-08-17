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
public class screenSubMenuEventos {
    public screenSubMenuEventos(){
        JFrame userPage = new JFrame();
        userPage.setSize(351, 478);
        userPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userPage.setLocationRelativeTo(null);
        userPage.setResizable(false);
        userPage.setLayout(null);
        
        JLabel titulo= new JLabel("Administracion de Eventos");
        titulo.setBounds(65, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        userPage.add(titulo);
        
        JButton crearEvento = new JButton("Evento Nuevo");
        crearEvento.setBounds(70, 60, 200, 45);
        crearEvento.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Proceso A");
          }
                    
        });
        
        
        JButton editarEvento = new JButton("Editar Evento");
        editarEvento.setBounds(70, 120, 200, 45);
        editarEvento.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Proceso B");
          }
                    
        });
        
        JButton borrarEvento = new JButton("Borrar Evento");
        borrarEvento.setBounds(70, 180, 200, 45);
        borrarEvento.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Proceso C");
          }
                    
        });
        
        
        JButton verEvento = new JButton("Ver Evento");
        verEvento.setBounds(70, 240, 200, 45);
        verEvento.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Proceso D");
          }
                    
        });
        
        
         JButton regresar = new JButton("Regresar");
        regresar.setBounds(70, 300, 200, 45);
        regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screenMenu menu = new screenMenu();
              userPage.dispose();
          }
                    
        });
        
        userPage.add(crearEvento);
        userPage.add(editarEvento);
        userPage.add(borrarEvento);
        userPage.add(verEvento);
        userPage.add(regresar);
        userPage.setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        screenSubMenuEventos ventana = new screenSubMenuEventos();
    }
    
    
}
