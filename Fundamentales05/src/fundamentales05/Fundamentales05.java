/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales05;

import Entities.CuentaBancaria;
import Services.CuentaBancariaService;
import java.util.Scanner;

/**
 * 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo
 * los atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el
 * saldo actual (entero). Las operaciones asociadas a dicha clase son:
 *
 * a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e
 * interés.
 *
 * b) Agregar los métodos getters y setters correspondientes
 *
 * c) Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
 *
 * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * ingresar y se la sumara a saldo actual.
 *
 * e) Método retirar(double retiro): el método recibe una cantidad de dinero a
 * retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de
 * dinero a retirar, se pondrá el saldo actual en 0.
 *
 * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
 * Validar que el usuario no saque más del 20%. (supongo que el usuario debería
 * tener que volver a ingresar para sacar otro 20%)
 *
 * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la
 * cuenta.
 *
 * h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 */
public class Fundamentales05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        CuentaBancariaService cbS = new CuentaBancariaService();
        CuentaBancaria cb = cbS.crearCuentaBancaria();
        boolean continuar = true;

        while (continuar) {
            System.out.println(
                    "==========================\n"
                    + "=        Menú:           =\n"
                    + "= 1) Ingresar monto.     =\n"
                    + "= 2) Retirar fondos.     =\n"
                    + "= 3) Extracción rápida.  =\n"
                    + "= 4) Consultar datos.    =\n"
                    + "= 5) Consultar saldo.    =\n"
                    + "= 6) Salir.              =\n"
                    + "= Ingrese una opción.    =\n"
                    + "==========================\n");

            switch (r.nextInt()) {
                case 1:
                    System.out.println("Ingrese el monto a ingresar.");
                    cbS.ingresar(cb, r.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar.");
                    cbS.retirar(cb, r.nextDouble());
                    break;
                case 3:
                    System.out.println("Tenga en cuenta que solo puede realizar este tipo de extraccion 1 vez por sesión");
                    cbS.extraccionRapida(cb);
                    break;
                case 4:
                    System.out.println("Datos de la cuenta:");
                    cbS.consultarDatos(cb);
                    break;
                case 5:
                    System.out.println("Saldo disponible:");
                    cbS.consultarSaldo(cb);
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("ERROR: opción inválida.");
            }
            if (continuar) {
                System.out.println("Presione enter para continuar.");
                r.nextLine();
                r.nextLine();
            }
        }

    }

}
