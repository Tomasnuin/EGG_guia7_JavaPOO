/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Nespresso;

/**
 *
 * @author tomasnuin
 */
public class NespressoService {

    public Nespresso crearNespresso() {
        java.util.Scanner leer = new java.util.Scanner(System.in);

        System.out.println("Ingresar capacidad máxima.");
        int capMax = leer.nextInt();

        System.out.println("Ingresar capacidad actual.");
        int capActual = leer.nextInt();
        while (capActual > capMax) {
            System.out.println("ERROR: capacidad actual excede capacidad máxima.");
            System.out.println("Ingrese capacidad actual.");
            capActual = leer.nextInt();
        }

        return new Nespresso(capMax, capActual);
    }

    public void llenarCafetera(Nespresso nsp) {
        nsp.setCapacidadActual(nsp.getCapacidadMaxima());
    }

    public void servirTaza(Nespresso nsp, int capacidad) {

        if (nsp.getCapacidadActual() < capacidad) {
            System.out.println("No hubo suficiente café para llenar la taza.");
            System.out.println("Solo se lleno con " + nsp.getCapacidadActual() + " ml\n "
                    + "de café.");
            vaciarCafetera(nsp);

        } else {
            System.out.println("Sirviendo taza.");
            nsp.setCapacidadActual(nsp.getCapacidadActual() - capacidad);
            System.out.println("La cafetera tiene " + nsp.getCapacidadActual() 
                    + " ml de café.");
        }

    }

    public void vaciarCafetera(Nespresso nsp) {
        nsp.setCapacidadActual(0);
    }

    public void agregarCafe(Nespresso nsp, int cantidad) {
        /* Si se agrega mas café que la cantidad máxima, se llena la cafetera
        y se manda un mensaje de que la cantidad excedio el máximo.
         */

        if (nsp.getCapacidadMaxima() < nsp.getCapacidadActual() + cantidad) {
            System.out.println("Se ha excedido la capacidad máxima.");
            System.out.println("Se ha llenado la cafetera y sobró "
                    + ((nsp.getCapacidadActual() + cantidad) - nsp.getCapacidadMaxima())
                    + " ml de café.");
            llenarCafetera(nsp);
        } else {
            System.out.println("Llenando la cafetera con " + cantidad + " ml de café.");
            nsp.setCapacidadActual(nsp.getCapacidadActual() + cantidad);
        }
    }
}
