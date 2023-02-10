package Ejercicios.VectoresYMatrices;

//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//        muestre por pantalla en orden descendente
public class Ejercicio15 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        int numeros = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numeros++;
            System.out.println(vector[i] + 1);
        }
    }
}