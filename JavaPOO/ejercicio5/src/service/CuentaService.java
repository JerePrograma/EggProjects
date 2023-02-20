package service;

import entidad.Cuenta;

import java.util.Scanner;

//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
//Las operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumará a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//f) Método extracciónRápida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
public class CuentaService {
    Scanner sc = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese el número de cuenta");
        cuenta.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        cuenta.setDNI(sc.nextLong());
        System.out.println("Ingrese el saldo de la cuenta");
        cuenta.setSaldo(sc.nextDouble());
        return cuenta;
    }

    public void ingresar(Cuenta cuenta) {
        System.out.println("Ingrese el dinero que desea depositar");
        cuenta.setSaldo(cuenta.getSaldo() + sc.nextDouble());
        System.out.println("En la cuenta quedó saldo de " + cuenta.getSaldo());
    }

    public void retirar(Cuenta cuenta) {
        System.out.println("Ingresa el dinero que desea retirar");
        double retiro = sc.nextDouble();
        if (retiro > cuenta.getSaldo()) {
            System.out.println("Se retiraron " + cuenta.getSaldo());
            cuenta.setSaldo(0);
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
            System.out.println("En la cuenta quedó saldo de " + cuenta.getSaldo());
        }
    }

    public void extraccionRapida(Cuenta cuenta) {
        double veintePorCien = cuenta.getSaldo() * 0.2;
        System.out.println("Extrajo " + veintePorCien);
        cuenta.setSaldo(cuenta.getSaldo() - veintePorCien);
    }

    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("El saldo de la cuenta " + cuenta.getNumeroCuenta() + " es " + cuenta.getSaldo());
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println("Los datos de la cuenta son: ");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getDNI());
    }
}
