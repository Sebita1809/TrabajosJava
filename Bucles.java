import java.util.Scanner;

public class Bucles {
    public static void main(String[]){
        double horasEstudio;
        double horasEjercicio;
        double horasLeer;
        double horasLibres;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i = 3; i++){
            switch (i){
                case 0:
                    System.out.println("Ingrese las horas que le dedica al estudio");
                    horasEstudio = input.nextDouble();
                    continue;
                case 1:
                    System.out.println("Ingrese las horas que le dedica al ejercicio");
                    horasEjercicio = input.nextDouble();
                    continue;
                case 2:
                    System.out.println("Ingrese las horas que le dedidca a la lectura");
                    horasLeer = input.nextDouble();
                    continue;
                case 4:
                    System.out.println("Ingrese las horas que le dedica a su tiempo libre");
                    horasLibres = input.nextDouble();
                    continue;
                default:
                    break;
            }
        }
        System.out.println("El total de la suma de las horas es: " + (horasEstudio + horasEjercicio + horasLeer + horasLibres));
    }
}
