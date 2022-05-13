/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author user
 */
public class Revista {
    
      String principal;
    String  tipoPapel ;
    int tiempPersonaje;
    public boolean esPrincipal(){
        var retorno=false;
        if(this.principal=="Articulo Principal"){
            retorno=true;
        }
        return retorno;   
    }
}
