/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class Operacion {

    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        num1 = read.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = read.nextInt();
    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 + num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        if (num2 == 0) {
            System.out.println("ERROR: Division por cero");
            return 0;
        } else {
            return (double)num1 / num2;
        }
    }

}
