package fbtw.app;

import static java.lang.System.out;

class Artículo {

    private String id;
    private String título;
    private Boolean prestado;
    private String autor;
    private int año;
    private Tipo tipo;


    Artículo() {
        this.id = "";
        this.título = "";
        this.prestado = false;
        this.autor = "";
        this.año = 0;
    }

    public void detalle(){
        String sino;
        if (getPrestado()) sino="NO";
        else sino="SI";
        out.println("\n"+ getTipo()+" # \t" + getId()+
                "\nTítulo: \t" + getTítulo() +
                "\nAutor: \t\t" + getAutor() +
                "\nAño: \t\t" + getAño() +
                "\nDisponible:\t"+sino);
    }
    public void pedir(){
        if (!prestado){
            prestado=true;
            out.println("\n"+ tipo +" prestado con éxito!");
        }
        else {
            out.println("\n"+"Error: el "+ tipo +" no está disponible.");
        }
    }
    public void devolver(){
        if (prestado){
            prestado=false;
            out.println("\n"+ tipo +" devuelto con éxito!");
        }
        else{
            out.println("\n"+"Error: El "+ tipo +" ya existe.");
        }
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    Boolean getPrestado() {
        return prestado;
    }

    void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    String getAutor() {
        return autor;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    int getAño() {
        return año;
    }

    void setAño(int año) {
        this.año = año;
    }

    void setTítulo(String título) {
        this.título = título;
    }

    String getTítulo() {

        return título;
    }

    Tipo getTipo() {
        return tipo;
    }

    void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    enum Tipo {
        Libro,
        Bluray
    }
}
