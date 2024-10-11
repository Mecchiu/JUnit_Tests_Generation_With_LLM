// SumSquares1Test.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [1, 2, 3].
			 */
			@Test
			void testSumSquares1() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(6, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the empty list [].
			 */
			@Test
			void testSumSquares2() {
				List<Object> lst = new ArrayList<Object>();
				int result = SumSquares1.sumSquares(lst);
				assertEquals(0, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [-1, -5, 2, -1, -5].
			 */
			@Test
			void testSumSquares3() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-5);
				lst.add(2);
				lst.add(-1);
				lst.add(-5);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(-126, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [1, 1, 1, 1, 1, 1, 1, 1, 1].
			 */
			@Test
			void testSumSquares4() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(1);
				lst.add(1);
				lst.add(1);
				lst.add(1);
				lst.add(1);
				lst.add(1);
				lst.add(1);
				lst.add(1);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(9, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [-1, -1, -1, -1, -1, -1, -1, -1, -1].
			 */
			@Test
			void testSumSquares5() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-1);
				lst.add(-1);
				lst.add(-1);
				lst.add(-1);
				lst.add(-1);
				lst.add(-1);
				lst.add(-1);
				lst.add(-1);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(-3, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [0].
			 */
			@Test
			void testSumSquares6() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(0);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(0, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [-56, -99, 1, 0, -2].
			 */
			@Test
			void testSumSquares7() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-56);
				lst.add(-99);
				lst.add(1);
				lst.add(0);
				lst.add(-2);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(3030, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [-1, 0, 0, 0, 0, 0, 0, 0, -1].
			 */
			@Test
			void testSumSquares8() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(0);
				lst.add(0);
				lst.add(0);
				lst.add(0);
				lst.add(0);
				lst.add(0);
				lst.add(0);
				lst.add(-1);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(0, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37].
			 */
			@Test
			void testSumSquares9() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-16);
				lst.add(-9);
				lst.add(-2);
				lst.add(36);
				lst.add(36);
				lst.add(26);
				lst.add(-20);
				lst.add(25);
				lst.add(-40);
				lst.add(20);
				lst.add(-4);
				lst.add(12);
				lst.add(-26);
				lst.add(35);
				lst.add(37);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(-14196, result);
			}

			/**
			 * Test case for the method {@link SumSquares1#sumSquares(List)}.
			 * It tests the method with the list [-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10].
			 */
			@Test
			void testSumSquares10() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-1);
				lst.add(-3);
				lst.add(17);
				lst.add(-1);
				lst.add(-15);
				lst.add(13);
				lst.add(-1);
				lst.add(14);
				lst.add(-14);
				lst.add(-12);
				lst.add(-5);
				lst.add(14);
				lst.add(-14);
				lst.add(6);
				lst.add(13);
				lst.add(11);
				lst.add(16);
				lst.add(16);
				lst.add(4);
				lst.add(10);
				int result = SumSquares1.sumSquares(lst);
				assertEquals(-1448, result);
			}
		}