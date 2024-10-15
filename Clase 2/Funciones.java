//EJERCICIO N°1///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public static void main(String[] args){
//        double[] ventas = new double[30];
//        double resultado;
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i <= 29; i++){
//            System.out.println("Ingrese las ventas del dia " + (i + 1));
//            ventas[i] = input.nextDouble();
//        }
//        resultado = calcularIngresosMensuales(ventas);
//        System.out.println("Las ventas mensuales fueron de: " + resultado);
//    }
//
//    public static double calcularIngresosMensuales(double[] a){
//        double ventasMensuales = 0;
//        for (int i = 0; i <= 29; i++){
//            ventasMensuales += a[i];
//        }
//        return ventasMensuales;
//    }
//}
//EJERCICIO N°2///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int cantidadProductos;
//        System.out.println("Ingrese la cantidad de productos que quiere registrar");
//        cantidadProductos = input.nextInt();
//        String[] productos = new String[cantidadProductos];
//        int[] stock = new int[cantidadProductos];
//        for (int i = 0; i <= (cantidadProductos -  1); i++){
//            System.out.println("ingrese el nombre del producto");
//            productos[i] = input.next();
//            System.out.println("Ingrese el stock de " + productos[i]);
//            stock[i] = input.nextInt();
//        }
//        generarReporteStock(productos, stock);
//    }
//    public static void generarReporteStock(String[] productos, int[] stock){
//        System.out.println("Productos con bajo stock");
//        for (int i = 0; i < productos.length; i++){
//            if (stock[i] < 5){
//                System.out.println("El producto " + productos[i] + " tiene " + stock[i] + " unidades");
//            }
//        }
//    }
//}
//EJERCICIO N°3///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int cantidadClientes;
//        System.out.println("Ingrese la cantidad de clientes que desea registrar");
//        cantidadClientes = input.nextInt();
//        String[] clientes = new String[cantidadClientes];
//        double[] facturasPendientes = new double[cantidadClientes];
//        for (int i = 0; i < cantidadClientes; i++){
//            System.out.println("Ingrese el nombre del cliente");
//            clientes[i] = input.next();
//            System.out.println("Ingrese el monto de la factura que " + clientes[i] + " tiene pendiente");
//            facturasPendientes[i] = input.nextDouble();
//        }
//        enviarFacturas(clientes, facturasPendientes);
//    }
//    public static void enviarFacturas(String[] clientes, double[] facturasPendientes){
//        for (int i = 0; i < clientes.length; i++){
//            if (facturasPendientes[i] > 500){
//                System.out.println("El cliente " + clientes[i] + " debe una factura pendiente superior a 500, su " +
//                        "monto pendiente es " + facturasPendientes[i]);
//            }
//        }
//    }
//}
//EJERCICIO N°4///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int cantidadClientes;
//        System.out.println("Ingrese la cantidad de clientes que desee registrar");
//        cantidadClientes = input.nextInt();
//        String[] clientes = new String[cantidadClientes];
//        int[] compras = new int[cantidadClientes];
//        for (int i = 0; i < cantidadClientes; i++){
//            System.out.println("Ingrese el nombre del cliente");
//            clientes[i] = input.next();
//            System.out.println("El cliente " + clientes[i] + ", cuantas compras ha realizaso?");
//            compras[i] = input.nextInt();
//        }
//        evaluarDescuento(clientes, compras);
//    }
//    public static void evaluarDescuento(String[] clientes, int[] compras){
//        for (int i = 0; i < clientes.length; i++){
//            if (compras[i] > 10){
//                System.out.println("El cliente " + clientes[i] + " merece un descuento del 10%");
//            }
//        }
//    }
//}
//EJERCICIO N°5///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        double calificacion;
//        int cantidadClientes;
//        System.out.println("Ingrese la cantidad de clientes que desea registrar");
//        cantidadClientes = input.nextInt();
//        double[] calificaciones = new double[cantidadClientes];
//        for (int i = 0; i < cantidadClientes; i++){
//            System.out.println("Ingrese la calificacion registrada del cliente N°" + (i + 1));
//            calificaciones[i] = input.nextDouble();
//        }
//        calificacion = calcularCalificacion(calificaciones);
//        System.out.println("La calificacion promedio fue de " + calificacion);
//    }
//    public static double calcularCalificacion(double[] calificaciones){
//        double calificacion = 0;
//        for (int i = 0; i < calificaciones.length; i++){
//            calificacion += calificaciones[i];
//        }
//        calificacion = calificacion / calificaciones.length;
//        return calificacion;
//    }
//}
//EJERCICIO N°6///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int cantidadFacturas;
//        System.out.println("Ingrese la cantidad de facturas que desee registrar");
//        cantidadFacturas = input.nextInt();
//        double[] facturas = new double[cantidadFacturas];
//        for (int i = 0; i < cantidadFacturas; i++){
//            System.out.println("Ingrese el importe de la factura N°" + (i + 1));
//            facturas[i] = input.nextDouble();
//        }
//        calcularImpuesto(facturas);
//    }
//    public static void calcularImpuesto(double[] facturas){
//        for (int i = 0; i < facturas.length; i++){
//            System.out.println("El importe que deberá abonar es de " + (facturas[i] + (facturas[i] * 0.21)) + " " +
//                    "debido a que se le ha hecho un recargo del 21%");
//        }
//    }
//}
//EJERCICIO N°7///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public static void main(String[] args) {
//        double[] compras = {450.0, 600.0, 300.0, 800.0, 500.0};
//        aplicarDescuento(compras);
//    }
//
//    public static void aplicarDescuento(double[] compras) {
//        final double porcentajeDescuento = 0.15;
//        System.out.println("Monto Original - Descuento - Total");
//        for (double compra : compras) {
//            double descuento = 0;
//            if (compra > 500) {
//                descuento = compra * porcentajeDescuento;
//            }
//            double total = compra - descuento;
//            System.out.printf("%.2f - %.2f - %.2f%n", compra, descuento, total);
//        }
//    }
//}
//EJERCICIO N°8///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public static void main(String[] args) {
//        String[] empleados = {"Empleado A", "Empleado B", "Empleado C", "Empleado D", "Empleado E"};
//        int[] horasTrabajadas = {40, 35, 50, 45, 30};
//        calcularPagoSemanal(empleados, horasTrabajadas);
//    }
//    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
//        final double tarifaPorHora = 15.0;
//        System.out.println("Pago semanal de empleados:");
//        for (int i = 0; i < empleados.length; i++) {
//            double pagoSemanal = horasTrabajadas[i] * tarifaPorHora;
//            System.out.printf("%s - Horas trabajadas: %d - Pago: $%.2f%n", empleados[i], horasTrabajadas[i], pagoSemanal);
//        }
//    }
//}
//EJERCICIO N°9///////////////////////////////////////////////////////////////////
//public class Funciones {
//    public class Func9 {
//        public static void main(String[] args) {
//            double[] preciosOriginales = {100.0, 250.0, 75.0, 150.0, 300.0};
//            calcularPrecioFinal(preciosOriginales);
//        }
//        public static void calcularPrecioFinal(double[] preciosOriginales) {
//            final double porcentajeDescuento = 0.10;
//            System.out.println("Precio Original - Descuento - Precio Final");
//            for (double precio : preciosOriginales) {
//                double descuento = precio * porcentajeDescuento;
//                double precioFinal = precio - descuento;
//                System.out.printf("%.2f - %.2f - %.2f%n", precio, descuento, precioFinal);
//            }
//        }
//    }
//}