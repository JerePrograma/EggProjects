package main;

import entidad.Cuenta;
import service.CuentaService;

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
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1234, 30343445, 200);
        CuentaService service = new CuentaService();
        Cuenta cuenta2 = service.crearCuenta();

        service.consultarDatos(cuenta1);
        service.consultarDatos(cuenta2);

        service.ingresar(cuenta2);
        service.retirar(cuenta2);
        service.extraccionRapida(cuenta2);
        service.consultarSaldo(cuenta2);
    }
}