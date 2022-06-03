/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales02;

import Entities.Circunferencia;
import java.util.Scanner;

/**
 * 2. Declarar una clase llamada Circunferencia que tenga como atributo privado 
 * el radio de tipo real. A continuación, se deben crear los siguientes métodos:
 * 
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * 
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * 
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda 
 *    en el atributo del objeto.
 * 
 * d) Método area(): para calcular el área de la circunferencia (Area = π * radio²).
 * 
 * e) Método perimetro(): para calcular el perímetro (Perímetro = 2 * π * radio).
 */

public class Fundamentales02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia circulo = new Circunferencia();
        circulo.crearCircunferencia();
        
        System.out.println("Area del circulo: " + circulo.area());
        System.out.println("Perímetro del circulo: " + circulo.area());
        
    }
    
}
