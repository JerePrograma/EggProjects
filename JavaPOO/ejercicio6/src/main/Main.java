package main;

import entidad.Cafetera;
import service.ServiceCafetera;

import java.util.Scanner;

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
//métodos:
// Constructor predeterminado o vacío
// Constructor con la capacidad máxima y la cantidad actual
// Métodos getters y setters.
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
// Método vaciarCafetera(): pone la cantidad de café actual en cero.
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafetera cafetera1 = new Cafetera();
        Cafetera cafetera2 = new Cafetera(500, 200);
        ServiceCafetera servicio = new ServiceCafetera();
        Cafetera cafetera3 = servicio.crearCafetera();
        System.out.println("Ingresa el tamaño de la taza ");
        int taza = sc.nextInt();

        servicio.agregarCafe(cafetera3, 600);
        servicio.vaciarCafetera(cafetera1);
        servicio.llenarCafetera(cafetera3);
        servicio.servirTaza(cafetera2, taza);
    }
}