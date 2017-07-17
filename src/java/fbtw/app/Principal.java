package fbtw.app;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

class Principal {
    private static String ingreso;
     static final Biblioteca bangalore = new Biblioteca();
    static Scanner sc =null;
    //private static Tipo tipo = null;
    private static int op2=0;
     static Usuario usuario;
    private static List<Artículo> listArticulos = new ArrayList<>();
    private static final List<Artículo> disponibles = new ArrayList<>();
    private static final List<Artículo> prestados = new ArrayList<>();

    public static void main (String[] args) throws Exception {
        sc = new Scanner(in);
        //datos falsos
        bangalore.setLibros(Inventor.crearLibros(6));
        bangalore.setBlurays(Inventor.crearBluray(5));
        usuario=Inventor.crearUsuario();
        String menu="bienvenida";
        Imprenta.imprimirInicio();
        do {
            menu=elegir(menu);
        }while (!menu.equals("salir"));
    }

    static String elegir (String menu ) {
        presYdevu();
        switch (menu) {
            case ("bienvenida"):
                menu= menúBienvenida();
                break;
            case ("usuario"):
                menu= menúUsuario();
                break;
            case ("contraseña"):
                menu= menúContraseña();
                break;
            case ("principal"):
                menu= menúPrincipal();
                break;
            case ("tipo"):
                menu= menúTipo();
                break;
            case ("artic"):
                menu= menúArticulo();
                break;
            case ("detalle"):
                menu= menúDetalle();
                break;
            case ("prestar"):
                menu= menúPrestar();
                break;
            case ("devolver"):
                menu= menúDevolver();
                break;
        }
        return menu;
    }

    private static String menúBienvenida(){
        String menu="bienvenida";
        ingreso = sc.nextLine().toLowerCase();
        if (ingreso.equals("c")) {menu = "usuario";
        }
        else {Imprenta.imprimirError();}
        return menu;
    }

    private static String menúUsuario(){
        String menu="usuario";
        Imprenta.imprimirUsuario();
        ingreso = sc.nextLine();
        if (ingreso.equals(usuario.getID())) {menu = "contraseña";
        }
        else {Imprenta.imprimirErrorUsuario();}
        return menu;
    }

    private static String menúContraseña(){
        String menu="contraseña";
        Imprenta.imprimirContraseña();
        ingreso = sc.nextLine();
        if (ingreso.equals(usuario.getPass())) {menu = "principal";
        }
        else {Imprenta.imprimirErrorContraseña();}
        return menu;
    }

    private static String menúPrincipal(){
        String menu="principal";
        Imprenta.imprimirMenú();
        ingreso = sc.nextLine().toLowerCase();
        switch (ingreso) {
            case "b":
                menu = "tipo";
                break;
            case "d":
                if (prestados.isEmpty()){Imprenta.imprimirVacio();}
                else {
                    menu = "devolver";
                    bangalore.detalleArtículos(prestados);
                    listArticulos=prestados;
                }
                break;
            case "p":
                if (disponibles.isEmpty()){Imprenta.imprimirVacio();}
                else {
                    menu = "prestar";
                    bangalore.detalleArtículos(disponibles);
                    listArticulos=disponibles;
                }
                break;
            case "i":
                usuario.imprimirInformación();

                break;
            case "s":
                menu = "salir";
                Imprenta.imprimirSalida();
                break;
            default:Imprenta.imprimirError();
        }
        return menu;
    }

    private static String menúPrestar(){
         String menu="prestar";
        Imprenta.imprimirMenúPedir();
        ingreso = sc.nextLine().toLowerCase();
        try{
            op2 = Integer.parseInt(ingreso);
            if (op2>listArticulos.size()){
                Imprenta.imprimirTamañoNúmero();
            }
            else if ((op2>0)) {
                Artículo artículo=listArticulos.get(op2-1);
                artículo.detalle();
                artículo.pedir();
                menu = "principal";
            }
        } catch (NumberFormatException e) {
            Imprenta.imprimirErrorNúmero();

        }

        return menu;
    }

    private static String menúDevolver(){
        String menu="devolver";
        Imprenta.imprimirMenúDevo();
        ingreso = sc.nextLine().toLowerCase();
        try{
            op2 = Integer.parseInt(ingreso);
            if (op2>listArticulos.size()){
                Imprenta.imprimirTamañoNúmero();
            }
            else if ((op2>0)) {
                Artículo artículo=listArticulos.get(op2-1);
                artículo.detalle();
                artículo.devolver();
                menu = "principal";
            }
        } catch (NumberFormatException e) {
            Imprenta.imprimirErrorNúmero();
        }
        return menu;
    }

    private static String menúTipo(){
         String menu="tipo";

        Imprenta.imprimirMenúTipo();
        ingreso = sc.nextLine().toLowerCase();
        switch (ingreso) {
            case "l":
                if (bangalore.getLibros().isEmpty()){Imprenta.imprimirVacio();}
                else {menu = "artic";
                    listArticulos = bangalore.getLibros();
                    bangalore.detalleLibrosBiblioteca();}
                break;

            case "b":
                if (bangalore.getBlurays().isEmpty()){Imprenta.imprimirVacio();   }
                else {menu = "artic";
                    listArticulos = bangalore.getBlurays();
                    bangalore.detalleBluraysBiblioteca();
                }
                break;
            case "a":
                menu = "principal";
                break;
            default: Imprenta.imprimirError();
        }
        return menu;
    }

    private static String menúArticulo(){
        String menu="artic";
        ingreso = sc.nextLine();
        try{
            op2 = Integer.parseInt(ingreso);
            if (op2>listArticulos.size()){
                Imprenta.imprimirTamañoNúmero();
            }
            else if ((op2>0)) {
                menu = "detalle";

            }
        } catch (NumberFormatException e) {
            Imprenta.imprimirErrorNúmero();
        }
        return menu;
    }

    private static String menúDetalle(){
        String menu="detalle";
        Artículo artículo=listArticulos.get(op2-1);
        artículo.detalle();
        Imprenta.imprimirDetalle();
        ingreso = sc.nextLine().toLowerCase();
        switch (ingreso) {
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
        }
        return menu;
    }
    private static void presYdevu(){
        prestados.clear();
        disponibles.clear();
        for (Artículo i : bangalore.getLibros() ){
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


}
