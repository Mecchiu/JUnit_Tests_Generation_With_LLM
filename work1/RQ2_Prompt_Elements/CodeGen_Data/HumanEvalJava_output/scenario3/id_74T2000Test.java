// TotalMatchTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains one unit test case for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {
/**
		 * Unit test case for {@link TotalMatch#totalMatch(List, List)}.
		 * It generates the code for the {@link TotalMatch#totalMatch(List, List) } method.
		 */
		@Test
    void testNoArgs1() {
        assertEquals(0, (int) totalMatch(null, null).size());
	}

		/**
		 * Unit test case for {@link TotalMatch#totalMatch(List, List)}.
		 * The generated test code is well, but the method may not return anything.
		 */
		@Test
    void testSimpleOne() {
        List<Object> res = totalMatch(new List();
        assertEquals(1, test(res, null, null).size());
    }

		/**
         * Unit test case for {@link TotalMatch#totalMatch(List, List)}.
         * The generated test code is well, but the method may not return anything.
         */
        @Test
    void test2One() {
        List<Object> res = totalMatch(new List(), new List());
        assertEquals(1, test(res, "", "").size());
		}

		/**
		 * Unit test case for {@link TotalMatch#totalMatch(List, List)}.
		 * The generated test code is well, but the method may return empty (for
		 * example, if there's only an integer value in each of the parameters.
		 */
		@Test
    void test3One() {
        List<Object> res = totalMatch(new List(), new List(new Object()));
        assertTrue(test(res, "", "").isEmpty());
    }

		/**
		 * Unit test case for {@link TotalMatch#totalMatch(List, List)}.
		 * The generated test code is well, but the method may return an empty
		 * list for null parameters.
		 */
		@Test
    void test4One() {
        List<Object> res = totalMatch(new List(), new List(new Object(), new Object()));
        assertTrue(test(res, "", "").isEmpty());
    }

		/**
		 * Unit test case for {@link TotalMatch#totalMatch(List, List)}.
		 * The generated test code is well, but the method may throw Exception in case
		 * of empty parameter value.
		 */
		@Test
    void test5One() {
        List<Object> res = totalMatch(new List(), new List(new Object(), new Object(), new Object()));
        assertEquals(0, test(res, "", "").size());
    }
}