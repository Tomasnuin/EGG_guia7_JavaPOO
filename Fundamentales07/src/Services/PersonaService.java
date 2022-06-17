/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Persona;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class PersonaService {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Creando objeto persona:");

        System.out.println("Ingresar nombre:");
        String nombre = leer.nextLine();

        System.out.println("Ingresar edad:");
        int edad = leer.nextInt();

        System.out.println("Ingresar peso en kg:");
        double peso = leer.nextDouble();

        System.out.println("Ingresar altura en metros:");
        double altura = leer.nextDouble();

        System.out.println("Ingresar sexo('H', 'M' u 'O'):");
        char sexo = leer.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {

            System.out.println("ERROR: debe ingresar un sexo valido.");
            System.out.println("Ingresar sexo('H', 'M' u 'O'):");
            sexo = leer.next().toUpperCase().charAt(0);

        }

        return new Persona(nombre, edad, peso, altura, sexo);
    }

    public int calcularIMC(Persona p) {

        double imc = p.getPeso() / Math.pow(p.getAltura(), 2);

        if (imc < 20) {
            return -1;
        } else if (imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }
}
