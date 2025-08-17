/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;
import com.mycompany.java.ticket.userBase.TypUsers;
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
        
        
        
        String[] items= {"ADMINISTRADOR", "CONTENIDOS", "LIMITADO"};
        JComboBox<String> tipos = new JComboBox<>(items);
        tipos.setBounds(180, 100, 129, 22);
        seleccion.add(tipos);
       // seleccion.pack();
        tipos.setVisible(true);
        
        
        
        
        JButton crearUser = new JButton("Crear Usuario");
        crearUser.setBounds(90, 300, 130, 45);
        crearUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              String typeString = (String) tipos.getSelectedItem();
              System.out.println(typeString);
              
              if(typeString.equals("ADMINISTRADOR")){
                  userBase newAdmin = new userAdministrador();//Creo usuario
                  TypUsers tipoo= newAdmin.getTipo();//Obtengo el tipo
                  newAdmin.setTipo(tipoo);//Se le establece al nuevo objeto el tipo de tipo
                  BaseDatos.getInstancia().getBaseActual().UserBank.add(newAdmin);
                  System.out.println("Se ha agregado un nuevo usuario de tipo administrador");
              }else if(typeString.equals("CONTENIDOS")){
                  userBase newContenidos = new userContenidos();
                  TypUsers tipoo= newContenidos.getTipo();
                  newContenidos.setTipo(tipoo);
                  BaseDatos.getInstancia().getBaseActual().UserBank.add(newContenidos);
                  System.out.println("Se hga agregado un nuevo usuario de tipo contenidos");
              }else if(typeString.equals("LIMITADO")){
                  userBase newLimited = new userLimitado();
                  TypUsers tipoo= newLimited.getTipo();
                  newLimited.setTipo(tipoo);
                  BaseDatos.getInstancia().getBaseActual().UserBank.add(newLimited);
                  System.out.println("Se ha agregado un nuevo usuario de tipo limitado");
              }
              
              windowCrearUser principal = new windowCrearUser();
              seleccion.dispose();
              
              
          }
                    
        });
        
        seleccion.add(crearUser);
        
        
        
        
        
        
        
        JButton regresar = new JButton("Regresar");
        regresar.setBounds(260, 300, 100, 45);
        regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screenMenu menu = new screenMenu();
              seleccion.dispose();
          }
                    
        });
        
        seleccion.add(regresar);
        seleccion.setVisible(true);
    }
    
    public static void main(String[] args) {
        windowPostUser nuevoUser= new windowPostUser();
    }
}
