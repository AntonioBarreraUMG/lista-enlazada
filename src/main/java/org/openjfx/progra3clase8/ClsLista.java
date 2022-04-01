package org.openjfx.progra3clase8;

public class ClsLista {
    public Nodo primero;

    public ClsLista(ClsAlumno dato) {
        primero = new Nodo(dato, primero);
    }
    
    public ClsLista insertarCabezaLista(ClsAlumno entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    
    public ClsLista insertarUltimoLista(Nodo ultimo, ClsAlumno entrada) {
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return this;
    }
    
    public Nodo buscarLista(String valorBuscar) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (valorBuscar.equalsIgnoreCase(indice.alumno.nombre)) {
                return indice;
            }
        }
        return null;
    }
    
    public ClsLista insertarLista(String valorBuscarInsertar, ClsAlumno entrada) {
        Nodo nuevo, anterior;
	    anterior = buscarLista(valorBuscarInsertar);
        if (anterior != null) {
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
	    return this;
    }

    public Nodo buscarPosicion(int posicion) {
        Nodo indice;
        int i;
        if (posicion < 0) return null;
        indice = primero;
        for (i = 1; (i < posicion) && (indice != null); i++) {
            indice = indice.enlace;
        }
        return indice;
    }

    public void eliminar(String entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        while ((actual != null) && (!encontrado)) {
            encontrado = entrada.equalsIgnoreCase(actual.alumno.nombre);
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
    
    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.println(n.alumno.toString() + " ");
            n = n.enlace;
            k++;
            System.out.print(k % 15 != 0 ? " " : "\n");
        }
    }
    
}
