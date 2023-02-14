package ejercicios.extras;

import java.util.Scanner;

//Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
//adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
//desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
//prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
//del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
//desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
//igual al 7 de sus notas del curso.
public class Ejercicio21Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] alumnos = new double[10];
        int trabajos = 4;
        double nota;
        double notaFinal;
        for (int i = 0; i < alumnos.length; i++) {
            notaFinal = 0;
            for (int j = 0; j < trabajos; j++) {
                switch (j) {
                    case 0 -> {
                        System.out.println("Ingresa la nota del primer TP evaluativo");
                        nota = sc.nextInt();
                        notaFinal += nota * 0.10;
                    }
                    case 1 -> {
                        System.out.println("Ingresa la nota del segundo TP evaluativo");
                        nota = sc.nextInt();
                        notaFinal += nota * 0.15;
                    }
                    case 2 -> {
                        System.out.println("Ingresa la nota del primer Integrador");
                        nota = sc.nextInt();
                        notaFinal += nota * 0.25;
                    }
                    case 3 -> {
                        System.out.println("Ingresa la nota del segundo Integrador");
                        nota = sc.nextInt();
                        notaFinal += nota * 0.50;
                    }
                }
            }
            alumnos[i] = notaFinal;
            if (alumnos[i] < 7) {
                System.out.println("El alumno " + i + " reprobó con un promedio de " + alumnos[i]);
            } else {
                System.out.println("El alumno " + i + " aprobócon un promedio de " + alumnos[i]);
            }
        }
    }
}