// SumSquares1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
	/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [1, 2, 3]
			* Expected output = 6
			*/
			@Test
			void testSumSquares1() {
						List<Object> lst = List.of(1, 2, 3);
						int expected = 6;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = []
			* Expected output = 0
			*/
			@Test
			void testSumSquares2() {
						List<Object> lst = List.of();
						int expected = 0;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [-1, -5, 2, -1, -5]
			* Expected output = -126
			*/
			@Test
			void testSumSquares3() {
						List<Object> lst = List.of(-1, -5, 2, -1, -5);
						int expected = -126;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [1, 1, 1, 1, 1, 1, 1, 1, 1]
			* Expected output = 9
			*/
			@Test
			void testSumSquares4() {
						List<Object> lst = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1);
						int expected = 9;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [-1, -1, -1, -1, -1, -1, -1, -1, -1]
			* Expected output = -3
			*/
			@Test
			void testSumSquares5() {
						List<Object> lst = List.of(-1, -1, -1, -1, -1, -1, -1, -1, -1);
						int expected = -3;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [0]
			* Expected output = 0
			*/
			@Test
			void testSumSquares6() {
						List<Object> lst = List.of(0);
						int expected = 0;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [-56, -99, 1, 0, -2]
			* Expected output = 3030
			*/
			@Test
			void testSumSquares7() {
						List<Object> lst = List.of(-56, -99, 1, 0, -2);
						int expected = 3030;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [-1, 0, 0, 0, 0, 0, 0, 0, -1]
			* Expected output = 0
			*/
			@Test
			void testSumSquares8() {
						List<Object> lst = List.of(-1, 0, 0, 0, 0, 0, 0, 0, -1);
						int expected = 0;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37]
			* Expected output = -14196
			*/
			@Test
			void testSumSquares9() {
						List<Object> lst = List.of(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37);
						int expected = -14196;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link SumSquares1#sumSquares(List)} method.
			* It tests the method with the following parameters:
			* lst = [-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10]
			* Expected output = -1448
			*/
			@Test
			void testSumSquares10() {
						List<Object> lst = List.of(-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10);
						int expected = -1448;
						int actual = SumSquares1.sumSquares(lst);
						assertEquals(expected, actual);
			}
}
