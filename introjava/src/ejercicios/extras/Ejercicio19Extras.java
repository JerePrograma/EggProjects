package ejercicios.extras;

import java.util.Scanner;

//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).
public class Ejercicio19Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de los vectores");
        int n = sc.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            vector1[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
        }
        System.out.println("Los vectores iguales son " + sonIguales(vector1, vector2, n));
    }

    public static boolean sonIguales(int[] vector1, int[] vector2, int n) {
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }
}