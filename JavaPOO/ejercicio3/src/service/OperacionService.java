package service;

import entidad.Operacion;

import java.util.Scanner;

//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
//A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
public class OperacionService {
    Scanner sc = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion operacion = new Operacion();
        System.out.println("Ingresa dos números");
        operacion.setNumero1(sc.nextDouble());
        operacion.setNumero2(sc.nextDouble());
        return operacion;
    }

    public double sumar(Operacion operacion) {
        return operacion.getNumero1() + operacion.getNumero2();
    }

    public double restar(Operacion operacion) {
        return operacion.getNumero1() - operacion.getNumero2();
    }

    public double multiplicar(Operacion operacion) {
        if (operacion.getNumero2() == 0 || operacion.getNumero1() == 0) {

            return 0;
        } else {
            return operacion.getNumero1() * operacion.getNumero2();
        }
    }

    public double dividir(Operacion operacion) {
        if (operacion.getNumero2() == 0 || operacion.getNumero1() == 0) {
            System.out.println("No se puede dividir el número por cero");
            return 0;
        } else {
            return operacion.getNumero1() / operacion.getNumero2();
        }
    }
}