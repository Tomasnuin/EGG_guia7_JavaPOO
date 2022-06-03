/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author tomasnuin
 */
public class Libro {
    private final int isbn;
    private final String titulo;
    private final String autor;
    private final int paginas;
    
    public Libro(){
        isbn = -1;
        titulo = null;
        autor = null;
        paginas = -1;
    }
    
    public Libro(int isbn, String titulo, String autor, int paginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public int getISBN() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + isbn + ", Titulo=" + titulo + ", Autor=" + autor + ", Paginas=" + paginas + '}';
    }
    
    
}
