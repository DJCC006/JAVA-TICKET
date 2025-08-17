/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;
import com.toedter.calendar.JDateChooser;
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
public class windowCEventoM {
    
    public windowCEventoM(){
        
        //Detalles generales---------------
        JFrame crEvent = new JFrame();
        crEvent.setSize(690, 490);
        crEvent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crEvent.setLocationRelativeTo(null);
        crEvent.setResizable(false);
        crEvent.setLayout(null);
        
        
        JLabel titulo= new JLabel("Nuevo Evento");
        titulo.setBounds(206, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        crEvent.add(titulo);
        
        
        JLabel codetag= new JLabel("Codigo de Evento: ");
        codetag.setBounds(30, 50, 200, 80);
        codetag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        crEvent.add(codetag);
        
        
        JTextField ingcode = new JTextField("code ici");
        ingcode.setBounds(150, 80, 150, 25);
        crEvent.add(ingcode);
        
        
        JLabel nametag= new JLabel("Nombre Evento: ");
        nametag.setBounds(30, 105, 300, 80);
        nametag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        crEvent.add(nametag);
        
        JTextField ingname = new JTextField("name ici");
        ingname.setBounds(150, 135, 150, 25);
        crEvent.add(ingname);
        
        
        
        JLabel datetag= new JLabel("Fecha Evento: ");
        datetag.setBounds(330, 50, 300, 80);
        datetag.setFont(new Font("Segoe UI",Font.ITALIC, 15));
        crEvent.add(datetag);
        
        JDateChooser calendario = new JDateChooser();
        calendario.setBounds(430, 80, 150, 25);
        crEvent.add(calendario);
        
        JLabel rentatag= new JLabel("Monto de Renta: ");
        rentatag.setBounds(330, 105, 300, 80);
        rentatag.setFont(new Font("Segoe UI",Font.ITALIC, 13));
        crEvent.add(rentatag);
        
        
        JTextField ingrenta = new JTextField("renta ici");
        ingrenta.setBounds(430, 135, 150, 25);
        crEvent.add(ingrenta);
        
        
        //Detalles especificos----------------
        JLabel cantidadtag= new JLabel("Cantidad Personas: ");
        cantidadtag.setBounds(30, 165, 300, 80);
        cantidadtag.setFont(new Font("Segoe UI",Font.ITALIC, 13));
        crEvent.add(cantidadtag);
        
        JTextField ingcantidad = new JTextField("cantidad ici");
        ingcantidad.setBounds(150, 195, 150, 25);
        crEvent.add(ingcantidad);
        
        JLabel tipotag= new JLabel("Tipo Musical: ");
        tipotag.setBounds(330, 165, 300, 80);
        tipotag.setFont(new Font("Segoe UI",Font.ITALIC, 14));
        crEvent.add(tipotag);
        
        String[] items= {"POP", "ROCK", "CLASSICA", "RAP", "REGGEATON", "OTRO"};
        JComboBox<String> tipos = new JComboBox<>(items);
        tipos.setBounds(430, 195, 150, 25);
        crEvent.add(tipos);
       
        //POP, ROCK, CLASSICA, RAP, REGGEATON, OTRO
        
        JLabel desctag= new JLabel("Descripcion de Evento: ");
        desctag.setBounds(30, 225, 300, 80);
        desctag.setFont(new Font("Segoe UI",Font.ITALIC, 13));
        crEvent.add(desctag);
        
        JTextField ingdesc = new JTextField("Descripcion del evento");
        ingdesc.setBounds(160, 255, 385, 25);
        crEvent.add(ingdesc);
        
        crEvent.setVisible(true);
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        windowCEventoM ventana = new windowCEventoM();
    }
    
    
    
}
