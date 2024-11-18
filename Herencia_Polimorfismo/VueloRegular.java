package Herencia_Polimorfismo;

public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public double calcularPrecio() {
        return 100 * numeroAsientos; // Precio base por asiento
    }

    @Override
    public void aplicarPromocion() {
        // Lógica para aplicar una promoción
    }
}