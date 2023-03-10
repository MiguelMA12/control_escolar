package contolescolar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombreCompleto = " ";
        String fechaNacimiento = " ";
        String telefono = " ";
        String direccion = " ";
        String numeroCuenta = " ";
        int semestre = 0;
        String horario = " ";
        String materia1= "";
        String materia2= "";
        String materia3= "";
        String materia4= "";
        String materia5= "";
        String materia6= "";
double calif1 = 0;
double calif2 = 0;
double calif3 = 0;
double calif4 = 0;
double calif5 = 0;
double calif6 = 0;
        InformacionAlumno info = new InformacionAlumno();
        info.informacionPersonal(nombreCompleto, fechaNacimiento, telefono, direccion);

        InformacionAlumno inf = new InformacionAlumno();

        inf.informacionAcademica(numeroCuenta, semestre);

        InformacionAlumno in = new InformacionAlumno();
        in.horarios(horario);
        
        Calificacion Mat = new Calificacion();
        Mat.Materias(materia1, materia2,materia3, materia4, materia5, materia6);
        
        Calificacion Ma = new Calificacion();
        Ma.Promedio(calif1,  calif2,  calif3,  calif4,  calif5,  calif6);
    }
}
