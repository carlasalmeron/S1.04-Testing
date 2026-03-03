package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        addBookAtPosition(books.size(), title, author);
    }

    public void addBookAtPosition(int position, String title, String author) {
        checkIfTitleExists(title);
        books.add(position, new Book(title, author));
    }

    public boolean removeBook(String title) {
        return books.removeIf(book -> book.getTitle().equals(title));
    }

    public String getBookTitle(int position) {
        return books.get(position).getTitle();
    }

    public List<String> getAllTitles() {
        List<String> copy = new ArrayList<>();
        for (Book book : books) {
            copy.add(book.getTitle());
        }
        return copy;
    }

    public List<String> getTitlesSorted() {
        List<String> sortedTitles = new ArrayList<>();
        for (Book book : books) {
            sortedTitles.add(book.getTitle());
        }
        Collections.sort(sortedTitles);
        return sortedTitles;
    }

    public int size() {
        return books.size();
    }

    private void checkIfTitleExists(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                throw new IllegalArgumentException("Cannot duplicate book titles");
            }
        }
    }
}
