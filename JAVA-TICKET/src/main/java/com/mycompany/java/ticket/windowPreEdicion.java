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
public class windowPreEdicion {
    userBase temporal;
    
    public windowPreEdicion(){
        JFrame seleccion = new JFrame();
        seleccion.setSize(507, 446);
        seleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        seleccion.setLocationRelativeTo(null);
        seleccion.setResizable(false);
        seleccion.setLayout(null);
        
        JTextField field = new JTextField("Ingrese el username del usuario a Editar");
        field.setBounds(20, 20, 350, 25);
        seleccion.add(field);
        
        JLabel nombretag= new JLabel("Nombre: ");
        nombretag.setBounds(30, 50, 200, 80);
        nombretag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        seleccion.add(nombretag);
        
        
        JTextField ingnombre = new JTextField("");
        ingnombre.setBounds(201, 80, 170, 25);
        seleccion.add(ingnombre);
        
        
        JLabel usertag= new JLabel("Username: ");
        usertag.setBounds(30, 105, 300, 80);
        usertag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        seleccion.add(usertag);
        
        JTextField ingusername = new JTextField("");
        ingusername.setBounds(201, 135, 170, 25);
        seleccion.add(ingusername);
        
        JLabel psswrdtag= new JLabel("Contraseña: ");
        psswrdtag.setBounds(30, 160, 300, 80);
        psswrdtag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        seleccion.add(psswrdtag);
        
        JTextField ingpassword = new JTextField();
        ingpassword.setBounds(201, 190, 170, 25);
        seleccion.add(ingpassword);
        
        JLabel edadtag= new JLabel("Edad: ");
        edadtag.setBounds(30, 215, 300, 80);
        edadtag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        seleccion.add(edadtag);
        
        JTextField ingedad = new JTextField("");
        ingedad.setBounds(201, 245, 170, 25);
        seleccion.add(ingedad);
        
        
        
        
        
        JButton buscarUser = new JButton("Buscar");
        buscarUser.setBounds(380, 20, 90, 25);
        buscarUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              String usertemp = field.getText();
              
              System.out.println(usertemp);
              
              
              userBase temp= BaseDatos.getInstancia().getBaseActual().buscarMandar(usertemp);
              temporal=temp;
              if(temp!=null){
                  System.out.println("Se encontro el usuario >:D");
                  ingnombre.setText(temp.getNombre());
                  ingusername.setText(temp.getUsername());
                  ingpassword.setText(temp.getPassword());             
                  ingedad.setText(String.valueOf(temp.getEdad()));
              }else{
                  System.out.println("No se encontró ningun usuario");
              }  
          }
                    
        });
        
        
        
        
        
        
        
        JButton editar = new JButton("Editar");
        editar.setBounds(90, 300, 130, 45);
        editar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              
              int opcion=JOptionPane.showConfirmDialog(seleccion, "¿Desea realizar la accion de editar?","Confirmacion", JOptionPane.YES_NO_OPTION);
              
              if(opcion==JOptionPane.YES_OPTION){
                  temporal.setNombre(ingnombre.getText());
                  temporal.setUsername(ingusername.getText());
                  temporal.setPassword(ingpassword.getText());
                  temporal.setEdad(Integer.parseInt(ingedad.getText()));
                  
                  System.out.println("Datos actualizados:");
                  System.out.println(temporal.getNombre());
                  System.out.println(temporal.getUsername());
                  System.out.println(temporal.getPassword());
                  System.out.println(temporal.getEdad());
                  
              }else if(opcion==JOptionPane.NO_OPTION){
                  System.out.println("No se realiza nada");
              }
              
              
          }
                    
        });
        
        
        
        
        
        
        JButton regresar = new JButton("Regresar");
        regresar.setBounds(250, 300, 100, 45);
        regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              seleccion.dispose();
              screenSubMenuUsers menu = new screenSubMenuUsers();
              
          }
                    
        });
        
        seleccion.add(editar);
        seleccion.add(buscarUser);
        seleccion.add(regresar);
        seleccion.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        windowPreEdicion ventana = new windowPreEdicion();
        
    }
    
    
    
}
