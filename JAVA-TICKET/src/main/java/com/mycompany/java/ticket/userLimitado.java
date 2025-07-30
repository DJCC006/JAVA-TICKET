/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public class userLimitado extends userBase {
    private TypUsers tipoUsuario= TypUsers.LIMITADOS;
    
    //getter
    public TypUsers getTipo(){
        return tipoUsuario;
    }
}
