package service;

import entidad.Cafetera;

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
public class ServiceCafetera {
    Scanner sc = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera cafetera = new Cafetera();
        System.out.println("Ingrese la capacidad de la cafetera");
        cafetera.setCapacidadMaxima(sc.nextInt());
        System.out.println("Ingrese la cantidad actual de café");
        cafetera.setCantidadActual(sc.nextInt());
        return cafetera;
    }

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se llenó la cafetera");
    }

    public void servirTaza(Cafetera cafetera, int tamanio) {
        if (cafetera.getCantidadActual() > tamanio) {
            System.out.println("Se llenó la taza");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanio);
            System.out.println("Le quedó " + cafetera.getCantidadActual() + "ml a la cafetera");
        } else {
            System.out.println("Se sirvió " + cafetera.getCantidadActual() + "ml a la taza");
            cafetera.setCantidadActual(0);
            System.out.println("La cafetera quedó vacía");
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Se vació la cafetera");
    }

    public void agregarCafe(Cafetera cafetera, int cafe) {
        if ((cafe + cafetera.getCantidadActual()) > cafetera.getCapacidadMaxima()) {
            int diferencia = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
            System.out.println("Se agregó " + diferencia + " a la cafetera");
            System.out.println("NO se pudo servir " + (cafe - diferencia));
        } else {
            System.out.println("Se agregó " + cafe + " a la cafetera");
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cafe);
        }
    }
}