package fbtw.app;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

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
        bangalore.setLibros(Editorial.crearLibros(6));
        bangalore.setBlurays(Editorial.crearBluray(5));
        usuario=usuarioEjemplo();
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
                menu=mBienvenida();
                break;
            case ("usuario"):
                menu=mUsuario();
                break;
            case ("contraseña"):
                menu=mContraseña();
                break;
            case ("principal"):
                menu=mPrincipal();
                break;
            case ("tipo"):
                menu=mTipo();
                break;
            case ("artic"):
                menu=mArtic();
                break;
            case ("detalle"):
                menu=mDetalle();
                break;
            case ("prestar"):
                menu=mPrestar();
                break;
            case ("devolver"):
                menu=mDevolver();
                break;
        }
        return menu;
    }

    private static String mBienvenida(){
        String menu="bienvenida";
        ingreso = sc.nextLine().toLowerCase();
        if (ingreso.equals("c")) {menu = "usuario";
        }
        else {Imprenta.imprimirError();}
        return menu;
    }

    private static String mUsuario(){
        String menu="usuario";
        Imprenta.imprimirUsuario();
        ingreso = sc.nextLine();
        if (ingreso.equals(usuario.getID())) {menu = "contraseña";
        }
        else {Imprenta.imprimirErrorUsuario();}
        return menu;
    }

    private static String mContraseña(){
        String menu="contraseña";
        Imprenta.imprimirContraseña();
        ingreso = sc.nextLine();
        if (ingreso.equals(usuario.getPass())) {menu = "principal";
        }
        else {Imprenta.imprimirErrorContraseña();}
        return menu;
    }

    private static String mPrincipal(){
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

    private static String mPrestar(){
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

    private static String mDevolver(){
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

    private static String mTipo(){
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
            case "r":
                if (bangalore.getRevistas().isEmpty()){Imprenta.imprimirVacio();}
                else {menu = "artic";
                    listArticulos = bangalore.getRevistas();
                    //bangalore.detalleRevistasBiblioteca();
                }
                break;
            case "e":
                if (bangalore.getEnsayos().isEmpty()){Imprenta.imprimirVacio();  }
                else {menu = "artic";
                    listArticulos = bangalore.getEnsayos();
                    //bangalore.detalleEnsayosBiblioteca();
                }
                break;
            case "t":
                if (bangalore.getTesis().isEmpty()){Imprenta.imprimirVacio(); }
                else {menu = "artic";
                    listArticulos = bangalore.getTesis();
                    // bangalore.detalleTesisBiblioteca();
                }
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

    private static String mArtic(){
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

    private static String mDetalle(){
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
    static Usuario usuarioEjemplo(){
        Usuario u=new Usuario();
        u.setID("asd-1234");
        u.setPass("pass");
        u.setNombre("Fulano");
        u.setDirección("xy y XD esquina");
        u.setEmail("email@yahoo.com");
        u.setTelefono("09-955-5555");
        return u;
    }

}
