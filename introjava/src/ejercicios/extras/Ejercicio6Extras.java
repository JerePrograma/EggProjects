package ejercicios.extras;

import java.util.Scanner;

//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
//por debajo de 1.60 mts. y el promedio de estaturas en general.
public class Ejercicio6Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas a medir");
        int cantidadPersonas = sc.nextInt();
        float promedioAltura = 0;
        float alturaPersona;
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingresa la altura de la persona");
            alturaPersona = sc.nextFloat();
            promedioAltura += alturaPersona;
        }
        promedioAltura /= cantidadPersonas;
        System.out.println("El promedio de la altura de las personas es de " + promedioAltura);
    }
}
