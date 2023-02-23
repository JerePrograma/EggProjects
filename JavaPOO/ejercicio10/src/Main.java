/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/
public class Main {
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        double aux;
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 10;
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;
        }
        aux = arregloA[0];
        int position;

        for (int i = 0; i < arregloA.length - 1; i++) {
            for (int j = i + 1; j < arregloA.length; j++) {
                if (arregloA[i] > arregloA[j]) {
                    aux = arregloA[i];
                    arregloA[i] = arregloA[j];
                    arregloA[j] = aux;
                }
            }
        }
        for (int i = 0; i < arregloA.length; i++) {
            if (aux > arregloA[0]) {
                position = i;
                while (aux > arregloA[position]) {
                    position++;
                }
                if (arregloA[position] < aux) {
                    arregloA[i] = arregloA[position];
                }
            }
        }

        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        System.out.println();
        for (double a : arregloA) {
            System.out.print(a + "||");
        }
        
        System.out.println();
        for (double b : arregloB) {
            System.out.print(b + "||");
        }
    }
}