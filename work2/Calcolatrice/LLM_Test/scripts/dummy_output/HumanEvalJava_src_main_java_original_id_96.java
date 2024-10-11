// CountUpToTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
			@Test
			void testCountUpTo5() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				List<Object> actual = CountUpTo.countUpTo(5);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo6() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Object> actual = CountUpTo.countUpTo(6);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo7() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Object> actual = CountUpTo.countUpTo(7);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo10() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				List<Object> actual = CountUpTo.countUpTo(10);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo0() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = CountUpTo.countUpTo(0);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo22() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				expected.add(11);
				expected.add(13);
				expected.add(17);
				expected.add(19);
				List<Object> actual = CountUpTo.countUpTo(22);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo1() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = CountUpTo.countUpTo(1);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo18() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				expected.add(11);
				expected.add(13);
				expected.add(17);
				List<Object> actual = CountUpTo.countUpTo(18);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo47() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				expected.add(11);
				expected.add(13);
				expected.add(17);
				expected.add(19);
				expected.add(23);
				expected.add(29);
				expected.add(31);
				expected.add(37);
				expected.add(41);
				expected.add(43);
				List<Object> actual = CountUpTo.countUpTo(47);
				assertEquals(expected, actual);
			}

			@Test
			void testCountUpTo101() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(7);
				expected.add(11);
				expected.add(13);
				expected.add(17);
				expected.add(19);
				expected.add(23);
				expected.add(29);
				expected.add(31);
				expected.add(37);
				expected.add(41);
				expected.add(43);
				expected.add(47);
				expected.add(53);
				expected.add(59);
				expected.add(61);
				expected.add(67);
				expected.add(71);
				expected.add(73);
				expected.add(79);
				expected.add(83);
				expected.add(89);
				expected.add(97);
				List<Object> actual = CountUpTo.countUpTo(101);
				assertEquals(expected, actual);
			}
}