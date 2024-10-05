import javax.swing.*;
import java.util.Locale;
import java.util.Random;

// EJERCICIO N°1 //////////////////////////////////////////////////////////////////////////////////////
//import javax.swing.*;
//import java.util.Scanner;
//
//public class Condicionales {
//    public static void main(String[] args){
//        String pelicula = "";
//        pelicula = JOptionPane.showInputDialog("Ingrese la categoria de pelicula que le gustaria ver");
//        pelicula = pelicula.toLowerCase();
//        if (pelicula.equals("terror")){
//            JOptionPane.showMessageDialog(null,"Le recomendamos ver la pelicula 'SCREAM'");
//        } else if (pelicula.equals("comedia")){
//            JOptionPane.showInputDialog(null, "Le recomendamos ver la pelicula '¿Y donde están las rubias?'");
//        } else if (pelicula.equals("drama")) {
//            JOptionPane.showMessageDialog(null, "Le recomendamos la pelicula 'El código Da Vinci'");
//        } else if (pelicula.equals("ciencia ficcion")) {
////            JOptionPane.showMessageDialog(null, "Le recomendamos la pelicula 'Terminator'");
////        } else {
//            JOptionPane.showMessageDialog(null, "Lamentablemente no tenemos recomendaciones para dicha categoria");
//        }
//    }
//}
// EJERCICIO N°2 //////////////////////////////////////////////////////////////////////////////////////
//public class Condicionales {
//    public static void main(String[] args){
//        String precioString;
//        String cliente;
//        precioString = JOptionPane.showInputDialog("Ingrese el precio del producto");
//        cliente = JOptionPane.showInputDialog("Ahora ingrese el tipo de cliente (estudiante/adulto/jubilado").toLowerCase();
//        Double precio = Double.parseDouble(precioString);
//        if(cliente.equals("estudiante")){
//            precio -= precio * 0.10;
//            JOptionPane.showMessageDialog(null,"El precio para estudiantes es: " + precio);
//        } else if (cliente.equals("adulto")) {
//            precio -= precio * 0.05;
//            JOptionPane.showMessageDialog(null, "El precio para adultos es: " + precio);
//        } else if (cliente.equals("jubilado")) {
//            precio -= precio * 0.15;
//            JOptionPane.showMessageDialog(null, "El precio para jubilados es: " + precio);
//        } else {
//            JOptionPane.showMessageDialog(null, "El precio a pagar es: " + precio);
//        }
//    }
//}
// EJERCICIO N°3 //////////////////////////////////////////////////////////////////////////////////////
//public class Condicionales {
//    public static void main(String[] args){
//        String genero = "";
//        genero = JOptionPane.showInputDialog("Ingrese el genero de libros que le gustaria leer");
//        genero = genero.toLowerCase();
//        if (genero.equals("fantasia")){
//            JOptionPane.showMessageDialog(null,"Le recomendamos leer el libro 'Harry Potter'");
//        } else if (genero.equals("misterio")){
//            JOptionPane.showInputDialog(null, "Le recomendamos leer el libro 'La oscuridad de los crayones'");
//        } else if (genero.equals("romance")) {
//            JOptionPane.showMessageDialog(null, "Le recomendamos leer el libro 'Romeo y Julieta'");
//        } else if (genero.equals("ciencia ficcion")) {
//            JOptionPane.showMessageDialog(null, "Le recomendamos leer el libro 'El señor de los anillos'");
//        } else {
//            JOptionPane.showMessageDialog(null, "Lamentablemente no tenemos recomendaciones para dicho genero");
//       }
//    }
//}
// EJERCICIO N°4 //////////////////////////////////////////////////////////////////////////////////////
//public class Condicionales {
//    public static void main(String[] args){
//        Double peso;
//        String pesoString;
//        Double altura;
//        String alturaString;
//        Double IMC;
//        pesoString = JOptionPane.showInputDialog("Ingrese su peso");
//        alturaString = JOptionPane.showInputDialog("Ingrese su altura (recuerde que la altura se ingresa con .)");
//        peso = Double.parseDouble(pesoString);
//        altura = Double.parseDouble(alturaString);
//        IMC = peso / (altura*altura);
//            if (IMC < 18.5) {
//                JOptionPane.showMessageDialog(null, "Usted se encuentra con un peso mas bajo que la normal");
//            } else if (IMC >= 18.5 && IMC <= 24.9) {
//                JOptionPane.showMessageDialog(null, "Usted se encuentra en un peso normal");
//            } else if (IMC >= 25 && IMC <= 29.9) {
//                JOptionPane.showMessageDialog(null, "Usted se ecuentra en sobrepeso");
//            } else if (IMC >= 30) {
//                JOptionPane.showMessageDialog(null, "Usted se encuentra en la linea de obesidad");
//            } else {
//                JOptionPane.showMessageDialog(null, "Su índice se encuentra fuera de nuestros parámetros");
//            }
//    }
//}
// EJERCICIO N°5 //////////////////////////////////////////////////////////////////////////////////////
//public class Condicionales {
//    public static void main(String[] args){
//        Random random = new Random();
//        int resultado = 0;
//        int opcionBot = random.nextInt(3) + 1;
//        int opcionJugador = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a 'Piedra, Papel o Tijera' \n" +
//                "Ingrese su jugada (solo el número)\n" +
//                "1 - Piedra\n" +
//                "2 - Papel\n" +
//                "3 - Tijera"));
//        resultado = (opcionJugador - opcionBot);
//        if (opcionBot == opcionJugador){
//            JOptionPane.showMessageDialog(null, "EMPATE");
//        } else if (resultado < 1 && resultado != (-2)){
//            JOptionPane.showMessageDialog(null, "TE GANÉ!!! \n" +
//                    "Mi respuesta fue: " + opcionBot);
//        } else {
//            JOptionPane.showMessageDialog(null, "ME GANASTE!!! \n" +
//                    "Mi respuesta fue: " + opcionBot);
//        }
//    }
//}
// EJERCICIO N°6 //////////////////////////////////////////////////////////////////////////////////////
//public class Condicionales {
//    public static void main(String[] args){
//        int horasDeSueño;
//        int horasDeEjercicio;
//        int comidasSaludables;
//        horasDeSueño = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas son generalmente las que usted duerme?"));
//        horasDeEjercicio = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas al dia realiza ejercicio?"));
//        comidasSaludables = Integer.parseInt(JOptionPane.showInputDialog("Cuantas comidas saludables en el dia?"));
//
//        if (horasDeSueño == 8 && horasDeEjercicio > 1 && comidasSaludables > 1){
//        JOptionPane.showMessageDialog(null, "Vemos que tus habitos son realmente saludables, igualmente, recuerda que darte permitidos está bien");
//        } else if (horasDeSueño >= 6 || horasDeSueño <= 8 || horasDeEjercicio > 1 || comidasSaludables >= 1){
//            JOptionPane.showMessageDialog(null, "Usted posee algunos habitos saludables, recomendamos mejorar un poco en aquellos donde no se encuentra tan bien");
//        } else if (horasDeSueño > 8 || horasDeSueño < 6 || horasDeEjercicio < 1 || comidasSaludables == 0) {
//            JOptionPane.showMessageDialog(null, "Recomendamos que se realice cambios en sus rutinas, debido a que la vida que lleva no es muy sana");
//        }
//        JOptionPane.showMessageDialog(null, "A continuación, le comentaremos sobre como categorizamos los habitos saludables");
//        JOptionPane.showMessageDialog(null, "Con respecto al sueño, lo mas saludables es dormir 8 hs, pero generalmente\n" +
//                                                                   "las personas duermen unas 6-7 hs, menos de eso ya no es bueno.\n" +
//                                                                   "-------------------------------------------------------------------------------\n" +
//                                                                   "Sobre las horas de ejercicio, lo recomedable es hacer por lo menos 1.5 hs,\n" +
//                                                                   "por lo general la gente sueles hacer 30 min, pero menos de eso no es saludable. \n" +
//                                                                   "-------------------------------------------------------------------------------\n" +
//                                                                   "Finalmente lo recomedable es comer por lo menos 2 comidas saludables, en general\n" +
//                                                                   "las personas sueles comer 1 comida saludable por dia, menos de eso no es recomedable.");
//
//    }
//}
// EJERCICIO N°7 //////////////////////////////////////////////////////////////////////////////////////
//public class Condicionales {
//    public static void main(String[] args) {
//        String estadoDeAnimo;
//        estadoDeAnimo = JOptionPane.showInputDialog("¿Podria indicarnos cual es su estado de animo?").toLowerCase();
//        switch (estadoDeAnimo){
//            case "feliz":
//                JOptionPane.showMessageDialog(null, "Le recomendamos que dibuje, ya que puede lograr hermosas obras de arte");
//                break;
//            case "triste":
//                JOptionPane.showMessageDialog(null, "Le recomendamos juntarse con amigos, los amigos siempre ayudan a sentirse mejor");
//                break;
//            case "energico":
//                JOptionPane.showMessageDialog(null, "Le recomendamos salir a hacer ejercicio, asi aprovecha la energia para algo sano");
//                break;
//            case "relajado":
//                JOptionPane.showMessageDialog(null, "Le recomendamos sentarse a ver una pelicula, hay que aprovechar los momentos de paz");
//                break;
//            default:
//                JOptionPane.showMessageDialog(null, "Lamentablemente no tenemos recomendaciones para su estado de animo actual, mil disculpas");
//        }
//    }
//}