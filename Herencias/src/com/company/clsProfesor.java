package com.company;

public class clsProfesor extends clsPersona {

    private String departamento;

    @Override
    public void mostrarPersona() {
        System.out.println("Soy un profesor, mi nombre es " + getNombre() + " " + getApellido() + " y mi DNI es " + DNI);
    }

    public void mostrarDepartamento() {

        System.out.println("Mi departamento es el de " + departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
