package fbtw.app;

import org.junit.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrincipalTest  {

    private static final File file = new File("src/resource/usuario.txt");
    private static String ingreso;
    private static int ingreso2;
    private static final Biblioteca bangalore = new Biblioteca();
    private static Scanner sc =null;
/*
    @Test
    public  void elegirTest ()throws java.lang.Exception {
       // bangalore.setArtículos(Editorial.crearLibros(6),Tipo.Libro);
        Imprenta.imprimirInicio();

        String op="c";
        String m=Principal.elegir("bienvenida",op);
        Assert.assertEquals("principal", m);
        op="b";
        m=Principal.elegir(m,op);
        Assert.assertEquals("tipo", m);
        op="b";
        m=Principal.elegir(m,op);
        Assert.assertEquals("tipo", m);
        op="l";
        m=Principal.elegir(m,op);
        Assert.assertEquals("artic", m);
        op="1";
        m=Principal.elegir(m,op);
        Assert.assertEquals("detalle", m);
        op="p";
        m=Principal.elegir(m,op);
        Assert.assertEquals("principal", m);
        op="s";
        m=Principal.elegir(m,op);
        Assert.assertEquals("salir", m);
    }
*/

    @Before
    public void prep() throws FileNotFoundException {
        sc = new Scanner(file);
        // Cambia el metodo out de System para que escriba en un archivo en vez de en consola.
        PrintStream out = new PrintStream(new FileOutputStream("src/resource/ejemplo.txt"));
        System.setOut(out);

    }
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


}