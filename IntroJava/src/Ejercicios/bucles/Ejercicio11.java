package Ejercicios.bucles;

import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
       MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.*/
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Ingresa dos números positivos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean bucle = true;
        String respuesta;
        do {
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println(suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println(resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println(multiplicacion);
                    break;
                case 4:
                    int division = num1 / num2;
                    System.out.println(division);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("Ha salido exitosamente del programa");
                        bucle = false;
                        break;
                    } else {
                        continue;
                    }
            }
        } while (bucle);
    }
}
