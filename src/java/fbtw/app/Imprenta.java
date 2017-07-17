package fbtw.app;

import static java.lang.System.out;

class Imprenta {

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
                "* Ver información (I)"+"\n"+
                "* Salir (S) "+"\n"+
                "U:"
        );
    }
    static void imprimirMenúTipo( ){
        out.print("\n"+
                "Seleccione el artículo:"+"\n"+
                "* (L)ibro"+"\n"+
                "* (B)lu-Ray"+"\n"+
                "U:"
        );
    }
    static void imprimirMenúPedir(){
        out.print("\n"+
                "Seleccione el artículo que desea pedir\n"+
                "U:"
        );
    }
    static void imprimirMenúDevo(){
        out.print("\n"+
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
    static void imprimirUsuario() { out.print("Ingrese el ID del usuario:");}
    static void imprimirContraseña() { out.print("Ingrese la contraseña:");}

    static void imprimirError(){
        out.println("Opción incorrecta, intente de nuevo");
    }
    static void imprimirErrorNúmero(){
        out.println("Ingrese un número");
    }
    static void imprimirTamañoNúmero() { out.println("El número es muy grande");}
    static void imprimirErrorUsuario() { out.println("Nombre de usuario incorrecto");}
    static void imprimirErrorContraseña() { out.println("Contraseña incorrecta");}
    public static void imprimirVacio() {
        out.println("Artículo no encontrado");
    }
    public static void imprimirSalida() {
        out.println("\n\n\tGracias por venir.");
    }
}
