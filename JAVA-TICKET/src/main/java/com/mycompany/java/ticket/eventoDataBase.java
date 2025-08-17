/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

import java.util.ArrayList;

/**
 *
 * @author David
 * Clase que llevara control de todos los eventos guardados.....Logica es que se guarden tanto aqui como por el array list del usuario activo
 */
public class eventoDataBase {
    ArrayList <eventoBase> EventBank;
    
    public eventoDataBase(){
        EventBank = new ArrayList<eventoBase>();        
        
    }
    
    public eventoBase buscarEvento (int codigo){
        try{
            for(int i=0; i<+EventBank.size(); i++){
                if(codigo == EventBank.get(i).getCode()){
                    return EventBank.get(i);
                }
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("El evento ingresado no existe");
        }
        return null;
    }//Metodo que expande el alcance de poder buscar al evento en el array list mediante el codigo de evento
    
}
