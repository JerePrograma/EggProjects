package ejercicios.extras;

import java.util.Scanner;

//Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
//        muestre la suma de sus elementos.
public class Ejercicio22Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas y columnas de la matriz");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        rellenarMatriz(matriz,m);
        mostrarMatriz(matriz,m);
    }

    public static void rellenarMatriz(int[][] matriz,int m) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz,int m) {
        for (int[] ints : matriz) {
            for (int j = 0; j < m; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}