package ejercicios.extras;

//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano.
public class Ejercicio4Extras {
    public static void main(String[] args) {
        convertirARomano(125);
        convertirARomano(959);
        convertirARomano(1000);
        convertirARomano(1010);
    }

    public static void convertirARomano(int num) {
        System.out.println("Entero: " + num);
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letrasRomanas = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                num = num - valores[i];
                roman.append(letrasRomanas[i]);
            }
        }
        System.out.println("El número en romano es: " + roman.toString());
    }
}
