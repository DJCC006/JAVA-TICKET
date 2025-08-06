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
public class screenInicial {
    
    public screenInicial(){
        JFrame Inicio = new JFrame();
        Inicio.setSize(351, 478);
        Inicio.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Inicio.setLocationRelativeTo(null);
        Inicio.setResizable(false);
        Inicio.setLayout(null);
        
        JLabel titulo= new JLabel("JAVA TICKET");
        titulo.setBounds(115, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        Inicio.add(titulo);
        
        JButton log = new JButton("Log In");
        log.setBounds(120, 150, 80, 45);
        log.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              System.out.println("Se entra a la pagina de log in");
              screenLogIn logIn= new screenLogIn();
              Inicio.dispose();
          }
                    
        });
         Inicio.add(log);
        
         
        JButton salir = new JButton("Salir");
        salir.setBounds(120, 250, 80, 45);
        salir.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              Inicio.dispose();
          }
                    
        });
        Inicio.add(salir);
        
        Inicio.setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        screenInicial inicio = new screenInicial();
        
    }
}
