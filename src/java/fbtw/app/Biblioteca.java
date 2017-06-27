package fbtw.app;

import java.util.*;

import static java.lang.System.out;

class Biblioteca {

    private List<Artículo> libros = new ArrayList<>();
    private List<Artículo> revistas = new ArrayList<>();
    private List<Artículo> ensayos = new ArrayList<>();
    private List<Artículo> tesis = new ArrayList<>();
    private List<Artículo> blurays = new ArrayList<>();

    public void detalleLibrosBiblioteca(){
        int i=0;
        out.println("\n#\t| \t\t\t   Libro \t\t\t|\t\t   Autor ");
        for(Artículo L:libros){
            out.println((i+1)+"\t| "+L.getTítulo()+"  \t|\t  "+L.getAutor());
            i++;
        }
    }
    public void detalleArtículos(List<Artículo> lista){
        int i=0;
        out.println("\n#\t| \t\t\t Artículo \t\t\t|\t\t  ID ");
        for(Artículo L:lista){
            out.println((i+1)+"\t| "+L.getTítulo()+"  \t|\t  "+L.getId());
            i++;
        }
    }

    public List<Artículo> getLibros() {
        return libros;
    }

    public void setLibros(List<Artículo> libros) {
        this.libros = libros;
    }

    public List<Artículo> getRevistas() {
        return revistas;
    }

    public void setRevistas(List<Artículo> revistas) {
        this.revistas = revistas;
    }

    public List<Artículo> getEnsayos() {
        return ensayos;
    }

    public void setEnsayos(List<Artículo> ensayos) {
        this.ensayos = ensayos;
    }

    public List<Artículo> getTesis() {
        return tesis;
    }

    public void setTesis(List<Artículo> tesis) {
        this.tesis = tesis;
    }

    public List<Artículo> getBlurays() {
        return blurays;
    }

    public void setBlurays(List<Artículo> blurays) {
        this.blurays = blurays;
    }
    /*
    public List<Artículo> getArtículos(Tipo tipo) {
        switch (tipo){
            case Libro:return libros;
            case Tésis:return tesis;
            case Revista:return revistas;
            case Ensayo:return ensayos;
            case Bluray:return blurays;
        }
        return null;
    }

    public void setArtículos(List<Artículo> artículos,Tipo tipo) {
        switch (tipo){
            case Libro:this.libros = artículos;
            case Tésis:this.tesis = artículos;
            case Revista:this.revistas = artículos;
            case Ensayo:this.ensayos = artículos;
            case Bluray:this.blurays = artículos;
        }
    }
*/

    /*  En caso de agregar un nuevo artículo simplemente se agregaría:
    *    private List<Revista> revistas = new ArrayList<>();
    *    public void detalleRevistasBiblioteca(){ ... }
    *    get+set revistas;
    */

}
