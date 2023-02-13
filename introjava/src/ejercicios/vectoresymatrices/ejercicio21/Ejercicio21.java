package ejercicios.vectoresymatrices.ejercicio21;

import java.util.Arrays;

//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
//se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
//que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
//la matriz M en la cual empieza el primer elemento de la submatriz P.
public class Ejercicio21 {
    private static boolean compararMatriz(int[][] matrizMayor, int[][] matrizPequeña, int x, int y) {
        for (int i = 0; i < matrizPequeña.length; i++) {
            for (int j = 0; j < matrizPequeña.length; j++) {
                if (matrizMayor[x + i][y + j] != matrizPequeña[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Coordenadas compararMatriz(int[][] matrizMayor, int[][] matrizPequeña) {
        for (int i = 0; i < matrizMayor.length - matrizPequeña.length; i++) {
            for (int j = 0; j < matrizMayor.length - matrizPequeña.length; j++) {
                if (compararMatriz(matrizMayor, matrizPequeña, i, j)) {
                    return new Coordenadas(i, j);
                }
            }
        }
        return null;
    }

    public static String MatrizToString(int[][] matriz){
        return Arrays.deepToString(matriz).replaceAll("]]?", "\n").replaceAll("(,\s)?\\[", "");
    }
}