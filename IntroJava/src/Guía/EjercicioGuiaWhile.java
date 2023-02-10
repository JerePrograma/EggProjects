package Guía;

import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break. */
public class EjercicioGuiaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 0;
        int promedio = 0;
        do {
            System.out.println("Ingresá un número");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            } else if (num > 0) {
                cont++;
                promedio += num;
            }
        } while (cont < 20);
        promedio = promedio / cont;
        System.out.println("El promedio de número ingresados es " + promedio);
    }
}