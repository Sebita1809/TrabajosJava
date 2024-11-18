package Herencia_Polimorfismo;

public class SistemaDeReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();
        reservas.agregarVuelos(new VueloRegular(1, "Madrid", "Nueva York", "2023-12-01", 100));
        reservas.agregarVuelos(new VueloCharter(2, "Barcelona", "París", "2023-12-02", 5000));

        reservas.mostrarInfoVuelos();
    }
}

