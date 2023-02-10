package Ejercicios;

import java.util.Scanner;

//Crear un programa que dado un numero determine si es par o impar.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es par o impar");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
