package main;

import entidad.Circunferencia;
import service.CircunferenciaService;

//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda
//en el atributo del objeto.
//d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
//e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
public class Main {
    public static void main(String[] args) {
        CircunferenciaService circuService = new CircunferenciaService();
        Circunferencia circunferencia1 = circuService.crearCircunferencia();
        Circunferencia circunferencia2 = new Circunferencia(13);

        System.out.println("El área del círculo es " + circuService.area(circunferencia1));
        System.out.println("El perímetro del círculo es " + circuService.perimetro(circunferencia1));
        System.out.println("El área del círculo 2 es " + circuService.area(circunferencia2));
    }
}