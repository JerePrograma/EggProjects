package service;

import entidad.Cadena;

/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
public class Servicio {

    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            char letraActual = cadena.getFrase().charAt(i);
            if (esVocal(letraActual)) contador++;
        }
        System.out.println("Se contó " + contador + " vocales");
    }
    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }

    public void invertirFrase(Cadena cadena) {
        System.out.print("La cadena invertida es: ");
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            System.out.print(cadena.getFrase().charAt(cadena.getFrase().length() - 1 - i));
        }
        System.out.println();
    }

    public void buscarLetra(Cadena cadena, String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(cadena.getFrase().charAt(i)))) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " se contabilizó " + contador + " veces");
    }

    public boolean compararLongitud(Cadena cadena, String frase) {
        System.out.print("La longitud de ambas palabras es: ");
        return cadena.getLongFrase() == frase.length();
    }

    public void unirFrases(Cadena cadena, String frase) {
        System.out.print("Las cadenas unidas quedan: ");
        System.out.println(cadena.getFrase().concat(frase));
    }

    public void reemplazar(Cadena cadena, String letra) {
        System.out.print("Reemplazando las letra a por la letra " + letra + " queda: ");
        System.out.println(cadena.getFrase().replaceAll("a", letra));
    }

    public boolean contiene(Cadena cadena, String letra) {
        System.out.print("Si la cadena contiene la letra " + letra + " es: ");
        return cadena.getFrase().contains(letra);
    }
}