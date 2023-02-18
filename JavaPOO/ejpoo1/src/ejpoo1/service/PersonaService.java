package ejpoo1.service;

import ejpoo1.entidad.Persona;

import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona personaCompleta = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        personaCompleta.setNombre(leer.next());
        return personaCompleta;
    }

    public void mostrarAtributos(Persona persona) {
        System.out.println(persona.getId());
        System.out.println(persona.getAltura());
        System.out.println(persona.getNombre());
    }
}
