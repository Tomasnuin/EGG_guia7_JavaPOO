/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Libro;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class LibroService {

    public Libro crearLibro() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el codigo ISBN:");
        final int isbn = leer.nextInt();
        
        System.out.println("Ingrese el título del libro:");
        final String titulo = leer.next();
        
        System.out.println("Ingrese el autor del libro:");
        final String autor = leer.next();
        
        System.out.println("Ingrese la cantidad de paginas que tiene el libro:");
        final int paginas = leer.nextInt();

        return new Libro(isbn, titulo, autor,paginas);
    }

    public void mostrarLibro(Libro l) {
        System.out.println("Libro: " + l.getTitulo() + "\n"
                + "Autor: " + l.getAutor() + "\n"
                + "Paginas: " + l.getPaginas() + "\n"
                + "ISBN: " + l.getISBN() + "\n");
    }
}
