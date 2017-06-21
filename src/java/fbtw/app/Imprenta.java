package fbtw.app;

import static java.lang.System.out;

public class Imprenta {

    static void imprimirInicio(String in){
        out.print("    Bienvenido a"+"\n"+
                "बैंगलोर सार्वजनिक पुस्तकालय"+"\n"+
                "Biblioteca Bengalore"+"\n\n"+
                "Pulse C para continuar"+"\n"+
                "U:"+ in
        );
    }
    static void imprimirMenú(String in){
        out.print("\n       MENÚ " +"\n"+
                "Seleccione una opción:"+"\n"+
                "* Buscar un artículo (B)"+"\n"+
                // "* Devolver un artículo (D)"+"\n"+
                "* Salir (S) "+"\n"+
                "U:"+in
        );
    }
    static void imprimirMenú2(int in2){
        out.print("\nSeleccione una opción" +
                "\nU:"+in2);
    }

    static void imprimirDetalle(String in){
        out.print("* Pedir el artículo (P)"+"\n"+
                "* Devolver el artículo (D)"+"\n"+
                "* Atras (A) "+"\n"+
                "U:"+in
        );
    }
    static void imprimirError(){
        out.print(" \nOpción incorrecta, intente de nuevo"+"\n");
    }
    static void imprimirErrorNúmero(){
        out.print(" \nIngrese un número"+"\n");
    }

}
