package task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    private final CalculoDni calculo = new CalculoDni();

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "0, T",
            "99999999, R",
            "23456789, D",
            "34567890, X",
            "45678901, J",
            "56789012, U",
            "67890123, A"
    })
    void testValidDniLetter(int num, char expectedLetter) {
        char calculatedLetter = calculo.calculateLetter(num);
        assertEquals(expectedLetter, calculatedLetter);
    }

    @Test
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculo.calculateLetter(-1));
    }

    @Test
    void testNumberLength() {
        assertThrows(IllegalArgumentException.class, () -> calculo.calculateLetter(100000000));
    }

}