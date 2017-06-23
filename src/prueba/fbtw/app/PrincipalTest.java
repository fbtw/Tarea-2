package fbtw.app;

import org.junit.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.out;

public class PrincipalTest  {

    private final File file = new File("src/resource/usuario.txt");
    private String ingreso;
    private int ingreso2;
    private final Biblioteca bangalore = new Biblioteca(Editorial.crearLibros(10));
    private Scanner sc =null;

    @Before
    public void prep() throws FileNotFoundException {
        sc = new Scanner(file);
        // Cambia el metodo out de System para que escriba en un archivo en vez de en consola.
        PrintStream out = new PrintStream(new FileOutputStream("src/resource/ejemplo4.txt"));
        System.setOut(out);

    }
    @Test
    public void inicio() throws java.lang.Exception {
        do {
            ingreso = sc.nextLine().toLowerCase();
            Imprenta.imprimirInicio(ingreso);
            if (ingreso.equals("c")) {
                menú();
                break;
            }
            Imprenta.imprimirError();
        }while (true);
    }

    @Test
    public void menú() throws java.lang.Exception {   //menú
        do {
            ingreso = sc.nextLine().toLowerCase();
            Imprenta.imprimirMenú(ingreso);
            if (ingreso.equals("b")) {
                menú2();
                break;
            }
            if (ingreso.equals("s")) {
                salir();
                break;
            }
            Imprenta.imprimirError();
        }while (true);

    }
    @Test
    public void menú2() throws java.lang.Exception { //buscar
        ingreso2=0;
        do {
            ingreso = sc.nextLine();
            try{
                ingreso2 = Integer.parseInt(ingreso);
            } catch (NumberFormatException e) {
                Imprenta.imprimirErrorNúmero();
            }
            bangalore.detalleLibrosBiblioteca();
            Imprenta.imprimirMenú2(ingreso2);
            if (ingreso2>bangalore.getLibros().size()){
                Imprenta.imprimirTamañoNúmero();
            }
            else if ((ingreso2>0)) {
                detalle();
                break;
            }
            else
                Imprenta.imprimirError();
        }while (true);
    }
    @Test
    public void detalle() throws java.lang.Exception {
        do {
            ingreso = sc.nextLine().toLowerCase();
            if (ingreso2==0)ingreso2=1;    //Solo para probar detalle() de forma individual
            Libro libroDetallado = bangalore.getLibros().get(ingreso2-1);
            libroDetallado.detalleLibro();

            Imprenta.imprimirDetalle(ingreso);

            if (ingreso.equals("p")) {
                libroDetallado.pedir();
                menú();
                break;
            }
            if (ingreso.equals("d")) {
                libroDetallado.devolver();
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

    @Test
    public void salir() {
        out.println("\n\n\tGracias por venir.");
    }

}