// FTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {
	@Test
			void testF() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				expected.add(4);
				expected.add(15);
				expected.add(6);
				expected.add(28);
				expected.add(8);
				expected.add(45);
				expected.add(10);
				List<Integer> actual = F.f(10);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithZero() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = F.f(0);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithNegative() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = F.f(-1);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithOne() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				List<Integer> actual = F.f(1);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithTwo() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				List<Integer> actual = F.f(2);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithThree() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				List<Integer> actual = F.f(3);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithFour() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				expected.add(4);
				List<Integer> actual = F.f(4);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithFive() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				expected.add(4);
				expected.add(15);
				List<Integer> actual = F.f(5);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithSix() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				expected.add(4);
				expected.add(15);
				expected.add(6);
				List<Integer> actual = F.f(6);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithSeven() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				expected.add(4);
				expected.add(15);
				expected.add(6);
				expected.add(28);
				List<Integer> actual = F.f(7);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithEight() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				expected.add(4);
				expected.add(15);
				expected.add(6);
				expected.add(28);
				expected.add(8);
				List<Integer> actual = F.f(8);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithNine() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				expected.add(4);
				expected.add(15);
				expected.add(6);
				expected.add(28);
				expected.add(8);
				expected.add(45);
				List<Integer> actual = F.f(9);
				assertEquals(expected, actual);
			}

			@Test
			void testFWithTen() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(6);
				expected.add(4);
				expected.add(15);
				expected.add(6);
				expected.add(28);
				expected.add(8);
				expected.add(45);
				expected.add(10);
				List<Integer> actual = F.f(10);
				assertEquals(expected, actual);
			}
}
