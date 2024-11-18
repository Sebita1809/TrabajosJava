package TP_Asociacion.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static <Nota> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el nombre completo del alumno: ");
            scanner.nextLine();  // Limpiar el buffer
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el legajo del alumno: ");
            long legajo = scanner.nextLong();

            Alumno alumno = new Alumno(nombre, legajo);

            System.out.print("Ingrese la cantidad de notas: ");
            int cantidadNotas = scanner.nextInt();

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Ingrese la cátedra: ");
                scanner.nextLine();  // Limpiar el buffer
                String catedra = scanner.nextLine();

                System.out.print("Ingrese la nota del examen: ");
                double notaExamen = scanner.nextDouble();

                Nota nota;
                nota = new Nota(catedra, notaExamen);
                alumno.agregarNota((TP_Asociacion.Ejercicio1.Nota) nota);
            }

            alumnos.add(alumno);
        }

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        scanner.close();
    }
}