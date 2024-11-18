package TP_Asosiciacion;

import java.util.ArrayList;
import java.util.Scanner;

public class CargarNotas {

    class Nota {
        private String catedra;
        private double notaExamen;

        public Nota(String catedra, double notaExamen) {
            this.catedra = catedra;
            this.notaExamen = notaExamen;
        }

        public double getNotaExamen() {
            return notaExamen;
        }

        @Override
        public String toString() {
            return "Cátedra: " + catedra + ", Nota: " + notaExamen;
        }
    }

    class Alumno {
        private String nombreCompleto;
        private long legajo;
        private ArrayList<Notas> notas;

        public Alumno(String nombreCompleto, long legajo) {
            this.nombreCompleto = nombreCompleto;
            this.legajo = legajo;
            this.notas = new ArrayList<Notas>();
        }

        public void agregarNota(Notas nota) {
            notas.add(nota);
        }

        public double calcularPromedio() {
            double sum = 0;
            for (Notas nota : notas) {
                sum += nota.getNotaExamen();
            }
            return notas.isEmpty() ? 0 : sum / notas.size();
        }

        @Override
        public String toString() {
            return "Nombre: " + nombreCompleto + ", Legajo: " + legajo + ", Promedio: " + calcularPromedio();
        }
    }

    public class CargaNotas {
        public void main(String[] args) {
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

                    Notas nota = new Notas(catedra, notaExamen);
                    alumno.agregarNota(nota);
                }

                alumnos.add(alumno);
            }

            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }

            scanner.close();
        }
    }
}