package fbtw.app;

import static java.lang.System.out;

abstract class Artículo {

    private String id;
    private String título;
    private Boolean prestado;
    private String autor;
    private int año;
    private CualArtículo cualArtículo;

    Artículo() {
        this.id = "";
        this.título = "";
        this.prestado = false;
        this.autor = "";
        this.año = 0;
    }

    Artículo(String id, String título, Boolean prestado, String autor, int año) {
        this.id = id;
        this.título = título;
        this.prestado = prestado;
        this.autor = autor;
        this.año = año;
    }
    public void pedir(){
        if (!prestado){
            prestado=true;
            out.println("\n"+cualArtículo+" prestado con éxito!");
        }
        else {
            out.println("\n"+"Error: el "+cualArtículo+" no está disponible.");
        }
    }
    public void devolver(){
        if (prestado){
            prestado=false;
            out.println("\n"+cualArtículo+" devuelto con éxito!");
        }
        else{
            out.println("\n"+"Error: El "+cualArtículo+" ya existe.");
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

    CualArtículo getCualArtículo() {
        return cualArtículo;
    }

    void setCualArtículo(CualArtículo cualArtículo) {
        this.cualArtículo = cualArtículo;
    }
}
