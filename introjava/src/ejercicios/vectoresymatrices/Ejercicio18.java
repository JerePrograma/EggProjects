package ejercicios.vectoresymatrices;

//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).
public class Ejercicio18 {
    public static void main(String[] args) {
        int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];

        System.out.println("MATRIZ A");
        System.out.println("");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println("");
        System.out.println("MATRIZ B");
        System.out.println("");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
