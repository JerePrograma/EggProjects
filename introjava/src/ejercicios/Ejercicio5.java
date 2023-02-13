package ejercicios;

import java.util.Scanner;

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresá un número para calcular su doble, triple y raiz cuadrada");
        int num = sc.nextInt();

        int doble = num * 2;
        int triple = num * 3;
        double cuadrado = Math.sqrt(num);

        System.out.println("El doble del número es " + doble);
        System.out.println("El triple del número es " + triple);
        System.out.println("El cuadrado del número es " + cuadrado);
    }
}
