package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testCollectionNotNull() {
        assertNotNull(library.getAllTitles());
    }

    @Test
    void addBooksCorrectPosition() {
        library.addBook("Drácula", "Stoker");
        library.addBook("Hamlet", "Shakespeare");
        library.addBook("It", "King");

        assertEquals(3, library.size());
    }

    @Test
    void testGetBookTitle() {
        library.addBook("1984", "Owell");
        library.addBook("Hamlet", "Shakespeare");

        assertEquals("1984", library.getBookTitle(0));
        assertEquals("Hamlet", library.getBookTitle(1));
    }

    @Test
    void correctAddBookPosition() {
        library.addBook("Jane Eyre", "Bronte");

        assertEquals("Jane Eyre", library.getBookTitle(0));
    }

    @Test
    void testAddBooktoPosition() {
        library.addBook("1984", "Owell");
        library.addBook("Hamlet", "Shakespeare");

        library.addBookAtPosition(1, "Jane Eyre", "Bronte");

        assertEquals("Jane Eyre", library.getBookTitle(1));
        assertEquals(3, library.size());
    }

    @Test
    void testRemoveBook() {
        library.addBook("El Quijote", "Cervantes");
        library.addBook("Drácula", "Stroker");

        library.removeBook("El Quijote");

        assertEquals(1, library.size());
    }

    @Test
    void testTitleSorted() {
        library.addBook("El Quijote", "Cervantes");
        library.addBook("Romeo and Juliet", "Shakespeare");
        library.addBook("Hamlet", "Shakespeare");

        List<String> sorted = library.getTitlesSorted();

        assertEquals(List.of("El Quijote", "Hamlet", "Romeo and Juliet"), sorted);
    }

    @Test
    void testNoDuplicates() {
        library.addBook("1984", "Owell");

        assertThrows(IllegalArgumentException.class, () -> library.addBook("1984", "Owell"));
    }

}