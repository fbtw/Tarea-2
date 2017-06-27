package fbtw.app;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Principal {
    private static String ingreso;
    private static int ingreso2;
    private static Biblioteca bangalore = new Biblioteca();
    private static Scanner sc =null;
    private static Tipo tipo = null;
    private static int op2=0;
    private static List<Artículo> listArticulos = new ArrayList<>();
    private static List<Artículo> disponibles = new ArrayList<>();
    private static List<Artículo> prestados = new ArrayList<>();

    public static void main (String[] args) throws Exception {
        sc = new Scanner(in);
        bangalore.setLibros(Editorial.crearLibros(5));


        String menu="bienvenida";
        Imprenta.imprimirInicio();
        do {
            ingreso = sc.nextLine().toLowerCase();
            presYdevu();
            menu=elegir(menu,ingreso);

        }while (!menu.equals("salida"));


    }
    public static void presYdevu(){
        prestados.clear();
        disponibles.clear();
        for (Artículo i : bangalore.getLibros() ){
            if (i.getPrestado()){
                prestados.add(i);
            }else{
                disponibles.add(i);
            }
        }for (Artículo i : bangalore.getRevistas() ){
            if (i.getPrestado()){
                prestados.add(i);
            }else{
                disponibles.add(i);
            }
        }for (Artículo i : bangalore.getTesis() ){
            if (i.getPrestado()){
                prestados.add(i);
            }else{
                disponibles.add(i);
            }
        }for (Artículo i : bangalore.getEnsayos() ){
            if (i.getPrestado()){
                prestados.add(i);
            }else{
                disponibles.add(i);
            }
        }for (Artículo i : bangalore.getBlurays() ){
            if (i.getPrestado()){
                prestados.add(i);
            }else{
                disponibles.add(i);
            }
        }



    }

    public static String elegir (String menu, String op ) {



        //op = sc.nextLine().toLowerCase();
        bangalore.setLibros(Editorial.crearLibros(6));

        Artículo artículo=null;
        switch (menu) {
            case ("bienvenida"):
                if (op.equals("c")) {menu = "principal";
                    Imprenta.imprimirMenú();}
                else {Imprenta.imprimirError();}
                break;
            case ("principal"):
                switch (op) {
                    case "b":
                        menu = "tipo";
                        Imprenta.imprimirMenúTipo();
                        break;
                    case "p":
                        if (disponibles.isEmpty()){Imprenta.imprimirVacio();}
                        else {
                            menu = "pedir";
                            bangalore.detalleArtículos(disponibles);
                            Imprenta.imprimirMenúPedir();
                            listArticulos=disponibles;
                        }
                        break;
                    case "d":
                        if (prestados.isEmpty()){Imprenta.imprimirVacio();}
                        else {
                            menu = "devolver";
                            bangalore.detalleArtículos(prestados);
                            Imprenta.imprimirMenúDevo();
                            listArticulos=prestados;
                        }
                        break;
                    case "s":
                        menu = "salir";
                        Imprenta.imprimirSalida();
                        break;
                    default:Imprenta.imprimirError();
                }
                break;
            case ("tipo"):
                switch (op) {
                    case "l":
                        tipo = Tipo.Libro;
                        if (bangalore.getLibros().isEmpty()){Imprenta.imprimirVacio();}
                        else {menu = "artic";
                            listArticulos = bangalore.getLibros();
                            bangalore.detalleLibrosBiblioteca();}
                        break;
                    case "r":
                        tipo = Tipo.Revista;
                        if (bangalore.getRevistas().isEmpty()){Imprenta.imprimirVacio();}
                        else {menu = "artic";
                        listArticulos = bangalore.getRevistas();
                        //bangalore.detalleRevistasBiblioteca();
                        }
                        break;
                    case "e":
                        tipo = Tipo.Ensayo;
                        if (bangalore.getEnsayos().isEmpty()){Imprenta.imprimirVacio();  }
                        else {menu = "artic";
                        listArticulos = bangalore.getEnsayos();
                        //bangalore.detalleEnsayosBiblioteca();
                        }
                        break;
                    case "t":
                        tipo = Tipo.Tésis;
                        if (bangalore.getTesis().isEmpty()){Imprenta.imprimirVacio(); }
                        else {menu = "artic";listArticulos = bangalore.getTesis();
                        // bangalore.detalleTesisBiblioteca();
                        }
                        break;
                    case "b":
                        tipo = Tipo.Bluray;
                        if (bangalore.getBlurays().isEmpty()){Imprenta.imprimirVacio();   }
                        else {menu = "artic";
                        listArticulos = bangalore.getBlurays();
                        //   bangalore.detalleBruraysBiblioteca();
                        }
                        break;
                    case "a":
                        menu = "principal";
                        break;
                    default: Imprenta.imprimirError();
                }
                break;
            case ("artic"):

                try{
                    op2 = Integer.parseInt(op);
                } catch (NumberFormatException e) {
                    Imprenta.imprimirErrorNúmero();
                    break;
                }
                if (op2>listArticulos.size()){
                    Imprenta.imprimirTamañoNúmero();
                }
                else if ((op2>0)) {
                    menu = "detalle";

                } break;
            case ("detalle"):
                artículo=listArticulos.get(op2-1);
                artículo.detalle();
                Imprenta.imprimirDetalle();
                switch (op) {
                case "p":
                    artículo.pedir();
                    menu = "principal";
                    break;
                case "d":
                    artículo.devolver();
                    menu = "principal";
                    break;
                case "a":
                    menu = "principal";
                    break;
                default:Imprenta.imprimirError();
            }break;
            case ("pedir"):
                try{
                    op2 = Integer.parseInt(op);
                } catch (NumberFormatException e) {
                    Imprenta.imprimirErrorNúmero();
                    break;
                }
                if (op2>disponibles.size()){
                    Imprenta.imprimirTamañoNúmero();
                }
                else if ((op2>0)) {
                    artículo=listArticulos.get(op2-1);
                    artículo.detalle();
                    artículo.pedir();
                    menu = "principal";
                }
                break;
            case ("devolver"):
                try{
                    op2 = Integer.parseInt(op);
                } catch (NumberFormatException e) {
                    Imprenta.imprimirErrorNúmero();
                    break;
                }
                if (op2>prestados.size()){
                    Imprenta.imprimirTamañoNúmero();
                }
                else if ((op2>0)) {
                    artículo=listArticulos.get(op2-1);
                    artículo.detalle();
                    artículo.devolver();
                    menu = "principal";
                }
                break;
        }
        return menu;
    }

}
