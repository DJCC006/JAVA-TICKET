/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public class eventoReligioso extends eventoBase {
    private int cantMax= 30000;
    private int seguro = 2000;
    private TypEvent tipo= TypEvent.RELIGIOSO;
    
    
    //getters
    public int getcantMax(){
        return cantMax;
    }
    
    public int getSeguro(){
        return seguro;
    }
    
    public TypEvent getTipo(){
        return tipo;
    }
    
    
}
