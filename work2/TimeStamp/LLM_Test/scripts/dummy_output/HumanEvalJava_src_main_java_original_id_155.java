// EvenOddCountTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
			@Test
			void testEvenOddCount1() {
				List<Integer> expected = Arrays.asList(0, 1);
				List<Integer> actual = EvenOddCount.evenOddCount(7);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount2() {
				List<Integer> expected = Arrays.asList(1, 1);
				List<Integer> actual = EvenOddCount.evenOddCount(-78);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount3() {
				List<Integer> expected = Arrays.asList(2, 2);
				List<Integer> actual = EvenOddCount.evenOddCount(3452);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount4() {
				List<Integer> expected = Arrays.asList(3, 3);
				List<Integer> actual = EvenOddCount.evenOddCount(346211);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount5() {
				List<Integer> expected = Arrays.asList(3, 3);
				List<Integer> actual = EvenOddCount.evenOddCount(-345821);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount6() {
				List<Integer> expected = Arrays.asList(1, 0);
				List<Integer> actual = EvenOddCount.evenOddCount(-2);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount7() {
				List<Integer> expected = Arrays.asList(2, 3);
				List<Integer> actual = EvenOddCount.evenOddCount(-45347);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount8() {
				List<Integer> expected = Arrays.asList(1, 0);
				List<Integer> actual = EvenOddCount.evenOddCount(0);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount9() {
				List<Integer> expected = Arrays.asList(1, 1);
				List<Integer> actual = EvenOddCount.evenOddCount(123);
				assertEquals(expected, actual);
			}

			@Test
			void testEvenOddCount10() {
				List<Integer> expected = Arrays.asList(1, 1);
				List<Integer> actual = EvenOddCount.evenOddCount(-12);
				assertEquals(expected, actual);
			}
}