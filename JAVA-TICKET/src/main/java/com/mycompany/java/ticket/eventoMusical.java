/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public class eventoMusical extends eventoBase {
    private int cantMax = 25000;
    private double seguro;
    
    enum TypeMusic{
        POP,
        ROCK,
        RAP,
        CLASICA,
        REGGEATON,
        OTROS
    }
    
    //Setter
    public void setSeguro(double renta){
        seguro= renta*0.30;
    }//probablemente se ha de cambiar y se puede pasar al constructor
    
    public int getcantMax(){
        return cantMax;
    }
    
    public double getSeguro(){
        return seguro;
    }
    
}
