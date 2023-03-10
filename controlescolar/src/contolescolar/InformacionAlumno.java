package contolescolar;

import java.util.Scanner;

public class InformacionAlumno {
    Scanner scanner = new Scanner(System.in);
    

    public void informacionPersonal(String nombre, String fecha, String telefono, String direccion) {

        System.out.print("Ingrese nombre completo del alumno: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese fecha de nacimiento (dd/mm/aaaa): ");
        fecha = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
         telefono = scanner.nextLine();
        System.out.print("Ingrese dirección: ");
        direccion = scanner.nextLine();
         

    }

    public void informacionAcademica(String numeroCuenta, int semestre) {

        System.out.print("Ingrese número de cuenta: ");
        numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese semestre: ");
        semestre = scanner.nextInt();
    }


    public void horarios(String horarios){
    System.out.println("Horario del alumno:");
       horarios = scanner.nextLine();
    }

 
   
}