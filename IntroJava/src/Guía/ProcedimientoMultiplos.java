package Guía;

import java.util.Scanner;

//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
//segundo, sino informe que no lo son.
public class ProcedimientoMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingresa dos números");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El número " + num1 + " es múltiplo de " + num2);
        } else {
            System.out.println("El número " + num1 + " NO es múltiplo de " + num2);
        }
    }
}
