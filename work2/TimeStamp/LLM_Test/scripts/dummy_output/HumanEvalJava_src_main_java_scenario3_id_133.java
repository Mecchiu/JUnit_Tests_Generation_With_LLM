// SumSquaresTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains ten unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {
			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [1, 2, 3] and expects the output 14.
			*/
			@Test
			void testSumSquares1() {
				List<Number> lst = List.of(1, 2, 3);
				int expected = 14;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [1.0, 2, 3] and expects the output 14.
			*/
			@Test
			void testSumSquares2() {
				List<Number> lst = List.of(1.0, 2, 3);
				int expected = 14;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [1, 3, 5, 7] and expects the output 84.
			*/
			@Test
			void testSumSquares3() {
				List<Number> lst = List.of(1, 3, 5, 7);
				int expected = 84;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [1.4, 4.2, 0] and expects the output 29.
			*/
			@Test
			void testSumSquares4() {
				List<Number> lst = List.of(1.4, 4.2, 0);
				int expected = 29;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [-2.4, 1, 1] and expects the output 6.
			*/
			@Test
			void testSumSquares5() {
				List<Number> lst = List.of(-2.4, 1, 1);
				int expected = 6;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [100, 1, 15, 2] and expects the output 10230.
			*/
			@Test
			void testSumSquares6() {
				List<Number> lst = List.of(100, 1, 15, 2);
				int expected = 10230;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [10000, 10000] and expects the output 200000000.
			*/
			@Test
			void testSumSquares7() {
				List<Number> lst = List.of(10000, 10000);
				int expected = 200000000;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [-1.4, 4.6, 6.3] and expects the output 75.
			*/
			@Test
			void testSumSquares8() {
				List<Number> lst = List.of(-1.4, 4.6, 6.3);
				int expected = 75;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [-1.4, 17.9, 18.9, 19.9] and expects the output 1086.
			*/
			@Test
			void testSumSquares9() {
				List<Number> lst = List.of(-1.4, 17.9, 18.9, 19.9);
				int expected = 1086;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [0] and expects the output 0.
			*/
			@Test
			void testSumSquares10() {
				List<Number> lst = List.of(0);
				int expected = 0;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [-1] and expects the output 1.
			*/
			@Test
			void testSumSquares11() {
				List<Number> lst = List.of(-1);
				int expected = 1;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link SumSquares#sumSquares(List)}.
			* It tests the method with the input [-1, 1, 0] and expects the output 2.
			*/
			@Test
			void testSumSquares12() {
				List<Number> lst = List.of(-1, 1, 0);
				int expected = 2;
				int actual = SumSquares.sumSquares(lst);
				assertEquals(expected, actual);
			}
}