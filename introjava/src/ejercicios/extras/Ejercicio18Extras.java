package ejercicios.extras;

import java.util.Scanner;

//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//N, con los valores ingresados por el usuario.
public class Ejercicio18Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int n = sc.nextInt();
        int sumaVector = 0;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el valor en el subíndice " + i);
            vector[i] = sc.nextInt();
            sumaVector += vector[i];
        }
        System.out.println("La suma de todos los elementos es: " + sumaVector);
    }
}