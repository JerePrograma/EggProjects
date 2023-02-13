package ejercicios.extras;

import java.util.Scanner;

//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.
public class Ejercicio7Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desea calcular");
        int n = sc.nextInt();
        int num, numMin = 0, numMax = 0, iterador;
        iterador = 0;
        while (iterador < n) {
            System.out.println("Ingresa un número");
            num = sc.nextInt();
            if (iterador == 0) {
                numMax = num;
                numMin = num;
            }
            if (numMax < num) {
                numMax = num;
            }
            if (numMin > num) {
                numMin = num;
            }
            iterador++;
        }

        System.out.println("El número más bajo es " + numMin);
        System.out.println("El número más alto es " + numMax);
        iterador = 0;
        do {
            System.out.println("Ingresa un número");
            num = sc.nextInt();
            if (iterador == 0) {
                numMax = num;
                numMin = num;
            }
            if (numMax < num) {
                numMax = num;
            }
            if (numMin > num) {
                numMin = num;
            }
            iterador++;
        } while (iterador < n);
        System.out.println("El número más bajo es " + numMin);
        System.out.println("El número más alto es " + numMax);
    }
}
