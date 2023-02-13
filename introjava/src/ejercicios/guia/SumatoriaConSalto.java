package ejercicios.guia;

import java.util.Scanner;

public class SumatoriaConSalto {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un número entero positivo");
            num = leer.nextInt();
            if (num > 1000) {
                System.out.println("Este programa podría tardar, ¿Está seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    break;
                }
            }
        } while (num <= 0 || num > 1000);


        int j, suma;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0)
                continue;
            suma = 0;
            j = 1;
            while (j <= i) {
                suma += j;
                j++;
            }
            System.out.println("La suma de los " + i + " números naturales es: " + suma);
        }
    }
}
