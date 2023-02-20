package main;
//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para generar el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

import entidad.Rectangulo;
import service.RectanguloService;

public class Main {
    public static void main(String[] args) {
        RectanguloService rectanguloService = new RectanguloService();
        Rectangulo rectangulo = rectanguloService.crearRectangulo();
        Rectangulo rectangulo2 = new Rectangulo(12, 10);

        System.out.println("La superficie del rectángulo es " + rectanguloService.superficie(rectangulo));
        System.out.println("El perímetro del rectángulo es " + rectanguloService.perimetro(rectangulo));
        System.out.println("La superficie del rectángulo es " + rectanguloService.superficie(rectangulo2));
        System.out.println("El perímetro del rectángulo es " + rectanguloService.perimetro(rectangulo2));
    }
}