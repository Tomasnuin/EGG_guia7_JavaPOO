/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author tomasnuin
 */
public class CuentaBancaria {

    private int numeroCuenta;
    private int DNICliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int DNICliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNICliente = DNICliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(int DNICliente) {
        this.DNICliente = DNICliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    
}
