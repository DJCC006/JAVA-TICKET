/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public class Sesion {
    private static Sesion instancia;
    private userBase UserLogged; 
    
    private Sesion(){};
    
    public static Sesion getInstancia(){
        if(instancia==null){
            instancia = new Sesion();
        }
        return instancia;
    }
    
    public void setUsuarioActual(userBase Usuario){
        this.UserLogged=Usuario;
    }
    
    public userBase getUsuarioActual(){
        return UserLogged;
    }
    
    
}
