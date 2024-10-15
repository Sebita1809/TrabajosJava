import javax.swing.*;
import java.security.PublicKey;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//
//public class Secuenciales {
//    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "A continuacion te pediremos tus datos para mostrarte tu horoscopo del dia");
//        String fechaNacimiento = JOptionPane.showInputDialog("Por favor, ingrese su fecha de nacimiento de la siguiente forma (DD/MM/AAAA)");
//        int dia;
//        dia = Integer.parseInt(fechaNacimiento.substring(0,2));
//        int mes;
//        mes = Integer.parseInt(fechaNacimiento.substring(3,5));
//        int año;
//        año = Integer.parseInt(fechaNacimiento.substring(7));
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        int añoActual = Integer.parseInt((LocalDate.now().format(formato).substring(7)));
//        if (año <= añoActual) {
//            switch (mes) {
//                case 1:
//                    if (dia < 20){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'CAPRICORNIO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: No siempre podrás razonar la salida hacia tus problemas. Busca en ti la entereza para actuar cuando la situación lo requiere.");
//                        JOptionPane.showMessageDialog(null, "Amor: Podrás alcanzar el entendimiento con tu pareja luego de un periodo de continuas discusiones. Se acercan mejores días.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Encontrarás la manera de reducir los tiempos que invertías en ciertas actividades laborales. Aprovéchalo al máximo.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Los cambios en la vida son inevitables, algunos son positivos y otros negativos, pero todos son importantes por igual. Procura no temerles.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'ACUARIO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Serás fuente de confort y ayuda a tus seres queridos durante la jornada de hoy.Procura dar lo mejor de ti para hacerlo.");
//                        JOptionPane.showMessageDialog(null, "Amor: No le des lugar a inseguridades en la pareja. Asegúrate de desmitificar todo tipo de miedos en el momento que surjan.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Que la paranoia no se convierta en tu estándar de vida. Deberás aprender a jugar en equipo para triunfar laboralmente.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: No esperes perfección en aquella persona que eliges para compartir tu vida, es tan \nhumana como tú. Valora las pequeñeces que la hacen única.");
//                        break;
//                    }
//                case 2:
//                    if (dia < 19){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'ACUARIO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Serás fuente de confort y ayuda a tus seres queridos durante la jornada de hoy.Procura dar lo mejor de ti para hacerlo.");
//                        JOptionPane.showMessageDialog(null, "Amor: No le des lugar a inseguridades en la pareja. Asegúrate de desmitificar todo tipo de miedos en el momento que surjan.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Que la paranoia no se convierta en tu estándar de vida. Deberás aprender a jugar en equipo para triunfar laboralmente.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: No esperes perfección en aquella persona que eliges para compartir tu vida, es tan \nhumana como tú. Valora las pequeñeces que la hacen única.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'PICIS");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: No dejes que te arrastren a actividades denigrantes para el orgullo. Mantén tu cabeza en alto y aléjate de las malas influencias.");
//                        JOptionPane.showMessageDialog(null, "Amor: El apoyo incondicional de tu pareja te resultará de gran ayuda en la situación laboral a la que estás expuesto.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No temas defender tus convicciones en lo laboral aunque esto traiga enemistades. No le temas a la competencia.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Retomarás viejos hábitos cuyo efecto en ti habías olvidado. Lograrás experimentar sensaciones que hace tiempo no sentías. Incorpóralos a tu rutina.");
//                        break;
//                    }
//                case 3:
//                    if (dia < 21){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'PICIS");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: No dejes que te arrastren a actividades denigrantes para el orgullo. Mantén tu cabeza en alto y aléjate de las malas influencias.");
//                        JOptionPane.showMessageDialog(null, "Amor: El apoyo incondicional de tu pareja te resultará de gran ayuda en la situación laboral a la que estás expuesto.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No temas defender tus convicciones en lo laboral aunque esto traiga enemistades. No le temas a la competencia.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Retomarás viejos hábitos cuyo efecto en ti habías olvidado. Lograrás experimentar sensaciones que hace tiempo no sentías. Incorpóralos a tu rutina.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'ARIES");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Deberás iniciar un curso de acción que te lleve a mejorar emocionalmente. Te enfrentas a graves consecuencias si no lo haces.");
//                        JOptionPane.showMessageDialog(null, "Amor: Existen ciertos aspectos de tu personalidad que te resultan muy difíciles de cambiar. Hoy encontrarás la fuerza para hacerlo.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Evita comprar en cuotas cualquier tipo de bien. Por ahora posterga toda adquisición a crédito en cualquier ámbito.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: No puedes vivir de sueños. La vida es un proceso de mantenerse en movimiento, de intentar llegar a algún lado. Ponte metas y procura alcanzarlas.");
//                        break;
//                    }
//                case 4:
//                    if (dia < 20){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'ARIES");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Deberás iniciar un curso de acción que te lleve a mejorar emocionalmente. Te enfrentas a graves consecuencias si no lo haces.");
//                        JOptionPane.showMessageDialog(null, "Amor: Existen ciertos aspectos de tu personalidad que te resultan muy difíciles de cambiar. Hoy encontrarás la fuerza para hacerlo.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Evita comprar en cuotas cualquier tipo de bien. Por ahora posterga toda adquisición a crédito en cualquier ámbito.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: No puedes vivir de sueños. La vida es un proceso de mantenerse en movimiento, de intentar llegar a algún lado. Ponte metas y procura alcanzarlas.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'TAURO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Hoy te sentirás plenamente complementado por la forma de ser de tu pareja. Tendencia a caer en los mismos errores de siempre.");
//                        JOptionPane.showMessageDialog(null, "Amor: La tentación a la infidelidad es parte común en toda relación. Lo único que puede ayudarte a superarla es el amor.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Deberás ser muy cuidadoso con las personas que eliges para que sean tus protegidos. Asegúrate que sean dignos de confianza.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Tendrás que ser capaz de disfrutar de aquellas cosas que te estremecen plenamente. No estés perturbado por la opinión de los demás o su forma de catalogarte.");
//                        break;
//                    }
//                case 5:
//                    if (dia < 21){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'TAURO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Hoy te sentirás plenamente complementado por la forma de ser de tu pareja. Tendencia a caer en los mismos errores de siempre.");
//                        JOptionPane.showMessageDialog(null, "Amor: La tentación a la infidelidad es parte común en toda relación. Lo único que puede ayudarte a superarla es el amor.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Deberás ser muy cuidadoso con las personas que eliges para que sean tus protegidos. Asegúrate que sean dignos de confianza.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Tendrás que ser capaz de disfrutar de aquellas cosas que te estremecen plenamente. No estés perturbado por la opinión de los demás o su forma de catalogarte.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'GEMINIS");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: La intolerancia y los rencores están comenzando a desintegrar todo aquello que tanto trabajo te ha dado. No lo permitas.");
//                        JOptionPane.showMessageDialog(null, "Amor: Estarás con mal genio durante todo el día. Háblalo con tu pareja para evitar discusiones y tensión innecesarias.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No siempre podrás resolver ciertas dificultades de la misma manera, sobre todo cuando se trata de lidiar con personas.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Defiende tu punto de vista hasta las últimas consecuencias, pero sé lo suficientemente maduro para aceptar la derrota si esta llegara.");
//                        break;
//                    }
//                case 6:
//                    if (dia < 21){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'GEMINIS");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: La intolerancia y los rencores están comenzando a desintegrar todo aquello que tanto trabajo te ha dado. No lo permitas.");
//                        JOptionPane.showMessageDialog(null, "Amor: Estarás con mal genio durante todo el día. Háblalo con tu pareja para evitar discusiones y tensión innecesarias.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No siempre podrás resolver ciertas dificultades de la misma manera, sobre todo cuando se trata de lidiar con personas.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Defiende tu punto de vista hasta las últimas consecuencias, pero sé lo suficientemente maduro para aceptar la derrota si esta llegara.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'CANCER");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Etapa complicada en la que estarás cuestionándote cada paso que das. Dale tiempo a la confianza para que regrese a ti.");
//                        JOptionPane.showMessageDialog(null, "Amor: Deberás preguntarte si es que estás listo para afrontar una relación comprometida y a largo plazo antes de comprometerte.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No te permitas flaquear estando tan cerca de la " +
//                                "salida de esta etapa tan difícil a nivel económico. Mantente firme.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: La mejor manera de mantenerte alejado de la tentación de viejos estigmas es evitando exponerte a ellos. No pongas tu voluntad a prueba.");
//                        break;
//                    }
//                case 7:
//                    if (dia < 24){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'CANCER");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Etapa complicada en la que estarás cuestionándote cada paso que das. Dale tiempo a la confianza para que regrese a ti.");
//                        JOptionPane.showMessageDialog(null, "Amor: Deberás preguntarte si es que estás listo para afrontar una relación comprometida y a largo plazo antes de comprometerte.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No te permitas flaquear estando tan cerca de la " +
//                                "salida de esta etapa tan difícil a nivel económico. Mantente firme.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: La mejor manera de mantenerte alejado de la tentación de viejos estigmas es evitando exponerte a ellos. No pongas tu voluntad a prueba.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'LEO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Las situaciones a las que te deberás enfrentar en la jornada de hoy llevarán al límite tu capacidad de tolerar al prójimo.");
//                        JOptionPane.showMessageDialog(null, "Amor: Jornada de descubrimiento en la relación. Podrás vislumbrar algunas características de tu pareja antes ocultas para ti.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No postergues ninguna de tus responsabilidades para más adelante. Aprovecha cada instante que tengas en el día de hoy.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Aprovecha las oportunidades que se presentan de manera activa. Mantente alerta y despierto, solo así lograrás que el éxito golpee tu puerta.");
//                        break;
//                    }
//                case 8:
//                    if (dia < 23){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'LEO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Las situaciones a las que te deberás enfrentar en la jornada de hoy llevarán al límite tu capacidad de tolerar al prójimo.");
//                        JOptionPane.showMessageDialog(null, "Amor: Jornada de descubrimiento en la relación. Podrás vislumbrar algunas características de tu pareja antes ocultas para ti.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No postergues ninguna de tus responsabilidades para más adelante. Aprovecha cada instante que tengas en el día de hoy.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Aprovecha las oportunidades que se presentan de manera activa. Mantente alerta y despierto, solo así lograrás que el éxito golpee tu puerta.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'VIRGO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Te verás forzado a cambiar tus concepciones sobre ciertos aspectos de tu vida. Esto provocará replanteos profundos en ella.");
//                        JOptionPane.showMessageDialog(null, "Amor: No prometas amor eterno cuando no estás dispuesto a otorgarlo. Debes ser cuidadoso con los sentimientos de los que te rodean.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No dejes que las tensiones que te generan las presiones en el trabajo afecten tu humor fuera del ámbito laboral.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: No podrás satisfacer las necesidades de todos los que te rodean todo el tiempo. Aprende a no dejarte a ti mismo para el último lugar.");
//                        break;
//                    }
//                case 9:
//                    if (dia < 23){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'VIRGO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Te verás forzado a cambiar tus concepciones sobre ciertos aspectos de tu vida. Esto provocará replanteos profundos en ella.");
//                        JOptionPane.showMessageDialog(null, "Amor: No prometas amor eterno cuando no estás dispuesto a otorgarlo. Debes ser cuidadoso con los sentimientos de los que te rodean.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: No dejes que las tensiones que te generan las presiones en el trabajo afecten tu humor fuera del ámbito laboral.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: No podrás satisfacer las necesidades de todos los que te rodean todo el tiempo. Aprende a no dejarte a ti mismo para el último lugar.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'LIBRA");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Ciertos comentarios sembrarán la duda en tu interior. No cometas tonterías antes de tener mayor información.");
//                        JOptionPane.showMessageDialog(null, "Amor: Iniciarás la jornada de hoy con muy buen ánimo en pareja. Mantenlo durante el día mediante llamadas o mensajes a ella.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Día de grandes satisfacciones en lo laboral. Estarás inspirado, solucionarás los problemas al momento en que estos aparezcan.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Intenta ver los problemas desde distintas perspectivas. Esto te dará una vista más amplia del mismo y te permitirá encontrar la mejor solución.");
//                        break;
//                    }
//                case 10:
//                    if (dia < 23){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'LIBRA");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Ciertos comentarios sembrarán la duda en tu interior. No cometas tonterías antes de tener mayor información.");
//                        JOptionPane.showMessageDialog(null, "Amor: Iniciarás la jornada de hoy con muy buen ánimo en pareja. Mantenlo durante el día mediante llamadas o mensajes a ella.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Día de grandes satisfacciones en lo laboral. Estarás inspirado, solucionarás los problemas al momento en que estos aparezcan.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Intenta ver los problemas desde distintas perspectivas. Esto te dará una vista más amplia del mismo y te permitirá encontrar la mejor solución.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'ESCORPIO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Tu incapacidad para expresar tus sentimientos y deseos te hará pasar varios momentos de tensión durante la jornada de hoy.");
//                        JOptionPane.showMessageDialog(null, "Amor: Las palabras pueden ser muy dañinas si son usadas de forma incorrecta. Piensa detenidamente antes de hablar.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Deberás luchar continuamente contra las distracciones en tu ambiente laboral en el día de hoy. No pierdas la paciencia.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: No incorpores malos hábitos a tu vida, por alguna razón son estos los que más rápido se aprenden. Apégate a tus principios y valores.");
//                        break;
//                    }
//                case 11:
//                    if (dia < 22){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'ESCORPIO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Tu incapacidad para expresar tus sentimientos y deseos te hará pasar varios momentos de tensión durante la jornada de hoy.");
//                        JOptionPane.showMessageDialog(null, "Amor: Las palabras pueden ser muy dañinas si son usadas de forma incorrecta. Piensa detenidamente antes de hablar.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Deberás luchar continuamente contra las distracciones en tu ambiente laboral en el día de hoy. No pierdas la paciencia.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: No incorpores malos hábitos a tu vida, por alguna razón son estos los que más rápido se aprenden. Apégate a tus principios y valores.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'SAGITARIO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Lograrás evolucionar a nivel intelectual y emocional en la jornada de hoy. Replantéate ciertas actitudes hacia la vida.");
//                        JOptionPane.showMessageDialog(null, "Amor: Sentirás como la relación junto a tu pareja evoluciona favorablemente con cada día que transcurre. Disfruta este momento.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Deberás poner toda tu atención en tus actividades laborales de hoy, pero lograrás culminarlas todas sin mayores inconvenientes.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Las tensiones de una realidad tajante y despiadada pueden hacernos actuar de manera tonta a veces, magnificando situaciones mundanas.");
//                        break;
//                    }
//                case 12:
//                    if (dia < 22){
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'SAGITARIO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: Lograrás evolucionar a nivel intelectual y emocional en la jornada de hoy. Replantéate ciertas actitudes hacia la vida.");
//                        JOptionPane.showMessageDialog(null, "Amor: Sentirás como la relación junto a tu pareja evoluciona favorablemente con cada día que transcurre. Disfruta este momento.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Deberás poner toda tu atención en tus actividades laborales de hoy, pero lograrás culminarlas todas sin mayores inconvenientes.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Las tensiones de una realidad tajante y despiadada pueden hacernos actuar de manera tonta a veces, magnificando situaciones mundanas.");
//                        break;
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es 'CAPRICORNIO");
//                        JOptionPane.showMessageDialog(null, "Horoscopo de hoy: No siempre podrás razonar la salida hacia tus problemas. Busca en ti la entereza para actuar cuando la situación lo requiere.");
//                        JOptionPane.showMessageDialog(null, "Amor: Podrás alcanzar el entendimiento con tu pareja luego de un periodo de continuas discusiones. Se acercan mejores días.");
//                        JOptionPane.showMessageDialog(null, "Riqueza: Encontrarás la manera de reducir los tiempos que invertías en ciertas actividades laborales. Aprovéchalo al máximo.");
//                        JOptionPane.showMessageDialog(null, "Bienestar: Los cambios en la vida son inevitables, algunos son positivos y otros negativos, pero todos son importantes por igual. Procura no temerles.");
//                        break;
//                    }
//                default:
//                    JOptionPane.showMessageDialog(null, "Alguno de los datos ingresados son incorrectos");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "El año ingresado no es correcto");
//        }
//    }
//}
//EJERCICIO N°2////////////////////////////////////////////////////////////////////////////////////////////////////////
//public class Secuenciales {
//    public static void main(String[]args){
//        double calorias;
//        double tiempo;
//        double peso;
//        String deporte;
//        JOptionPane.showMessageDialog(null, "Bienvenido a nuestra calculadora de calorias");
//        deporte = JOptionPane.showInputDialog("Que deporte realizó").toLowerCase();
//        tiempo = Double.parseDouble(JOptionPane.showInputDialog("Cuanto tiempo se encontró realizando la actividad? " + deporte));
//        peso = Double.parseDouble(JOptionPane.showInputDialog("Finalmente, cual es su actual peso?"));
//        switch (deporte){
//            case "correr":
//                calorias = 11.7 * tiempo;
//                JOptionPane.showMessageDialog(null, "La cantidad de calorias quemadas son: " + calorias);
//            case "nadar":
//                calorias = tiempo * (7 * peso);
//                JOptionPane.showMessageDialog(null, "La cantidada de calorias quemadas son: " + calorias);
//            case "ciclismo":
//                calorias = tiempo * (8 * peso);
//                JOptionPane.showMessageDialog(null, "La cantidada de calorias quemadas son: " + calorias);
//            default:
//                JOptionPane.showMessageDialog(null, "Lamemtablemente no tenemos modo de calcular la actividad " +
//                        "ingresada");
//        }
//    }
//}
//EJERCICIO N°3///////////////////////////////////////////////////////////////////////////////////////////
//public class Secuenciales {
//    public static void main(String[] args){
//        String respuesta = JOptionPane.showInputDialog("Como considera el nivel de su condicion fisica (principiante," +
//                " intermedio o avanzado)?").toLowerCase();
//        switch (respuesta){
//            case "principiante":
//                JOptionPane.showMessageDialog(null, "Lunes: Cardio\n" +
//                        "Caminata rápida: 30 minutos\n" +
//                        "Estiramientos: 10 minutos\n" +
//                        "Martes: Fuerza (Cuerpo superior)\n" +
//                        "Flexiones de brazos (modificadas si es necesario): 3 series de 8-10 repeticiones\n" +
//                        "Elevaciones laterales con botellas de agua (o pesas ligeras): 3 series de 12 repeticiones\n" +
//                        "Plancha (en posición de rodillas si es necesario): 3 series de 20-30 segundos\n" +
//                        "Miércoles: Descanso o yoga\n" +
//                        "Yoga suave o estiramientos: 20-30 minutos\n" +
//                        "Jueves: Cardio\n" +
//                        "Bicicleta estática o al aire libre: 30 minutos\n" +
//                        "Estiramientos: 10 minutos\n" +
//                        "Viernes: Descanso");
//            case "intermedio":
//                JOptionPane.showMessageDialog(null, "Lunes: Cardio\n" +
//                        "\n" +
//                        "Correr: 30 minutos\n" +
//                        "Estiramientos: 10 minutos\n" +
//                        "Martes: Fuerza (Cuerpo superior)\n" +
//                        "\n" +
//                        "Flexiones de brazos: 3 series de 10-15 repeticiones\n" +
//                        "Press de banca (o con mancuernas): 3 series de 10-12 repeticiones\n" +
//                        "Remo con mancuernas: 3 series de 10-12 repeticiones\n" +
//                        "Plancha: 3 series de 30-45 segundos\n" +
//                        "Miércoles: Cardio\n" +
//                        "\n" +
//                        "Cycling: 30-40 minutos\n" +
//                        "Estiramientos: 10 minutos\n" +
//                        "Jueves: Fuerza (Cuerpo inferior)\n" +
//                        "\n" +
//                        "Sentadillas: 3 series de 12-15 repeticiones\n" +
//                        "Zancadas: 3 series de 10-12 repeticiones por pierna\n" +
//                        "Elevaciones de talones (pantorrillas): 3 series de 15 repeticiones\n" +
//                        "Puente de glúteos: 3 series de 12-15 repeticiones\n" +
//                        "Viernes: Cardio y Flexibilidad\n" +
//                        "\n" +
//                        "HIIT (Entrenamiento de intervalos de alta intensidad): 20 minutos\n" +
//                        "Yoga o estiramientos profundos: 20 minutos");
//            case "avanzado":
//                JOptionPane.showMessageDialog(null, "Lunes: Cardio\n" +
//                        "\n" +
//                        "Correr (intervalos): 5 minutos de calentamiento, 20 minutos de sprints (30s rápido, 1m suave), 5 minutos de enfriamiento\n" +
//                        "Estiramientos: 10 minutos\n" +
//                        "Martes: Fuerza (Cuerpo superior)\n" +
//                        "\n" +
//                        "Flexiones con elevación de pies: 4 series de 12-15 repeticiones\n" +
//                        "Press de banca: 4 series de 8-10 repeticiones\n" +
//                        "Dominadas: 4 series de 6-10 repeticiones\n" +
//                        "Fondos en paralelas: 3 series de 8-10 repeticiones\n" +
//                        "Miércoles: Cardio y Flexibilidad\n" +
//                        "\n" +
//                        "Cycling en ruta o ergómetro: 45-60 minutos a ritmo moderado\n" +
//                        "Yoga o estiramientos profundos: 20 minutos\n" +
//                        "Jueves: Fuerza (Cuerpo inferior)\n" +
//                        "\n" +
//                        "Sentadillas con barra: 4 series de 8-10 repeticiones\n" +
//                        "Peso muerto: 4 series de 6-8 repeticiones\n" +
//                        "Zancadas con mancuernas: 3 series de 10-12 repeticiones por pierna\n" +
//                        "Elevaciones de talones: 4 series de 15 repeticiones\n" +
//                        "Viernes: HIIT (Entrenamiento de intervalos de alta intensidad)\n" +
//                        "\n" +
//                        "Circuito de 20 minutos (30s trabajo, 15s descanso):\n" +
//                        "Burpees\n" +
//                        "Saltos de caja\n" +
//                        "Kettlebell swings\n" +
//                        "Mountain climbers");
//        }
//    }
//}
//EJERCICIO N°4//////////////////////////////////////////////////////////////////////////////
//public class Secuenciales {
//    public static void main(String[] args){
//        String estadoAnimo = JOptionPane.showInputDialog("Cual es su estado de animo actual? (feliz, triste, " +
//                "enérgico, relajado)").toLowerCase();
//        switch (estadoAnimo){
//            case "feliz":
//                JOptionPane.showMessageDialog(null, "\"Happy Hits!\"\n" +
//                        "\"Feel-Good Indie\"\n" +
//                        "\"Sunny Day\"\n" +
//                        "\"Pop Remixes\"\n" +
//                        "\"Acoustic Chill\"");
//                break;
//            case "triste":
//                JOptionPane.showMessageDialog(null, "\"Sad Songs\"\n" +
//                        "\"Acoustic Sad\"\n" +
//                        "\"Emotional Chill\"\n" +
//                        "\"Heartbreak\"\n" +
//                        "\"Lo-Fi Beats\"");
//                break;
//            case "energico":
//                JOptionPane.showMessageDialog(null, "\"Uptown Funk\"\n" +
//                        "\"Don't Stop Believin\"\n" +
//                        "\"Shut Up and Dance\"\n" +
//                        "\"Happy\"\n" +
//                        "\"Shake It Off\"");
//                break;
//            case "relajado":
//                JOptionPane.showMessageDialog(null, "\"Weightless\"\n" +
//                        "\"River\"\n" +
//                        "\"Banana Pancakes\"\n" +
//                        "\"Holocene\"\n" +
//                        "\"Better Together\"");
//                break;
//            default:
//                JOptionPane.showMessageDialog(null, "Lamentablemente no tenemos recmomendaciones para tu estado de " +
//                        "animo actual");
//        }
//    }
//}
//EJERCICIO N°5///////////////////////////////////////////////////////////////////////////////////////////////////////
//public class Secuenciales {
//    public static void main(String[] args){
//        double kilometros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilometros a " +
//                "recorrer o recorridos"));
//        double consumo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto combustible consume su auto"));
//        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del combustible"));
//        double costoDeViaje = (kilometros * consumo) * precio;
//        JOptionPane.showMessageDialog(null, "El costo total de su viaje es: $" + costoDeViaje);
//    }
//}
//EJERCICIO N°6/////////////////////////////////////////////////////////////////////////////////////////////////////
//public class Secuenciales {
//    public static void main(String[] args) {
//        int horasPorDias = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas al dia puedes estudiar?"));
//        int totalMaterias = 5;
//        int horasPorSemana = horasPorDias * 7;
//        int horasPorMateria = horasPorSemana / totalMaterias;
//        JOptionPane.showMessageDialog(null, "Plan de estudio semanal:\n" +
//                "Matemáticas: " + horasPorMateria + " horas a la semana.\n" +
//                "Ciencias: " + horasPorMateria + " horas a la semana.\n" +
//                "Historia: " + horasPorMateria + " horas a la semana.\n" +
//                "Lenguaje: " + horasPorMateria + " horas a la semana.\n" +
//                "Tecnología: " + horasPorMateria + " horas a la semana.");
//    }
//}
//EJERCICIO N°7/////////////////////////////////////////////////////////////////////////////////////////////////////
//public class Secuenciales {
//    public static void main(String[] args){
//        double indiceFelicidad;
//        JOptionPane.showMessageDialog(null, "A continuacion te haremos unas preguntas para que respondas con un " +
//                "limite de 1 a 10");
//        double satisfaccionVida = Double.parseDouble(JOptionPane.showInputDialog("Cual es tu nivel de satisfaccion " +
//                "con la vida?"));
//        double nivelEstres = Double.parseDouble(JOptionPane.showInputDialog("Cual es tu nivel de estres?"));
//        double nivelSalud = Double.parseDouble(JOptionPane.showInputDialog("Cual es tu nivel de salud?"));
//        indiceFelicidad = (nivelSalud + nivelEstres + satisfaccionVida) / 3;
//        JOptionPane.showMessageDialog(null, "Su inidice de felicidad es: " + indiceFelicidad + "%");
//    }
//}




























