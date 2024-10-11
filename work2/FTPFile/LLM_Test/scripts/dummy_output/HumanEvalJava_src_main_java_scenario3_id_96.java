// CountUpToTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
			@Test
			void testCountUpTo() {
				List<Object> result = CountUpTo.countUpTo(5);
				assertEquals(2, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
			}

			@Test
			void testCountUpTo2() {
				List<Object> result = CountUpTo.countUpTo(6);
				assertEquals(3, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(5, result.get(2));
			}

			@Test
			void testCountUpTo3() {
				List<Object> result = CountUpTo.countUpTo(7);
				assertEquals(3, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(5, result.get(2));
			}

			@Test
			void testCountUpTo4() {
				List<Object> result = CountUpTo.countUpTo(10);
				assertEquals(4, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(5, result.get(2));
				assertEquals(7, result.get(3));
			}

			@Test
			void testCountUpTo5() {
				List<Object> result = CountUpTo.countUpTo(0);
				assertEquals(0, result.size());
			}

			@Test
			void testCountUpTo6() {
				List<Object> result = CountUpTo.countUpTo(22);
				assertEquals(8, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(5, result.get(2));
				assertEquals(7, result.get(3));
				assertEquals(11, result.get(4));
				assertEquals(13, result.get(5));
				assertEquals(17, result.get(6));
				assertEquals(19, result.get(7));
			}

			@Test
			void testCountUpTo7() {
				List<Object> result = CountUpTo.countUpTo(1);
				assertEquals(0, result.size());
			}

			@Test
			void testCountUpTo8() {
				List<Object> result = CountUpTo.countUpTo(18);
				assertEquals(7, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(5, result.get(2));
				assertEquals(7, result.get(3));
				assertEquals(11, result.get(4));
				assertEquals(13, result.get(5));
				assertEquals(17, result.get(6));
			}

			@Test
			void testCountUpTo9() {
				List<Object> result = CountUpTo.countUpTo(47);
				assertEquals(14, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(5, result.get(2));
				assertEquals(7, result.get(3));
				assertEquals(11, result.get(4));
				assertEquals(13, result.get(5));
				assertEquals(17, result.get(6));
				assertEquals(19, result.get(7));
				assertEquals(23, result.get(8));
				assertEquals(29, result.get(9));
				assertEquals(31, result.get(10));
				assertEquals(37, result.get(11));
				assertEquals(41, result.get(12));
				assertEquals(43, result.get(13));
			}

			@Test
			void testCountUpTo10() {
				List<Object> result = CountUpTo.countUpTo(101);
				assertEquals(25, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(5, result.get(2));
				assertEquals(7, result.get(3));
				assertEquals(11, result.get(4));
				assertEquals(13, result.get(5));
				assertEquals(17, result.get(6));
				assertEquals(19, result.get(7));
				assertEquals(23, result.get(8));
				assertEquals(29, result.get(9));
				assertEquals(31, result.get(10));
				assertEquals(37, result.get(11));
				assertEquals(41, result.get(12));
				assertEquals(43, result.get(13));
				assertEquals(47, result.get(14));
				assertEquals(53, result.get(15));
				assertEquals(59, result.get(16));
				assertEquals(61, result.get(17));
				assertEquals(67, result.get(18));
				assertEquals(71, result.get(19));
				assertEquals(73, result.get(20));
				assertEquals(79, result.get(21));
				assertEquals(83, result.get(22));
				assertEquals(89, result.get(23));
				assertEquals(97, result.get(24));
			}
		}