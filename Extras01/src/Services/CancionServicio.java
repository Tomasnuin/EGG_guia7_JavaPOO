/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Cancion;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class CancionServicio {
    public Cancion CrearCancion(){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Creando canción nueva:");
        System.out.println("Ingresar título:");
        String titulo = r.nextLine();
        System.out.println("Ingresar autor:");
        String autor = r.nextLine();
        return new Cancion(titulo, autor);
        
    }
}
