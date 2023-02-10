package Ejercicios.Guía;

import java.util.Scanner;

public class ProductoVectorMatriz {
    public static void main(String[] args) {
        //Declaración y creación de un vector.
        //tipo [] nombreVector = new tipo[Tamaño]

        //declarar un arreglo de una dimensión
        int[] vector;
        //crear en memoria (construir/dimensionar) con el valor por defecto (cero para los enteros)
        vector = new int[2];
        //los dos pasos en una línea
        int[] producto = new int[3];

        //Declaración y creación de una matriz
        //tipo[][] nombreMatriz = new tipo[Filas][Columnas]
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};

        //Declaración y creación de arreglos genéricos
        //tipo[][]...[] nombreArreglo = new tipo[cardinalidad 1][cardinalidad 2]...[cardinalidad N]

        System.out.println("Ingrese los vvalores del vector de tamaño " + vector.length + ": ");
        Scanner leer = new Scanner(System.in);
        //int = 0, porque los subíndices de los arreglos en Java inician en cero
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v[" + i + "]=");
            //acceder al valor i del vector
            vector[i] = leer.nextInt();
        }

        //Multiplica vector por matriz
        int sum;
        //... para cada columna de la matriz...
        for (int j = 0; j < matriz[0].length; j++) {
            sum = 0;
            //...recorro el vector y multiplico
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        String aux = "";

        //Mostrar vector
        System.out.println("* vector:");
        //bucle for "mejorado" (enchanced)
        //fot (tipo de elemto : arreglo)
        for (int elemento : vector) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);

        //Mostrar matriz
        System.out.println("/n* matriz: ");
        //para cada fila de la matriz
        for (int[] fila : matriz
        ) {
            aux = "";
            //para cada elemento de la fila
            for (int elemento : fila
            ) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }

        //Mostrar resultado
        aux = "";
        System.out.println("/n vector x matriz:");
        for (int elemento : producto
        ) {
            aux += " " + elemento;
        }
        System.out.println(aux);
    }
}