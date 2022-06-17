/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales06;

import Entities.Nespresso;
import Services.NespressoService;
import java.util.Scanner;

/**
 * 6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera).
 * Implemente, al menos, los siguientes métodos:
 *
 * • Constructor predeterminado o vacío
 *
 * • Constructor con la capacidad máxima y la cantidad actual
 *
 * • Métodos getters y setters.
 *
 * • Método llenarCafetera(): hace que la cantidad actual sea igual a la
 * capacidad máxima.
 *
 * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método
 * recibe el tamaño de la taza y simula la acción de servir la taza con la
 * capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la
 * taza, se sirve lo que quede. El método le informará al usuario si se llenó o
 * no la taza, y de no haberse llenado en cuanto quedó la taza.
 *
 * • Método vaciarCafetera(): pone la cantidad de café actual en cero.
 *
 * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el
 * método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class Fundamentales06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        NespressoService nspS = new NespressoService();

        Nespresso nsp = nspS.crearNespresso();

        Boolean continuar = true;

        while (continuar) {

            /**
             *      Menú 
             * 1) Servir taza 
             * 2) Agregar café 
             * 3) Llenar cafetera 
             * 4) Vaciar cafetera 
             * 5) Salir
             */
            System.out.println(
                      "     Menú \n"
                    + " 1) Servir taza \n"
                    + " 2) Agregar café \n"
                    + " 3) Llenar cafetera \n"
                    + " 4) Vaciar cafetera \n"
                    + " 5) Salir");
            switch (leer.nextInt()) {
                case 1:
                    System.out.println("1) Servir taza:\n"
                            + "Ingrese capacidad de la taza.");
                    nspS.servirTaza(nsp, leer.nextInt());
                    break;
                case 2:
                    System.out.println("1) Agregar café:\n"
                            + "Ingrese cantidad de ml a agregar.");
                    nspS.agregarCafe(nsp, leer.nextInt());
                    break;
                case 3:
                    System.out.println("Llenando cafetera.");
                    nspS.llenarCafetera(nsp);
                    break;
                case 4:
                    System.out.println("Vaciando cafetera.");
                    nspS.vaciarCafetera(nsp);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("ERROR: opción invalida.");
            }
            if (continuar) {
                System.out.println("Presione enter para continuar.");
                leer.nextLine();
                leer.nextLine();
            }
        }
    }

}
