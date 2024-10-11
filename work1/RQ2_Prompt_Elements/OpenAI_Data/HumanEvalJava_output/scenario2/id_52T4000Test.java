// BelowThresholdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

	/**
	 * Test case 1:
	 * Input: [1, 2, 3, 4, 5], 6
	 * Expected output: true
	 */
	@Test
	void test1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 6;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 2:
	 * Input: [1, 2, 3, 4, 5], 5
	 * Expected output: true
	 */
	@Test
	void test2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 5;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 3:
	 * Input: [1, 2, 3, 4, 5], 4
	 * Expected output: true
	 */
	@Test
	void test3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 4;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 4:
	 * Input: [1, 2, 3, 4, 5], 3
	 * Expected output: true
	 */
	@Test
	void test4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 3;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 5:
	 * Input: [1, 2, 3, 4, 5], 2
	 * Expected output: true
	 */
	@Test
	void test5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 2;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 6:
	 * Input: [1, 2, 3, 4, 5], 1
	 * Expected output: true
	 */
	@Test
	void test6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 1;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 7:
	 * Input: [1, 2, 3, 4, 5], 0
	 * Expected output: false
	 */
	@Test
	void test7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 0;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 8:
	 * Input: [1, 2, 3, 4, 5], -1
	 * Expected output: false
	 */
	@Test
	void test8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -1;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 9:
	 * Input: [1, 2, 3, 4, 5], -2
	 * Expected output: false
	 */
	@Test
	void test9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -2;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 10:
	 * Input: [1, 2, 3, 4, 5], -3
	 * Expected output: false
	 */
	@Test
	void test10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -3;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
}

// BelowThresholdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	/**
	 * Test case 1:
	 * Input: [1, 2, 3, 4, 5], 6
	 * Expected output: true
	 */
	@Test
	void test1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 6;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 2:
	 * Input: [1, 2, 3, 4, 5], 5
	 * Expected output: true
	 */
	@Test
	void test2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 5;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 3:
	 * Input: [1, 2, 3, 4, 5], 4
	 * Expected output: true
	 */
	@Test
	void test3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 4;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 4:
	 * Input: [1, 2, 3, 4, 5], 3
	 * Expected output: true
	 */
	@Test
	void test4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 3;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 5:
	 * Input: [1, 2, 3, 4, 5], 2
	 * Expected output: true
	 */
	@Test
	void test5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 2;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 6:
	 * Input: [1, 2, 3, 4, 5], 1
	 * Expected output: true
	 */
	@Test
	void test6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 1;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 7:
	 * Input: [1, 2, 3, 4, 5], 0
	 * Expected output: false
	 */
	@Test
	void test7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 0;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 8:
	 * Input: [1, 2, 3, 4, 5], -1
	 * Expected output: false
	 */
	@Test
	void test8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -1;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 9:
	 * Input: [1, 2, 3, 4, 5], -2
	 * Expected output: false
	 */
	@Test
	void test9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -2;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 10:
	 * Input: [1, 2, 3, 4, 5], -3
	 * Expected output: false
	 */
	@Test
	void test10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -3;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
}

// BelowThresholdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	/**
	 * Test case 1:
	 * Input: [1, 2, 3, 4, 5], 6
	 * Expected output: true
	 */
	@Test
	void test1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 6;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 2:
	 * Input: [1, 2, 3, 4, 5], 5
	 * Expected output: true
	 */
	@Test
	void test2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 5;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 3:
	 * Input: [1, 2, 3, 4, 5], 4
	 * Expected output: true
	 */
	@Test
	void test3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 4;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 4:
	 * Input: [1, 2, 3, 4, 5], 3
	 * Expected output: true
	 */
	@Test
	void test4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 3;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 5:
	 * Input: [1, 2, 3, 4, 5], 2
	 * Expected output: true
	 */
	@Test
	void test5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 2;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 6:
	 * Input: [1, 2, 3, 4, 5], 1
	 * Expected output: true
	 */
	@Test
	void test6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 1;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 7:
	 * Input: [1, 2, 3, 4, 5], 0
	 * Expected output: false
	 */
	@Test
	void test7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 0;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 8:
	 * Input: [1, 2, 3, 4, 5], -1
	 * Expected output: false
	 */
	@Test
	void test8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -1;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 9:
	 * Input: [1, 2, 3, 4, 5], -2
	 * Expected output: false
	 */
	@Test
	void test9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -2;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 10:
	 * Input: [1, 2, 3, 4, 5], -3
	 * Expected output: false
	 */
	@Test
	void test10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = -3;
		assertFalse(BelowThreshold.belowThreshold(l, t));
	}
}

// BelowThresholdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	/**
	 * Test case 1:
	 * Input: [1, 2, 3, 4, 5], 6
	 * Expected output: true
	 */
	@Test
	void test1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 6;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 2:
	 * Input: [1, 2, 3, 4, 5], 5
	 * Expected output: true
	 */
	@Test
	void test2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 5;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 3:
	 * Input: [1, 2, 3, 4, 5], 4
	 * Expected output: true
	 */
	@Test
	void test3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 4;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 4:
	 * Input: [1, 2, 3, 4, 5], 3
	 * Expected output: true
	 */
	@Test
	void test4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 3;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 5:
	 * Input: [1, 2, 3, 4, 5], 2
	 * Expected output: true
	 */
	@Test
	void test5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		int t = 2;
		assertTrue(BelowThreshold.belowThreshold(l, t));
	}
	
	/**
	 * Test case 6:
	 * Input: [1, 2, 3, 4, 5], 1
	 * Expected output: true
	 */
	@Test
	void test6() {
