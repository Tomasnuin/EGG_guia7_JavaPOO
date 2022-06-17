/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class Fundamentales11 {

    /**
     * 11. Pongamos de lado un momento el concepto de POO, ahora vamos a
     * trabajar solo con la clase Date. En este ejercicio deberemos instanciar
     * en el main, una fecha usando la clase Date, para esto vamos a tener que
     * crear 3 variables, dia, mes y anio que se le pedirán al usuario para
     * poner el constructor del objeto Date. Una vez creada la fecha de tipo
     * Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
     * fecha actual, que se puede conseguir instanciando un objeto Date con
     * constructor vacío.
     *
     * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     *
     * Ejemplo fecha actual: Date fechaActual = new Date();
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int dia, mes, anio;

        System.out.println("A continuacion ingrese una fecha:\n"
                + "Dia: ");
        dia = r.nextInt();
        System.out.println("Mes:");
        mes = r.nextInt();
        System.out.println("Año:");
        anio = r.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Fecha elegida: " + fecha);
        Date fechaActual = new Date();

        System.out.println("Fecha actual: " + fechaActual);
        if (fechaActual.getMonth() - fecha.getMonth() < 0
                && fechaActual.getDay() - fecha.getDay() < 0) {
            System.out.println("La diferencia de tiempo entre le fecha elegida y la \n"
                    + "fecha actual es de " + Math.abs(fecha.getDay() - fechaActual.getDay()) + " dias, \n"
                    + Math.abs(fecha.getMonth() - fechaActual.getMonth()) + " meses y \n"
                    + (Math.abs(fecha.getYear() - fechaActual.getYear()) - 1) + " años.");
        } else {

            System.out.println("La diferencia de tiempo entre le fecha elegida y la \n"
                    + "fecha actual es de " + Math.abs(fechaActual.getDay() - fecha.getDay()) + " dias, \n"
                    + Math.abs(fechaActual.getMonth() - fecha.getMonth()) + " meses y \n"
                    + Math.abs(fechaActual.getYear() - fecha.getYear()) + " años.");
        }

    }

}
