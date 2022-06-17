/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class CuentaBancariaService {

    private static boolean retiroRapido = false;

    public CuentaBancaria crearCuentaBancaria() {
        Scanner r = new Scanner(System.in);

        System.out.println("Creando nueva cuenta bancaria:");
        System.out.println("Ingresar número de cuenta:");
        int numeroCuenta = r.nextInt();
        System.out.println("Ingresar D.N.I. de cuenta:");
        int DNICliente = r.nextInt();

        return new CuentaBancaria(numeroCuenta, DNICliente, 0);
    }

    public void ingresar(CuentaBancaria cb, double ingreso) {
        cb.setSaldoActual(cb.getSaldoActual() + ingreso);

        System.out.println("Usted ha ingresado $" + ingreso + " pesos.");
    }

    public void retirar(CuentaBancaria cb, double retiro) {

        if (cb.getSaldoActual() < retiro) {
            System.out.println("Cantidad a retirar excede el saldo actual.");
            System.out.println("Se han ratirado $" + cb.getSaldoActual() + " pesos.");
            cb.setSaldoActual(0);
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - retiro);
            System.out.println("Se han retirado $" + retiro + " pesos.");
            System.out.println("Saldo restante: $" + cb.getSaldoActual() + " pesos.");
        }

    }

    public void extraccionRapida(CuentaBancaria cb) {
        if (!retiroRapido) {
            System.out.println("Se ha retirado 20% de su saldo como extracción rápida.");
            cb.setSaldoActual(cb.getSaldoActual() - cb.getSaldoActual() * 0.2);
            retiroRapido = true;
        } else {
            System.out.println("Acción anulada: Solo puede realizar una extracción rapida por sesión.");
        }

    }

    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Saldo disponible: $" + cb.getSaldoActual());

    }

    public void consultarDatos(CuentaBancaria cb) {
        System.out.println("Número de cuenta: " + cb.getNumeroCuenta());
        System.out.println("DNI del usuario: " + cb.getDNICliente());

    }

}
