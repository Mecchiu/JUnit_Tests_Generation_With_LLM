// GenerateIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {
	// Test case 1: a = 1, b = 10
			@Test
			void test1() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(1, 10));
			}

			// Test case 2: a = 10, b = 1
			@Test
			void test2() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(10, 1));
			}

			// Test case 3: a = 1, b = 1
			@Test
			void test3() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, GenerateIntegers.generateIntegers(1, 1));
			}

			// Test case 4: a = 2, b = 8
			@Test
			void test4() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
			}

			// Test case 5: a = 8, b = 2
			@Test
			void test5() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(8, 2));
			}

			// Test case 6: a = 0, b = 10
			@Test
			void test6() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(0, 10));
			}

			// Test case 7: a = 10, b = 0
			@Test
			void test7() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(10, 0));
			}

			// Test case 8: a = -1, b = 10
			@Test
			void test8() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(-1, 10));
			}

			// Test case 9: a = 10, b = -1
			@Test
			void test9() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(10, -1));
			}

			// Test case 10: a = -1, b = -10
			@Test
			void test10() {
				List<Object> expected = new ArrayList<>();
				expected.add(2);
				expected.add(4);
				expected.add(6);
				expected.add(8);
				assertEquals(expected, GenerateIntegers.generateIntegers(-1, -10));
			}
}
