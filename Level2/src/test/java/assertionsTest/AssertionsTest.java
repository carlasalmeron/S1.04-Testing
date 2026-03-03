package assertionsTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AssertionsTest {

    //Task 1
    @Test
    void testEquality() {

        class Score {
            final int value;

            Score(int value) {
                this.value = value;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }

                if (obj instanceof Score) {
                    Score anotherScore = (Score) obj;

                    if (this.value == anotherScore.value) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public int hashCode() {
                return value;
            }
        }

        Score score1 = new Score(10);
        Score score2 = new Score(15);
        Score score3 = new Score(10);

        assertThat(score1).isEqualTo(score3);
        assertThat(score2).isNotEqualTo(score3);
    }

    //Task 2
    @Test
    void testAssertionReferenceEquality() {

        class Book {
            final String title;

            Book(String title) {
                this.title = title;
            }

        }

        Book title1 = new Book("Hamlet"), title2;
        title2 = title1;

        assertThat(title1).isSameAs(title2);

        title2 = new Book("Hamlet");
        assertThat(title1).isNotSameAs(title2);

    }

    //Task 3
    @Test
    void testArrayEquals() {

        int[] data1 = {1, 2, 3, 4};
        int[] data2 = {1, 2, 3, 4};

        assertThat(data1).isEqualTo(data2);

    }

    //Task 4
    @Test
    void testAssertionArrayList() {
        int obj1 = 1;
        int obj2 = 2;
        double obj3 = 3.3;
        String obj4 = "Carla";
        String obj5 = "Book";

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(obj1);
        objects.add(obj2);
        objects.add(obj3);
        objects.add(obj4);

        assertThat(objects).containsExactly(1, 2, 3.3, "Carla");
        assertThat(objects).containsOnlyOnce(obj1, obj2, obj3, obj4);
        assertThat(objects).containsExactlyInAnyOrder(obj2, obj1, obj4, obj3);
        assertThat(objects).doesNotContain(obj5);
    }

    //Task 5
    @Test
    void testAssertKey() {

        Map<String, String> person = new HashMap<>();
        person.put("12345678C", "Carla");
        person.put("87456123C", "Stephania");
        person.put("89456123C", "Sofia");

        assertThat(person).containsKey("87456123C");
    }

    //Task 6
    @Test
    void testAssertIndexOutOfBound() {

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);

        assertThatThrownBy(() -> numberList.get(9))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index 9 out of bounds");
    }

    //Task 7
    @Test
    void testIsEmpty() {

        Optional<String> dato = Optional.empty();

        assertThat(dato).isEmpty();

    }

}