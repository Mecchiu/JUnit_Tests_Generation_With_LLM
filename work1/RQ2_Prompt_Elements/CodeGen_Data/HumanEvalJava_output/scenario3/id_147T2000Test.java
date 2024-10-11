// GetMaxTriplesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains one unit test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
@Test
		public void test() {
				int[] arr = {1, 3, 7, 13, 21};
		assertEquals(10, GetMaxTriples.getMaxTriples(arr));
		}
		
		
		}
