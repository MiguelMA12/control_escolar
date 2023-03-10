package contolescolar;

import java.util.Scanner;

public class Calificacion {

    Scanner input = new Scanner(System.in);
    // Variable global para almacenar el promedio de calificaciones
    private static double promedio;

    // Variables globales para las materias actuales del semestre en curso
    private static String materia1;
    private static String materia2;
    private static String materia3;
    private static String materia4;
    private static String materia5;
    private static String materia6;

    // Método para capturar las materias actuales del semestre
    public void Materias(String mat1, String mat2, String mat3, String mat4, String mat5, String mat6) {
        materia1 = mat1;
        materia2 = mat2;
        materia3 = mat3;
        materia4 = mat4;
        materia5 = mat5;
        materia6 = mat6;
        System.out.print("la primera materia del semestre es: ");
        mat1 = input.nextLine();
        System.out.print("la segunda materia del semestre es: ");
        mat2 = input.nextLine();
        System.out.print("la tercera materia del semestre es: ");
        mat3 = input.nextLine();
        System.out.print("la primera materia del semestre es: ");
        mat4 = input.nextLine();
        System.out.print("la segunda materia del semestre es: ");
        mat5 = input.nextLine();
        System.out.print("la tercera materia del semestre es: ");
        mat6 = input.nextLine();
    }

    public void Promedio(double calif1, double calif2, double calif3, double calif4, double calif5, double calif6) {
        System.out.printf("Ingresa la calificación para %s: ", materia1);
        calif1 = input.nextDouble();
        System.out.printf("Ingresa la calificación para %s: ", materia2);
        calif2 = input.nextDouble();
        System.out.printf("Ingresa la calificación para %s: ", materia3);
        calif3 = input.nextDouble();
        System.out.printf("Ingresa la calificación para %s: ", materia4);
        calif4 = input.nextDouble();
        System.out.printf("Ingresa la calificación para %s: ", materia5);
        calif5 = input.nextDouble();
        System.out.printf("Ingresa la calificación para %s: ", materia6);
        calif6 = input.nextDouble();
        System.out.printf("El promedio de calificaciones es:", +promedio);
        double suma = calif1 + calif2 + calif3 + calif4 + calif5 + calif6;
        promedio = suma / 6.0;

    }

}
