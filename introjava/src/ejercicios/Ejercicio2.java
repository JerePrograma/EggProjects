package ejercicios;

import java.util.Scanner;

//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresá tu nombre");

        String nombre = sc.next();

        System.out.println("Hola " + nombre);
    }
}
