package Ejercicios.VectoresYMatrices;

import java.util.Random;
import java.util.Scanner;

//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//        numero y si se encuentra repetido
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector;
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        System.out.println("Ingresa el número que desea buscar en el vector");
        int numeroABuscar = sc.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (numeroABuscar == vector[i]) {
                System.out.println("Se encontró el número " + numeroABuscar + " en el subíndice " + i);
            }
        }
    }
}
