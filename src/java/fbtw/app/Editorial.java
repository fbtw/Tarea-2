package fbtw.app;

import java.util.ArrayList;
import java.util.List;

class Editorial {

    public static List<Artículo> crearLibros(int x){
        List<Artículo> lib = new ArrayList<>();
        for (int i=0;i<x;i++){
            Artículo nuevoLibro = new Artículo() ;
            nuevoLibro.setId(crearID());
            nuevoLibro.setAutor(crearAutor());
            nuevoLibro.setTítulo(crearTítulo());
            nuevoLibro.setPrestado(crearBooleano());
            nuevoLibro.setAño((int)(Math.random()*121+1900));
            nuevoLibro.setTipo(Tipo.Libro);
            lib.add(nuevoLibro);
        }
        return lib;
    }

    public static String crearAutor(){
        String autor="";
        int azar = (int)(Math.random()*20+1);
        switch (azar) {
            case 1: autor="Anthony"; break;
            case 2: autor="Bryan"; break;
            case 3: autor="Cristina"; break;
            case 4: autor="Doroty"; break;
            case 5: autor="Frank"; break;
            case 6: autor="Lisa"; break;
            case 7: autor="Katy"; break;
            case 8: autor="Pablo"; break;
            case 9: autor="Marta"; break;
            case 10: autor="Mike"; break;
            case 11: autor="Wilson"; break;
            case 12: autor="Zoila"; break;
            case 13: autor="Enrique"; break;
            case 14: autor="Raul"; break;
            case 15: autor="Ana Maria"; break;
            case 16: autor="verónica"; break;
            case 17: autor="Max"; break;
            case 18: autor="Tom"; break;
            case 19: autor="Samuel"; break;
            case 20: autor="Sandra"; break;
        }
        azar = (int)(Math.random()*20+1);
        switch (azar) {
            case 1: autor+=" Del Toro"; break;
            case 2: autor+=" Urcuango"; break;
            case 3: autor+=" Lee"; break;
            case 4: autor+=" Manson"; break;
            case 5: autor+=" McCarty"; break;
            case 6: autor+=" Jhonson"; break;
            case 7: autor+=" Toapanta"; break;
            case 8: autor+=" Gardfield"; break;
            case 9: autor+=" Piedra"; break;
            case 10: autor+=" Martinez"; break;
            case 11: autor+=" Simpson"; break;
            case 12: autor+=" Del Piero"; break;
            case 13: autor+=" Marshall"; break;
            case 14: autor+=" Lopez"; break;
            case 15: autor+=" Miyazaki"; break;
            case 16: autor+=" Jackson"; break;
            case 17: autor+=" Sylvestre"; break;
            case 18: autor+=" Chang"; break;
            case 19: autor+=" Konstantinovich"; break;
            case 20: autor+=" Maccarone"; break;
        }

        return autor;
    }
    public static String crearTítulo(){
        String título="";
        int azar = (int)(Math.random()*20+1);
        switch (azar) {
            case 1: título="La era"; break;
            case 2: título="Guerra"; break;
            case 3: título="El niño"; break;
            case 4: título="La máquina"; break;
            case 5: título="Locura"; break;
            case 6: título="El maestro"; break;
            case 7: título="El arte"; break;
            case 8: título="La ruina"; break;
            case 9: título="Elementos"; break;
            case 10: título="Fantasia"; break;
            case 11: título="El auto"; break;
            case 12: título="Cocina"; break;
            case 13: título="Aliens"; break;
            case 14: título="Misterios"; break;
            case 15: título="Castillo"; break;
            case 16: título="Tortura"; break;
            case 17: título="Árboles"; break;
            case 18: título="Monstruos"; break;
            case 19: título="La ciudad"; break;
            case 20: título="El secreto"; break;

        }
        azar = (int)(Math.random()*20+1);
        switch (azar) {
            case 1: título+=" en el espacio"; break;
            case 2: título+=" de los imperios"; break;
            case 3: título+=" de la guerra"; break;
            case 4: título+=" contigo"; break;
            case 5: título+=" con pasión"; break;
            case 6: título+=" en el tiempo"; break;
            case 7: título+=" del futuro"; break;
            case 8: título+=" y de más"; break;
            case 9: título+=" fantasma"; break;
            case 10: título+=" del diablo"; break;
            case 11: título+=" en la sombra"; break;
            case 12: título+=" radical"; break;
            case 13: título+=" misteriosos"; break;
            case 14: título+=" en el lago"; break;
            case 15: título+=" en todas partes"; break;
            case 16: título+=" de la luna"; break;
            case 17: título+=" y piratas"; break;
            case 18: título+=" del mar"; break;
            case 19: título+=" de la montaña"; break;
            case 20: título+=" del más allá"; break;
        }
        while (título.length()<24) {título+=" ";}
        return título;
    }
    public static boolean crearBooleano(){
        return (int) (Math.random() * 2) == 1;
    }
    public static String crearID(){
       // int rand = (int)(Math.random()*43+48); //48->90
        String ID="";
        for (int i=0;i<8;i++)
            ID += (char)((int)(Math.random()*26+65));
        //out.print("c:" +c);
        //String.valueOf(rand);
        return ID;
    }
}
