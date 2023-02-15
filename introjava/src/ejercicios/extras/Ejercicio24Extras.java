package ejercicios.extras;

import java.util.Scanner;

//Realizar un programa que complete un vector con los N primeros números de la sucesión
//de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
//números:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
//La sucesión del número 2 se calcula sumando (1+1)
//Análogamente, la sucesión del número 3 es (1+2),
//Y la del 5 es (2+3),
//Y así sucesivamente…
//La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
//Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para t odo n>1
//Fibonaccin = 1 para t odo n<=1
//Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
//como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
//Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
public class Ejercicio24Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de serie de Fibonacci");
        int serie = sc.nextInt();
        for (int i = 0; i < serie; i++) {
            System.out.println(fibonacciRecursivo(i));
        }
    }

    public static int fibonacciRecursivo(int n) {
        //CASO BASE, si es cero devuelve un cero
        if (n <= 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}