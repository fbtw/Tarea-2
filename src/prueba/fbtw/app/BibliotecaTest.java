package fbtw.app;

import org.junit.*;

public class BibliotecaTest {
    @Test
    public void LibrosTest() throws Exception {
        Biblioteca bangalore = new Biblioteca(Editorial.crearLibros(100));
        bangalore.detalleLibrosBiblioteca();
    }
    @Test
    public void UnLibroTest() throws Exception {
        Biblioteca bangalore = new Biblioteca(Editorial.crearLibros(1));
        //Libro UnLibro = bangalore.getLibros().get(0);
        bangalore.getLibros().get(0).detalleLibro();
    }


}