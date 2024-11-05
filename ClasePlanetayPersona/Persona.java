
public class Persona {
    String nombre;
    String apellido;
    String numeroDocumentoIdentidad;
    int añoNacimiento;
    String paisNacimiento;
    char genero;

    Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento
            , char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }
    void imprimir(){
        System.out.println("Nombre" + nombre);
        System.out.println("Apellido" + apellido);
        System.out.println("Numero de Documento de identidad" + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento" + añoNacimiento);
        System.out.println("Pais de nacimiento" + paisNacimiento);
        System.out.println("Genero" + genero);
        System.out.println();
    }
    public static void main(String args[]){
        Persona p1 = new Persona("Pedro", "Perez", "1053121010", 1998, "Bolivia", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Argentina", 'H');
        p1.imprimir();
        p2.imprimir();
    }
}


