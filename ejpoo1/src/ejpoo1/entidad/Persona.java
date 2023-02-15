package ejpoo1.entidad;

public class Persona {
    public String nombre;
    public int id;
    public int altura;

    public Persona(String nombre, int id, int altura) {
        this.nombre = nombre;
        this.id = id;
        this.altura = altura;
    }

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
