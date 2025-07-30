/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;
import java.util.ArrayList;
/**
 *
 * @author David
 * Esta clase llevará el control de todos los usuarios almacenándolos en un arraylist. De aquí se podrá acceder a ellos de una manera más ordenada
 */
public class userDataBase { 
    ArrayList <userBase> UserBank;
    
    //Constructor
    public userDataBase(){
        UserBank = new ArrayList<userBase>();
    }
    
    //Recordar que el arraylist ya trae por defecto la propiedad de add, get, remove
    //Solamente es de definir un ciclo para poder buscar entre el array list.
    
    public userBase buscarMandar(String usuario){
        try{
            for(int i=0; i<+UserBank.size(); i++){
                if(usuario.equals(UserBank.get(i).getUsername())){
                    return UserBank.get(i);
                }
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("El usuario ingresado no existe");
        }
        return null;
    }//Metodo que expande el alcance de poder buscar al usuario en el array list mediante el nombre de usuario
    
    
    
}
