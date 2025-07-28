/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public abstract class eventoBase {
    private int codigo;
    private String titulo;
    private String descripcion;
    private String fecha;//posblemente cambiar el tipo de dato
    private double renta;
    
    //Setters
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    public void setRenta( double renta){
        this.renta=renta;
    }
    
    //Getters
    public int getCode(){
        return codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public double getRenta(){
        return renta;
    }
    
    
    
}
