// FibTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib}.
* It contains one unit test case for the {@link Fib#fib(int)} method.
*/
class FibTest {

	@Test
	void test() {
		Fib f = new Fib();
		int value = 1;
		int result = f.fib(1);		
	}
}