/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author user
 */
public class Articulo {
    
      String genero;
    AutorPrincipal datosActor;
    Revista rodaje;
    
    public String categoria(){
        var retorno="";
            if(this.genero==" Cientifica"){
               retorno= "Los Agujeros negros ";
            }else{
            if(this.genero==" Drama "){
                retorno= " Ovnis en E.E.U.U ";
            }else{
             if(this.genero=="Academico"){
                retorno= "Los mejores estudiantes de EC ";
             } 
            }          
         } 
       
        return retorno; 
    }
}
