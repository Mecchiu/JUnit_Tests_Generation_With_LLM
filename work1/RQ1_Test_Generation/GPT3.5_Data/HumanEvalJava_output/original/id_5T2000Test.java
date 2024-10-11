```java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntersperseTest {

    @Test
    void testIntersperse_emptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        int delimiter = 4;
        assertEquals(expected, Intersperse.intersperse(input, delimiter));
    }

    @Test
    void testIntersperse_normalList() {
        List<Object> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        int delimiter = 4;
        assertEquals(expected, Intersperse.intersperse(input, delimiter));
    }

    @Test
    void testIntersperse_emptyListWithDifferentDelimiter() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        int delimiter = 7;
        assertEquals(expected, Intersperse.intersperse(input, delimiter));
    }

    @Test
    void testIntersperse_normalListWithDifferentDelimiter() {
        List<Object> input = new ArrayList<>();
        input.add(5);
        input.add(6);
        input.add(3);
        input.add(2);
        List<Object> expected = new ArrayList<>();
        expected.add(5);
        expected.add(8);
        expected.add(6);
        expected.add(8);
        expected.add(3);
        expected.add(8);
        expected.add(2);
        int delimiter = 8;
        assertEquals(expected, Intersperse.intersperse(input, delimiter));
    }

    @Test
    void testIntersperse_allSameElements() {
        List<Object> input = new ArrayList<>();
        input.add(2);
        input.add(2);
        input.add(2);
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        expected.add(2);
        expected.add(2);
        int delimiter = 2;
        assertEquals(expected, Intersperse.intersperse(input, delimiter));
    }
}
```
```java
package original;

import java.util.ArrayList;
import java.util.List;

class Intersperse {

    public static List<Object> intersperse(List<Object> numbers, int delimiter) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.add(delimiter);
            }
        }
        return result;
    }
}
```
```java
package original;

import java.util.ArrayList;
import java.util.List;

class Intersperse {

    public static List<Object> intersperse(List<Object> numbers, int delimiter) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.add(delimiter);
            }
        }
        return result;
    }
}
```
```java
package original;

import java.util.ArrayList;
import java.util.List;

class Intersperse {

    public static List<Object> intersperse(List<Object> numbers, int delimiter) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.add(delimiter);
            }
        }
        return result;
    }
}
```