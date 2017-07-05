package fbtw.app;

import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import static java.lang.System.out;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class CementerioTest {

    //PrincipalTest.java
    @Test
    public void inicio() throws java.lang.Exception {
        Imprenta.imprimirInicio();
        do {
            ingreso = sc.nextLine().toLowerCase();
            if (ingreso.equals("c")) {
                menú();
                break;
            }
            Imprenta.imprimirError();
        }while (true);
    }

    @Test
    public void menú() throws java.lang.Exception {   //menú
        Imprenta.imprimirMenú();
        do {
            ingreso = sc.nextLine().toLowerCase();

            if (ingreso.equals("b")) {
                menú2();
                break;
            }
            if (ingreso.equals("s")) {
                Imprenta.imprimirSalida();
                break;
            }
            Imprenta.imprimirError();
        }while (true);

    }
    @Test
    public void menú2() throws java.lang.Exception { //buscar
        ingreso2=0;

        bangalore.detalleLibrosBiblioteca();
        // Imprenta.imprimirMenú2();

        do {
            ingreso = sc.nextLine();
            try{
                ingreso2 = Integer.parseInt(ingreso);
            } catch (NumberFormatException e) {
                Imprenta.imprimirErrorNúmero();
            }
            if (ingreso2>bangalore.getLibros().size()){
                Imprenta.imprimirTamañoNúmero();
            }
            else if ((ingreso2>0)) {
                detalle();
                break;
            }
            else
                Imprenta.imprimirError();           //impo
        }while (true);
    }
    @Test
    public void detalle() throws java.lang.Exception {
        if (ingreso2==0)ingreso2=1;
        Artículo libro=bangalore.getLibros().get(ingreso2-1);
        libro.detalle();
        Imprenta.imprimirDetalle();
        do {
            ingreso = sc.nextLine().toLowerCase();

            if (ingreso.equals("p")) {
                libro.pedir();
                menú();
                break;
            }
            if (ingreso.equals("d")) {
                libro.devolver();
                menú();
                break;
            }
            if (ingreso.equals("a")) {
                menú();
                break;
            }
            Imprenta.imprimirError();
        }while (true);
    }

    // Pruebas I/O
    @Test   // [✓]
    public void testScanner() throws Exception {
        File file = new File("src/resource/cinco.txt");
        String txt="5";
        Scanner sc = new Scanner(file);
        out.println("txt 1: "+txt);
        txt=sc.nextLine();
        out.println("txt 2: "+txt);
        Assert.assertEquals("5",txt);
    }
    @Test   // [✓] ✓
    public void testreadFileRelativePath() {
        File file = new File("src/resource/usuario.txt");
        assertTrue(file.exists());
    }
    @Test   // [X]
    public void testReadAsStream() throws IOException {
        InputStream is = this.getClass().getResourceAsStream("/usuario.txt");
        out.println(is);
        assertNotNull(is);
    }
    @Test   // [X]
    public void testReadAsClassLoader() throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL ass = classLoader.getResource("/usuario.txt");
        //Thread.currentThread().getContextClassLoader().getResourceAsStream("usuario.txt"); // /resource/
        out.println(ass);
        assertNotNull(ass);
        File file = new File(ass.getFile());
        assertNotNull(file);
    }
}
