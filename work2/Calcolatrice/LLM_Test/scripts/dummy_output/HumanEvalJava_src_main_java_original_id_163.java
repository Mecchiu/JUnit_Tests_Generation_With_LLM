// GenerateIntegersTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {
			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 2, b = 8
			* The expected result is [2, 4, 6, 8].
			*/
			@Test
			void testGenerateIntegers1() {
						List<Object> expected = new ArrayList<>();
						expected.add(2);
						expected.add(4);
						expected.add(6);
						expected.add(8);
						List<Object> actual = GenerateIntegers.generateIntegers(2, 8);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 8, b = 2
			* The expected result is [2, 4, 6, 8].
			*/
			@Test
			void testGenerateIntegers2() {
						List<Object> expected = new ArrayList<>();
						expected.add(2);
						expected.add(4);
						expected.add(6);
						expected.add(8);
						List<Object> actual = GenerateIntegers.generateIntegers(8, 2);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 10, b = 14
			* The expected result is [].
			*/
			@Test
			void testGenerateIntegers3() {
						List<Object> expected = new ArrayList<>();
						List<Object> actual = GenerateIntegers.generateIntegers(10, 14);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 2, b = 10
			* The expected result is [2, 4, 6, 8].
			*/
			@Test
			void testGenerateIntegers4() {
						List<Object> expected = new ArrayList<>();
						expected.add(2);
						expected.add(4);
						expected.add(6);
						expected.add(8);
						List<Object> actual = GenerateIntegers.generateIntegers(2, 10);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 10, b = 2
			* The expected result is [2, 4, 6, 8].
			*/
			@Test
			void testGenerateIntegers5() {
						List<Object> expected = new ArrayList<>();
						expected.add(2);
						expected.add(4);
						expected.add(6);
						expected.add(8);
						List<Object> actual = GenerateIntegers.generateIntegers(10, 2);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 132, b = 2
			* The expected result is [2, 4, 6, 8].
			*/
			@Test
			void testGenerateIntegers6() {
						List<Object> expected = new ArrayList<>();
						expected.add(2);
						expected.add(4);
						expected.add(6);
						expected.add(8);
						List<Object> actual = GenerateIntegers.generateIntegers(132, 2);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 17, b = 89
			* The expected result is [].
			*/
			@Test
			void testGenerateIntegers7() {
						List<Object> expected = new ArrayList<>();
						List<Object> actual = GenerateIntegers.generateIntegers(17, 89);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 2, b = 2
			* The expected result is [2].
			*/
			@Test
			void testGenerateIntegers8() {
						List<Object> expected = new ArrayList<>();
						expected.add(2);
						List<Object> actual = GenerateIntegers.generateIntegers(2, 2);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 8, b = 8
			* The expected result is [8].
			*/
			@Test
			void testGenerateIntegers9() {
						List<Object> expected = new ArrayList<>();
						expected.add(8);
						List<Object> actual = GenerateIntegers.generateIntegers(8, 8);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
			* It tests the method with the following parameters:
			* a = 0, b = 0
			* The expected result is [2].
			*/
			@Test
			void testGenerateIntegers10() {
						List<Object> expected = new ArrayList<>();
						expected.add(2);
						List<Object> actual = GenerateIntegers.generateIntegers(0, 0);
						assertEquals(expected, actual);
			}
}