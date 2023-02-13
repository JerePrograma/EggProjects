package ejercicios.extras;

import java.util.Scanner;

//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
public class Ejercicio1Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos que desea convertir");
        double minutos, horas, dias;
        minutos = sc.nextInt();
        dias = 0;
        horas = minutos / 60;
        while (horas > 24) {
            dias++;
            horas = horas - 24;
        }
        dias = Math.floor(dias);
        horas = Math.floor(horas);
        System.out.println((int) dias + " días y " + (int) horas + " horas");
    }
}