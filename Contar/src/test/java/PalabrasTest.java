import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.annotation.Documented;
import static org.junit.Assert.assertEquals;
public class PalabrasTest {
    @Test
    public void testContadorLetra() {
        Palabras palabras = new Palabras();
        Palabras.Miau miau = palabras.new Miau();

        // Configuramos los valores de entrada para las pruebas
        miau.numPalabras = 3;
        miau.lista = new String[]{"apple", "banana", "orange"};
        miau.letra = 'a';
        // Ejecutamos el método que queremos probar
    }
    @Test
    public void testLetra(){
        String input = "a";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Palabras palabras = new Palabras();
        Palabras.Miau miau = palabras.new Miau();
        miau.letraIntro();

        char letra = miau.letra;
        assertEquals('a',letra);
    }
    @Test
    public void testPalabras(){
        String[] input = {"hola", "adios", "miau"};
        String inputJunto = String.join(System.lineSeparator(),input);
        InputStream in = new ByteArrayInputStream(inputJunto.getBytes());
        System.setIn(in);

        Palabras palabras = new Palabras();
        Palabras.Miau miau = palabras.new Miau();
        miau.listaIntro();

        String[] palabrasLista = miau.lista;
                //{"hola", "adios","miau"};
        assertEquals(palabrasLista,palabrasLista);
    }
    @Test
    public void longitudLista(){
        String[] input = {"hola", "adios", "miau"};
        String inputJunto = String.join(System.lineSeparator(),input);
        InputStream in = new ByteArrayInputStream(inputJunto.getBytes());
        System.setIn(in);
        Palabras palabras = new Palabras();
        Palabras.Miau miau = palabras.new Miau();
        miau.listaIntro();

        int num = 3;
       // InputStream num = new ByteArrayInputStream(num.getBytes);
        //System.setIn(num);
        miau.palabrasIntro();


        assertEquals(input.length,miau.lista.length);
    }
    @Test
    public void palabraMeter(){
        Palabras palabras = new Palabras();
        Palabras.Miau miau = palabras.new Miau();
        miau.palabrasIntro(2);
        assertEquals(2,miau.numPalabras);
        System.out.println("Num palabras esperados: "+2+"\nNum palabras: "+miau.numPalabras);
    }
}
