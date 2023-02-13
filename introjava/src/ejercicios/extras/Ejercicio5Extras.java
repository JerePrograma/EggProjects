package ejercicios.extras;
//Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
//los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento (previo al descuento) y determine el
//importe en efectivo a pagar por dicho socio.

import java.util.Scanner;

public class Ejercicio5Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige la clase de socio");
        String opcion = sc.next();
        System.out.println("Ingrese el valor del tratamiento");
        double importe = sc.nextInt();
        double descuento;
        double cuota;
        switch (opcion) {
            case "A" -> {
                descuento = importe * 0.5;
                cuota = 500;
                importe = cuota + descuento;
                System.out.println("El socio tiene un descuento del 50% en el tratamiento, y debe pagar una cuota de " + cuota);
            }
            case "B" -> {
                descuento = importe * 0.65;
                cuota = 250;
                importe = cuota + descuento;
                System.out.println("El socio tiene un descuento del 35% en el tratamiento, y debe pagar una cuota de " + cuota);
            }
            case "C" -> {
                cuota = 100;
                importe += cuota;
                System.out.println("El socio tiene NO descuento en el tratamiento, y debe pagar una cuota de " + cuota);
            }
        }
        System.out.println("El monto total a pagar es de " + importe);
    }
}