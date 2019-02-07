package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        clsAlumno alumno1 = new clsAlumno();

        alumno1.setNombre("Eneko");

        alumno1.setApellido("Galdos");

        alumno1.setDNI("72826873H");

        alumno1.setCreditos(60);

        alumno1.mostrarPersona();

        alumno1.mostrarCreditos();

        System.out.println();

        clsProfesor profesor1 = new clsProfesor();

        profesor1.setNombre("Javier");

        profesor1.setApellido("Cerro");

        profesor1.setDNI("11111111A");

        profesor1.setDepartamento("Informática");

        profesor1.mostrarPersona();

        profesor1.mostrarDepartamento();

    }
}
