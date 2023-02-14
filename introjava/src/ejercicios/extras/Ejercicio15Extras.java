package ejercicios.extras;

import java.util.Scanner;

//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main.
public class Ejercicio15Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resultadoSuma, resultadoResta, resultadoMultiplicacion;
        float resultadoDivision;
        System.out.println("Ingresa la opción que desea realizar \n1- Suma\n2- Resta\n3- Multiplicacion\n4- Division");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> {
                resultadoSuma = suma(num1, num2);
                System.out.println("El resultado de la suma es " + resultadoSuma);
            }
            case 2 -> {
                resultadoResta = resta(num1, num2);
                System.out.println("El resultado de la suma es " + resultadoResta);
            }
            case 3 -> {
                resultadoMultiplicacion = multiplicacion(num1, num2);
                System.out.println("El resultado de la suma es " + resultadoMultiplicacion);
            }
            case 4 -> {
                resultadoDivision = division(num1, num2);
                System.out.println("El resultado de la suma es " + resultadoDivision);
            }
        }
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static float division(float num1, float num2) {
        return num1 / num2;
    }
}