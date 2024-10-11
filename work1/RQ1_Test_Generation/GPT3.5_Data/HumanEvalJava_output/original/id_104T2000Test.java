```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class UniqueDigitsTest {

    @Test
    void testUniqueDigits_case1() {
        List<Integer> input = new ArrayList<>();
        input.add(15);
        input.add(33);
        input.add(1422);
        input.add(1);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(15);
        expected.add(33);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testUniqueDigits_case2() {
        List<Integer> input = new ArrayList<>();
        input.add(152);
        input.add(323);
        input.add(1422);
        input.add(10);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testUniqueDigits_case3() {
        List<Integer> input = new ArrayList<>();
        input.add(12345);
        input.add(2033);
        input.add(111);
        input.add(151);
        List<Object> expected = new ArrayList<>();
        expected.add(111);
        expected.add(151);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testUniqueDigits_case4() {
        List<Integer> input = new ArrayList<>();
        input.add(135);
        input.add(103);
        input.add(31);
        List<Object> expected = new ArrayList<>();
        expected.add(31);
        expected.add(135);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }
}
```
