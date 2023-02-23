package main;

import entidad.Matematica;
import service.Servicio;

import java.util.Scanner;

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardarán en el objeto con sus respectivos sets.
Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente, se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Servicio servicio = new Servicio();
        System.out.println("Ingresá dos números");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        Matematica matematica = new Matematica();
        Matematica matematica1 = new Matematica(num1, num2);
        matematica.setNum1(num1);
        matematica.setNum2(num2);
        System.out.println("El número mayor es " + servicio.devolverMayor(matematica));
        System.out.println("El número menor es " + servicio.devolverMenor(matematica));
        servicio.calculaRaiz(matematica);
        servicio.calcularPotencia(matematica1);
    }
}