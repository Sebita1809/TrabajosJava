//EJERCICIO N°1////////////////////////////////////////////////////////////////////
//public class Bucles {
//    public static void main(String[] args){
//        double horasEstudio = 0;
//        double horasEjercicio = 0;
//        double horasLeer = 0;
//        double horasLibres = 0;
//        int i;
//        Scanner input = new Scanner(System.in);
//        for (i = 0 ; i <= 4; i++){
//            switch (i){
//                case 0:
//                    System.out.println("Ingrese las horas que le dedica al estudio");
//                    horasEstudio = input.nextDouble();
//                    continue;
//                case 1:
//                    System.out.println("Ingrese las horas que le dedica al ejercicio");
//                    horasEjercicio = input.nextDouble();
//                    continue;
//                case 2:
//                    System.out.println("Ingrese las horas que le dedidca a la lectura");
//                    horasLeer = input.nextDouble();
//                    continue;
//                case 4:
//                    System.out.println("Ingrese las horas que le dedica a su tiempo libre");
//                    horasLibres = input.nextDouble();
//                    continue;
//                default:
//                    break;
//            }
//        }
//        System.out.println("El total de la suma de las horas es: " + (horasEstudio + horasEjercicio + horasLeer + horasLibres));
//    }
//}
//EJERCICIO N°2////////////////////////////////////////////////////////////////////
//public class Bucles {
//    public static void main(String[] args){
//        int empleados;
//        double horas;
//        double salario;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Por favor ingrese la cantidad de empleados");
//        empleados = input.nextInt();
//        for(int i = 1; i <= (empleados); i++){
//            System.out.println("Ingrese la cantidad de horas que trabaja su empleado N°" + i);
//            horas = input.nextDouble();
//            salario = horas * 15;
//            System.out.println("El sueldo de su empleado N°" + i + " es de $" + salario);
//
//        }
//    }
//}
//EJERCICIO N°3////////////////////////////////////////////////////////////////////
//public class Bucles {
//    public static void main(String [] args){
//        int cantidad;
//        int productos;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Ingrese la cantidad de productos que desea registrar");
//        productos = input.nextInt();
//        for(int i = 1; i <= productos; i++){
//            System.out.println("Ingrese la cantidad de unidades para el producto N°" + i);
//            cantidad = input.nextInt();
//            if(cantidad < 5){
//                System.out.println("Usted necesita realizar pedido de este productos");
//            }
//        }
//    }
//}
//EJERCICIO N°4////////////////////////////////////////////////////////////////////
//public class Bucles {
//    public static void main(String[] args){
//        double ventasDiarias;
//        double ventasSemanales = 0;
//        Scanner input = new Scanner(System.in);
//        for (int i = 1; i <= 7; i++){
//            System.out.println("Por favor ingrese las ventas del dia " + i);
//            ventasDiarias = input.nextDouble();
//            ventasSemanales += ventasDiarias;
//        }
//        System.out.println("La cantidad de ventas semanales fueron: " + ventasSemanales);
//    }
//}
//EJERCICIO N°5////////////////////////////////////////////////////////////////////
//public class Bucles {
//    public static void main(String[] args){
//        int empleados;
//        double horas;
//        double horasExtras;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Ingrese la cantidad de empleados");
//        empleados = input.nextInt();
//        for (int i = 1; i <= empleados; i++){
//            System.out.println("Ingrese la cantidad de horas trabajadas del empleado N°" + i);
//            horas = input.nextDouble();
//            if (horas > 40){
//                horasExtras = horas - 40;
//                System.out.println("Las horas extras trabajadas por el empleado N°" + i + " son: " + horasExtras);
//            }
//        }
//    }
//}

