package Ejercicios.VectoresYMatrices;

//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
//se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
//que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
//la matriz M en la cual empieza el primer elemento de la submatriz P.
public class Ejercicio21 {
    public static void main(String[] args) {
        int matrizM[][] = new int[][]{
                {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
                {11, 12, 13, 21, 41, 22, 67, 22, 10, 61},
                {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
                {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
                {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                {21, 68, 78, 98, 90, 67, 12, 61, 65, 12},
        };

        int[][] matrizP = new int[][]{
                {36, 5, 67},
                {89, 90, 75},
                {14, 22, 26},
        };

        System.out.println("Matriz M");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
//                matrizM[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz P");
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
//                matrizP[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println("");
        }
        int contadorCoincidencia = 0;
        int contador = 0;
        int jaux = -1;
        int iaux = 0;
        for (int k = 0; k < matrizM.length; k++) {
            if (k == 7 && jaux == 7 && iaux == 7) {
                break;
            } else if (iaux == 7) {
                iaux = 0;
            } else if (jaux >= 7) {
                iaux++;
                jaux = 0;
                k = 0;
            } else {
                jaux++;
            }
            for (int i = 0; i < matrizP.length; i++) {
                for (int j = 0; j < matrizP.length; j++) {
                    if (matrizM[iaux + i][jaux + j] == matrizP[i][j]) {
                        contadorCoincidencia++;
                        contador++;
                    } else if (matrizM[iaux + i][jaux + j] != matrizP[i][j]) {
                        contadorCoincidencia = 0;
                        contador = 0;
                    }
                }
                if (contador >= 9) {
                    System.out.println("Se halló coincidencia en los índices");
                    for (int j = 0; j < matrizP.length; j++) {
                        for (int l = 0; l < matrizP.length; l++) {
                            System.out.print(iaux + "," + (jaux + l) + " ");
                        }
                        iaux++;
                    }
                    return;
                }
            }
        }
    }
}