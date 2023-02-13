package ejercicios.vectoresymatrices.ejercicio21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static ejercicios.vectoresymatrices.ejercicio21.Ejercicio21.MatrizToString;
import static ejercicios.vectoresymatrices.ejercicio21.Ejercicio21.compararMatriz;

public class Ejercicio21Test {
    private int[][] matrizM;
    private int[][] matrizP;

    @BeforeEach
    public void preparacion() {
        matrizM = new int[][]{
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

        matrizP = new int[][]{
                {36, 5, 67},
                {89, 90, 75},
                {14, 22, 26},
        };
    }

    @Test
    public void testMatrizExiste() {
        System.out.println("Matriz M");
        System.out.println(MatrizToString(matrizM));
        System.out.println("Matriz P");
        System.out.println(MatrizToString(matrizP));

        Coordenadas coordenadas = compararMatriz(matrizM, matrizP);
        System.out.println("Las coordenadas son " + coordenadas.getX() + " " + coordenadas.getY());

        Assertions.assertNotNull(coordenadas);
        Assertions.assertEquals(4, coordenadas.getX());
        Assertions.assertEquals(4, coordenadas.getY());
    }

    @Test
    public void testMatrizNoExiste() {
        matrizM[5][5] = 9999;
        System.out.println("Matriz M");
        System.out.println(MatrizToString(matrizM));
        System.out.println("Matriz P");
        System.out.println(MatrizToString(matrizP));

        Coordenadas coordenadas = compararMatriz(matrizM, matrizP);

        Assertions.assertNull(coordenadas);
    }

    @Test
    public void testMatrizElementoEsquina() {
        matrizM[5][5] = 9999;
        matrizM[9][9] = matrizP[0][0];
        System.out.println("Matriz M");
        System.out.println(MatrizToString(matrizM));
        System.out.println("Matriz P");
        System.out.println(MatrizToString(matrizP));

        Coordenadas coordenadas = compararMatriz(matrizM, matrizP);

        Assertions.assertNull(coordenadas);
    }

}
