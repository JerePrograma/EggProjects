package service;

import entidad.Rectangulo;

import java.util.Scanner;

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para generar el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
public class RectanguloService {
    Scanner sc = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingresa la base");
        rectangulo.setBase(sc.nextInt());
        System.out.println("Ingresa la altura");
        rectangulo.setAltura(sc.nextInt());
        return rectangulo;
    }

    public int superficie(Rectangulo rectangulo) {
        return rectangulo.getAltura() * rectangulo.getBase();
    }

    public int perimetro(Rectangulo rectangulo) {
        return (rectangulo.getAltura() + rectangulo.getBase()) * 2;
    }
}