/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Puntos;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class PuntosService {

    public Puntos CrearPuntos() {

        Scanner r = new Scanner(System.in);
        System.out.println("Creando dos puntos:");
        System.out.println("Primer punto:");
        System.out.println("x:");
        int x1 = r.nextInt();
        System.out.println("y:");
        int y1 = r.nextInt();
        System.out.println("Segundo punto:");
        System.out.println("x:");
        int x2 = r.nextInt();
        System.out.println("y:");
        int y2 = r.nextInt();

        return new Puntos(x1, y1, x2, y2);
    }
    
    public void distanciaEntrePuntos(Puntos pts){
        
        System.out.println("La distancia entre los dos puntos es " 
                + Math.sqrt( Math.pow(pts.getX1()-pts.getX2(), 2) + Math.pow(pts.getY1()-pts.getY2(), 2) ));
        
    }
}
