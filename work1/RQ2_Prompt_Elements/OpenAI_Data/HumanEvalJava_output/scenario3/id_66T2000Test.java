// DigitsumTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
	/**
			* Test case for empty string.
			*/
			@Test
			void testEmptyString() {
						assertEquals(0, Digitsum.digitSum(""));
			}

			/**
			* Test case for "abAB".
			*/
			@Test
			void testAbAB() {
						assertEquals(131, Digitsum.digitSum("abAB"));
			}

			/**
			* Test case for "abcCd".
			*/
			@Test
			void testAbcCd() {
						assertEquals(67, Digitsum.digitSum("abcCd"));
			}

			/**
			* Test case for "helloE".
			*/
			@Test
			void testHelloE() {
						assertEquals(69, Digitsum.digitSum("helloE"));
			}

			/**
			* Test case for "woArBld".
			*/
			@Test
			void testWoArBld() {
						assertEquals(131, Digitsum.digitSum("woArBld"));
			}

			/**
			* Test case for "aAaaaXa".
			*/
			@Test
			void testAAaaaXa() {
						assertEquals(153, Digitsum.digitSum("aAaaaXa"));
			}

			/**
			* Test case for " How are yOu?".
			*/
			@Test
			void testHowAreYou() {
						assertEquals(151, Digitsum.digitSum(" How are yOu?"));
			}

			/**
			* Test case for "You arE Very Smart".
			*/
			@Test
			void testYouAreVerySmart() {
						assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
			}

			/**
			* Test case for "1234567890".
			*/
			@Test
			void test1234567890() {
						assertEquals(0, Digitsum.digitSum("1234567890"));
			}

			/**
			* Test case for "ABCDEFGHIJ".
			*/
			@Test
			void testABCDEFGHIJ() {
						assertEquals(0, Digitsum.digitSum("ABCDEFGHIJ"));
			}
}
