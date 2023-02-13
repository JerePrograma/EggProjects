package ejercicios.extras;

import java.util.Scanner;

//Simular la división usando solamente restas. Dados dos números enteros mayores que
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
//Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
//resultado es el residuo, y el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
public class Ejercicio9Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número que quiere divir");
        Double num = sc.nextDouble();
        System.out.println("Ingrese el divisor");
        Double divisor = sc.nextDouble();
        restaDivisor(num, divisor);
    }

    public static void restaDivisor(Double num, Double divisor) {
        int contador = 0;
        while (num > divisor) {
            num -= divisor;
            contador++;
        }
        System.out.println("Dado que " + num + " es menor que " + divisor + ", entonces: el residuo es " + num + " y el cociente es " + contador);
    }
}


