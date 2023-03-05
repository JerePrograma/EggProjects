package ejercicios.vectoresymatrices;

import java.util.Random;

//Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una
//matriz A es antisimétrica cuando esta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)
public class Ejercicio19 {
    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        Random claseRandom = new Random();
        int randomInt;
        System.out.println("MATRIZ A");
        System.out.println();
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                randomInt = -1 + claseRandom.nextInt((int) (2 + (10 * Math.pow(5, Math.random() * 5))));
                matrizA[i][j] = randomInt;
                if (j != 0) {
                    System.out.print("+ " + matrizA[i][j] + " ");
                } else {
                    System.out.print(matrizA[i][j] + " ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        boolean antiSimetrica = false;
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                if (matrizA[i][j] == -(matrizB[j][i])) {
                    antiSimetrica = true;
                } else {
                    antiSimetrica = false;
                    System.out.println();
                    System.out.println("La matriz no es antisimétrica");
                    break;
                }
            }
            if (!antiSimetrica) {
                break;
            }
        }
        if (antiSimetrica) {
            System.out.println();
            System.out.println("La matriz es antisimétrica");
        }
        System.out.println();
        System.out.println("MATRIZ B");
        System.out.println();
        for (int[] ints : matrizB) {
            for (int j = 0; j < matrizB.length; j++) {
                if (j != 0) {
                    System.out.print("+ " + ints[j] + " ");
                } else {
                    System.out.print(ints[j] + " ");
                }
            }
            System.out.println();
        }
    }
}