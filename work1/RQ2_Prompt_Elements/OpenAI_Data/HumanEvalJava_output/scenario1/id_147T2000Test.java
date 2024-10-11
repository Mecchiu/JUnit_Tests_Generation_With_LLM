// GetMaxTriplesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
	@Test
			void testGetMaxTriples1() {
				int n = 1;
				int expected = 0;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples2() {
				int n = 2;
				int expected = 0;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples3() {
				int n = 3;
				int expected = 1;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples4() {
				int n = 4;
				int expected = 1;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples5() {
				int n = 5;
				int expected = 2;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples6() {
				int n = 6;
				int expected = 2;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples7() {
				int n = 7;
				int expected = 3;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples8() {
				int n = 8;
				int expected = 3;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples9() {
				int n = 9;
				int expected = 4;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
			
			@Test
			void testGetMaxTriples10() {
				int n = 10;
				int expected = 4;
				int actual = GetMaxTriples.getMaxTriples(n);
				assertEquals(expected, actual);
			}
}