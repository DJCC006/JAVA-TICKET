/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public class BaseDatosEventos {
    private static eventoDataBase BaseDatosEvents;
    private static BaseDatosEventos instancia;
    
    
    private BaseDatosEventos(){
        //no hay nada aqui jeje
    }
    
    public static BaseDatosEventos getInstancia(){
        if(instancia==null){
            instancia = new BaseDatosEventos();
        }
        return instancia;
    }
    
    
    public void setBasedeEventos(eventoDataBase BaseDatos){
        BaseDatosEvents =BaseDatos;
    }
    
    public eventoDataBase getBaseActual(){
        return BaseDatosEvents;
    }
    
    
}
