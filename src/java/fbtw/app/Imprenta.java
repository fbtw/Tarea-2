package fbtw.app;

import static java.lang.System.out;

public class Imprenta {

    static void imprimirInicio( ){
        out.print("    Bienvenido a"+"\n"+
                "बैंगलोर सार्वजनिक पुस्तकालय"+"\n"+
                "Biblioteca Bengalore"+"\n\n"+
                "Pulse C para continuar"+"\n"+
                "U:"
        );
    }
    static void imprimirMenú( ){
        out.print("\n       MENÚ " +"\n"+
                "Seleccione una opción:"+"\n"+
                "* Buscar un artículo (B)"+"\n"+
                "* Pedir un artículo (P)"+"\n"+
                "* Devolver un artículo (D)"+"\n"+
                "* Salir (S) "+"\n"+
                "U:"
        );
    }
    static void imprimirMenúTipo( ){
        out.print("\n       MENÚ " +"\n"+
                "Seleccione el artículo:"+"\n"+
                "* (L)ibro"+"\n"+
                "* (R)evista"+"\n"+
                "* (B)lu-Ray"+"\n"+
                "* (T)ésis"+"\n"+
                "* (E)nsayo"+"\n"+
                "U:"
        );
    }
    static void imprimirMenúPedir(){
        out.print("\n       MENÚ " +"\n"+
                "Seleccione el artículo que desea pedir\n"+
                "U:"
        );
    }
    static void imprimirMenúDevo(){
        out.print("\n       MENÚ " +"\n"+
                "Seleccione el artículo que desea devolver\n"+
                "U:"
        );
    }
    static void imprimirDetalle(){
        out.print("* Pedir el artículo (P)"+"\n"+
                "* Devolver el artículo (D)"+"\n"+
                "* Atras (A) "+"\n"+
                "U:"
        );
    }
    static void imprimirError(){
        out.print("Opción incorrecta, intente de nuevo"+"\n");
    }
    static void imprimirErrorNúmero(){
        out.print("Ingrese un número"+"\n");
    }
    static void imprimirTamañoNúmero() { out.print("El número es muy grande"+"\n");}

    public static void imprimirVacio() {
        out.print("Artículo no encontrado"+"\n");
    }
    public static void imprimirSalida() {
        out.println("\n\n\tGracias por venir.");
    }
}
