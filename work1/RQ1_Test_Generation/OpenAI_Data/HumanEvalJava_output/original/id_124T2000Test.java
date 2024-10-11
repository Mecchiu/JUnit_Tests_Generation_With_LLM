// ValidDateTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
	/**
			* Test case 1: validDate('03-11-2000') => True
			*/
			@Test
			void testValidDate1() {
						assertTrue(ValidDate.validDate("03-11-2000"));
			}

			/**
			* Test case 2: validDate('15-01-2012') => False
			*/
			@Test
			void testValidDate2() {
						assertFalse(ValidDate.validDate("15-01-2012"));
			}

			/**
			* Test case 3: validDate('04-0-2040') => False
			*/
			@Test
			void testValidDate3() {
						assertFalse(ValidDate.validDate("04-0-2040"));
			}

			/**
			* Test case 4: validDate('06-04-2020') => True
			*/
			@Test
			void testValidDate4() {
						assertTrue(ValidDate.validDate("06-04-2020"));
			}

			/**
			* Test case 5: validDate('06/04/2020') => False
			*/
			@Test
			void testValidDate5() {
						assertFalse(ValidDate.validDate("06/04/2020"));
			}

			/**
			* Test case 6: validDate('01-01-2007') => True
			*/
			@Test
			void testValidDate6() {
						assertTrue(ValidDate.validDate("01-01-2007"));
			}

			/**
			* Test case 7: validDate('03-32-2011') => False
			*/
			@Test
			void testValidDate7() {
						assertFalse(ValidDate.validDate("03-32-2011"));
			}

			/**
			* Test case 8: validDate('') => False
			*/
			@Test
			void testValidDate8() {
						assertFalse(ValidDate.validDate(""));
			}

			/**
			* Test case 9: validDate('04-31-3000') => False
			*/
			@Test
			void testValidDate9() {
						assertFalse(ValidDate.validDate("04-31-3000"));
			}

			/**
			* Test case 10: validDate('06-06-2005') => True
			*/
			@Test
			void testValidDate10() {
						assertTrue(ValidDate.validDate("06-06-2005"));
			}
}
