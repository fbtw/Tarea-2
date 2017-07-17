package fbtw.app;

import org.junit.*;


public class ArtículoTest {

    private final Artículo unLibro = new Artículo();


    @Test
    public void títuloTest() throws Exception {
        String tituloLibro = "Qwerty";
        unLibro.setTítulo(tituloLibro);
        Assert.assertEquals("Qwerty",unLibro.getTítulo());
    }
    @Test
    public void idTest() throws Exception {
        String idLibro = "ID2005XDD";
        unLibro.setId(idLibro);
        Assert.assertEquals("ID2005XDD",unLibro.getId());
    }
    @Test
    public void prestadoTest() throws Exception {
        unLibro.setPrestado(true);
        Assert.assertEquals(true,unLibro.getPrestado());
    }
    @Test
    public void autorTest() throws Exception {
        String autorLibro = "Sade";
        unLibro.setAutor(autorLibro);
        Assert.assertEquals("Sade",unLibro.getAutor());
    }
    @Test
    public void añoTest() throws Exception {
        int añoLibro = 1888;
        unLibro.setAño(añoLibro);
        Assert.assertEquals(1888,unLibro.getAño());
    }
    @Test
    public void cualArticuloTest() throws Exception {
        unLibro.setTipo(Artículo.Tipo.Libro);
        Assert.assertEquals(Artículo.Tipo.Libro,unLibro.getTipo());
    }


}