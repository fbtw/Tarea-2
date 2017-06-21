package fbtw.app;

import java.util.*;

import static java.lang.System.out;

class Biblioteca {

    private List<Libro> libros = new ArrayList<>();


    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    public void detalleLibrosBiblioteca(){
        int i=0;
        out.println("\n#\t| \t\t\t   Libro \t\t\t|\t\t   Autor ");
        for(Libro L:libros){
            out.println((i+1)+"\t| "+L.getTítulo()+"  \t|\t  "+L.getAutor());
            i++;
        }
    }

    public List<Libro> getLibros() {
        return libros;
    }

    //Ingresar libros apartir de una base de datos:
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /*  En caso de agregar un nuevo artículo simplemente se agregaría:
    *    private List<Revista> revistas = new ArrayList<>();
    *    public void detalleRevistasBiblioteca(){ ... }
    *    get+set revistas;
    */

}
