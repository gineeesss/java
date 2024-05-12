import org.example.ClaseVotacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVotacion {
    private ClaseVotacion claseVotacion;

    /*
    * La etiqueta @BeforeEach hace que cada vez que se ejecute un test hace lo implementado
    * en el módulo, yo la necesito porque tengo que crear el objeto en cada módulo
    *
    * He usado etiquetas @Tag se utiliza para categorizar las pruebas.
    * - unitarias: para probar unidades individuales de código
    * - integracion: verifican la integración entre diferentes partes del programa
    */

    @BeforeEach
    void setUp() {
         claseVotacion = new ClaseVotacion();
    }
    @Test
    @DisplayName("Comprueba si al realizar una votación, entra en el apartado adecuado")
    @Tag("unitarias")
    public void testClasificanEnSuLugar() {
        assertAll(
                ()-> assertEquals("A FAVOR", claseVotacion.clasificarVotos("nombre","A FAVOR",3)),
                ()-> assertEquals("EN CONTRA", claseVotacion.clasificarVotos("nombre","EN CONTRA",3)),
                ()-> assertEquals("ABSTENCIÓN", claseVotacion.clasificarVotos("nombre","ABSTENCIÓN",3))
        );
    }
    @Test
    @DisplayName("Test que comprueba si los votos de la clase se guardan en las variables estáticas")
    @Tag("unitarias")
    public void testContarVotos(){
        claseVotacion.clasificarVotos("5 Personas","A FAVOR",5);
        claseVotacion.clasificarVotos("3 Personas","EN CONTRA",3);
        claseVotacion.clasificarVotos("2 Personas","ABSTENCIÓN",2);

        assertAll(
                ()-> assertEquals(5, claseVotacion.getVotosAFavor()),
                ()-> assertEquals(3, claseVotacion.getVotosEnContra()),
                ()-> assertEquals(2, claseVotacion.getVotosAbstencion())
        );
    }
    @Test
    @DisplayName("Test que que comprueba si los nombres de las votaciones se guardan correctamente")
    @Tag("unitarias")
    public void testComprobarNomrbes(){
        claseVotacion.clasificarVotos("Mampos","A FAVOR",5);
        claseVotacion.clasificarVotos("SEFUTBOL","A FAVOR",8);
        claseVotacion.clasificarVotos("Familia Picapiedras","EN CONTRA",5);
        claseVotacion.clasificarVotos("Rasca y Pica","ABSTENCIÓN",2);
        claseVotacion.clasificarVotos("Hola y Hola","ABSTENCIÓN",2);
        claseVotacion.clasificarVotos("Elvis","ABSTENCIÓN",2);

        assertAll(
                ()-> assertEquals("[Mampos, SEFUTBOL]", claseVotacion.getNombresAFavor()),
                ()-> assertEquals("[Familia Picapiedras]", claseVotacion.getNombresEnContra()),
                ()-> assertEquals("[Rasca y Pica, Hola y Hola, Elvis]", claseVotacion.getNombresAbstencion())
        );
    }
    @Test
    @DisplayName("Se introducen más votos a favor que en contra entonces la propuesta debería de ser aprobada")
    @Tag("integracion")
    public void testResultadoAceptado(){
        claseVotacion.clasificarVotos("Paquitos","A FAVOR",55);
        claseVotacion.clasificarVotos("Rubiales & CO","A FAVOR",8);
        claseVotacion.clasificarVotos("Ramiro y Dos Más","EN CONTRA",3);

        assertEquals("La propuesta ha sido aceptada", claseVotacion.calcularResultado());
    }
    @Test
    @DisplayName("Se introducen más votos a favor que en contra entonces la propuesta debería de ser rechazada")
    @Tag("integracion")
    public void testResultadoRechazado(){
        claseVotacion.clasificarVotos("Paco y Sus Amigos","A FAVOR",5);
        claseVotacion.clasificarVotos("Mezquita Unida","EN CONTRA",2);
        claseVotacion.clasificarVotos("Ramiros","EN CONTRA",3);

        assertEquals("La propuesta ha sido rechazada", claseVotacion.calcularResultado());
    }
    @Test
    @DisplayName("Un test en el caso de que se todos los votos estén mal, es decir todos nulos")
    @Tag("integracion")
    public void testVotos0(){
        claseVotacion.clasificarVotos("Paco y Sus Amigos","A AVOR",5);
        claseVotacion.clasificarVotos("Mezquita Unida","EN CONRA",2);
        claseVotacion.clasificarVotos("Ramiros","ENTRA",3);

        assertEquals("La propuesta ha sido rechazada", claseVotacion.calcularResultado());
    }
}
