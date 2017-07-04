package fbtw.app;

import org.junit.*;


public class UsuarioTest {
    private final Usuario user = new Usuario();

    @Test
    public void userTest() throws Exception {
        user.setNombre("Esteban");
        user.setDirección("here");
        user.setEmail("user@yahoo.com");
        user.setID("xxx-xxxx");
        user.setPass("xxxxx");
        user.setTelefono("099999999");
        Assert.assertEquals("Esteban",user.getNombre());
        Assert.assertEquals("here",user.getDirección());
        Assert.assertEquals("user@yahoo.com",user.getEmail());
        Assert.assertEquals("xxx-xxxx",user.getID());
        Assert.assertEquals("xxxxx",user.getPass());
        Assert.assertEquals("099999999",user.getTelefono());

    }
}