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
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public void setFrase() {
        Scanner leer = new Scanner(System.in);
        String nueva = leer.nextLine();
        if ("\"\"".equals(nueva)) {
            System.out.println("No se modifico la frase.");
        } else {
            this.frase = nueva;
            longitud = this.frase.length();
        }
        System.out.println("frase: " + frase);
    }

    public void mostrarVocales() {
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        System.out.println(frase);

        for (int j = 0; j < longitud; j++) {
            switch (frase.substring(j, j + 1).toLowerCase()) {
                case "a":
                    a++;
                    break;
                case "e":
                    e++;
                    break;
                case "i":
                    i++;
                    break;
                case "o":
                    o++;
                    break;
                case "u":
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(
                "La frase tiene " + (a + e + i + o + u) + " vocales: \n"
                + "a = " + a + "\n"
                + "e = " + e + "\n"
                + "i = " + i + "\n"
                + "o = " + o + "\n"
                + "u = " + u);

    }

    public void invertirFrase() {
        System.out.println(frase);
        String aux = "";
        for (int i = 0; i < longitud; i++) {
            aux += frase.substring(longitud - i - 1, longitud - i);
        }
        frase = aux;
        System.out.println("Cadena invertida: \n"
                + frase);
    }

    public void vecesRepetido(String letra) {
        // Prefiero usar un char en vez de un string
        System.out.println(frase);
        int repetido = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                repetido++;
            }
        }

        if (repetido == 0) {
            System.out.println(letra + " no se repite en la frase.");
        } else {
            System.out.println("La letra " + letra.charAt(0) + " se repite " + repetido
                    + " veces.");
        }
    }

    public void compararLongitud(String frase) {
        System.out.println(this.frase);
        if (frase.length() == longitud) {
            System.out.println("La frase ingresada tiene la misma longitud.");
        } else if (frase.length() > longitud) {
            System.out.println("La frase ingresada es de mayor longitud.");
        } else {
            System.out.println("La frase ingresada es de menor longitud.");
        }
    }

    public Cadena unirFrases(String frase) {
        longitud += frase.length();
        this.frase += frase;
        System.out.println(this.frase);
        return this;
    }

    /**
     * Método reemplazar(String letra), deberá reemplazar todas las letras “a”
     * que se encuentren en la frase, por algún otro carácter seleccionado por
     * el usuario y mostrar la frase resultante.
     *
     * @param letra
     */
    public void reemplazar(String letra) {
        if ("no".equals(letra.toLowerCase())) {
            System.out.println("No se ha modificado la frase.");
        } else {
            frase = frase.replace('a', letra.charAt(0));
            System.out.println(frase);
        }
    }

    public boolean contiene(String letra) {

        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
