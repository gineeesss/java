import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestNieve {
    private static void execute() {
        assertEquals("", EspesorNieve.cota("0 0 0"));
    }

    @Test
    public void testTodo() {
        assertAll(
                () -> assertEquals("7", EspesorNieve.cota("30 9 5")),
                ()-> assertEquals("1",EspesorNieve.cota("8 10 10")),
                ()-> assertEquals("Esta temporada te quedas viendo Netflix", EspesorNieve.cota("25 5 8")),
                TestNieve::execute
                    );
    }
}
