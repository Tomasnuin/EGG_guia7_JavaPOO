package Services;

import Entities.Rectangulo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tomasnuin
 */
public class RectanguloService {

    public Rectangulo crearRectangulo() {
        int base, altura;

        Scanner r = new Scanner(System.in);

        System.out.println("Creando un nuevo rectangulo:");
        System.out.println("Ingresar base:");
        base = r.nextInt();
        System.out.println("Ingresar altura:");
        altura = r.nextInt();

        return new Rectangulo(base, altura);
    }

    public void perimetroRectangulo(Rectangulo r) {
        System.out.println("El perimetro del rectangulo es " + ((r.getAltura() + r.getBase()) * 2));
    }

    public void superficieRectangulo(Rectangulo r) {
        System.out.println("La superficie del rectangulo es " + (r.getAltura() * r.getBase()));
    }

    public void dibujarRectangulo(Rectangulo r) {
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i == 0 || j == 0 || i == r.getAltura()-1 || j == r.getBase()-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
