package ejercicios.vectoresymatrices;

import java.util.Random;

//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)
public class Ejercicio19 {
    public static void main(String[] args) {
        int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];

        Random claseRandom = new Random();

        System.out.println("MATRIZ A");
        System.out.println("");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                int randomInt = -1 + claseRandom.nextInt(1 + 1);
                matrizA[i][j] = randomInt;
                if (matrizA[i][j] >= 0) {
                    System.out.print("+" + matrizA[i][j] + " ");
                } else {
                    System.out.print(matrizA[i][j] + " ");
                }
            }
            System.out.println("");
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
                    System.out.println("");
                    System.out.println("La matriz no es antisimétrica");
                    break;
                }
            }
            if (antiSimetrica == false) {
                break;
            }
        }
        if (antiSimetrica == true) {
            System.out.println("");
            System.out.println("La matriz es antisimétrica");
        }
        System.out.println("");
        System.out.println("MATRIZ B");
        System.out.println("");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                if (matrizB[i][j] >= 0) {
                    System.out.print("+" + matrizB[i][j] + " ");
                } else {
                    System.out.print(matrizB[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
