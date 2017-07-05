package fbtw.app;

import org.junit.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class PrincipalTest  {

    private static final File file = new File("src/resource/usuario.txt");
    private static Scanner sc =null;

    @Before
    public void prep() throws FileNotFoundException {
        sc = new Scanner(file);
        // Cambia el metodo out de System para que escriba en un archivo en vez de en consola.
        PrintStream out = new PrintStream(new FileOutputStream("src/resource/ejemplo5.txt"));
        System.setOut(out);
    }

    @Test
    public void mainTest() throws Exception {
        Principal.sc=sc;
        //datos falsos
        Principal.bangalore.setLibros(Editorial.crearLibros(7));
        Principal.bangalore.setBlurays(Editorial.crearBluray(10));
        Principal.usuario=Principal.usuarioEjemplo();
        String menu="bienvenida";
        Imprenta.imprimirInicio();
        do {
            menu=Principal.elegir(menu);
        }while (!menu.equals("salir"));
        Assert.assertTrue(true);
    }

}