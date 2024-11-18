package Herencia_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Reservas {
    private List<Vuelo> vuelos = new ArrayList<>();

    public void agregarVuelos(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularTotalReservas() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarInfoVuelos() {
    }
}

