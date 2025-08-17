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
public class userContenidos extends userBase{
    ArrayList<eventoBase> registroEventos = new ArrayList<eventoBase>();
    private TypUsers tipoUsuario = TypUsers.CONTENIDOS;
    
    //getters
    public TypUsers getTipo(){
        return tipoUsuario;
    }
}
