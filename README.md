# S1.04 – Testing

## 🎯Objetives
This task aims to put into practice essential knowledge about testing in Java, 
using tools such as JUnit 5, AssertJ, and the TDD (Test-Driven Development) methodology.

## 📌Level 1: JUnit

---

### ✅Exercise 1 – Book Store

- Create a class to manage a book store with these features:
- Add a book to the collection.
- Retrieve all books.
- Get a book’s title by its position.
- Insert a book at a specific position.
- Delete a book by title.

JUnit tests should verify:

- The list is not null after adding a book.
- The list size is correct after adding multiple books.
- A specific book is in the correct position.
- No duplicate books exist.
- A book can be retrieved by position.
- Adding a new book updates the list correctly.
- Removing books decreases the list size.
- Sorting alphabetically remains consistent after add/remove operations.
---

### ✅Exercise 2 – Spanish ID Letter

---
- Create a class that calculates the final letter of a Spanish ID from its number.
- Write a JUnit test (parameterized) to validate 10 ID numbers.
---

### ✅Exercise 3 – ArrayIndexOutOfBoundsException
- Create a class that throws this exception.
- Verify its behavior with a JUnit test.
---
## 📌Level 2: AssertJ

---

### ✅Exercise 1 – Object Value Equality

Assert that two objects of the same class have equal values, and also assert when they differ.

### ✅Exercise 2 – Object Reference Equality

Assert that two references point to the same object, and also assert when they don’t.

### ✅Exercise 3 – Array Equality

Assert that two integer arrays are equal.

### ✅Exercise 4 – ArrayList Assertions

- Create an ArrayList with diverse objects.
- Verify insertion order.
- Verify all included objects exist (regardless of position).
- Ensure one object is added only once.
- Ensure a missing object is not in the list.

### ✅Exercise 5 – Map Assertions

Create a Map and verify it contains a specific key.

### ✅Exercise 6 – Exception Assertion

Trigger an ArrayIndexOutOfBoundsException and assert it is thrown correctly.

### ✅Exercise 7 – Optional Assertion

Create an empty Optional and assert that it is indeed empty.

---

## 🛠Technologies

- JDK 21
- IntelliJ IDEA
- Git & GitHub
- Maven

## 🚀 Installation & Execution

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/carlasalmeron/S1.04-Testing.git
    cd S1.04-Testing
    ```
2.  **Environment Variables:**
    Create a `.env` file in the project root (optional, for custom configuration, though this project primarily uses Maven defaults):
    ```text
    # Example .env
    PROJECT_NAME=S1.04-Testing
    ```
3.  **Application Execution:**
    This project is divided into modules (`Level1` and `Level2`). You can compile the entire project from the root:
    ```bash
    mvn clean compile
    ```
4.  **Tests:**
    To run all unit tests using JUnit 5 and AssertJ:
    ```bash
    mvn test
    ```
    Or for a specific module:
    ```bash
    cd Level1
    mvn test
    ```

## 📸 Demo
_If applicable, you can find a demo or screenshots here._
- [Vercel/Netlify Link] (Not applicable for this backend/Java project)
- ![Screenshot](path/to/your/image.png)

## 🧩 Diagrams & Technical Decision Justification
- **Modular Structure:** The project is divided into levels (Level 1 and Level 2) to separate basic JUnit concepts from advanced assertions with AssertJ.
- **TDD:** Test-Driven Development methodology was followed for Exercise 1 (Book Store).
- **JUnit 5 & AssertJ:** Used as industry standards to ensure test quality and readability.

