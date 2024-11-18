package TP_Asosiciacion;


import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Notas> notas;

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Notas notas) {
        notas.add(notas);
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
