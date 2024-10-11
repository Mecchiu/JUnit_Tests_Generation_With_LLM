// HistogramTest.java
package scenario2;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains one unit test case for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {
@Test
		void test_case_1() {
    // given
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // when
        Object res = HistogramTest.histogram("aa");

        // then
        assertEquals(map.keySet(), res);
        assertEquals(map.values(), res.toString());
	}

        @Test
    void test_case_2() {
        // given
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // when
        Object res = HistogramTest.histogram("bbb");

        // then
        assertEquals(map.keySet(), res);
        assertEquals(map.values(), res.toString());
        assertFalse(map.contains("bbc"));
    }

        @Test
    void test_case_3() {
        // given
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 0);

        // when
        Object res = HistogramTest.histogram("bbc");

        // then
        assertEquals(map.entrySet().size(), res.toString());
        assertTrue(map.containsEntry(map.entrySet().iterator().next()));
    }
}