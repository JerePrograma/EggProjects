package ejercicios.vectoresymatrices;

import java.util.Scanner;

//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//        de 2 dígitos, etcétera (hasta 5 dígitos).
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vector[];
        System.out.println("Ingresa la dimensión del vector");
        int n = sc.nextInt();
        vector = new int[n];
        int contador1digito = 0;
        int contador2digito = 0;
        int contador3digito = 0;
        int contador4digito = 0;
        int contador5digito = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresa un número entre 1 y 5 dígitos");
            vector[i] = sc.nextInt();
        }

        for (int elementos : vector) {
            if (elementos > 0 && elementos < 10) {
                contador1digito++;
            } else if (elementos >= 10 && elementos < 100) {
                contador2digito++;
            } else if (elementos >= 100 && elementos < 1000) {
                contador3digito++;
            } else if (elementos >= 1000 && elementos < 10000) {
                contador4digito++;
            } else if (elementos >= 10000 && elementos < 100000) {
                contador5digito++;
            } else {
                System.out.println("No se reconoce los dígitos del número");
            }
        }
        System.out.println(contador1digito + " números son de 1 dígito ");
        System.out.println(contador2digito + " números son de 2 dígitos ");
        System.out.println(contador3digito + " números son de 3 dígitos ");
        System.out.println(contador4digito + " números son de 4 dígitos ");
        System.out.println(contador5digito + " números son de 5 dígitos ");
    }
}