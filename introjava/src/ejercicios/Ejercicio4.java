package ejercicios;

import java.util.Scanner;

//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
//        La fórmula correspondiente es: F = 32 + (9 * C / 5).
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los grados C° que desea convertir a F°");
        int gradosC = sc.nextInt();

        int gradosF = 32 + (9 * gradosC / 5);

        System.out.println("Los grados convertidos a Fahrenheit es " + gradosF);
    }
}
