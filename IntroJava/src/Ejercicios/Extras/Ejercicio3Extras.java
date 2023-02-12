package Ejercicios.Extras;

import java.util.Scanner;

//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
public class Ejercicio3Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = sc.next();
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es una vocal");
        }
    }
}
