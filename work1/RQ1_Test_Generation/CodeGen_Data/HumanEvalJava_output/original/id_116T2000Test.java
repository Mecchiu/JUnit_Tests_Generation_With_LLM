// SortArrayTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains one unit test case for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
/**
		 * This method performs the same test as {@link SortArray#sortArray(List)} method except the
		 * parameter <code>arr</code> is <code>null</code>.
		 */
		@Test
    void testEmptyList() {
        assertTrue(SortArray.sortArray(Collections.EMPTY_LIST).isEmpty());
    }

		/**
		 * This method performs the same test as {@link SortArray#sortArray(List)} method except the
		 * parameter <code>arr</code> is <code>null</code>.
		 */
		@Test
    void testEmptyList_WithIndex() {
        assertTrue(SortArray.sortArray(new ArrayList<Number>(), 12).isEmpty());
    }

		/**
		 * This method performs the same test as {@link SortArray#sortArray(List)} method except the
		 * second parameter <code>num</code> is not <code>null</code>.
		 */
		@Test
    void testUniqueValues(int num) {
        List<Number> values = new ArrayList<Number>();
        List<Object> sortedValues = SortArray.sortArray(values);
        List<Object> expected = new ArrayList<Object>();
        for (int i = 0; i < num; i++) {
            expected.add(new Number(sortedValues.get(i)));
        }
        final List<Object> result = SortArray.sortArray(expected);
        assertEquals(expected, result);
    }

		/**
		 * This method performs the same test as {@link SortArray#sortArray(List)} method except the
		 * second parameter <code>num</code> is not <code>null</code>.
		 */
		@Test
    void testUniqueValuesTwo(int num) {
        List<Number> values = new ArrayList<Number>();
        for (int i = 0; i < num; i++) {
            values.add(new Number(((Number) values.get(i)).intValue() + (Math.random() / 10000)));
        }
        List<Object> sortedValues = SortArray.sortArray(values);
        List<Object> expected = new ArrayList<Object>();
        for (int i = 0; i < num; i++) {
            expected.add(new Number(sortedValues.get(i)));
        }
        final List<Object> result = SortArray.sortArray(expected);
        assertEquals(expected, result);
    }

}
