// RemoveDuplicates.java
package scenario3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class RemoveDuplicates {

    /**
     * From a list of integers, remove all elements that occur more than once.
     * Keep order of elements left the same as in the input.
     *
     * > removeDuplicates([1, 2, 3, 2, 4])
     * [1, 3, 4]
     * > removeDuplicates([])
     * []
     * > removeDuplicates([1, 2, 3, 4])
     * [1, 2, 3, 4]
     * > removeDuplicates([1, 2, 3, 2, 4, 3, 5])
     * [1, 4, 5]
     */
    public static List<Object> removeDuplicates(List<Object> numbers) {
        Set<Object> set = new LinkedHashSet<>();
        List<Object> result = new ArrayList<>();
        for (Object number : numbers) {
            if (set.add(number)) {
                result.add(number);
            }
        }
        return result;
    }
}

// RemoveDuplicatesTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        List<Object> input1 = Arrays.asList(1, 2, 3, 2, 4);
        List<Object> expectedOutput1 = Arrays.asList(1, 3, 4);
        assertEquals(expectedOutput1, RemoveDuplicates.removeDuplicates(input1));

        List<Object> input2 = Arrays.asList();
        List<Object> expectedOutput2 = Arrays.asList();
        assertEquals(expectedOutput2, RemoveDuplicates.removeDuplicates(input2));

        List<Object> input3 = Arrays.asList(1, 2, 3, 4);
        List<Object> expectedOutput3 = Arrays.asList(1, 2, 3, 4);
        assertEquals(expectedOutput3, RemoveDuplicates.removeDuplicates(input3));

        List<Object> input4 = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        List<Object> expectedOutput4 = Arrays.asList(1, 4, 5);
        assertEquals(expectedOutput4, RemoveDuplicates.removeDuplicates(input4));

        List<Object> input5 = Arrays.asList(1, 1, 1, 1, 1);
        List<Object> expectedOutput5 = Arrays.asList(1);
        assertEquals(expectedOutput5, RemoveDuplicates.removeDuplicates(input5));

        List<Object> input6 = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expectedOutput6 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expectedOutput6, RemoveDuplicates.removeDuplicates(input6));

        List<Object> input7 = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        List<Object> expectedOutput7 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expectedOutput7, RemoveDuplicates.removeDuplicates(input7));

        List<Object> input8 = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        List<Object> expectedOutput8 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expectedOutput8, RemoveDuplicates.removeDuplicates(input8));

        List<Object> input9 = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 6, 7, 8, 9, 10);
        List<Object> expectedOutput9 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expectedOutput9, RemoveDuplicates.removeDuplicates(input9));

        List<Object> input10 = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6);
        List<Object> expectedOutput10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expectedOutput10, RemoveDuplicates.removeDuplicates(input10));
    }
}