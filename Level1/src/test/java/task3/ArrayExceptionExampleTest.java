package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExceptionExampleTest {

    @Test
    void testArrayExceptionExample() {
        ArrayExceptionExample example = new ArrayExceptionExample();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> example.tryException());
    }

}