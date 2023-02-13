package ejercicios.guia;

import java.util.Scanner;

public class EncuestaCondicionales {
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 al 5 estrellas");
        opinion = leer.nextInt();

        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1, 2 -> System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                case 3 -> System.out.println("Has calificado la peli como buena");
                case 4 -> System.out.println("Has calificado la peli como muy buena");
                case 5 -> System.out.println("Fantástico que haya disfrutado un excelente entretenimiento!");
            }
        } else if (opinion < 0) {
            System.out.println("¿Una opinión negativa? ¿Taaaan mala fue la película? :c");
        } else if (opinion == 0) {
            System.out.println("El valor " + opinion + " no es válido y no se tomará en cuenta :c");
        } else {
            System.out.println(opinion + " ¡Wow! Se te fue la mano con la calificación! :D");
        }
        System.out.println("Hasta la próxima!");
    }
}
