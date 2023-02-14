package ejercicios.extras;

import java.util.Scanner;

//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
public class Ejercicio20Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector");
        int n = sc.nextInt();
        int[] vector = new int[n];
        llenarVector(vector);
        imprimirVector(vector);
    }

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int j : vector) {
            System.out.print("[" + j + "]");
        }
    }
}