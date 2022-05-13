/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author user
 */
public class Empresa {
    String nombre;
    String ubicacion;
    String descripcion;
    Empleado datosEmpleado;
    Departamento desDepartamento;
    
    public boolean existeEmpresa(){
        var retorno=false;
        if(this.nombre=="Nestle"){
            retorno=true;
        }
        return retorno;
    }
}