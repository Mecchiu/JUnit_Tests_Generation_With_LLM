// FactorizeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains one unit test case for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {
/**
		 * Test for {@link Factorize#factorize(int)}.
		 */
		@Test
		public void factorizeTest1() {
			assertEquals(Integer.valueOf(2), new Factorize().factorize(Integer.valueOf(12)));
			assertEquals(Integer.valueOf(2), new Factorize().factorize(Integer.valueOf(10)));
			assertEquals(Integer.valueOf(6), new Factorize().factorize(Integer.valueOf(18)));
			assertEquals(Integer.valueOf(3), new Factorize().factorize(Integer.valueOf(8)));
			assertEquals(Integer.valueOf(2), new Factorize().factorize(Integer.valueOf(5)));
		}
}
