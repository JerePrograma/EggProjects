package Ejercicios;

import java.util.Scanner;

//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//        usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//        Nota: investigar la función Lenght() en Java.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        do {
            System.out.println("Ingresa una palabra de 8 caracteres");
            frase = sc.next();
            if (frase.length() != 8) {
                System.out.println("INCORRECTO");
            } else {
                System.out.println("CORRECTO");
            }
        } while (frase.length() != 8);
    }
}
