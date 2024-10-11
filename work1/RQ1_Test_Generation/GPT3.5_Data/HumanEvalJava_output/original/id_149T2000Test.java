```java
// SortedListSumTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedListSumTest {

    @Test
    void testSortedListSum_oddLengthStringsRemoved_sortedAscendingByLength() {
        List<String> input = new ArrayList<>();
        input.add("aa");
        input.add("a");
        input.add("aaa");
        List<String> expected = new ArrayList<>();
        expected.add("aa");
        assertEquals(expected, SortedListSum.sortedListSum(input));
    }

    @Test
    void testSortedListSum_oddLengthStringsRemoved_sortedAscendingByLengthAndAlphabetically() {
        List<String> input = new ArrayList<>();
        input.add("school");
        input.add("AI");
        input.add("asdf");
        input.add("b");
        List<String> expected = new ArrayList<>();
        expected.add("AI");
        expected.add("asdf");
        expected.add("school");
        assertEquals(expected, SortedListSum.sortedListSum(input));
    }

    @Test
    void testSortedListSum_noStringsLeft() {
        List<String> input = new ArrayList<>();
        input.add("d");
        input.add("b");
        input.add("c");
        input.add("a");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SortedListSum.sortedListSum(input));
    }

    @Test
    void testSortedListSum_sortedAscendingByLengthAndAlphabetically() {
        List<String> input = new ArrayList<>();
        input.add("d");
        input.add("dcba");
        input.add("abcd");
        input.add("a");
        List<String> expected = new ArrayList<>();
        expected.add("abcd");
        expected.add("dcba");
        assertEquals(expected, SortedListSum.sortedListSum(input));
    }

    @Test
    void testSortedListSum_sortedAscendingByLengthAndAlphabeticallyWithDuplicates() {
        List<String> input = new ArrayList<>();
        input.add("AI");
        input.add("ai");
        input.add("au");
        List<String> expected = new ArrayList<>();
        expected.add("AI");
        expected.add("ai");
        expected.add("au");
        assertEquals(expected, SortedListSum.sortedListSum(input));
    }

    @Test
    void testSortedListSum_noStringsLeftWithDuplicates() {
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");
        input.add("b");
        input.add("c");
        input.add("c");
        input.add("a");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SortedListSum.sortedListSum(input));
    }

    @Test
    void testSortedListSum_sortedAscendingByLengthAndAlphabeticallyWithDifferentLengths() {
        List<String> input = new ArrayList<>();
        input.add("aaaa");
        input.add("bbbb");
        input.add("dd");
        input.add("cc");
        List<String> expected = new ArrayList<>();
        expected.add("cc");
        expected.add("dd");
        expected.add("aaaa");
        expected.add("bbbb");
        assertEquals(expected, SortedListSum.sortedListSum(input));
    }
}
```
```java
// SortedListSum.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortedListSum {

    public static List<String> sortedListSum(List<String> lst) {
        List<String> result = new ArrayList<>();
        for (String str : lst) {
            if (str.length() % 2 == 0) {
                result.add(str);
            }
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        return result;
    }
}
```
