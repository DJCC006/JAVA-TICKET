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
public class windowCrearUser {
        boolean ver1=false;//verificador de length minimo 8
        boolean ver2=false; //Verificar si tiene un numero en la contra
        boolean ver3=false; //verificador si tiene una letra
        boolean ver4=false; //verificador si tiene un simbolo
        boolean ver5=false; //verificador si no ingresan un espacio en blanco
    public windowCrearUser(){
  
        
        JFrame crUser = new JFrame();
        crUser.setSize(507, 446);
        crUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crUser.setLocationRelativeTo(null);
        crUser.setResizable(false);
        crUser.setLayout(null);
        
        
        //agregar todo esto dentro de un try-catch para controlar los inputs
        
        JLabel titulo= new JLabel("Creacion de Usuarios");
        titulo.setBounds(150, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        crUser.add(titulo);
        
        
        JLabel nombretag= new JLabel("Ingrese el nombre: ");
        nombretag.setBounds(30, 50, 200, 80);
        nombretag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        crUser.add(nombretag);
        
        
        JTextField ingnombre = new JTextField("nomen ici");
        ingnombre.setBounds(201, 80, 170, 25);
        crUser.add(ingnombre);
        
        
        JLabel usertag= new JLabel("Ingrese el username: ");
        usertag.setBounds(30, 105, 300, 80);
        usertag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        crUser.add(usertag);
        
        JTextField ingusername = new JTextField("username ici");
        ingusername.setBounds(201, 135, 170, 25);
        crUser.add(ingusername);
        
        JLabel psswrdtag= new JLabel("Ingrese su contraseña: ");
        psswrdtag.setBounds(30, 160, 300, 80);
        psswrdtag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        crUser.add(psswrdtag);
        
        JTextField ingpassword = new JTextField();
        ingpassword.setBounds(201, 190, 170, 25);
        crUser.add(ingpassword);
        
        JLabel edadtag= new JLabel("Ingrese su edad: ");
        edadtag.setBounds(30, 215, 300, 80);
        edadtag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        crUser.add(edadtag);
        
        JTextField ingedad = new JTextField("edad ici");
        ingedad.setBounds(201, 245, 170, 25);
        crUser.add(ingedad);
        
        
        JButton crearUser = new JButton("Crear Usuario");
        crearUser.setBounds(90, 300, 130, 45);
        crearUser.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              
              
              
              
              String passCheck= ingpassword.getText();
              int length =passCheck.length();
              
              //Seccion de recolectar y analizar la contrasenia---
              if(length>=8){//verificar el length
                  ver1=true;
              }
              
              for(int i=0; i<length; i++){
                  char charCheck=passCheck.charAt(i);
                  
                  if(Character.isWhitespace(charCheck)){//verificar si no es un espacio en blanco
                      ver5=true;
                  }else if(Character.isDigit(charCheck)){//verificador si es un numero
                      ver2=true;
                  }else if(Character.isAlphabetic(charCheck)){//verificador si es una letra
                      ver3=true;
                  }else if(!Character.isLetterOrDigit(charCheck)){//verificador si es un simbolo especial
                      ver4=true;
                  }
              }
              
              
              System.out.println(ver2);
              System.out.println(ver3);
              System.out.println(ver4);
              
              
              //Mensajes dependiendo de los verificadores (filtros)
              System.out.println(length);
              System.out.println("ver5 "+ver5);
              
              if(ver1==false){
                  JOptionPane.showMessageDialog(crUser, "Su contraseña debe ser mayor a 8 digitos");
              }else{
                  if(ver5==true){
                      JOptionPane.showMessageDialog(crUser, "La contraseña no puede tener espacios en blanco");
                      ver1=false;
                      ver2=false;
                      ver3=false;
                      ver4=false;
                      ver5=false;
                  }else{
                      if(ver2==false){
                          JOptionPane.showMessageDialog(crUser,"La contraseña debe tener por lo menos un numero");
                      }
                      if(ver3==false){
                          JOptionPane.showMessageDialog(crUser, "La contraseña debe tener por lo menos una letra");
                      }
                      if(ver4==false){
                          JOptionPane.showMessageDialog(crUser, "La contrseña debe tener por lo menos un simbolo especial");
                      }
                      
                      if(ver2==true && ver3==true && ver4==true){
                          System.out.println("Se procede a guardar la info del usuario");
                          //int ubicacion= BaseDatos.getInstancia().getBaseActual().UserBank.size()-1;
                          String name=ingnombre.getText();
                          String username=ingusername.getText();
                          String pass=ingpassword.getText();
                          int age= Integer.parseInt(ingedad.getText());
                          
                          userBase reciente = BaseDatos.getInstancia().getBaseActual().UserBank.getLast();
                          reciente.setNombre(name);
                          reciente.setUsername(username);
                          reciente.setPassword(pass);
                          reciente.setEdad(age);
                          
                          
                          System.out.println(reciente.getNombre());
                          System.out.println(reciente.getEdad());
                          System.out.println(reciente.getUsername());
                          System.out.println(reciente.getTipo());
                          
                          ingusername.setText("");
                          ingnombre.setText("");
                          ingpassword.setText("");
                          ingedad.setText("");
                          
                      }else{
                          ver1=false;
                          ver2=false;
                          ver3=false;
                          ver4=false;
                          ver5=false;
                      }
                  }
              }  
          }
                    
        });
        
        
        JButton regresar = new JButton("Regresar");
        regresar.setBounds(250, 300, 100, 45);
        regresar.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              crUser.dispose();
              screenSubMenuUsers menu = new screenSubMenuUsers();
              
          }
                    
        });
        
        crUser.add(regresar);
        crUser.add(crearUser);
        
        crUser.setVisible(true);
        
        
        
        
    }
    
    public static void main(String[] args) {
        windowCrearUser crUsuarios = new windowCrearUser();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //400, 446
}
