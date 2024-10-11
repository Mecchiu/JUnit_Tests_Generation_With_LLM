// FactorizeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {
			@Test
			void testFactorize1() {
				List<Integer> result = Factorize.factorize(8);
				assertEquals(3, result.size());
				assertEquals(2, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(2, result.get(2));
			}

			@Test
			void testFactorize2() {
				List<Integer> result = Factorize.factorize(25);
				assertEquals(2, result.size());
				assertEquals(5, result.get(0));
				assertEquals(5, result.get(1));
			}

			@Test
			void testFactorize3() {
				List<Integer> result = Factorize.factorize(70);
				assertEquals(3, result.size());
				assertEquals(2, result.get(0));
				assertEquals(5, result.get(1));
				assertEquals(7, result.get(2));
			}

			@Test
			void testFactorize4() {
				List<Integer> result = Factorize.factorize(2);
				assertEquals(1, result.size());
				assertEquals(2, result.get(0));
			}

			@Test
			void testFactorize5() {
				List<Integer> result = Factorize.factorize(4);
				assertEquals(2, result.size());
				assertEquals(2, result.get(0));
				assertEquals(2, result.get(1));
			}

			@Test
			void testFactorize6() {
				List<Integer> result = Factorize.factorize(8);
				assertEquals(3, result.size());
				assertEquals(2, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(2, result.get(2));
			}

			@Test
			void testFactorize7() {
				List<Integer> result = Factorize.factorize(57);
				assertEquals(2, result.size());
				assertEquals(3, result.get(0));
				assertEquals(19, result.get(1));
			}

			@Test
			void testFactorize8() {
				List<Integer> result = Factorize.factorize(3249);
				assertEquals(4, result.size());
				assertEquals(3, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(19, result.get(2));
				assertEquals(19, result.get(3));
			}

			@Test
			void testFactorize9() {
				List<Integer> result = Factorize.factorize(185193);
				assertEquals(6, result.size());
				assertEquals(3, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(3, result.get(2));
				assertEquals(19, result.get(3));
				assertEquals(19, result.get(4));
				assertEquals(19, result.get(5));
			}

			@Test
			void testFactorize10() {
				List<Integer> result = Factorize.factorize(20577);
				assertEquals(4, result.size());
				assertEquals(3, result.get(0));
				assertEquals(19, result.get(1));
				assertEquals(19, result.get(2));
				assertEquals(19, result.get(3));
			}

			@Test
			void testFactorize11() {
				List<Integer> result = Factorize.factorize(18);
				assertEquals(3, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(3, result.get(2));
			}
}