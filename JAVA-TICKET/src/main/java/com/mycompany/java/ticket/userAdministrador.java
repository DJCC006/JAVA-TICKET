/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;
import java.util.ArrayList;
/**
 *
 * @author David
 */
public class userAdministrador extends userBase {
    ArrayList<Integer> registroEventos = new ArrayList<Integer>();
    private TypUsers tipoUsuario = TypUsers.ADMINISTRADOR;
        
    //getter
    public TypUsers getTipo(){
        return tipoUsuario;
    }
    
}
