package fbtw.app;

import static java.lang.System.out;

class Libro  extends Artículo{

   Libro(){
        super();
        this.setCualArtículo(CualArtículo.Libro);
   }

    public void detalleLibro(){
        String sino;
        if (getPrestado()) sino="NO";
        else sino="SI";
        out.println("\n"+getCualArtículo()+" # \t" + getId()+
                "\nTítulo: \t" + getTítulo() +
                "\nAutor: \t\t" + getAutor() +
                "\nAño: \t\t" + getAño() +
                "\nDisponible:\t"+sino);
    }

}
