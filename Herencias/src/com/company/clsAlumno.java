package com.company;

public class clsAlumno extends clsPersona {

    private int creditos;

    @Override
    public void mostrarPersona() {

        System.out.println("Soy un alumno, mi nombre es " + getNombre() + " " + getApellido() + " y mi DNI es " + DNI);
    }

    public void mostrarCreditos (){

        System.out.println("Tengo " + creditos + " matriculados" );
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
