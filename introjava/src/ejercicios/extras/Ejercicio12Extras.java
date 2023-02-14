package ejercicios.extras;

//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
//0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
//Nota: investigar función equals() y como convertir números a String.
public class Ejercicio12Extras {
    public static void main(String[] args) {
        String numCadena1;
        String numcadena2;
        String numcadena3;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    numCadena1 = String.valueOf(i);
                    numcadena2 = String.valueOf(j);
                    numcadena3 = String.valueOf(k);
                    numCadena1 = numCadena1.replace("3", "E");
                    numcadena2 = numcadena2.replace("3", "E");
                    numcadena3 = numcadena3.replace("3", "E");
                    System.out.println(numCadena1 + "-" + numcadena2 + "-" + numcadena3);
                }
            }
        }
    }
}