// SumSquaresTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains ten unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {
	/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Number> lst = List.of();
				int expected = 0;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains one element.
			*/
			@Test
			void testOneElementList() {
				List<Number> lst = List.of(1);
				int expected = 1;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains two elements.
			*/
			@Test
			void testTwoElementsList() {
				List<Number> lst = List.of(1, 2);
				int expected = 5;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains three elements.
			*/
			@Test
			void testThreeElementsList() {
				List<Number> lst = List.of(1, 2, 3);
				int expected = 14;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains four elements.
			*/
			@Test
			void testFourElementsList() {
				List<Number> lst = List.of(1, 2, 3, 4);
				int expected = 30;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains five elements.
			*/
			@Test
			void testFiveElementsList() {
				List<Number> lst = List.of(1, 2, 3, 4, 5);
				int expected = 55;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains six elements.
			*/
			@Test
			void testSixElementsList() {
				List<Number> lst = List.of(1, 2, 3, 4, 5, 6);
				int expected = 91;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains seven elements.
			*/
			@Test
			void testSevenElementsList() {
				List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7);
				int expected = 140;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains eight elements.
			*/
			@Test
			void testEightElementsList() {
				List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				int expected = 204;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains nine elements.
			*/
			@Test
			void testNineElementsList() {
				List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int expected = 285;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares#sumSquares(List)} method.
			* It tests the case when the list contains ten elements.
			*/
			@Test
			void testTenElementsList() {
				List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				int expected = 385;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}
}
