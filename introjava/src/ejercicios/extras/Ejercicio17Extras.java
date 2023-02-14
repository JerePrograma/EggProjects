package ejercicios.extras;

import java.util.Scanner;

//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
//por parámetro para que nos indique si es o no un número primo, debe devolver true si es
//primo, sino false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
//primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
public class Ejercicio17Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número que desea saber si es primo");
        int num = sc.nextInt();
        System.out.println("El número es " + esPrimo(num));
    }

    public static boolean esPrimo(int num) {
        int contador = 0;
        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        return contador == 2;
    }
}