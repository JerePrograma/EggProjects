package ejercicios.bucles;

import java.util.Scanner;

//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//        números al usuario hasta que la suma de los números introducidos supere el límite inicial.
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un límite positivo");
        int limite = sc.nextInt();
        int num;
        int suma = 0;
        do {
            num = sc.nextInt();
            suma += num;
        } while (suma <= limite);

        System.out.println("La suma superó el límite");
    }
}
