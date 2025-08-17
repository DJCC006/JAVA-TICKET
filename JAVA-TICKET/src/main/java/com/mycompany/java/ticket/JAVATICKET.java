/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.ticket;

/**
 *
 * @author David
 */
public class JAVATICKET {

    public static void main(String[] args) {
     userDataBase dbPrincipal = new userDataBase();//Creacion de base de datos
     eventoDataBase dbEventosPrincipal = new eventoDataBase();//Creacion de base de datos de eventos
     BaseDatosEventos.getInstancia().setBasedeEventos(dbEventosPrincipal); //Controlador de base de datos de eventos
     BaseDatos.getInstancia().setBaseActual(dbPrincipal); //Controlador de base de datos
     screenInicial inicio = new screenInicial(); //ventana de login
    }
}
