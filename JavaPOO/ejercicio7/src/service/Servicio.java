package service;

import entidad.Persona;

import java.util.Scanner;

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
public class Servicio {
    Scanner sc = new Scanner(System.in);

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(sc.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(sc.nextInt());
        System.out.println("Ingrese el sexo");
        String sexo;
        do {
            sexo = String.valueOf(sc.next().charAt(0));
            sexo = sexo.toUpperCase();
            if (!(sexo.equals("O") || sexo.equals("H") || sexo.equals("M"))) {
                System.out.println("Error, no se reconoce el sexo ingresado");
                System.out.println("Ingrese el sexo devuelta");
            }
        } while (!(sexo.equals("O") || sexo.equals("H") || sexo.equals("M")));

        persona.setSexo(sexo);
        System.out.println("Ingrese el peso");
        persona.setPeso(sc.nextDouble());
        System.out.println("Ingrese la altura");
        persona.setAltura(sc.nextDouble());
        return persona;
    }

    public double calcularIMC(Persona persona) {
        double kg = persona.getPeso();
        double altura = persona.getAltura() / 100;
        double imc = kg / (altura * altura);
        System.out.println(imc);
        if (imc < 20) {
            System.out.println("La persona está por debajo de su peso ideal");
            imc = -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("La persona está en su peso ideal");
            imc = 0;
        } else {
            System.out.println("La persona está por encima de su peso ideal");
            imc = 1;
        }
        return imc;
    }

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() > 18;
    }
}