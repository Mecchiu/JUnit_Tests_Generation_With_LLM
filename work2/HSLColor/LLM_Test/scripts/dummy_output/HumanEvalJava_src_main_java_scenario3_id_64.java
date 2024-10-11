// VowelsCountTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
			@Test
			void testVowelsCount1() {
				assertEquals(2, VowelsCount.vowelsCount("abcde"));
			}

			@Test
			void testVowelsCount2() {
				assertEquals(3, VowelsCount.vowelsCount("Alone"));
			}

			@Test
			void testVowelsCount3() {
				assertEquals(2, VowelsCount.vowelsCount("key"));
			}

			@Test
			void testVowelsCount4() {
				assertEquals(1, VowelsCount.vowelsCount("bye"));
			}

			@Test
			void testVowelsCount5() {
				assertEquals(2, VowelsCount.vowelsCount("keY"));
			}

			@Test
			void testVowelsCount6() {
				assertEquals(1, VowelsCount.vowelsCount("bYe"));
			}

			@Test
			void testVowelsCount7() {
				assertEquals(3, VowelsCount.vowelsCount("ACEDY"));
			}

			@Test
			void testVowelsCount8() {
				assertEquals(0, VowelsCount.vowelsCount("BCDFG"));
			}

			@Test
			void testVowelsCount9() {
				assertEquals(1, VowelsCount.vowelsCount("A"));
			}

			@Test
			void testVowelsCount10() {
				assertEquals(0, VowelsCount.vowelsCount("B"));
			}
}