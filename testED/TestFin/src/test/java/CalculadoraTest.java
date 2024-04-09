import org.junit.jupiter.api.Test;

import java.lang.annotation.Documented;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora.Pila pila = new Calculadora.Pila();
        pila.push(2);
        pila.push(3);
        pila.sumar();
        assertEquals(5, pila.pop(), 0.0001); // Tolerancia de 0.0001 para comparar números de punto flotante
    }

    @Test
    public void testRestar() {
        Calculadora.Pila pila = new Calculadora.Pila();
        pila.push(5);
        pila.push(3);
        pila.restar();
        assertEquals(2, pila.pop(), 0.0001);
    }

    @Test
    public void testMultiplicar() {
        Calculadora.Pila pila = new Calculadora.Pila();
        pila.push(2);
        pila.push(3);
        pila.multiplicar();
        assertEquals(6, pila.pop(), 0.0001);
    }

    @Test
    public void testDividir() {
        Calculadora.Pila pila = new Calculadora.Pila();
        pila.push(6);
        pila.push(3);
        pila.dividir();
        assertEquals(2, pila.pop(), 0.0001);
    }
    @Test
    public void testSumaResta(){
        Calculadora.Pila pila = new Calculadora.Pila();
        pila.push(1);
        pila.push(2);
        pila.sumar();
        pila.push(1);
        pila.restar();
    }
}
