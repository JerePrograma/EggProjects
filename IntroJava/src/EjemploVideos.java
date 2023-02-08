import java.util.Scanner;

public class EjemploVideos {
    public static void main(String[] args) {
        int resultado = suma(10, 10);

        System.out.println(resultado);

        saludoPersonalizado("Jeremías");

        Scanner leer = new Scanner(System.in);

        String nombre = leer.next();

        saludoPersonalizado(nombre);
    }

    public static int suma(int a, int b) {
        int resultado = a + b;

        return resultado;
    }

    public static void saludoPersonalizado(String nombre) {
        System.out.println("Hola " + nombre + " cómo estás?");
    }
}
