package ejercicios.guia;//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
//        en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
//        reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
//        vocales acentuadas) se mantienen sin cambios.
//        Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//        correspondiente. Utilice la estructura “según” para la transformación.
//        Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//        La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

import java.util.Scanner;

public class ReemplazarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder palabra = new StringBuilder();
        char primerLetra;
        do {
            primerLetra = sc.next().charAt(0);
            palabra.append(primerLetra);
        } while (primerLetra != '.');
        System.out.println("La frase ingresada fue: ");
        System.out.println(palabra);
        System.out.println("La frase cambiada es: ");
        System.out.println(cambiarLetras(palabra.toString()));
    }

    public static String cambiarLetras(String palabra) {
        palabra = palabra.replaceAll("a", "@");
        palabra = palabra.replaceAll("e", "#");
        palabra = palabra.replaceAll("i", "$");
        palabra = palabra.replaceAll("o", "%");
        palabra = palabra.replaceAll("u", "*");
        return palabra;
    }
}
