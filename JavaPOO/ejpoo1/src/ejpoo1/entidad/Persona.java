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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAltura() {
        return altura;
    }
}