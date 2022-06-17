/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales09;

import Entities.Matematica;
import Services.MatematicaService;
import java.util.Scanner;

/**
 * 9. Realizar una clase llamada Matemática que tenga como atributos dos números
 * reales con los cuales se realizarán diferentes operaciones matemáticas. La
 * clase deber tener un constructor vacío, parametrizado y get y set. En el main
 * se creará el objeto y se usará el Math.random para generar los dos números y
 * se guardaran en el objeto con su respectivos set. Deberá además implementar
 * los siguientes métodos:
 *
 * a) Método devolverMayor() para retornar cuál de los dos atributos tiene el
 * mayor valor.
 *
 * b) Método calcularPotencia() para calcular la potencia del mayor valor de la
 * clase elevado al menor número. Previamente se deben redondear ambos valores.
 *
 * c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos
 * valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
 * del número.
 */
public class Fundamentales09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        MatematicaService mateS = new MatematicaService();
        boolean continuar = true;
        Matematica mate = mateS.CrearMatematica();

        System.out.println("n1 = " + mate.getN1() + "\n"
                + "n2 = " + mate.getN2());
        
        while (continuar) {   
        System.out.println(""
                + "             Menú \n"
                + "a) Indica cual es el número mayor.\n"
                + "b) Elevar el mayor a la potencia del menor (redondeado).\n"
                + "c) Calcula la raiz cuadrada del menor.\n"
                + "q) Salir del programa.\n"
                + "\n"
                + "Ingrese una opción.\n");
        
            switch (r.next().toLowerCase().charAt(0)) {
                case 'a':
                    System.out.println("El mayor de los dos numeros es " + mateS.devolverMayor(mate));
                    break;
                case 'b':
                    mateS.calcularPotencia(mate);
                    break;
                case 'c':
                    mateS.calculaRaiz(mate);
                    break;
                case 'q':
                    continuar = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

}
