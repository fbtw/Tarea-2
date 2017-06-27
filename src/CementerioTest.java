package fbtw.app;

import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import static java.lang.System.out;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class CementerioTest {

    // Pruebas I/O
    @Test   // [✓]
    public void testScanner() throws Exception {
        File file = new File("src/resource/cinco.txt");
        String txt="5";
        Scanner sc = new Scanner(file);
        out.println("txt 1: "+txt);
        txt=sc.nextLine();
        out.println("txt 2: "+txt);
        Assert.assertEquals("5",txt);
    }
    @Test   // [✓] ✓
    public void testreadFileRelativePath() {
        File file = new File("src/resource/usuario.txt");
        assertTrue(file.exists());
    }
    @Test   // [X]
    public void testReadAsStream() throws IOException {
        InputStream is = this.getClass().getResourceAsStream("/usuario.txt");
        out.println(is);
        assertNotNull(is);
    }
    @Test   // [X]
    public void testReadAsClassLoader() throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL ass = classLoader.getResource("/usuario.txt");
        //Thread.currentThread().getContextClassLoader().getResourceAsStream("usuario.txt"); // /resource/
        out.println(ass);
        assertNotNull(ass);
        File file = new File(ass.getFile());
        assertNotNull(file);
    }
}
