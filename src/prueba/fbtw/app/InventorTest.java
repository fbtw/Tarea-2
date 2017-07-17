package fbtw.app;

import org.junit.*;

import static java.lang.System.out;


public class InventorTest {
    @Test
    public void crearDirector() throws Exception {
        String d = Inventor.crearDirector();
        out.print(d);
        Assert.assertEquals("Alejandro Iñárritu", d );
    }

    @Test
    public void crearAutor() throws Exception {
        String a = Inventor.crearAutor();
        out.println(a);
        Assert.assertEquals("Anthony Del Toro",a);
    }

    @Test
    public void crearTítulo() throws Exception {
        String t = Inventor.crearTítulo();
        out.println(t);
        Assert.assertEquals("La era de los imperios    ",t);
    }

    @Test
    public void crearBooleano() throws Exception {
        Boolean b = Inventor.crearBooleano();
        out.println(b);
        Assert.assertEquals(true,b);
    }

    @Test
    public void crearID() throws Exception {
        String s = Inventor.crearID();
        out.println(s);
        Assert.assertEquals("AAAAAAAA",s);
    }
    @Test
    public void crearUsuario() throws Exception {
        Usuario u = Inventor.crearUsuario();
        u.imprimirInformación();
        Assert.assertEquals("asd-1234", u.getID());
    }

}