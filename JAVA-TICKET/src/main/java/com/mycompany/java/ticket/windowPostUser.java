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
public class windowPostUser {
   
    public windowPostUser(){
        JFrame seleccion = new JFrame();
        seleccion.setSize(507, 446);
        seleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        seleccion.setLocationRelativeTo(null);
        seleccion.setResizable(false);
        seleccion.setLayout(null);
        
        JLabel titulo= new JLabel("Seleccione el tipo de Usuario a crear");
        titulo.setBounds(80, 10, 350, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        seleccion.add(titulo);
        
        
        
        seleccion.setVisible(true);
    }
    
    public static void main(String[] args) {
        windowPostUser nuevoUser= new windowPostUser();
    }
}
