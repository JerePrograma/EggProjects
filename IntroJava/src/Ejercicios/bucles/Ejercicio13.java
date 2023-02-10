package Ejercicios.bucles;

import java.util.Scanner;

//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//        * * * *
//        *     *
//        *     *
//        * * * *
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la dimensión del cuadrado que desea");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || j == num - 1 || i == num - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
