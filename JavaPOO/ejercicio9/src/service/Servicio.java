package service;

import entidad.Matematica;

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
public class Servicio {

    public double devolverMayor(Matematica matematica) {
        return Math.max(matematica.getNum1(), matematica.getNum2());
    }

    public double devolverMenor(Matematica matematica) {
        return Math.min(matematica.getNum1(), matematica.getNum2());
    }

    public void calcularPotencia(Matematica matematica) {
        System.out.println("La potencia del número mayor es " + Math.pow(Math.round(devolverMayor(matematica)), Math.round(devolverMenor(matematica))));
    }

    public void calculaRaiz(Matematica matematica) {
        System.out.println("La raíz del número menor es " + Math.sqrt(Math.abs(devolverMenor(matematica))));
    }
}