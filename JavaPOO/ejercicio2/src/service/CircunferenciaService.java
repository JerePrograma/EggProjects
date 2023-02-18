package service;

import entidad.Circunferencia;

import java.util.Scanner;

//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda
// en el atributo del objeto.
//d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
//e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
public class CircunferenciaService {
    Scanner sc = new Scanner(System.in);
    public Circunferencia crearCircunferencia() {
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Ingresa el radio de la circunferencia");
        circunferencia.setRadio(sc.nextDouble());
        return circunferencia;
    }

    public double area(Circunferencia circunferencia) {
        return circunferencia.getRadio() * Math.PI;
    }

    public double perimetro(Circunferencia circunferencia) {
        return circunferencia.getRadio() * 2 * Math.PI;
    }
}