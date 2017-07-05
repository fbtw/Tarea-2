package fbtw.app;

import static java.lang.System.out;

class Usuario {
    private String nombre;
    private String ID;
    private String pass;
    private String email;
    private String dirección;
    private String telefono;

    void imprimirInformación(){
        out.println("\n#:\t\t\t" + getID()+
                "\nNombre:\t\t" + getNombre() +
                "\nEmail:\t\t" + getEmail() +
                "\nDirección:\t" + getDirección() +
                "\nTelefono:\t"+getTelefono());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
