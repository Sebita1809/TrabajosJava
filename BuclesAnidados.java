import java.util.Scanner;
//public class BuclesAnidados {
//    public static void main(String[] args) {
//        int i;
//        int suma = 0;
//        int n;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Introduce un número: ");
//        n = input.nextInt();
//        for (i = 1; i < n; i++) {
//            if (n % i == 0) {
//                suma = suma + i;
//            }
//        }
//        if (suma == n) {
//            System.out.println("Perfecto");
//        } else {
//            System.out.println("No es perfecto");
//
//        }
//    }
//}
//EJERCICIO N°2//////////////////////////////////////////////////////////////////
//public class BuclesAnidados {
//    public static void main(String[] args) {
//        int N;
//        double factorial;
//        Scanner input = new Scanner(System.in);
//
//        do{
//            System.out.print("Introduce un número > 0: ");
//            N = input.nextInt();
//        }while(N<0);
//
//        for(int i = 0; i <= N ; i++){
//
//            factorial = 1;
//            for(int j = 1; j <= i; j++){
//                factorial = factorial * j;
//            }
//
//            System.out.printf("%2d! = %.0f %n", i, factorial);
//
//        }
//    }
//
//}
//EJERCICIO N°3//////////////////////////////////////////////////////////////////
//public class BuclesAnidados {
//    public static void main(String[] args) {
//        int N;
//        double factorial, suma = 0;
//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.print("Introduce un número > 0: ");
//            N = input.nextInt();
//        } while (N < 0);
//
//        for (int i = 0; i <= N; i++) {
//
//            factorial = 1;
//            for (int j = 1; j <= i; j++) {
//                factorial = factorial * j;
//            }
//
//            System.out.printf("%n%2d! = %.0f %n", i, factorial);
//
//            suma = suma + factorial;
//        }
//
//        System.out.printf("Suma de los factoriales desde 0 hasta %d: %.0f%n", N, suma);
//    }
//}
//EJERCICIO N°4//////////////////////////////////////////////////////////////////
//public class BuclesAnidados {
//    public static void main(String[] args) {
//        for (char x = 'Z'; x >= 'A'; x--) {
//            for (char y = x; y >= 'A'; y--) {
//                System.out.print(y);
//            }
//            System.out.println();
//        }
//    }
//}
//EJERCICIO N°5//////////////////////////////////////////////////////////////////
//public class BuclesAnidados {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 9; i++) {
//            for (int j = 0; j <= 9; j++) {
//                for (int k = 0; k <= 9; k++) {
//                    for (int l = 0; l <= 9; l++) {
//                        for (int m = 0; m <= 9; m++) {
//                            System.out.print(i != 3 ? i : "E");
//                            System.out.print(j != 3 ? j : "E");
//                            System.out.print(k != 3 ? k : "E");
//                            System.out.print(l != 3 ? l : "E");
//                            System.out.println(m != 3 ? m : "E");
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//EJERCICIO N°6//////////////////////////////////////////////////////////////////
//public class BuclesAnidados {
//    public static void main(String[] args) {
//        int N, i, j;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.print("Introduce un numero > 0: ");
//            N = sc.nextInt();
//        } while (N <= 0);
//        System.out.println("Números primos desde 1 hasta " + N);
//
//        for (j = 2; j <= N; j++) {    // j es el número que se comprueba si es primo
//            i = 2;                // i son los divisores
//            while (j % i != 0) {
//                i++;
//            }
//            if (i == j) { // si se ha dividido por el propio número entonces es primo
//                System.out.println(j);
//            }
//        }
//    }
//}