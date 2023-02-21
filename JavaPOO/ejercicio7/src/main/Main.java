package main;

import entidad.Persona;
import service.Servicio;

import java.util.ArrayList;
import java.util.List;

/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, O, H o M.
Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
*/
public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Servicio servicio = new Servicio();
        Persona persona1 = servicio.crearPersona();
        Persona persona2 = servicio.crearPersona();
        Persona persona3 = servicio.crearPersona();
        Persona persona4 = servicio.crearPersona();
        Persona persona5 = new Persona("Jeremías", 28, "H", 96, 168);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        int menores = 0;
        int mayores = 0;
        int pesoIdeal = 0;
        int pesoMenor = 0;
        int pesoMayor = 0;
        double imc;
        boolean mayor;
        for (Persona personas2 : personas) {
            System.out.println(personas2.toString());
            imc = servicio.calcularIMC(personas2);
            if (imc == 0) {
                pesoIdeal++;
            } else if (imc == -1) {
                pesoMenor++;
            } else {
                pesoMayor++;
            }
            mayor = servicio.esMayorDeEdad(personas2);
            servicio.esMayorDeEdad(personas2);
            if (mayor) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println(persona5);
        double promedioMayores = (float) mayores * 100 / personas.size();
        System.out.println("El promedio de las personas mayores es de: " + promedioMayores);
        double promedioMenores = (float) menores * 100 / personas.size();
        System.out.println("El promedio de las personas mayores es de: " + promedioMenores);
        double promedioPesoIdeal = (float) pesoIdeal * 100 / personas.size();
        System.out.println("El promedio de las personas con peso ideal es de: " + promedioPesoIdeal);
        double promedioPesoMenor = (float) pesoMenor * 100 / personas.size();
        System.out.println("El promedio de las personas con peso ideal es de: " + promedioPesoMenor);
        double promedioPesoMayor = (float) pesoMayor * 100 / personas.size();
        System.out.println("El promedio de las personas con peso ideal es de: " + promedioPesoMayor);
    }
}