package Ejercicios.Funciones;

import java.time.Year;
import java.util.Scanner;

//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
// La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será una cadena,
// este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//        El cambio de divisas es:
//        * 0.86 libras es un 1 €
//        * 1.28611 $ es un 1 €
//        * 129.852 yenes es un 1 €
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de euros que desea convertir");
        double euros = sc.nextInt();
        ConvertidorMoneda(euros);
    }

    public static void ConvertidorMoneda(double euros) {
        double libras = 0.86 * euros;
        double pesos = 1.28611 * euros;
        double yenes = 129.852 * euros;
        System.out.println("Euro convertido a libras es: " + libras);
        System.out.println("Euro convertido a pesos es: " + pesos);
        System.out.println("Euro convertido a yenes es: " + yenes);
    }
}
