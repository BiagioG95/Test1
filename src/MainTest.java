import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void somma() {
        int result = testing.somma(2, 3);
        assertEquals(5, result, "La somma di 2 e 3 dovrebbe essere 5");
    }
}