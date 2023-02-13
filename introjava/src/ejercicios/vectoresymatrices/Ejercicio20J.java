package ejercicios.vectoresymatrices;

public class Ejercicio20J {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        MostrarMatriz(matriz);
        boolean resultado = esMagica(matriz);
        System.out.println("La matriz mágica es " + resultado);
    }

    public static int sumatoriaFila(int[][] matriz, int fila) {
        int sum = 0;
        int cantidadColumnas = matriz.length;
        for (int columna = 0; columna < cantidadColumnas; columna++) {
            sum += matriz[columna][fila];
        }
        return sum;
    }

    private static int sumatoriaColumna(int[][] matriz, int columna) {
        int sum = 0;
        int cantidadFilas = matriz[0].length;
        for (int fila = 0; fila < cantidadFilas; fila++) {
            sum += matriz[columna][fila];
        }
        return sum;
    }

    private static int sumatoriaDiagonal(int[][] matriz) {
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            sum += matriz[i][i];
        }
        return sum;
    }

    public static boolean esMagica(int[][] m) {
        int sumaEsperada = sumatoriaDiagonal(m);
        for (int i = 0; i < m.length; i++) {
            if (sumatoriaColumna(m, i) != sumaEsperada) {
                return false;
            }
            if (sumatoriaFila(m, i) != sumaEsperada) {
                return false;
            }
        }
        return true;
    }

    public static void MostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}