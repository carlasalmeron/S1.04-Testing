package Task2;

public class CalculoDni {

    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateLetter(int number) {
        if (number < 0 || number > 99999999) {
            throw new IllegalArgumentException("Invalid DNI");
        }
        int index = number % 23;
        return LETRAS.charAt(index);
    }
}
