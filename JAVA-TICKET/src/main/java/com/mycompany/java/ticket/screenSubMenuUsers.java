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
public class screenSubMenuUsers {
    
    public static void main(String[] args) {
        JFrame userPage = new JFrame();
        userPage.setSize(351, 478);
        userPage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        userPage.setLocationRelativeTo(null);
        userPage.setResizable(false);
        userPage.setLayout(null);
        
        JLabel titulo= new JLabel("MENU PRINCIPAL");
        titulo.setBounds(90, 0, 300, 80);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        userPage.add(titulo);
    }
    
}
