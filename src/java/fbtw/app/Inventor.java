package fbtw.app;

import java.util.ArrayList;
import java.util.List;
import java.security.SecureRandom;

class Inventor {
    private static final SecureRandom dado = new SecureRandom();

    public static List<Artículo> crearLibros(int x){
        List<Artículo> lib = new ArrayList<>();
        for (int i=0;i<x;i++){
            Artículo nuevoLibro = new Artículo() ;
            nuevoLibro.setId(crearID());
            nuevoLibro.setAutor(crearAutor());
            nuevoLibro.setTítulo(crearTítulo());
            nuevoLibro.setPrestado(crearBooleano());
            nuevoLibro.setAño((dado.nextInt(121)+1900));
            nuevoLibro.setTipo(Artículo.Tipo.Libro);
            lib.add(nuevoLibro);
        }
        return lib;
    }
    public static List<Artículo> crearBluray(int x){
        List<Artículo> blu = new ArrayList<>();
        for (int i=0;i<x;i++){
            Artículo nuevoBluray= new Artículo() ;
            nuevoBluray.setId(crearID());
            nuevoBluray.setAutor(crearDirector());
            nuevoBluray.setTítulo(crearTítulo());
            nuevoBluray.setPrestado(crearBooleano());
            nuevoBluray.setAño((dado.nextInt(71)+1950));
            nuevoBluray.setTipo(Artículo.Tipo.Bluray);
            blu.add(nuevoBluray);
        }
        return blu;
    }
    static Usuario crearUsuario(){
        Usuario u=new Usuario();
        u.setID("asd-1234");
        u.setPass("pass");
        u.setNombre(crearAutor());
        u.setDirección("xy y XD esquina");
        u.setEmail(crearID()+ "@yahoo.com");
        u.setTelefono("09 9"+dado.nextInt(1000000) );
        return u;
    }
    public static String crearDirector(){
        String direc="";
        int azar = (dado.nextInt(12)+1);
        switch (azar) {
            case 1: direc="Alejandro Iñárritu"; break;
            case 2: direc="Steven Spielberg"; break;
            case 3: direc="Christopher Nolan"; break;
            case 4: direc="Quentin Tarantino"; break;
            case 5: direc="Francis F. Coppola"; break;
            case 6: direc="Peter Jackson"; break;
            case 7: direc="Clint Eastwood"; break;
            case 8: direc="Hayao Miyazaki"; break;
            case 9: direc="Alfred Hitchcock"; break;
            case 10: direc="Stanley Kubrick"; break;
            case 11: direc="James Cameron"; break;
            case 12: direc="Martin Scorsese"; break;
        }
        return direc;
    }
    public static String crearAutor (){
        String autor="";
        int azar = (dado.nextInt(20)+1);
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
        azar = (dado.nextInt(20)+1);
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
        int azar = (dado.nextInt(20)+1);
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
        azar = (dado.nextInt(20)+1);
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
        return (dado.nextInt(2)  ) == 1;
    }
    public static String crearID(){
        String ID="";
        for (int i=0;i<8;i++)
            ID += (char)((dado.nextInt(26)+65));
        return ID;
    }
}
