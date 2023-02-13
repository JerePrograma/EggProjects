package ejercicios.vectoresymatrices;

//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
public class Ejercicio20 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        verificar(matriz);
    }

    public static boolean verificar(int[][] matriz) {
        int sumaEsperada = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaFila;
        int sumaColumna;
        int sumaDiagonal = 0;
        int sumaInversa = 0;
        boolean aux = false;
        for (int i = 0; i < matriz.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if (i + j == matriz.length - 1) {
                    sumaInversa += matriz[i][j];
                }
            }
            if (sumaEsperada != sumaFila) {
                System.out.println("La matriz NO es mágica");
                return false;
            }
            if (sumaEsperada != sumaColumna) {
                System.out.println("La matriz NO es mágica");
                return false;
            }
        }
        if (sumaEsperada != sumaInversa) {
            System.out.println("La matriz NO es mágica");
            return false;
        }
        System.out.println("La matriz es mágica");
        return true;
    }
}