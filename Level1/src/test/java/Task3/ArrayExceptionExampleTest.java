package Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExceptionExampleTest {


    @Test
    void testArrayExceptionExample() {

        ArrayExceptionExample example = new ArrayExceptionExample();

        try {
            example.tryException();
            fail("ArrayOutBoundException error expected");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }

    }

}