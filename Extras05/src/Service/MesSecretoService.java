/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entities.MesSecreto;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class MesSecretoService {
    
    public void adivinar(){
        MesSecreto ms = new MesSecreto();
        
        Scanner read = new Scanner(System.in);
         
        System.out.println("¡Adivine el mes secreto! \n"
                + "Introduzca el nombre del mes en minúsculas:");
        while (!read.next().equals(ms.getMesSecreto())) {            
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
        }
        System.out.println("¡Ha acertado!");
    }
}
