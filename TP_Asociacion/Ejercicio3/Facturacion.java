package TP_Asociacion.Ejercicio3;

import java.util.Scanner;

public class Facturacion {
    private static final Object[][] articulos = {
            {101L, "Leche", 25.0},
            {102L, "Gaseosa", 30.0},
            {103L, "Fideos", 15.0},
            {104L, "Arroz", 28.0},
            {105L, "Vino", 120.0},
            {106L, "Manteca", 20.0},
            {107L, "Lavandina", 18.0},
            {108L, "Detergente", 46.0},
            {109L, "Jabón en Polvo", 96.0},
            {110L, "Galletas", 60.0}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        // Solicitar fecha, número y cliente
        System.out.println("Ingrese la fecha de la factura:");
        factura.setFechaFactura(scanner.nextLine());

        System.out.println("Ingrese el número de la factura:");
        factura.setNumeroFactura(scanner.nextLong());
        scanner.nextLine(); // consumir la nueva línea

        System.out.println("Ingrese el nombre del cliente:");
        factura.setCliente(scanner.nextLine());

        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el código del artículo:");
            long codigoArticulo = scanner.nextLong();
            boolean existe = false;

            for (Object[] articulo : articulos) {
                if ((long) articulo[0] == codigoArticulo) {
                    existe = true;

                    System.out.println("Ingrese la cantidad:");
                    int cantidad = scanner.nextInt();

                    DetalleFactura detalle = new DetalleFactura();
                    detalle.setCodigoArticulo(String.valueOf(articulo[0]));
                    detalle.setNombreArticulo((String) articulo[1]);
                    detalle.setCantidad(cantidad);
                    detalle.setPrecioUnitario((double) articulo[2]);

                    double descuento = cantidad > 5 ? 0.1 * detalle.getPrecioUnitario() : 0;
                    detalle.setDescuentoItem(descuento);

                    double subtotal = (detalle.getPrecioUnitario() - descuento) * cantidad;
                    detalle.setSubTotal(subtotal);

                    factura.agregarDetalle(detalle);
                    break;
                }
            }

            if (!existe) {
                System.out.println("El código ingresado no existe, intente nuevamente");
            }

            System.out.println("¿Desea agregar otro artículo? (s/n)");
            continuar = scanner.next().equalsIgnoreCase("s");
        }

        factura.calcularMontoTotal();

        // Imprimir detalle de la factura
        System.out.println("Fecha: " + factura.getFechaFactura());
        System.out.println("Número: " + factura.getNumeroFactura());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("Código\tNombre\tCantidad\tPrecio Unitario\tDescuento Item\tSubtotal");

        for (DetalleFactura detalle : factura.getDetallesFactura()) {
            System.out.println(detalle.getCodigoArticulo() + "\t" +
                    detalle.getNombreArticulo() + "\t" +
                    detalle.getCantidad() + "\t" +
                    detalle.getPrecioUnitario() + "\t" +
                    detalle.getDescuentoItem() + "\t" +
                    detalle.getSubTotal());
        }

        System.out.println("Total Calculado: " + factura.getTotalCalculadoFactura());

        scanner.close();
    }
}

