package fbtw.app;

import org.junit.*;

import java.io.File;
import java.util.Scanner;


public class IngresoTest {
    private static final File file = new File("src/resource/usuario.txt");

    @Test
    public void ingresarTest() throws java.lang.Exception{
        Scanner sc = new Scanner(file);
        Usuario usuario = new Usuario();
        usuario.setID("asd-1234");
        usuario.setPass("pass");

        String usr= sc.nextLine();
        Assert.assertEquals(usuario.getID(),usr);
        String pss= sc.nextLine();
        Assert.assertEquals(usuario.getPass(),pss);
    }

}