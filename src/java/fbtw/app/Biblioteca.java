package fbtw.app;

import java.util.*;

import static java.lang.System.out;


class Biblioteca {

    private List<Artículo> libros = new ArrayList<>();
    private List<Artículo> blurays = new ArrayList<>();

    public void detalleLibrosBiblioteca(){
        int i=0;
        out.println("\n#\t| \t\t\t   Libro \t\t\t|\t\t   Autor ");
        for(Artículo L:libros){
            out.println((i+1)+"\t| "+L.getTítulo()+"  \t|\t  "+L.getAutor());
            i++;
        }
    }
    public void detalleBluraysBiblioteca(){
        int i=0;
        out.println("\n#\t| \t\t\t Película \t\t\t|\t\t  Director ");
        for(Artículo B:blurays){
            out.println((i+1)+"\t| "+B.getTítulo()+"  \t|\t  "+B.getAutor());
            i++;
        }
    }
    public void detalleArtículos(List<Artículo> lista){
        int i=0;
        out.println("\n#\t| \t\t\t Artículo \t\t\t|\t\t  ID \t\t|\t Tipo de artículo");
        for(Artículo A:lista){
            out.println((i+1)+"\t| "+A.getTítulo()+"  \t|\t  "+A.getId()+"\t\t|\t\t "+A.getTipo());
            i++;
        }
    }

    public List<Artículo> getLibros() {
        return libros;
    }

    public void setLibros(List<Artículo> libros) {
        this.libros = libros;
    }

    public List<Artículo> getBlurays() {
        return blurays;
    }

    public void setBlurays(List<Artículo> blurays) {
        this.blurays = blurays;
    }


}
