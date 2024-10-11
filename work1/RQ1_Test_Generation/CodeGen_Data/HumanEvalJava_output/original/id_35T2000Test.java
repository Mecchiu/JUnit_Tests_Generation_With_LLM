// MaxElementTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains one unit test case for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
int maxElement = maxElement(max1());

		@Test
		public void testMaxElement() {
			assertEquals(max1(), maxElement);
		}
	}


// Test class of {@link MaxElement#maxElement(Object)} method.
// It contains one unit test case which returns the object which is maximum.
package original;
import org.junit.jupiter.api.Assertions;

public class MaxElementTest {
		int max1() {
			int max = Integer.MIN_VALUE;

			for (int i = 1; i < 1000; i++) {
		            if (max < i) {
		                max = i;
		            }
			}

			return max;
		}

		@Test
		public void testMax() {
			assertEquals(1000, max1());
		}
	}


// max1Test.java
package original;

// Max1Test.java
class Max1Test {
	@Test
	public void testMax1() {
		int max = max1();

		assertEquals(max, max1());
	}
}