/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.progra3clase8;

/**
 *
 * @author jeant
 */
public class Main {
    public static void main(String[] args) {
        
        ClsLista lista = new ClsLista(new ClsAlumno("465", "Antonio", 89.45));

        //LLENAR LISTA
        lista.insertarCabezaLista(new ClsAlumno("354", "Carlos", 79.35));        
        lista.insertarCabezaLista(new ClsAlumno("657", "Daniela", 65.10));
        lista.insertarCabezaLista(new ClsAlumno("835", "Linda", 85.50));
        lista.insertarCabezaLista(new ClsAlumno("254", "Jesus", 55.46));
        lista.insertarCabezaLista(new ClsAlumno("467", "Pamela", 69.57));
        lista.insertarCabezaLista(new ClsAlumno("765", "Juan", 48.54));
        lista.insertarCabezaLista(new ClsAlumno("276", "Jimena", 59.37));
        lista.insertarCabezaLista(new ClsAlumno("945", "Daniel", 66.75));
        lista.insertarCabezaLista(new ClsAlumno("234", "Rosa", 92.43));
        System.out.println("\n--------------------------------------------");
        System.out.println("*** LISTA INICIAL ***");
        lista.visualizar();
        
        //INSERTAR CABEZA
        String nombreInsertarCabeza = "Maria";
        System.out.println("\n--------------------------------------------");
        lista.insertarCabezaLista(new ClsAlumno("987", nombreInsertarCabeza, 88.55));
        System.out.println("*** INSERTAR EN CABEZA A "+ nombreInsertarCabeza +" ***");
        lista.visualizar();

        //INSERTAR COLA
        String nombreInsertarCola = "Eduardo";
        Nodo ultimo = lista.buscarPosicion(11);
        lista.insertarUltimoLista(ultimo, new ClsAlumno("376", nombreInsertarCola, 78.87));
        System.out.println("\n--------------------------------------------");
        System.out.println("*** INSERTAR EN COLA A "+ nombreInsertarCola +" ***");
        lista.visualizar();

        //INSERTAR ENMEDIO
        String nombreAnterior = "Linda";
        String insertarNombreEnmedio = "Victor";
        lista.insertarLista(nombreAnterior, new ClsAlumno("254",insertarNombreEnmedio , 77.45));
        System.out.println("\n--------------------------------------------");
        System.out.println("*** INSERTAR LUEGO DE "+ nombreAnterior +" A "+ insertarNombreEnmedio +" ***");
        lista.visualizar();

        //BUSCAR NOMBRE
        String nombreBuscar = "Daniela";
        Nodo alumno = lista.buscarLista(nombreBuscar);
        System.out.println("\n--------------------------------------------");
        System.out.println("*** BUSCAR A "+ nombreBuscar +" ***");
        System.out.println(alumno.alumno.toString());

        //BUSCAR POSICION
        int posicion = 4;
        Nodo encontrado = lista.buscarPosicion(posicion);
        System.out.println("\n--------------------------------------------");
        System.out.println("*** BUSCAR EN POSICION "+ posicion +" ***");
        System.out.println(encontrado.alumno.toString());

        //ELIMINAR
        String nombreEliminar = "Jesus";
        lista.eliminar(nombreEliminar);
        System.out.println("\n--------------------------------------------");
        System.out.println("*** ELIMINAR A "+ nombreEliminar +" ***");
        lista.visualizar();
    }
}
