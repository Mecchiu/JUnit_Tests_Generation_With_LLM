// ValidDateTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
	@Test
			void testValidDate() {
				// Test case 1: Empty string
				assertFalse(ValidDate.validDate(""));
				
				// Test case 2: Invalid date format
				assertFalse(ValidDate.validDate("01/01/2020"));
				
				// Test case 3: Invalid month
				assertFalse(ValidDate.validDate("13-01-2020"));
				
				// Test case 4: Invalid day
				assertFalse(ValidDate.validDate("01-32-2020"));
				
				// Test case 5: Invalid year
				assertFalse(ValidDate.validDate("01-01-20200"));
				
				// Test case 6: Invalid month and day
				assertFalse(ValidDate.validDate("02-30-2020"));
				
				// Test case 7: Invalid month and year
				assertFalse(ValidDate.validDate("13-01-20200"));
				
				// Test case 8: Invalid day and year
				assertFalse(ValidDate.validDate("01-32-20200"));
				
				// Test case 9: Invalid month, day and year
				assertFalse(ValidDate.validDate("13-32-20200"));
				
				// Test case 10: Valid date
				assertTrue(ValidDate.validDate("01-01-2020"));
			}
}
