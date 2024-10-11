// HexKeyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
			/**
			* Test case 1: input "AB" should return 1.
			*/
			@Test
			void test1() {
				assertEquals(1, HexKey.hexKey("AB"));
			}

			/**
			* Test case 2: input "1077E" should return 2.
			*/
			@Test
			void test2() {
				assertEquals(2, HexKey.hexKey("1077E"));
			}

			/**
			* Test case 3: input "ABED1A33" should return 4.
			*/
			@Test
			void test3() {
				assertEquals(4, HexKey.hexKey("ABED1A33"));
			}

			/**
			* Test case 4: input "123456789ABCDEF0" should return 6.
			*/
			@Test
			void test4() {
				assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));
			}

			/**
			* Test case 5: input "2020" should return 2.
			*/
			@Test
			void test5() {
				assertEquals(2, HexKey.hexKey("2020"));
			}

			/**
			* Test case 6: input "112233445566778899AABBCCDDEEFF00" should return 12.
			*/
			@Test
			void test6() {
				assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
			}

			/**
			* Test case 7: input "A" should return 0.
			*/
			@Test
			void test7() {
				assertEquals(0, HexKey.hexKey("A"));
			}

			/**
			* Test case 8: input "B" should return 1.
			*/
			@Test
			void test8() {
				assertEquals(1, HexKey.hexKey("B"));
			}

			/**
			* Test case 9: input "C" should return 0.
			*/
			@Test
			void test9() {
				assertEquals(0, HexKey.hexKey("C"));
			}

			/**
			* Test case 10: input "D" should return 1.
			*/
			@Test
			void test10() {
				assertEquals(1, HexKey.hexKey("D"));
			}
}