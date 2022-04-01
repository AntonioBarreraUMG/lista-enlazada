package org.openjfx.progra3clase8;

public class Nodo {
    ClsAlumno alumno;
    Nodo enlace;

    public Nodo(ClsAlumno alumno) {
        this.alumno = alumno;
        enlace = null;
    }

    public Nodo(ClsAlumno alumno, Nodo n) {
        this.alumno = alumno;
        enlace = n;
    }

    public ClsAlumno getDato() {
        return this.alumno;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
