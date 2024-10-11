// GetMaxTriplesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
			@Test
			void testGetMaxTriples1() {
				assertEquals(1, GetMaxTriples.getMaxTriples(5));
			}

			@Test
			void testGetMaxTriples2() {
				assertEquals(4, GetMaxTriples.getMaxTriples(6));
			}

			@Test
			void testGetMaxTriples3() {
				assertEquals(36, GetMaxTriples.getMaxTriples(10));
			}

			@Test
			void testGetMaxTriples4() {
				assertEquals(53361, GetMaxTriples.getMaxTriples(100));
			}

			@Test
			void testGetMaxTriples5() {
				assertEquals(0, GetMaxTriples.getMaxTriples(1));
			}

			@Test
			void testGetMaxTriples6() {
				assertEquals(0, GetMaxTriples.getMaxTriples(2));
			}

			@Test
			void testGetMaxTriples7() {
				assertEquals(0, GetMaxTriples.getMaxTriples(3));
			}

			@Test
			void testGetMaxTriples8() {
				assertEquals(0, GetMaxTriples.getMaxTriples(4));
			}

			@Test
			void testGetMaxTriples9() {
				assertEquals(0, GetMaxTriples.getMaxTriples(0));
			}

			@Test
			void testGetMaxTriples10() {
				assertEquals(0, GetMaxTriples.getMaxTriples(-1));
			}
}