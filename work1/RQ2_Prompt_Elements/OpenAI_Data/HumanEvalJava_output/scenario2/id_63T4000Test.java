// FibfibTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fibfib}.
* It contains ten unit test cases for the {@link Fibfib#fibfib(int)} method.
*/
class FibfibTest {

	@Test
	void testFibfib() {
		assertEquals(0, Fibfib.fibfib(0));
		assertEquals(0, Fibfib.fibfib(1));
		assertEquals(1, Fibfib.fibfib(2));
		assertEquals(2, Fibfib.fibfib(3));
		assertEquals(4, Fibfib.fibfib(4));
		assertEquals(7, Fibfib.fibfib(5));
		assertEquals(13, Fibfib.fibfib(6));
		assertEquals(24, Fibfib.fibfib(7));
		assertEquals(44, Fibfib.fibfib(8));
		assertEquals(81, Fibfib.fibfib(9));
	}
}