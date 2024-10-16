// FactorizeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {
	/**
			* Test case for the {@link Factorize#factorize(int)} method.
			* It checks if the method returns the correct list of prime factors for the given input.
			*/
			@Test
			void testFactorize() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				assertEquals(expected, Factorize.factorize(8));
				expected.clear();
				expected.add(5);
				expected.add(5);
				assertEquals(expected, Factorize.factorize(25));
				expected.clear();
				expected.add(2);
				expected.add(5);
				expected.add(7);
				assertEquals(expected, Factorize.factorize(70));
				expected.clear();
				expected.add(2);
				assertEquals(expected, Factorize.factorize(2));
				expected.clear();
				expected.add(2);
				expected.add(2);
				assertEquals(expected, Factorize.factorize(4));
				expected.clear();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				assertEquals(expected, Factorize.factorize(8));
				expected.clear();
				expected.add(3);
				expected.add(19);
				assertEquals(expected, Factorize.factorize(57));
				expected.clear();
				expected.add(3);
				expected.add(3);
				expected.add(19);
				expected.add(19);
				assertEquals(expected, Factorize.factorize(3249));
				expected.clear();
				expected.add(3);
				expected.add(19);
				expected.add(19);
				expected.add(19);
				assertEquals(expected, Factorize.factorize(20577));
				expected.clear();
				expected.add(2);
				expected.add(3);
				expected.add(3);
				assertEquals(expected, Factorize.factorize(18));
			}
}
