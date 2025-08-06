/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public class BaseDatos {
    private static userDataBase BaseGeneral;
    private static BaseDatos instance;
    
    private BaseDatos(){
        //XD
    }
    
    public static BaseDatos getInstancia(){
       if(instance==null){
            instance = new BaseDatos();
       }
        return instance;
    }
    
    
     public void setBaseActual(userDataBase dataBase){
        BaseGeneral=dataBase;
    }
    
    public userDataBase getBaseActual(){
        return BaseGeneral;
    }
    
    
    
}
