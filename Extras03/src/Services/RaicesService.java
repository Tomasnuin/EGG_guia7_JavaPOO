/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Raices;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class RaicesService {

    public Raices crearRaices() {
        Scanner r = new Scanner(System.in);

        System.out.println("Ingresar a:");
        int a = r.nextInt();
        System.out.println("Ingresar b:");
        int b = r.nextInt();
        System.out.println("Ingresar c:");
        int c = r.nextInt();

        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices ra) {
        return Math.pow(ra.getB(), 2) - 4 * ra.getA() * ra.getC();
    }

    public boolean tieneRaices(Raices ra) {
        return getDiscriminante(ra) > 0;
    }

    public boolean tieneRaiz(Raices ra) {
        
        return getDiscriminante(ra) == 0;
    }

    public void obtenerRaices(Raices ra) {
        double r1, r2;
        if (tieneRaices(ra)) {
            r1 = (-ra.getB() + Math.sqrt(getDiscriminante(ra))) / (2 * ra.getA());
            r2 = (-ra.getB() - Math.sqrt(getDiscriminante(ra))) / (2 * ra.getA());
            System.out.println("Las raices de la ecuación son " + r1 + " y " + r2);
        }
    }

    public void obtenerRaiz(Raices ra) {
        double r1Y2;
        if (tieneRaiz(ra)) {
            r1Y2 = (-ra.getB() + Math.sqrt(getDiscriminante(ra))) / (2 * ra.getA());
            System.out.println("La ecuación tiene dos soluciones y son " + r1Y2);
        }
    }

    public void calcular(Raices ra) {
        // Formula para calcular raices (-b±√((b^2)-(4*a*c)))/(2*a)
        System.out.println("Obteniendo raices.");
        obtenerRaices(ra);
        obtenerRaiz(ra);
    }

}
