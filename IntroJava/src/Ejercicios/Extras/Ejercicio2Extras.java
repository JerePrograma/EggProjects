package Ejercicios.Extras;

//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
//tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
public class Ejercicio2Extras {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux = B;
        System.out.println("La variable A vale " + A + ". La variable B vale " + B + ". La variable C vale " + C + ". La variable D vale " + D);
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("La variable A vale " + A + ". La variable B vale " + B + ". La variable C vale " + C + ". La variable D vale " + D);
    }
}
