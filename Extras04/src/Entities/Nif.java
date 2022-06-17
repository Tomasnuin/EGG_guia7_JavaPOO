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
public class Nif {
    
    private int dNI;
    private char letra;
    
    public Nif() {
    }
    
    public char getLetra() {
        return letra;
    }
    
    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public int getDni() {
        return dNI;
    }
    
    public void setDni(int dNI) {
        this.dNI = dNI;
    }
    
    public void crearNif() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese DNI:");
        dNI = read.nextInt();
        final String codigo = "TRWAGMYFPDXBNJZSQVHLCKE";
        letra = codigo.charAt(dNI % 23);
    }
    
    public void mostrar() {
        System.out.format("%08d",dNI);
        System.out.println("-" + letra);
    }
}
