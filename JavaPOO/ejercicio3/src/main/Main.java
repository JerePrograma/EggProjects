package main;

import entidad.Operacion;
import service.OperacionService;

public class Main {
//Crear una clase llamada Operación que tenga como atributos privados numero1 y numero2.
//A continuación, se deben hacer los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Método constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperación(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero válida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero válida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

    public static void main(String[] args) {
        Operacion operacion = new Operacion(10, 2);
        OperacionService opService = new OperacionService();
        Operacion operacion2 = opService.crearOperacion();

        System.out.println("La suma es de " + opService.sumar(operacion2));
        System.out.println("La resta es de " + opService.restar(operacion2));
        System.out.println("La multiplicación es de " + opService.multiplicar(operacion2));
        System.out.println("La división es de " + opService.dividir(operacion2));

        System.out.println("La suma2 es de " + opService.sumar(operacion));
    }
}