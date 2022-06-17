/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales10;

import java.util.Arrays;

/**
 * 10. Realizar un programa en Java donde se creen dos arreglos: el primero será
 * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
public class Fundamentales10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] a = new double[50];
        double[] b = new double[20];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random()*10;
        }
        mostrarArreglo(a);
        Arrays.sort(a);
        mostrarArreglo(a);
    }
    
    public static void mostrarArreglo(double[] n){
        System.out.print("Arreglo[");
        for (double d : n) {
            System.out.print(d + ", ");
        }
        System.out.print("]\n");
    }

}