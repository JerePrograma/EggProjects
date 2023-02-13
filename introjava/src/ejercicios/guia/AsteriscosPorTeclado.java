package ejercicios.guia;

import java.util.Scanner;

//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
// 5 *****
// 3 ***
// 11 ***********
// 2 **
public class AsteriscosPorTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[4];

        for (int i = 0; i <= 3; i++) {
            do {
                System.out.println("Ingresa un número entre 1 y 20");
                num[i] = sc.nextInt();
            } while ((num[i] > 20) || (num[i] < 1));
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < num[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
