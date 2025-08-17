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
public class windowPreEventos {
    userAdministrador temp1;
    userContenidos temp2;
    
    public windowPreEventos(){
        JFrame seleccion = new JFrame();
        seleccion.setSize(507, 446);
        seleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        seleccion.setLocationRelativeTo(null);
        seleccion.setResizable(false);
        seleccion.setLayout(null);
        
        JLabel titulo= new JLabel("Seleccione el tipo de Evento a crear");
        titulo.setBounds(80, 10, 350, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        seleccion.add(titulo);
        
        
        
        String[] items= {"DEPORTIVO", "MUSICAL", "RELIGIOSO"};
        JComboBox<String> tipos = new JComboBox<>(items);
        tipos.setBounds(180, 100, 129, 22);
        seleccion.add(tipos);
       
        
        
        JButton crearEvento = new JButton("Crear Evento");
        crearEvento.setBounds(90, 300, 130, 45);
        crearEvento.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              String typeString = (String) tipos.getSelectedItem();
              System.out.println(typeString);
              
              if(typeString.equals("DEPORTIVO")){
                  userBase temporal = Sesion.getInstancia().getUsuarioActual(); //Obtencion del tipo de usuario
                  TypUsers type = temporal.getTipo();
                  
                  if(type.equals(type.ADMINISTRADOR)){
                      temp1= (userAdministrador) temporal;//Encapsulamiento para poder agregar el evento tambien al registro del usuario
                      eventoBase newDeportivo = new eventoDeportivo();
                      BaseDatosEventos.getInstancia().getBaseActual().EventBank.add(newDeportivo);
                      temp1.registroEventos.add(newDeportivo);
                      System.out.println("Se ha creado un nuevo evento deportivo");
                  }else if(type.equals(type.CONTENIDOS)){
                      temp2 = (userContenidos) temporal;
                      eventoBase newDeportivo = new eventoDeportivo();
                      BaseDatosEventos.getInstancia().getBaseActual().EventBank.add(newDeportivo);
                      temp2.registroEventos.add(newDeportivo);
                      System.out.println("Se ha creado un nuevo evento deportivo");
                  }
                  
              }else if(typeString.equals("MUSICAL")){
                  userBase temporal = Sesion.getInstancia().getUsuarioActual(); //Obtencion del tipo de usuario
                  TypUsers type = temporal.getTipo();
                  
                  if(type.equals(type.ADMINISTRADOR)){
                      temp1= (userAdministrador) temporal;//Encapsulamiento para poder agregar el evento tambien al registro del usuario
                      eventoBase newMusical = new eventoMusical();
                      BaseDatosEventos.getInstancia().getBaseActual().EventBank.add(newMusical);
                      temp1.registroEventos.add(newMusical);
                      System.out.println("Se ha creado un nuevo evento musical");
                  }else if(type.equals(type.CONTENIDOS)){
                      temp2 = (userContenidos) temporal;
                      eventoBase newMusical = new eventoMusical();
                      BaseDatosEventos.getInstancia().getBaseActual().EventBank.add(newMusical);
                      temp2.registroEventos.add(newMusical);
                      System.out.println("Se ha creado un nuevo evento musical");
                  }
                  
              }else if(typeString.equals("RELIGIOSO")){
                  userBase temporal = Sesion.getInstancia().getUsuarioActual(); //Obtencion del tipo de usuario
                  TypUsers type = temporal.getTipo();
                  
                  if(type.equals(type.ADMINISTRADOR)){
                      temp1= (userAdministrador) temporal;//Encapsulamiento para poder agregar el evento tambien al registro del usuario
                      eventoBase newReligioso = new eventoReligioso();
                      BaseDatosEventos.getInstancia().getBaseActual().EventBank.add(newReligioso);
                      temp1.registroEventos.add(newReligioso);
                      System.out.println("Se ha creado un nuevo evento religioso");
                  }else if(type.equals(type.CONTENIDOS)){
                      temp2 = (userContenidos) temporal;
                      eventoBase newReligioso = new eventoReligioso();
                      BaseDatosEventos.getInstancia().getBaseActual().EventBank.add(newReligioso);
                      temp2.registroEventos.add(newReligioso);
                      System.out.println("Se ha creado un nuevo evento religioso");
                  }
              }
              
              windowCrearEvento ventana = new windowCrearEvento();
              seleccion.dispose();
              
              
          }
                    
        });
        
     
        
        
        
        JButton regresar = new JButton("Regresar");
        regresar.setBounds(260, 300, 100, 45);
        regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screenMenu menu = new screenMenu();
              seleccion.dispose();
          }
                    
        });
        
        
        seleccion.add(crearEvento);
        seleccion.add(regresar);
        seleccion.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        windowPreEventos ventana = new windowPreEventos();
        
    }
}
