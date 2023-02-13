package ejercicios.extras;

import java.util.Scanner;

//Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.
public class Ejercicio10Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAdivinar;
        int numrandom = numeroAleatorio();
        do {
            System.out.println("Ingrese un número para adivinar la multiplicación de dos números entre 0 y 10");
            numAdivinar = sc.nextInt();
            if (numAdivinar > numrandom) {
                System.out.println("El número es más chico");
            } else if (numAdivinar < numrandom) {
                System.out.println("El número es más grande");
            }
        } while (!adivinanza(numAdivinar, numrandom));
        System.out.println("Adivinaste el número!");
    }

    public static int numeroAleatorio() {
        int num1, num2;
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        return num1 * num2;
    }

    public static boolean adivinanza(int numIngresado, int numeroAleatorio) {
        return numIngresado == numeroAleatorio;
    }
}