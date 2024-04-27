import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.annotation.Documented;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

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
    @DisplayName("Nombre que le quieras dar al test para que al ejecutarlo veas este nombre")
    void nombreTest() { //Debe ser único para cada test
        assertX(resultadoEsperado, resultadoActual(Llamada al método), "Mensaje que va a salir si falla (opcional)");
        //Sustituyes la X por el tipo de assert, ahora paso foto no os preocupéis. El más común es el assertEquals.
    }


    //Test compuestos (Tampoco sé cómo se llaman pero yo les digo compuestos porque ejecutan varios test):
    @Test
    @DisplayName("Nombre que le quieras dar al test para que al ejecutarlo veas este nombre")
    void nombreTest{ //Debe ser único para cada test
        assertAll(
                ()->{assertX(resultadoEsperado, resultadoActual(Llamada al método), "Mensaje que va a salir si falla (opcional)");},
                ()->{assertX(resultadoEsperado, resultadoActual(Llamada al método), "Mensaje que va a salir si falla (opcional)");},
                ()->{assertX(resultadoEsperado, resultadoActual(Llamada al método), "Mensaje que va a salir si falla (opcional)");},
                ()->{assertX(resultadoEsperado, resultadoActual(Llamada al método), "Mensaje que va a salir si falla (opcional)");},
                //Sustituyes la X por el tipo de assert, ahora paso foto no os preocupéis.
        );
    }


    Test parametrizados:
    @ParameterizedTest
    @DisplayName("Nombre que le quieras dar al test para que al ejecutarlo veas este nombre")
    @CsvSource({
            "dato, dato, dato",
            "dato, dato, dato",
            "dato, dato, dato",
            "dato, dato, dato",
            "dato, dato, dato"
    })
    public void restaCSV(tipo dato, tipo dato, tipo dato) {
        assertX( dato, método que utiliza los otros dos datos, "Mensaje que va a salir si falla (opcional)");
    }

    //Ejemplo:

    @ParameterizedTest
    @DisplayName("RESTA PARAMETRIZADA")
    @CsvSource({
            "1, 3, 2",
            "-5, -3, 2",
            "5, 3, -2",
            "-1, -3, -2",
            "-2, 0, 2"
    })
    public void restaCSV(int diferencia, int minuendo, int sustraendo) {
        assertEquals( diferencia, Calculadora.resta( minuendo, sustraendo ), "No devuelve el valor esperado.");
    }

    //Otra forma:
    @ParameterizedTest(name = "test[{index}] => {1} - {2} = {0}") //Reparto de valores
    @DisplayName("RESTAS CSV EXTERNO")
    @CsvFileSource(resources = "./resta.csv", numLinesToSkip = 1 //Salta la primera línea porque en la primera línea tenía unas palabras que no se tienen que comprobar con los test)
            void restaDesdeCSV(int diferencia, int minuendo, int sustraendo){
        assertEquals( diferencia, Calculadora.resta( minuendo, sustraendo ), "No devuelve el valor esperado.");
    }
}
