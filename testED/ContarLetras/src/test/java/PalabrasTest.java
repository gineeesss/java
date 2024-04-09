import org.junit.jupiter.api.Test;

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
}
