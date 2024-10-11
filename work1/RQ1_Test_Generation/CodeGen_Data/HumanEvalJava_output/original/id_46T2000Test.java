// Fib4Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains one unit test case for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {
@Test
		void test() {
			int testCaseCount = 100000;
				assertEquals(Fib4.fib4(testCaseCount), 2920);
		}
}