package ejercicios.extras;

import java.util.Scanner;

//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
//las personas ingresadas por teclado e indique si son mayores o menores de edad.
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
public class Ejercicio16Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String respuesta;
        int edad;
        do {
            System.out.println("Ingrese el nombre de la persona");
            nombre = sc.next();
            System.out.println("Ingresa la edad de " + nombre);
            edad = sc.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor");
            } else {
                System.out.println(nombre + " es menor");
            }
            System.out.println("Desea continuar?");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("SI"));
    }
}