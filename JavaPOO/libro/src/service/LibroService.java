package service;

import identidad.Libro;

import java.util.Scanner;

//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
public class LibroService {
    Scanner sc = new Scanner(System.in);

    public Libro crearLibro() {
        Libro libro = new Libro();
        System.out.println("Ingresa el ISBN");
        libro.setISBN(sc.next());
        System.out.println("Ingresa el título");
        libro.setTitulo(sc.nextLine());
        libro.setTitulo(sc.nextLine());
        System.out.println("Ingresa el autor");
        libro.setAutor(sc.nextLine());
        System.out.println("Ingresa la cantidad de páginas");
        libro.setNumeroPaginas(sc.nextInt());
        return libro;
    }
}