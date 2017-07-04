package fbtw.app;

import org.junit.*;

import static java.lang.System.out;


public class EditorialTest {
    @Test
    public void crearDirector() throws Exception {
        String d = Editorial.crearDirector();
        out.print(d);
        Assert.assertEquals("Alejandro Iñárritu", d );
    }

    @Test
    public void crearAutor() throws Exception {
        String a = Editorial.crearAutor();
        out.println(a);
        Assert.assertEquals("Anthony Del Toro",a);
    }

    @Test
    public void crearTítulo() throws Exception {
        String t = Editorial.crearTítulo();
        out.println(t);
        Assert.assertEquals("La era de los imperios    ",t);
    }

    @Test
    public void crearBooleano() throws Exception {
        Boolean b = Editorial.crearBooleano();
        out.println(b);
        Assert.assertEquals(true,b);
    }

    @Test
    public void crearID() throws Exception {
        String s = Editorial.crearID();
        out.println(s);
        Assert.assertEquals("AAAAAAAA",s);
    }

}