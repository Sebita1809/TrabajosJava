package TP_Asosiciacion;

public class Notas {
    private String catedra;
    private double notaExamen;

    public Notas(String catedra, double notaExamen) {
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


    public void add(Notas notas) {
    }
}
