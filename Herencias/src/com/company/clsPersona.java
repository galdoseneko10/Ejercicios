package com.company;

public class clsPersona {

    private String Nombre;
    private String Apellido;
    protected String DNI;

    public void mostrarPersona(){

        System.out.println("Soy una persona, mi nombre es " + Nombre+ " " + Apellido + " y mi DNI es " + DNI);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
