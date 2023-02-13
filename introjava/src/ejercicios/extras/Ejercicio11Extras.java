package ejercicios.extras;

import java.util.Scanner;

//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.
public class Ejercicio11Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número que desea saber la cantidad de dígitos");
        int numero = sc.nextInt();
        System.out.println("El número tiene " + digitos(numero) + " dígitos");
    }

    public static int digitos(int numero) {
        int digitos = 0;
        while (numero > 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }
}
