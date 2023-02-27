package ejercicios.vectoresymatrices;

//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//        muestre por pantalla en orden descendente
public class Ejercicio15 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        int numeros = 0;
        int aux;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numeros++;
            System.out.println(vector[i] + 1);
        }
    }
}