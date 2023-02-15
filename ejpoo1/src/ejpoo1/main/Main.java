package ejpoo1.main;

import ejpoo1.entidad.Persona;
import ejpoo1.service.PersonaService;

public class Main {
    public static void main(String[] args) {
        Persona primeraPersona = new Persona("Jeremías", 12345678, 168);
        Persona segundaPersona = new Persona("Mariano");
        PersonaService persService = new PersonaService();
        Persona terceraPersona = persService.crearPersona();
        System.out.println(primeraPersona.getId());
        segundaPersona.setId(98765412);
        System.out.println(segundaPersona.getId());
        persService.mostrarAtributos(terceraPersona);
    }
}