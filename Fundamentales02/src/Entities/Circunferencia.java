/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el radio de la circunferencia: ");
        radio = leer.nextDouble();
    }
    
    public double area(){
        return Math.PI * radio*radio;
    }
    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
