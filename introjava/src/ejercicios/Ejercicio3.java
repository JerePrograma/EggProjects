package ejercicios;

import java.util.Scanner;

//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
//        Nota: investigar la función toUpperCase() y toLowerCase() en Java.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = sc.nextLine();

        frase = frase.toLowerCase();
        System.out.println(frase);
        frase = frase.toUpperCase();
        System.out.println(frase);
    }
}
