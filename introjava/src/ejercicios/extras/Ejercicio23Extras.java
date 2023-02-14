package ejercicios.extras;

import java.util.Random;
import java.util.Scanner;

//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
//que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
//20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
//será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
//rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
//por pantalla la sopa de letras creada.
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
//de Java substring(), Length() y Math.random().
public class Ejercicio23Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] palabras = new String[20][20];
        String palabra2;
        String alphabet;
        int longitudPalabra = 5;
        String[] palabraVector = new String[5];
        int cantidadPalabras = 0;
        char c;
        alphabet = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        Random r = new Random();
        int columnaRandom;
        for (int i = 0; i < palabras.length; i++) {
            columnaRandom = (int) (Math.random() * 10) * 2;
            for (int j = 0; j < palabras.length; j++) {
                if (j == columnaRandom && cantidadPalabras < 5 && j < 15) {
                    do {
                        System.out.println("Ingresa la palabra " + (cantidadPalabras + 1) + " entre 3 y 5 caracteres");
                        palabra2 = sc.next().toUpperCase();
                        for (int k = 0; k < longitudPalabra; k++) {
                            if (k <= palabra2.length() - 1) {
                                palabraVector[k] = palabra2.substring(k, k + 1);
                            } else {
                                c = alphabet.charAt(r.nextInt(alphabet.length()));
                                palabraVector[k] = String.valueOf(c);
                            }
                        }
                    } while ((palabra2.length() > 5) || (palabra2.length() < 3));
                    for (int k = 0; k < palabraVector.length; k++) {
                        if (k == 0) {
                            j -= 1;
                        }
                        j++;
                        palabras[i][j] = palabraVector[k];
                    }
                    cantidadPalabras++;
                } else {
                    c = alphabet.charAt(r.nextInt(alphabet.length()));
                    palabras[i][j] = String.valueOf(c);
                }
            }
        }
        for (String[] palabra : palabras) {
            for (int j = 0; j < palabras.length; j++) {
                System.out.print(palabra[j] + " ");
            }
            System.out.println();
        }
    }
}