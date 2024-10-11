// MultiplyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Multiply}.
* It contains ten unit test cases for the {@link Multiply#multiply(int, int)} method.
*/
class MultiplyTest {
			@Test
			void testMultiply1() {
				assertEquals(16, Multiply.multiply(148, 412));
			}

			@Test
			void testMultiply2() {
				assertEquals(72, Multiply.multiply(19, 28));
			}

			@Test
			void testMultiply3() {
				assertEquals(0, Multiply.multiply(2020, 1851));
			}

			@Test
			void testMultiply4() {
				assertEquals(20, Multiply.multiply(14, -15));
			}

			@Test
			void testMultiply5() {
				assertEquals(42, Multiply.multiply(76, 67));
			}

			@Test
			void testMultiply6() {
				assertEquals(49, Multiply.multiply(17, 27));
			}

			@Test
			void testMultiply7() {
				assertEquals(0, Multiply.multiply(0, 1));
			}

			@Test
			void testMultiply8() {
				assertEquals(0, Multiply.multiply(0, 0));
			}

			@Test
			void testMultiply9() {
				assertEquals(0, Multiply.multiply(0, 100));
			}

			@Test
			void testMultiply10() {
				assertEquals(0, Multiply.multiply(100, 0));
			}
}