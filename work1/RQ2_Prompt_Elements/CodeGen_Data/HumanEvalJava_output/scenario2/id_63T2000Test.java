// FibfibTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fibfib}.
* It contains one unit test case for the {@link Fibfib#fibfib(int)} method.
*/
class FibfibTest {
void testFibfib(int n) {
			for (int i = 0; i < n; i++) {
				assertEquals(n + 1, fibfib(n), 0);
				n = n + 1;
			}
		}
		@Test
		void testFibfib() {
			doTestFibfib(5);
		}
}
