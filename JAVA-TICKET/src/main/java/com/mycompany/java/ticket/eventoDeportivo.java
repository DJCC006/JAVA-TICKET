/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public class eventoDeportivo extends eventoBase {
    private int cantMax= 20000;
    private String Equipo1;
    private String Equipo2;
    private TypeSport typeSport;
    private TypEvent typeEvent= TypEvent.DEPORTIVO;
    
    
    
    
    enum TypeSport{
        FUTBOL,
        TENIS,
        RUGBY,
        BASEBALL
    }
    
    //Setters
    public void setEquipos(String Equipo1, String Equipo2){
        this.Equipo1=Equipo1;
        this.Equipo2=Equipo2;
    }
    
    public void setTypeSport(TypeSport tipo){
        typeSport=tipo;
    }
    
    //Getters
    public TypeSport  getTypeSport(){
        return typeSport;
    }
    
    public String getEquipo1(){
        return Equipo1;
    }
    
    public String getEquipo2(){
        return Equipo2;
    }
    
    public TypEvent getTypeEvent(){
        return typeEvent;
    }
    
    
    
    
    public eventoDeportivo(){
        
    }
    
    
    
    
}
