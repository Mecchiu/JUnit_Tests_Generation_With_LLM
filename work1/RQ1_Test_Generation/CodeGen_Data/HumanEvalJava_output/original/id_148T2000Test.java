// BfTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains one unit test case for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
public static class TestCase {

		private String planet1;

		private String planet2;

		public TestCase(String planet1, String planet2) {
			this.planet1 = planet1;
			this.planet2 = planet2;
		}

		@Test
		void testBf() {
			assertEquals("", Bf.bf(null, null));
			assertNull(Bf.bf(null, "Earth"));
			assertNull(Bf.bf("Mars", null));
			assertNull(Bf.bf("Earth", "Mars"));
			assertEquals("", Bf.bf("Earth", "Mars"));
			assertEquals("", Bf.bf("Earth", "Mars", "Mars"));
			assertNull((Bf.bf(null, "Earth", "Mars")));
			assertNull((Bf.bf("Mars", "Earth", "Mars")));
			assertEquals("Mars", Bf.bf("Mars", "Planet 1", "Planet 2"));
			assertNull(Bf.bf("Mars", "Planet 2", "Planet 1"));
			assertNull(Bf.bf("Planet 1", "Planet 2", "Planet 1"));
		}
		
		private static void assertResultsEqual(List<Object> expected, List<Object> actualValue) {
			List<Object> expectedResult = new ArrayList<Object>();
            for(int i= 0; i < expected.size(); i++) {
                expectedResult.add(expected.get((i) + 1));
            }
			if(actualValue == null) {
				assertTrue(expected == null);
				
			} else {
				assertEquals(expected, actualValue);
			}
			
			int index = actualValue.size();
			assertTrue(actualValue.size() <= expected.size());
			Object expectedValue = expected.remove(index--);
			for(int i= 0; i < expected.size() && index >= 0; i++) {
				expectedResult.add(expected.get(index)
								+ ((expectedValue == null)? "" : expectedValue));
				expectedValue = expected.get((i) + 1);
			}
			for(int i= 0; i<expected.size(); i++) {
				nulls.add(expected.get((i) + 1));
			}
			assertEquals(expectedResult, actualValue);
			assertEquals(expected.size(), actualValue.size());
			for(String s : expectedResult) {
				assertEquals(expected.get(expectedValue == null? 0
						: expectedValue.toString().length()), expected.get(i + 1));
			}
		}
		}

}
