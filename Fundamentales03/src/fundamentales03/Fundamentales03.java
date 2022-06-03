/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales03;

import Entities.Operacion;

/**
 *
 * @author tomasnuin
 */
public class Fundamentales03 {

    /**
     * 3. Crear una clase llamada Operacion que tenga como atributos privados
     * numero1 y numero2. A continuación, se deben crear los siguientes métodos:
     *
     * a) Método constructor con todos los atributos pasados por parámetro.
     *
     * b) Método constructor sin los atributos pasados por parámetro.
     *
     * c) Métodos get y set.
     *
     * d) Método para crearOperacion(): que le pide al usuario los dos números y
     * los guarda en los atributos del objeto.
     *
     * e) Método sumar(): calcular la suma de los números y devolver el
     * resultado al main.
     *
     * f) Método restar(): calcular la resta de los números y devolver el
     * resultado al main.
     *
     * g) Método multiplicar(): primero valida que no se haga una multiplicación
     * por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le
     * informa al usuario el error. Si no, se hace la multiplicación y se
     * devuelve el resultado al main. //multiplicar por 0 no esta mal
     *
     * h) Método dividir(): primero valida que no se haga una división por cero,
     * si fuera a pasar una división por cero, el método devuelve 0 y se le
     * informa al usuario el error se le informa al usuario. Si no, se hace la
     * división y se devuelve el resultado al main.
     *
     * @param args
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();

        System.out.println(op.getNum1() + "+" + op.getNum2() + " = " + op.suma());
        System.out.println(op.getNum1() + "-" + op.getNum2() + " = " + op.resta());
        System.out.println(op.getNum1() + "*" + op.getNum2() + " = " + op.multiplicar());
        System.out.println(op.getNum1() + "/" + op.getNum2() + " = " + op.dividir());

    }

}
