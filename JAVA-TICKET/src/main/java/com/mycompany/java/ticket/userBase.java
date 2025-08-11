/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public abstract class userBase {
    private boolean derechos; //Esta variable es la que determinara si el usuario puede realizar ciertas acciones
    private String nombre;
    private String username;
    private String password;
    private int edad;
    private TypUsers type;
    
    //setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setUsername(String Username){
        username=Username;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setTipo(TypUsers tipo){
        type=tipo;
    }
    
    
    //getters
    public String getNombre(){
        return nombre;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public TypUsers getTipo(){
        return type;
    }
    
    
    
    
    
    
    enum TypUsers{
        ADMINISTRADOR,
        CONTENIDOS,
        LIMITADOS
    }
    
    
}
