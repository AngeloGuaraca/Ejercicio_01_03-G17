/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_03;

/**
 *
 * @author user
 */
public class Ejercicio_01_03 {

    public static void main(String[] args) {
        
        //EMPRESA
        var empresa = new Empresa();
        empresa.nombre="Nestle";
        empresa.ubicacion="Avenida tres cuadras";
        empresa.descripcion="Alimenticios";
        
        //EMPLEADO
        var datosEmpleado = new Empleado();
        datosEmpleado.nombre="Emiliano Condo";
        datosEmpleado.edad=35;
        datosEmpleado.profesion="Ingeniero Industrial";
        datosEmpleado.tiempoContrato=5;
        
        //DEPARTAMENTO
        var departamento=new Departamento();
        departamento.cargoExistentes="I";
        
        System.out.println("Nombre de la empresa: "+empresa.nombre+
                           " ubicada en la "+empresa.ubicacion);
        System.out.println("Nombre del emmpleado: "+datosEmpleado.nombre);
        System.out.println("Edad: "+datosEmpleado.edad);
        System.out.println("Profesion: "+datosEmpleado.profesion);
        System.out.println("Departamento en el que trabaja: "+departamento.verCargoDisponible());
        System.out.println("Estado del contrato laboral: "+datosEmpleado.tiempoLaboral());
        
        
        
        //
       
        var datosActor=new AutorPrincipal();
        datosActor.nombre="Leonardo Einsten";
        datosActor.nacionalidad="E.E.U.U";
        var art=new Articulo();
        art.genero="Cientifica";
        var tip=new Revista();
        tip.principal="Principal";
        tip.tipoPapel="El hombre viaja a la luna "; 
       
        System.out.println( datosActor.nombre+" Escribio  "+tip.tipoPapel 
                             + " en la revista "+art.genero);
       
        
    }
}
