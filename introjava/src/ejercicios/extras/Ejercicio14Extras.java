package ejercicios.extras;

import java.util.Scanner;

//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.
public class Ejercicio14Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de familias");
        int cantidadFamilias = sc.nextInt();
        int cantidadHijos;
        int edadHijo;
        float promedioEdadHijos;
        for (int i = 0; i < cantidadFamilias; i++) {
            System.out.println("Cuántos hijos tiene la familia");
            cantidadHijos = sc.nextInt();
            promedioEdadHijos = 0;
            for (int j = 0; j < cantidadHijos; j++) {
                System.out.println("Cual es la edad del hijo N°" + (j + 1));
                edadHijo = sc.nextInt();
                promedioEdadHijos += edadHijo;
            }
            promedioEdadHijos /= cantidadHijos;
            System.out.println("El promedio de la edad de los hijos de la familia " + (i + 1) + " es de " + promedioEdadHijos);
        }
    }
}
