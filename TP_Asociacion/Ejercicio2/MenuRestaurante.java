package TP_Asociacion.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurante {
    private ArrayList<Plato> platosMenu;

    public MenuRestaurante() {
        this.platosMenu = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platosMenu.add(plato);
    }

    public void mostrarMenu() {
        for (Plato plato : platosMenu) {
            System.out.println(plato);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuRestaurante menu = new MenuRestaurante();

        System.out.print("Ingrese la cantidad de platos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de línea

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del plato: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el precio del plato: ");
            double precio = scanner.nextDouble();
            System.out.print("Es bebida? (true/false): ");
            boolean esBebida = scanner.nextBoolean();

            Plato plato = new Plato(nombre, precio, esBebida);

            if (!esBebida) {
                System.out.print("Ingrese la cantidad de ingredientes: ");
                int m = scanner.nextInt();
                scanner.nextLine(); // consumir el salto de línea

                for (int j = 0; j < m; j++) {
                    System.out.print("Ingrese el nombre del ingrediente: ");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del ingrediente: ");
                    double cantidad = scanner.nextDouble();
                    System.out.print("Ingrese la unidad de medida del ingrediente: ");
                    String unidadDeMedida = scanner.next();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidad, unidadDeMedida);
                    plato.agregarIngrediente(ingrediente);

                    scanner.nextLine(); // consumir el salto de línea
                }
            }

            menu.agregarPlato(plato);
        }

        menu.mostrarMenu();
        scanner.close();
    }
}
